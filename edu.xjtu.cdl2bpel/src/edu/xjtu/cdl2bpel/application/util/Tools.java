package edu.xjtu.cdl2bpel.application.util;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;
import java.util.Vector;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;

public class Tools {

	/**
	 * ʮ������
	 * 
	 * @return string
	 */
	private static String[] HexCode = { "0", "1", "2", "3", "4", "5", "6", "7",
			"8", "9", "A", "B", "C", "D", "E", "F" };

	public Tools() {
	}

	public static byte[] hexStringToBytes(String hexString) {
		if (hexString == null)
			return null;
		int len = hexString.length() / 2;
		byte b[] = new byte[len];
		int p = 0;
		for (int i = 0; i < len; i++) {
			b[i] = (byte) Integer.parseInt(hexString.substring(p, p + 2), 16);
			p += 2;
		}

		return b;
	}

	/**
	 * ��byte �ֽ�ת��Ϊʮ�����ƴ�
	 * 
	 * @param b
	 *            byte
	 * @return string
	 */
	public static String byteToHexString(byte b) {
		int n = b;
		if (n < 0) {
			n = 256 + n;
		}
		int d1 = n / 16;
		int d2 = n % 16;
		return HexCode[d1] + HexCode[d2];
	}

	public static String byteArrayToHexString(byte[] b) {
		String result = "";
		for (int i = 0; i < b.length; i++) {
			result = result + byteToHexString(b[i]);
		}
		return result;
	}

	public static int byteToInt(byte[] b, int offset) {
		return (b[offset] & 0xff) | ((b[offset + 1] & 0xff) << 8)
				| ((b[offset + 2] & 0xff) << 16)
				| ((b[offset + 3] & 0xff) << 24);
	}

	public static int byteToInt(byte[] b) {
		return (b[0] & 0xff) | ((b[1] & 0xff) << 8) | ((b[2] & 0xff) << 16)
				| ((b[3] & 0xff) << 24);
	}

	public static long byteToLong(byte[] b) {
		return ((long) b[7] & (long) 255) | (((long) b[6] & (long) 255) << 8)
				| (((long) b[5] & (long) 255) << 16)
				| (((long) b[4] & (long) 255) << 24)
				| (((long) b[3] & (long) 255) << 32)
				| (((long) b[2] & (long) 255) << 40)
				| (((long) b[1] & (long) 255) << 48) | ((long) b[0] << 56);
	}

	public static long byteToLong(byte[] b, int offset) {
		return ((long) b[offset + 7] & (long) 255)
				| (((long) b[offset + 6] & (long) 255) << 8)
				| (((long) b[offset + 5] & (long) 255) << 16)
				| (((long) b[offset + 4] & (long) 255) << 24)
				| (((long) b[offset + 3] & (long) 255) << 32)
				| (((long) b[offset + 2] & (long) 255) << 40)
				| (((long) b[offset + 1] & (long) 255) << 48)
				| ((long) b[offset] << 56);
	}

	public static String doubleToStr(Double input) {
		double d = input.doubleValue();
		NumberFormat nf = NumberFormat.getInstance();
		String s = "#.##";
		nf = new DecimalFormat(s);
		String ss = nf.format(d);
		return ss;
	}

	/**
	 * n Ϊ4���ֽ�
	 * 
	 * @param n
	 *            int
	 * @return byte
	 */
	public static byte[] intToByte(int n) {
		byte[] b = new byte[4];
		b[3] = (byte) (n >> 24);
		b[2] = (byte) (n >> 16);
		b[1] = (byte) (n >> 8);
		b[0] = (byte) n;
		return b;
	}

	/**
	 * n Ϊ��ת���ݣ�4���ֽڣ���buf[]Ϊת��������ݣ�offsetΪbuf[]��ת������ʼ�� ת�������ݴӵ͵���λ
	 * 
	 * @param n
	 *            int
	 * @param buf
	 *            byte
	 * @param offset
	 *            offset
	 */
	public static void intToByte(int n, byte[] buf, int offset) {
		buf[offset + 3] = (byte) (n >> 24);
		buf[offset + 2] = (byte) (n >> 16);
		buf[offset + 1] = (byte) (n >> 8);
		buf[offset] = (byte) n;
	}

