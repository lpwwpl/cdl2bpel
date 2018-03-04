package edu.xjtu.cdl2bpel.orchestra2bpel;

import edu.xjtu.cdl2bpel.orchestra.xpath.XMLPrefixResolver;
import edu.xjtu.cdl2bpel.orchestra.xpath.XPathEvaluator;
import edu.xjtu.cdl2bpel.orchestra.xpath.XPathEvaluatorFactory;
import edu.xjtu.cdl2bpel.orchestra.xpath.XPathException;
import edu.xjtu.cdl2bpel.orchestra.xpath.XPathFunction;
import edu.xjtu.cdl2bpel.orchestra.xpath.XPathFunctionResolver;
import edu.xjtu.cdl2bpel.orchestra.xpath.XPathVisitor;

public class SingleFunctionExprEvaluator {

	public SingleFunctionExprEvaluator() {
		m_evaluator = XPathEvaluatorFactory.getXPathEvaluator();
	}
	
	public void registerFunctionResolver(String namespace,
			XPathFunctionResolver resolver) {
		m_evaluator.registerFunctionResolver(namespace,
				resolver);
	}
		
	public void evaluate(String expression,
			XMLPrefixResolver pres) throws XPathException {
		
		SingleFunctionVisitor visitor=new SingleFunctionVisitor();
		m_evaluator.visit(expression, visitor, pres);
	}
	
	public XPathFunction getXPathFunction() {
		return(m_function);
	}
	
	public String getXPathFunctionNamespace() {
		return(m_namespace);
	}
	
	public Object[] getXPathFunctionParameters() {
		return(m_parameters);
	}
	
	private XPathEvaluator m_evaluator=null;
	private String m_namespace=null;
	private XPathFunction m_function=null;
	private Object[] m_parameters=null;
	
	public class SingleFunctionVisitor implements XPathVisitor {
		
		public void function(String namespace, XPathFunction func,
						Object[] parameters) {
			
			// Check if function has already been found
			if (m_function != null) {
				throw new XPathException("Multiple functions have been found");
			}

			m_namespace = namespace;
			m_function = func;
			m_parameters = parameters;
		}
	}
}
