package edu.xjtu.cdl2bpel.orchestra.util;

import java.util.logging.Logger;

import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import edu.xjtu.cdl2bpel.cdl2bpel.util.WSBPELKeywords;
import edu.xjtu.cdl2bpel.orchestra.Compensation;
import edu.xjtu.cdl2bpel.orchestra2bpel.Orchestra2BPELContext;

public class CompensationUtil {
	public static void recordScopePlaceholder(
			Orchestra2BPELContext context, Compensation compensation) {

		// Create 'scope' element placeholder
		Element elem = context.createElement(SCOPE_PLACEHOLDER);
		context.getCurrentElement().appendChild(elem);

		elem.setAttribute(WSBPELKeywords.NAME_ATTR, compensation.getInstanceId());

		// Create assignments for bound variables
//		if (perform.getVariableBindings().size() > 0) {
//
//			Element startseq = context.createElement(WSBPELKeywords.SEQUENCE);
//			Element endseq = context.createElement(WSBPELKeywords.SEQUENCE);
//			elem.appendChild(startseq);
//			elem.appendChild(endseq);
//
//			Element startassign = context.createElement(WSBPELKeywords.ASSIGN);
//			startseq.appendChild(startassign);
//
//			Element endassign = context.createElement(WSBPELKeywords.ASSIGN);
//			endseq.appendChild(endassign);
//
//			java.util.Iterator binds = perform.getVariableBindings().iterator();
//			while (binds.hasNext()) {
//				VariableBinding bind = (VariableBinding) binds.next();
//
//				Element startcopy = context.createElement(WSBPELKeywords.COPY);
//				startassign.appendChild(startcopy);
//
//				Element startfrom = context.createElement(WSBPELKeywords.FROM);
//				startcopy.appendChild(startfrom);
//				startfrom.setAttribute(WSBPELKeywords.VARIABLE_ATTR,
//						ChoreographyUtil.getVariableName(bind
//								.getParentVariable()));
//
//				Element startto = context.createElement(WSBPELKeywords.TO);
//				startcopy.appendChild(startto);
//				startto.setAttribute(WSBPELKeywords.VARIABLE_ATTR,
//						ChoreographyUtil.getVariableName(bind
//								.getBoundVariable()));
//
//				Element endcopy = context.createElement(WSBPELKeywords.COPY);
//				endassign.appendChild(endcopy);
//
//				Element endfrom = context.createElement(WSBPELKeywords.FROM);
//				endcopy.appendChild(endfrom);
//				endfrom.setAttribute(WSBPELKeywords.VARIABLE_ATTR,
//						ChoreographyUtil.getVariableName(bind
//								.getBoundVariable()));
//
//				Element endto = context.createElement(WSBPELKeywords.TO);
//				endcopy.appendChild(endto);
//				endto.setAttribute(WSBPELKeywords.VARIABLE_ATTR,
//						ChoreographyUtil.getVariableName(bind
//								.getParentVariable()));
//			}
//		}
	}

	public static void resolveScopePlaceholders(
			Orchestra2BPELContext context) {

		Element[] prevnl = null;
		Element[] nl = null;

		do {
			// Copy list to previous value, so can be compared
			// for change
			prevnl = nl;

			// Get uptodate list of placeholders
			NodeList nodelist = context.getDocument().getElementsByTagName(
					SCOPE_PLACEHOLDER);

			nl = new Element[nodelist.getLength()];

			for (int i = 0; i < nodelist.getLength(); i++) {
				nl[i] = (Element) nodelist.item(i);
			}

			for (int i = 0; i < nl.length; i++) {
				resolveScopePlaceholder(context, nl[i]);
			}
		} while (hasChanged(prevnl, nl));

		// Check if any placeholders still exist
		NodeList remaining = context.getDocument().getElementsByTagName(
				SCOPE_PLACEHOLDER);

		if (remaining.getLength() > 0) {
			logger.severe("Not all Scope placeholders could be resolved");
		}
	}

	/**
	 * This method determines if the 'current' node list has changed from the
	 * 'prev' node list.
	 * 
	 * @param prev
	 *            The previous node list
	 * @param current
	 *            The current node list
	 * @return Whether the lists have changed
	 */
	protected static boolean hasChanged(Element[] prev, Element[] current) {
		boolean ret = false;

		if (prev == null) {
			ret = true;
		} else if (prev.length != current.length) {
			ret = true;
		} else if (prev.length > 0) {
			// Need to compare each element
			ret = true;

			for (int i = 0; ret == true && i < prev.length; i++) {
				if (prev[i] != current[i]) {
					ret = false;
				}
			}
		}

		return (ret);
	}

	/**
	 * This method replaces a located placeholder with the
	 * 
	 * @param context
	 * @param placeholder
	 */
	protected static void resolveScopePlaceholder(
			Orchestra2BPELContext context, Element placeholder) {

		// Get the name of the scope we are interested in
		String scopeName = placeholder.getAttribute(WSBPELKeywords.NAME_ATTR);

		if (scopeName != null) {
			Element scope = context.getScopeRegistry().getScope(scopeName);

			if (scope != null) {
				// Take a copy of the scope
				Element scopeCopy = (Element) scope.cloneNode(true);

				// Check if we need to move the variable binding
				// activities from the placeholder into the copy
//				transferVariableBindings(placeholder, scopeCopy);

				// Replace the placeholder with the copy
				Node parent = placeholder.getParentNode();
				parent.replaceChild(scopeCopy, placeholder);

			} else {
				logger.severe("Scope '" + scopeName
						+ "' was not found in registry");
			}
		} else {
			logger.severe("Scope name was not found on placeholder");
		}
	}

//	protected static void transferVariableBindings(Element placeholder,
//			Element scope) {
//
//		NodeList nl = placeholder.getElementsByTagName(WSBPELKeywords.SEQUENCE);
//
//		if (nl.getLength() > 0) {
//
//			if (nl.getLength() == 2) {
//
//				// Find first activity in the scope
//				NodeList scopenl = scope.getChildNodes();
//				Node firstActivity = null;
//				for (int i = 0; firstActivity == null
//						&& i < scopenl.getLength(); i++) {
//
//					String nodeName = scopenl.item(i).getNodeName();
//					if (WSBPELKeywords.isActivity(nodeName)) {
//						firstActivity = scopenl.item(i);
//					}
//				}
//
//				if (firstActivity != null) {
//					scope.insertBefore(nl.item(0).cloneNode(true),
//							firstActivity);
//					scope.appendChild(nl.item(1).cloneNode(true));
//				} else {
//					logger.info("Could not find first BPEL "
//							+ "activity in scope, to insert placeholder "
//							+ "variable binding information - assuming that "
//							+ "no activities, but may have finalizer");
//
//					// Therefore copy in variable values to make
//					// available to a finalizer
//					scope.appendChild(nl.item(0).cloneNode(true));
//				}
//			} else {
//				logger.severe("Invalid number of 'sequence' elements"
//						+ "in placeholder: " + nl.getLength());
//			}
//		}
//	}

	private static Logger logger = Logger
			.getLogger("edu.xjtu.cdl2bpel.orchestra.util");

	private static final String SCOPE_PLACEHOLDER = "scopePlaceholder";
}