	public static byte[] shortToByte(int n) {
		byte[] b = new byte[2];
		b[0] = (byte) (n >> 8);
		b[1] = (byte) n;
		return b;
	}

	public static void shortToByte(int n, byte[] buf, int offset) {
		buf[offset] = (byte) (n >> 8);
		buf[offset + 1] = (byte) n;
	}

	public static byte[] longToByte(long n) {
		byte[] b = new byte[8];
		b[0] = (byte) (int) (n >> 56);
		b[1] = (byte) (int) (n >> 48);
		b[2] = (byte) (int) (n >> 40);
		b[3] = (byte) (int) (n >> 32);
		b[4] = (byte) (int) (n >> 24);
		b[5] = (byte) (int) (n >> 16);
		b[6] = (byte) (int) (n >> 8);
		b[7] = (byte) (int) n;
		return b;
	}

	public static void longToByte(long n, byte[] buf, int offset) {
		buf[offset] = (byte) (int) (n >> 56);
		buf[offset + 1] = (byte) (int) (n >> 48);
		buf[offset + 2] = (byte) (int) (n >> 40);
		buf[offset + 3] = (byte) (int) (n >> 32);
		buf[offset + 4] = (byte) (int) (n >> 24);
		buf[offset + 5] = (byte) (int) (n >> 16);
		buf[offset + 6] = (byte) (int) (n >> 8);
		buf[offset + 7] = (byte) (int) n;
	}

	/**
	 * ��ż���ֻ������Ƿ���11λ���֣����Ƿ���13��ͷ
	 * 
	 * @param sMobile
	 *            String ������ֻ�����
	 * @return boolean true���Ϲ淶
	 */
	public static boolean checkMobile(String sMobile) {
		if (sMobile == null) {
			return false;
		}
		if (sMobile.length() != 11) {
			return false;
		}
		return sMobile.substring(0, 2).equals("13");
	}

	/**
	 * �ַ����滻����
	 * 
	 * @param sAll
	 *            String ԭ�����ַ���
	 * @param sOld
	 *            String Ҫ�滻�����ַ���
	 * @param sNew
	 *            String �µ��ַ���
	 * @return String �滻��Ľ��
	 */
	public static synchronized String strReplace(String sAll, String sOld,
			String sNew) {
		int iT = 0;
		String sF = null;
		String sH = null;
		/* ����´��а����ɴ�,�������ֻ������ */
		if (sNew.indexOf(sOld) != -1) {
			return sAll;
		}
		if ((sAll == null) || (sOld == null) || (sNew == null)) {
			return sAll;
		}
		iT = sAll.indexOf(sOld);
		while (iT != -1) {
			sF = sAll.substring(0, iT);
			sH = sAll.substring(iT + sOld.length());
			sAll = sF + sNew + sH;
			iT = sAll.indexOf(sOld);
		}
		return sAll;
	}

