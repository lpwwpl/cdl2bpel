/***********************************************************
 *                    SOA Framework                        *        
 *               Author : Dang Trung Anh                   *
 *             Email: dangtrunganh@gmail.com		       *
 *                Copyright (c) 2008-2009 			       *
 *          by Hanoi University of Technology              *
 *         Department of Software Engineering              *
 *           Faculty of Information Technology             *
 *                                                         *
 **********************************************************/

package edu.xjtu.cdl2bpel.bpel;

/**
 * <p>
 * Title: BPELConstants
 * </p>
 * <p>
 * Description:Class for BPEL constants (such as tag names).
 * </p>
 * <p>
 * Copyright: Copyright (c) 2008 - 2009
 * </p>
 * <p>
 * Company:
 * </p>
 * 
 * @author Dang Trung Anh
 * @version 1.4
 */
public class BPELConstants {
	static public final String stringAssign = "assign";
	static public final String stringBPEL = "bpel";
	static public final String stringCase = "case";
	static public final String stringEmpty = "empty";
	static public final String stringFlow = "flow";
	static public final String stringInvoke = "invoke";
	static public final String stringJoinCondition = "joinCondition";
	static public final String stringLink = "link";
	static public final String stringLinkName = "linkName";
	static public final String stringLinks = "links";
	static public final String stringName = "name";
	static public final String stringOnAlarm = "onAlarm";
	static public final String stringOnMessage = "onMessage";
	static public final String stringOtherwise = "otherwise";
	static public final String stringPick = "pick";
	static public final String stringProcess = "process";
	static public final String stringReceive = "receive";
	static public final String stringReply = "reply";
	static public final String stringScope = "scope";
	static public final String stringSequence = "sequence";
	static public final String stringSource = "source";
	static public final String stringSwitch = "switch";
	static public final String stringTarget = "target";
	static public final String stringWait = "wait";
	static public final String stringWhile = "while";

	public BPELConstants() {
	}

	static public boolean endsWith(String name, String end) {
		if (name.equalsIgnoreCase(end)) {
			return true;
		}
		int colon = name.lastIndexOf(":");
		if (colon >= 0) {
			String local = name.substring(colon + 1);
			return local.equalsIgnoreCase(end);
		}
		return false;
	}

	static public boolean isAssign(String name) {
		return endsWith(name, stringAssign);
	}

	static public boolean isCase(String name) {
		return endsWith(name, stringCase);
	}

	static public boolean isEmpty(String name) {
		return endsWith(name, stringEmpty);
	}

	static public boolean isFlow(String name) {
		return endsWith(name, stringFlow);
	}

	static public boolean isInvoke(String name) {
		return endsWith(name, stringInvoke);
	}

	static public boolean isName(String name) {
		return endsWith(name, stringName);
	}

	static public boolean isOnAlarm(String name) {
		return endsWith(name, stringOnAlarm);
	}

	static public boolean isOnMessage(String name) {
		return endsWith(name, stringOnMessage);
	}

	static public boolean isOtherwise(String name) {
		return endsWith(name, stringOtherwise);
	}

	static public boolean isPick(String name) {
		return endsWith(name, stringPick);
	}

	static public boolean isReceive(String name) {
		return endsWith(name, stringReceive);
	}

	static public boolean isReply(String name) {
		return endsWith(name, stringReply);
	}

	static public boolean isScope(String name) {
		return endsWith(name, stringScope);
	}

	static public boolean isSequence(String name) {
		return endsWith(name, stringSequence);
	}

	static public boolean isSource(String name) {
		return endsWith(name, stringSource);
	}

	static public boolean isSwitch(String name) {
		return endsWith(name, stringSwitch);
	}

	static public boolean isTarget(String name) {
		return endsWith(name, stringTarget);
	}

	static public boolean isWait(String name) {
		return endsWith(name, stringWait);
	}

	static public boolean isWhile(String name) {
		return endsWith(name, stringWhile);
	}

	static public boolean isBasic(String name) {
		return isAssign(name) || isEmpty(name) || isInvoke(name)
				|| isReceive(name) || isReply(name) || isWait(name);
	}

	static public boolean isStructured(String name) {
		return isFlow(name) || isPick(name) || isScope(name)
				|| isSequence(name) || isSwitch(name) || isWhile(name);
	}

	static public boolean isActivity(String name) {
		return isBasic(name) || isStructured(name);
	}
}
