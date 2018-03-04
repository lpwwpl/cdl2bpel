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
package edu.xjtu.cdl2bpel.utils;

import java.awt.Color;

/**
 * <p>
 * Title: ColorRepository.java
 * </p>
 * <p>
 * Description:
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
public class ColorRepository {

	public static final int STEPS = 512;
	protected static Color[] colors;

	public static Color getGradualColor(double value) {
		if (value > 1.0) {
			// System.err.println("getGradualColor: value overflow at " +
			// value);
			value = 1.0;
		} else if (value < 0.0) {
			// System.err.println("getGradualColor: value underflow at " +
			// value);
			value = 0.0;
		}
		if (colors == null) {
			createColorRepository();
		}
		int index = (int) (value * (ColorRepository.STEPS - 1));
		return colors[index];
	}

	public static Color getGradualColorBlackZero(double value) {
		if (value == 0.0) {
			return Color.BLACK;
		} else {
			return getGradualColor(value);
		}
	}

	protected static void createColorRepository() {
		colors = new Color[ColorRepository.STEPS];
		for (int i = 0; i < ColorRepository.STEPS; i++) {
			float value = ((float) (i + 1)) / ((float) ColorRepository.STEPS);
			colors[i] = generateColor(value);
		}
	}

	protected static Color generateColor(float value) {
		if (value == 0.0f) {
			return Color.BLACK;
		}
		if (value < 0.0f) {
			// System.err.println("generateColor: value underflow at " + value);
			value = 0.0f;
		} else if (value > 1.0f) {
			// System.err.println("generateColor: value overflow at " + value);
			value = 1.0f;
		}
		float red, green, blue;
		if (value < 0.5) {
			red = 0.0f;
			green = value * 2.0f;
			blue = 1.0f - green;
		} else {
			red = (value - 0.5f) * 2.0f;
			green = 1.0f - value;
			blue = 0.0f;
		}
		return new Color(red, green, blue);
	}

}