	/**
	 * ���˽����ַ�{MO}
	 * 
	 * @param sMo
	 *            String ת��ǰ�ַ�
	 * @return boolean ת�����ַ�
	 * @˵��
	 */
	public static synchronized String convertMoString(String sMo) {
		String sReturn = sMo;
		if (sReturn == null) {
			return sReturn;
		}
		try {
			sReturn = sReturn.toUpperCase();
			sReturn = sReturn.replace('��', ',');
			sReturn = sReturn.replace('��', '.');
			sReturn = sReturn.replace('��', ';');
			sReturn = sReturn.replace('��', '!');
			sReturn = sReturn.replace('��', '?');
			sReturn = sReturn.replace('��', ':');
			sReturn = sReturn.replace('"', '��');
			sReturn = sReturn.replace('��', '��');
			sReturn = sReturn.replace('��', '��');
			// sReturn = sReturn.replace('-', ' ');
			// sReturn = sReturn.replace('_', ' ');
			sReturn = sReturn.replace('��', ',');
			sReturn = sReturn.replace('��', '0');
			sReturn = sReturn.replace('��', '1');
			sReturn = sReturn.replace('��', '2');
			sReturn = sReturn.replace('��', '3');
			sReturn = sReturn.replace('��', '4');
			sReturn = sReturn.replace('��', '5');
			sReturn = sReturn.replace('��', '6');
			sReturn = sReturn.replace('��', '7');
			sReturn = sReturn.replace('��', '8');
			sReturn = sReturn.replace('��', '9');
			sReturn = sReturn.replace('��', 'A');
			sReturn = sReturn.replace('��', 'B');
			sReturn = sReturn.replace('��', 'C');
			sReturn = sReturn.replace('��', 'D');
			sReturn = sReturn.replace('��', 'E');
			sReturn = sReturn.replace('��', 'F');
			sReturn = sReturn.replace('��', 'G');
			sReturn = sReturn.replace('��', 'H');
			sReturn = sReturn.replace('��', 'I');
			sReturn = sReturn.replace('��', 'J');
			sReturn = sReturn.replace('��', 'K');
			sReturn = sReturn.replace('��', 'L');
			sReturn = sReturn.replace('��', 'M');
			sReturn = sReturn.replace('��', 'N');
			sReturn = sReturn.replace('��', 'O');
			sReturn = sReturn.replace('��', 'P');
			sReturn = sReturn.replace('��', 'Q');
			sReturn = sReturn.replace('��', 'R');
			sReturn = sReturn.replace('��', 'S');
			sReturn = sReturn.replace('��', 'T');
			sReturn = sReturn.replace('��', 'U');
			sReturn = sReturn.replace('��', 'V');
			sReturn = sReturn.replace('��', 'W');
			sReturn = sReturn.replace('��', 'X');
			sReturn = sReturn.replace('��', 'Y');
			sReturn = sReturn.replace('��', 'Z');
			sReturn = strReplace(sReturn, "��", "'");
		} catch (Exception ex) {
			return sMo;
		}
		return sReturn;
	}

	/**
	 * ���˽����ַ�{MT}
	 * 
	 * @param sMt
	 *            String ת��ǰ�ַ�
	 * @return string ת�����ַ�
	 * @˵��
	 */
	public static synchronized String convertMtString(String sMt) {
		String sReturn = sMt;
		if (sReturn == null) {
			return sReturn;
		}
		try {
			sReturn = strReplace(sReturn, "��", "'");
			sReturn = sReturn.replace('��', ',');
			sReturn = sReturn.replace('��', '.');
			sReturn = sReturn.replace('��', ';');
			sReturn = sReturn.replace('��', '!');
			sReturn = sReturn.replace('��', '?');
			sReturn = sReturn.replace('��', ':');
			sReturn = sReturn.replace('"', '��');
			sReturn = sReturn.replace('\'', '��');
			sReturn = sReturn.replace('��', '��');
			sReturn = sReturn.replace('��', '��');
		} catch (Exception ex) {
			return sMt;
		}
		return sReturn;
	}

	/**
	 * �����ַ�,����ӦJavaScript���Ҫ��
	 * 
	 * @param sMt
	 *            String ת��ǰ�ַ�
	 * @return string ת�����ַ�
	 * @˵��
	 */
	public static synchronized String convert2JsString(String sMt) {
		String sReturn = sMt;
		if (sReturn == null) {
			return sReturn;
		}
		try {
			sReturn = strReplace(sReturn, "'", "��");
			sReturn = sReturn.replace('"', '��');
		} catch (Exception ex) {
			return sMt;
		}
		return sReturn;
	}

	/**
	 * is numeric
	 * 
	 * @param msg
	 *            msg body string
	 * @return boolean
	 */
	public static boolean isNumeric(String msg) {
		try {
			Integer.parseInt(msg, 10);
		} catch (Exception ex) {
			return false;
		}
		return true;
	}

	/**
	 * ��byte����ת��Ϊ�ַ���
	 * 
	 * @param b
	 *            Ҫת��������
	 * @return��ת������ַ���
	 */
	public static String byteArrayToString(byte[] b) {
		byte[] bb = new byte[b.length + 1];
		System.arraycopy(b, 0, bb, 0, b.length);

		return new String(bb).trim();
	}

