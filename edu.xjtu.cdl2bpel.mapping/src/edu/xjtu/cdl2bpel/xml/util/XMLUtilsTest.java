package edu.xjtu.cdl2bpel.xml.util;

import junit.framework.TestCase;

/**
 * This class provides the test cases for the DOM utils.
 */
public class XMLUtilsTest extends TestCase {

	public void testReformat1() {
		String original="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"+
				"<first><second><third1/><third2/></second></first>";

		String expected="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"+
					"<first>\r\n    <second>\r\n        " +
					"<third1/>\r\n        <third2/>\r\n    " +
					"</second>\r\n</first>\r\n";
		
		String reformatted=XMLUtils.reformat(original);
		
		if (reformatted.equals(expected) == false) {
			fail("XML reformat incorrect: expected: "+expected+
					", but got: "+reformatted);
		}
	}

	public void testReformat2() {
		String original="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"+
				"<first>\r\n    <second>\r\n        <third1/>\r\n" +
				"        <third2/>\r\n    </second>\r\n</first>";

		String expected="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"+
					"<first>\r\n    <second>\r\n        " +
					"<third1/>\r\n        <third2/>\r\n    " +
					"</second>\r\n</first>\r\n";
		
		String reformatted=XMLUtils.reformat(original);
		
		if (reformatted.equals(expected) == false) {
			fail("XML reformat incorrect: expected: "+expected+
					", but got: "+reformatted);
		}
	}

	public void testReformat3() {
		String original="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"+
				"<first>\r\n    <second>\r\n        <third1/>\r\n" +
				"        <third2/>\r\n" +
				"        <third3>\r\n            " +
				"Description\r\n        " +
				"</third3>\r\n    " +
				"</second>\r\n</first>\r\n";

		String expected="<?xml version=\"1.0\" encoding=\"UTF-8\"?>\r\n"+
					"<first>\r\n    <second>\r\n        " +
					"<third1/>\r\n        <third2/>\r\n" +
					"        <third3>\r\n            " +
					"Description\r\n        " +
					"</third3>\r\n    " +
					"</second>\r\n</first>\r\n";
		
		String reformatted=XMLUtils.reformat(original);
		
		if (reformatted.equals(expected) == false) {
			fail("XML reformat incorrect: expected: "+expected+
					", but got: "+reformatted);
		}
	}
	
	public void testEncodeQName1() {
		String source="Hello World";
		String expected="HelloWorld";
		String result=null;
		
		if ((result=XMLUtils.encodeQName(source)).equals(expected) == false) {
			fail("Encode QName("+source+") should be '"+expected+"': "+result);
		}
	}
	
	public void testEncodeQName2() {
		String source="Hello > World = 5 ? < 25.4";
		String expected="HelloGTWorldEQ5LT254";
		String result=null;
		
		if ((result=XMLUtils.encodeQName(source)).equals(expected) == false) {
			fail("Encode QName("+source+") should be '"+expected+"': "+result);
		}
	}
}
