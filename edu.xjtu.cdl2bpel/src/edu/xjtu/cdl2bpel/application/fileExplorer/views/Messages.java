// Decompiled by Jad v1.5.8e2. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://kpdus.tripod.com/jad.html
// Decompiler options: packimports(3) fieldsfirst ansi space 
// Source File Name:   Messages.java

package edu.xjtu.cdl2bpel.application.fileExplorer.views;

import java.text.MessageFormat;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

public class Messages {

	private static final String BUNDLE_NAME = "edu.xjtu.cdl2bpel.application.fileExplorer.views.messages";
	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle("edu.xjtu.cdl2bpel.application.fileExplorer.views.messages");

	private Messages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException ex) {
			return '!' + key + '!';
		}
	}

	public static String getString(String key, Object arguments[]) {
		return MessageFormat.format(getString(key), arguments);
	}

	public static String getString(String key, Object arg1) {
		Object obj[] = { arg1 };
		return getString(key, obj);
	}

	public static String getString(String key, Object arg1, Object arg2) {
		Object obj[] = { arg1, arg2 };
		return getString(key, obj);
	}

	public static String getString(String key, Object arg1, Object arg2,
			Object arg3) {
		Object obj[] = { arg1, arg2, arg3 };
		return getString(key, obj);
	}

}