	/**
	 * ȡ���ֻ���������Ӫ��
	 * 
	 * @param mobileNum
	 *            �绰����
	 * @return String (0�ƶ�,1��ͨ,2ģ��,3����)
	 */
	public static String getMobileType(String mobileNum) {
		if (mobileNum == null || mobileNum.length() == 0) {
			return null;
		}

		if (isMoblie(mobileNum))
			return "0";
		else if (isUnicom(mobileNum))
			return "1";
		else if (isTelcom(mobileNum))
			return "3";
		else if (mobileNum.substring(0, 3).equals("999"))
			return "2";
		else
			return null;
	}

	/**
	 * �ж��Ƿ�Ϊ�ƶ����ֻ�����
	 * 
	 * @param num
	 *            �绰����
	 * @return boolean
	 */
	public static boolean isMoblie(String num) {
		if (num == null)
			return false;

		if (num.substring(0, 3).equals("134")
				|| num.substring(0, 3).equals("135")
				|| num.substring(0, 3).equals("136")
				|| num.substring(0, 3).equals("137")
				|| num.substring(0, 3).equals("138")
				|| num.substring(0, 3).equals("139")) {
			if (num.length() == 11)
				return true;
			else
				return false;
		} else
			return false;
	}

	/**
	 * �ж��Ƿ�Ϊ��ͨ���ֻ�����
	 * 
	 * @param num
	 *            �绰����
	 * @return boolean
	 */
	public static boolean isUnicom(String num) {
		if (num == null)
			return false;

		if (num.substring(0, 3).equals("130")
				|| num.substring(0, 3).equals("131")
				|| num.substring(0, 3).equals("132")
				|| num.substring(0, 3).equals("133")) {
			if (num.length() == 11)
				return true;
			else
				return false;
		} else
			return false;
	}

	/**
	 * �жϵ绰�����Ƿ�Ϊ���ŵĺ���
	 * 
	 * @param num
	 *            �绰����
	 * @return boolean
	 */
	public static boolean isTelcom(String num) {
		if (num == null)
			return false;
		if (num.length() > 7 && num.length() <= 12)
			return true;
		else
			return false;
	}

	/**
	 * ��GZIP��ʽѹ������
	 * 
	 * @param data
	 *            String
	 * @throws Exception
	 * @return byte[]
	 */
	public static byte[] zip(String data) throws Exception {
		return zip(data.getBytes());
	}

	/**
	 * ��GZIP��ʽѹ������
	 * 
	 * @param buffer
	 *            byte[]
	 * @throws Exception
	 * @return byte[]
	 */
	public static byte[] zip(byte[] buffer) throws Exception {
		// �����ֽ����������
		ByteArrayOutputStream o = new ByteArrayOutputStream();
		// ����gzipѹ�������
		GZIPOutputStream gzout = new GZIPOutputStream(o);
		gzout.write(buffer);
		gzout.finish();
		gzout.close();

		// ����ѹ���ֽ���
		byte[] data_ = o.toByteArray();
		o.close();
		return data_;
	}

	/**
	 * ��ѹ��GZIPѹ��������
	 * 
	 * @param data
	 *            String
	 * @throws Exception
	 * @return byte[]
	 */
	public static byte[] unZip(String hexStr) throws Exception {
		return unZip(Tools.hexStringToBytes(hexStr));
	}

	/**
	 * ��ѹ��GZIPѹ��������
	 * 
	 * @param buffer
	 *            byte[]
	 * @throws Exception
	 * @return byte[]
	 */
	public static byte[] unZip(byte[] buffer) throws Exception {
		byte[] buf = new byte[4096 * 2];
		// �����ֽ�����������
		ByteArrayInputStream i = new ByteArrayInputStream(buffer);
		// ����gzip��ѹ������
		GZIPInputStream gzin = new GZIPInputStream(i);
		int size = gzin.read(buf);
		i.close();
		gzin.close();
		byte b[] = new byte[size];
		System.arraycopy(buf, 0, b, 0, size);

		return b;
	}

	/**
	 * ��Vectorת���ɶ�ά���� ���� Vector,��������
	 */
	public static String[][] vector2Ary(Vector<String[]> v, int clos) {
		int int_loop = 0;
		String tmpAry[][] = {};
		if (v.size() == 0)
			return tmpAry;
		String str_return[][] = new String[v.size()][clos];
		while (true) {
			try {
				str_return[int_loop] = (String[]) v.elementAt(int_loop);
			} catch (ArrayIndexOutOfBoundsException e) {
				break;
			}
			int_loop++;
		}
		return str_return;
	}

