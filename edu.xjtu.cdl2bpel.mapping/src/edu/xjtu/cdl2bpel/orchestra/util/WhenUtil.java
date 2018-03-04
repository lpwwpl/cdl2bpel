/*
 * Copyright 2005 Pi4 Technologies Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * Change History:
 * May 23, 2005 : Initial version created by gary
 */
package edu.xjtu.cdl2bpel.orchestra.util;

import edu.xjtu.cdl2bpel.orchestra.xpath.DefaultXPathFunction;
import edu.xjtu.cdl2bpel.orchestra.xpath.XPathFunction;
import edu.xjtu.cdl2bpel.orchestra.xpath.XPathFunctionResolver;


/**
 * The utility functions for the When activity.
 */
public class WhenUtil {

	/**
	 * This function returns the function resolver for the
	 * 'when' activity.
	 * 
	 * @return The function resolver
	 */
	public static XPathFunctionResolver getWhenFunctionResolver() {
		return(m_whenFunctionResolver);
	}
	
	/**
	 * This method returns the 'hasDeadlinePassed' function.
	 * 
	 * @return The 'hasDeadlinePassed' function
	 */
	public static XPathFunction getHasDeadlinePassedFunction() {
		return(m_deadlinePassed);
	}
	
	/**
	 * This method returns the 'hasDurationPassed' function.
	 * 
	 * @return The 'hasDurationPassed' function
	 */
	public static XPathFunction getHasDurationPassedFunction() {
		return(m_durationPassed);
	}
	
	private static WhenFunctionResolver m_whenFunctionResolver=
				new WhenFunctionResolver();

	// TODO: Need to rationalise the CDL function declarations
	// when all are using the common XPath support
	private static XPathFunction m_deadlinePassed=
		new DefaultXPathFunction("hasDeadlinePassed");
	private static XPathFunction m_durationPassed=
		new DefaultXPathFunction("hasDurationPassed");
	
	public static class WhenFunctionResolver implements XPathFunctionResolver {
		
		public WhenFunctionResolver() {
		}
		
		/**
		 * This method returns an XPath function implementation
		 * associated with the supplied name, or null if not
		 * found.
		 * 
		 * @param name The function name
		 * @return The function, or null if not found.
		 */
		public XPathFunction getFunction(String name) {
			XPathFunction ret=null;
			
			if (name != null) {
				if (m_deadlinePassed.getFunctionName().equals(name)) {
					ret = m_deadlinePassed;
				} else if (m_durationPassed.getFunctionName().equals(name)) {
					ret = m_durationPassed;
				}
			}
			
			return(ret);
		}
	}
}
