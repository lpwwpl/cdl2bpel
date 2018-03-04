package edu.xjtu.cdl2bpel.cdl.xpathResolver;

import java.util.Hashtable;
import java.util.logging.Level;
import java.util.logging.Logger;

import edu.xjtu.cdl2bpel.cdl.xpathFunction.XPathFunction;


public class XPathFunctionRegistry {

	public static XPathFunction getFunction(String name) {
		XPathFunction ret=null;
		
		// Check if the supplied name is valid
		if (name == null || name.trim().length() == 0) {
			return(null);
		}
		
		// Check if the named function exists in the registry
		if (m_functions.containsKey(name)) {
			
			ret = (XPathFunction)m_functions.get(name);
		} else {
			
			// Check if the function can be loaded
			String className=name.substring(0, 1).toUpperCase()+
						name.substring(1);
			
			// Prefix the package
			className = XPathFunction.class.
					getPackage().getName()+"."+className+
					FUNCTION_SUFFIX;
			System.out.println(className);
			try {
				// Load the class
				Class cls = Class.forName(className);
				
				// Instantiate an instance of the function
				ret = (XPathFunction)cls.newInstance();
				
				// Add to registry
				if (ret != null) {
					m_functions.put(ret.getName(), ret);
				}
				
			} catch(Exception e) {
				logger.log(Level.SEVERE,
						"Failed to find function '"+
						name+"'", e);
			}
		}
		
		return(ret);
	}
	
	public static XPathFunction[] getFunctions() {
		XPathFunction[] ret=new XPathFunction[m_functions.size()];
		
		java.util.Enumeration iter=m_functions.keys();
		int index=0;
		
		while (iter.hasMoreElements()) {
			ret[index++] = (XPathFunction)iter.nextElement();
		}
		
		return(ret);
	}
	
	private static Hashtable m_functions=new Hashtable();
    private static Logger logger = Logger.getLogger("edu.xjtu.cdl2bpel.cdl.xpath");
	
	private static final String FUNCTION_SUFFIX="Function";
}