	/**
	 * ���ַ�������ת��JS�������� ����:��������,����������,Ԫ����
	 */
	public static String ary2JsStr(String[][] dataAry, String[] titleAry,
			String itemname) {
		String titleAryName = itemname + "TitleAry";
		String dataAryName = itemname + "DataAry";
		String tmpStr = "";
		StringBuffer rtnStr = new StringBuffer("var " + titleAryName
				+ " = new Array();\r\n" + "var " + dataAryName
				+ "  = new Array();\r\n");
		int i = 0, j = 0;
		if (titleAry != null && titleAry.length > 0) {
			rtnStr.append(titleAryName + "= new Array(");
			tmpStr = "";
			for (i = 0; i < titleAry.length; i++) {
				tmpStr += "\"" + titleAry[i] + "\",";
			}
			if (tmpStr != null && tmpStr.length() > 0) {
				rtnStr.append(tmpStr.substring(0, tmpStr.length() - 1)
						+ ");\r\n");
			}
		} else {
			// û��Ԫ��ҲҪ����һ��������
			rtnStr.append(titleAryName + "[0]= new Array();\r\n");
		}

		if (dataAry != null && dataAry.length > 0) {
			for (i = 0; i < dataAry.length; i++) {
				rtnStr.append(dataAryName + "[" + i + "]= new Array(");
				tmpStr = "";
				if (dataAry[i] != null && dataAry[i].length > 0) {
					for (j = 0; j < dataAry[i].length; j++) {
						tmpStr += "\"" + dataAry[i][j] + "\",";
					}
					if (tmpStr != null && tmpStr.length() > 0) {
						rtnStr.append(tmpStr.substring(0, tmpStr.length() - 1)
								+ ");\r\n");
					}
				}
			}
		} else {
			// û������ҲҪ����һ��������
			rtnStr.append(dataAryName + "[0]= new Array();\r\n");
		}
		return rtnStr.toString();
	}

	public static String formatStr4SplitByDollarChar(String str) {
		try {
			String tmpStr = str;
			tmpStr = tmpStr.replaceAll("\\$\\$", "\\$_\\$");
			if ("$".equals(tmpStr.substring(tmpStr.length() - 1, tmpStr
					.length()))) {
				// the end of char is "$"
				tmpStr += "_";
			}
			return tmpStr;
		} catch (Exception e) {
			return str;
		}
	}

	// �ַ���ת��
	public static String gb2Iso(String gbStr) {
		String str = null;
		try {
			str = new String(gbStr.getBytes("GBK"), "8859_1");
		} catch (Exception e) {
		}
		return str;
	}

	public static String iso2Gb(String Str) {
		String str = "";
		try {
			str = new String(Str.getBytes("8859_1"), "GBK");
		} catch (Exception e) {
		}
		return str;
	}

	// ȡ����
	public static Date getTomorrow() {
		java.util.Date d = new java.util.Date();
		java.util.Calendar c = java.util.Calendar.getInstance();
		c.setTime(d);
		c.add(java.util.Calendar.DAY_OF_MONTH, 1);
		return c.getTime();
	}

	public static Date getTomorrow(java.util.Date d) {
		java.util.Calendar c = java.util.Calendar.getInstance();
		c.setTime(d);
		c.add(java.util.Calendar.DAY_OF_MONTH, 1);
		return c.getTime();
	}

	// ȡ�൱ǰ����������·��
	public static String getClassTruePath() {
		Tools tools = new Tools();
		String path = tools.getClass().getProtectionDomain().getCodeSource()
				.getLocation().getPath();
		return path;
	}

	// ȡ�������еĸ�Ŀ¼����������·��
	public static String getRootTruePath() {
		String classPath = getClassTruePath();
		String rtn = classPath.substring(0, classPath.indexOf("classes"));
		rtn = (rtn.indexOf("WEB-INF") >= -1) ? rtn.substring(0, rtn
				.indexOf("WEB-INF")) : rtn;
		return rtn;
	}

