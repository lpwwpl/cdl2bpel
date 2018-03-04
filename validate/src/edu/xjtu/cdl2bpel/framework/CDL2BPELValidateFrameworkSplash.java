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

package edu.xjtu.cdl2bpel.framework;

import java.util.ArrayList;

public interface CDL2BPELValidateFrameworkSplash {

	public abstract void open();

	public abstract void close();

	public abstract void changeText(String s, int status);

	public abstract void setProgress(int progress);

	public abstract ArrayList getLog();

}