	public static String getActivePath(String activePath) {
		Date now = new Date();
		String path = activePath.replaceAll("\\$\\(yyyy\\)",
				getDateTimeString(now, "yyyy")).replaceAll("\\$\\(MM\\)",
				getDateTimeString(now, "MM")).replaceAll("\\$\\(dd\\)",
				getDateTimeString(now, "dd")).replaceAll("\\$\\(HH\\)",
				getDateTimeString(now, "HH")).replaceAll("\\$\\(mm\\)",
				getDateTimeString(now, "mm")).replaceAll("\\$\\(ss\\)",
				getDateTimeString(now, "ss"));
		return path;
	}

	public static String markDir(String path) {

		try {
			java.io.File file = new java.io.File(path);
			if (!file.exists()) {
				file.mkdirs(); // ����·����
			}
			return path;
		} catch (Exception ex) {
			return path;
		}
	}

	// ȡ����
	public static Date getYesterday() {
		java.util.Date d = new java.util.Date();
		java.util.Calendar c = java.util.Calendar.getInstance();
		c.setTime(d);
		c.add(java.util.Calendar.DAY_OF_MONTH, -1);
		return c.getTime();
	}

	public static Date getYesterday(java.util.Date d) {
		java.util.Calendar c = java.util.Calendar.getInstance();
		c.setTime(d);
		c.add(java.util.Calendar.DAY_OF_MONTH, -1);
		return c.getTime();
	}

	// ����ʽ���������ַ���
	public static String getDateTimeString(java.util.Date date, String fmt) {
		java.text.SimpleDateFormat fm = new java.text.SimpleDateFormat(fmt);
		try {
			return fm.format(date);
		} catch (Exception e) {
			return fm.format(new java.util.Date());
		} finally {
			fm = null;
		}
	}

	// ����ʽ��������
	public static Date getDateTime(String date, String fmt) {
		java.text.SimpleDateFormat fm = new java.text.SimpleDateFormat(fmt);
		try {
			return fm.parse(date);
		} catch (Exception e) {
			return new Date();
		} finally {
			fm = null;
		}
	}

	// ����ʽ���������ַ���
	public static String getDateTimeStringByCost(String costtype, int cost,
			String fmt) {
		java.text.SimpleDateFormat fm = new java.text.SimpleDateFormat(fmt);
		try {
			costtype = costtype.toUpperCase();
			java.util.Calendar strDate = java.util.Calendar.getInstance();
			if ("YEAE".equals(costtype) || "Y".equals(costtype)) {
				strDate.add(strDate.YEAR, cost);
			} else if ("MONTH".equals(costtype) || "M".equals(costtype)) {
				strDate.add(strDate.MONTH, cost + 1); // ��Ҫ��1
			} else if ("DAY".equals(costtype) || "D".equals(costtype)) {
				strDate.add(strDate.DATE, cost);
			} else if ("HOUR".equals(costtype) || "H".equals(costtype)) {
				strDate.add(strDate.HOUR, cost);
			} else if ("MINUTE".equals(costtype) || "MI".equals(costtype)) {
				strDate.add(strDate.MINUTE, cost);
			} else if ("SECOND".equals(costtype) || "S".equals(costtype)) {
				strDate.add(strDate.SECOND, cost);
			}
			return fm.format(strDate.getTime());
		} catch (Exception e) {
			return fm.format(new java.util.Date());
		} finally {
			fm = null;
		}
	}

	/**
	 * ���Ŀ¼�Ƿ���ڲ����ر��ص�ַ
	 * 
	 * @param fileName
	 * @return
	 */
//	public static String getRealFilePath(String fileName) {
//
//		String filepath = (String) ServletActionContext.getServletContext()
//				.getRealPath("")
//				+ java.io.File.separator + fileName;
//		File file = new File(filepath);
//		if (!file.exists()) {
//			file.mkdirs();
//		}
//		return filepath;
//
//	}

	// ��WEB����ʹ��
	public String getContextFilePath(String fileName) {
		String tempPath = this.getClass().getResource("/").getPath();
		if (tempPath != null && tempPath.length() > 0) {
			tempPath = tempPath.replaceAll("WEB-INF/classes/", "");
		}
		String filepath = tempPath + fileName;
		File file = new File(filepath);
		if (!file.exists()) {
			file.mkdirs();
		}
		return filepath;
	}

	/**
	 * ���Ŀ¼�Ƿ���ڲ����ر��ص�ַ
	 * 
	 * @param fileName
	 * @return
	 */
//	public String getTrueFilePath(String fileName) {
//
//		String filepath = (String) ServletActionContext.getServletContext()
//				.getRealPath("")
//				+ java.io.File.separator + fileName;
//		File file = new File(filepath);
//		if (!file.exists()) {
//			file.mkdirs();
//		}
//		return filepath;
//
//	}

	/**
	 * �ļ�����
	 * 
	 * @param src
	 *            /
	 * @param dst
	 */
	public void copyFile(File src, File dst) {
		try {
			InputStream in = null;
			OutputStream out = null;
			try {
				in = new BufferedInputStream(new FileInputStream(src),
						16 * 1024);
				out = new BufferedOutputStream(new FileOutputStream(dst),
						16 * 1024);
				byte[] buffer = new byte[16 * 1024];
				while (in.read(buffer) > 0) {
					out.write(buffer);
				}
			} finally {
				if (null != in) {
					in.close();
				}
				if (null != out) {
					out.close();
				}
			}
		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	// �ļ�ɾ������
	public static void deleteFile(String filepath) throws IOException {
		File f = new File(filepath);// �����ļ�·��
		if (f.exists() && f.isDirectory()) {// �ж����ļ�����Ŀ¼
			if (f.listFiles().length == 0) {// ��Ŀ¼��û���ļ���ֱ��ɾ��
				f.delete();
			} else {// ��������ļ��Ž����飬���ж��Ƿ����¼�Ŀ¼
				File delFile[] = f.listFiles();
				int i = f.listFiles().length;
				for (int j = 0; j < i; j++) {
					if (delFile[j].isDirectory()) {
						deleteFile(delFile[j].getAbsolutePath());// �ݹ����del������ȡ����Ŀ¼·��
					}
					delFile[j].delete();// ɾ���ļ�
				}
			}
			deleteFile(filepath);// �ݹ����
		} else {
			f.delete();
		}
	}

	/*
	 * ��������ļ���
	 */
	public synchronized String generateRandomFilename() {
		String RandomFilename = "";
		Random rand = new Random();// ���������
		int random = rand.nextInt();
		Calendar calCurrent = Calendar.getInstance();
		int intHour = calCurrent.get(Calendar.HOUR_OF_DAY);
		int intDay = calCurrent.get(Calendar.DATE);
		int intMonth = calCurrent.get(Calendar.MONTH) + 1;
		int intYear = calCurrent.get(Calendar.YEAR);
		String now = String.valueOf(intYear) + "_" + String.valueOf(intMonth)
				+ "_" + String.valueOf(intDay) + "_" + String.valueOf(intHour)
				+ "_";
		RandomFilename = now
				+ String.valueOf(random > 0 ? random : (-1) * random);
		return RandomFilename;
	}

	public String addStrTo2000byte(String str) {
		if (str.length() > 1000 && str.length() < 2001) {
			StringBuffer sbf = new StringBuffer();
			for (int i = 0; i < ((2001 - str.length()) / 100); i++) {
				sbf
						.append("                                                                                                    ");
			}
			sbf
					.append("                                                                                                    ");
			str += sbf.toString();
		} else if (str.length() <= 0) {
			str = "&nbsp;";
		}
		return str;
	}

	/***
	 * ��ȡ�ļ���׺��
	 * 
	 * @param fileName
	 * @return
	 */
	public static String getExtention(String fileName) {
		int pos = fileName.lastIndexOf(".");
		String result = fileName.substring(pos+1);
		return result;
	}

	public String formatNumber(Double fee) { // ��double���͸�ʽ������ֹ���Ϊ��ѧ������
		String str = "";
		try {

			// NumberFormat nf = NumberFormat.getNumberInstance(loc);
			DecimalFormat df = new DecimalFormat("###########.##");
			String output = df.format(fee);

			str = output;
		} catch (Exception ex) {
		}
		return str;
	}

	public static void main(String[] arg) {
		Double d = 12345678d;
		System.out.print(Tools.doubleToStr(d));

	}
}