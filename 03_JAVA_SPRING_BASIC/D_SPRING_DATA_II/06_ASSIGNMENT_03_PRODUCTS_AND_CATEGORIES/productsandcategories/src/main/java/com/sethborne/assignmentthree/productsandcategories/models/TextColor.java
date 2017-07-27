package com.sethborne.assignmentthree.productsandcategories.models;

public class TextColor {
	public static String ANSI_RESET;
	public static String RED_BKGRD;
	public static String GREEN_BKGRD;
	public static String CYAN_BKGRD;
	public static String WHITE_TXT;
	
//	public static final String RESET_ALL = "\u001B[0m";
//	public static final String RED_BKGRD = "\u001B[41m";
//	public static final String GREEN_BKGRD = "\u001B[42m";
//	public static final String CYAN_BKGRD = "\u001B[46m";
//	public static final String BLUE_BKGRD = "\u001B[44m";
//	public static final String PURPLE_BKGRD = "\u001B[45m";
//	public static final String WHITE_TXT = "\u001B[37m";
	
	public static String getColor(String colorInput) {
		if(colorInput == "RESET_ALL") {
			ANSI_RESET = "\u001B[0m";
			return ANSI_RESET;
		}
		else if(colorInput == "RED_BKGRD") {
			RED_BKGRD = "\u001B[31m";
			return RED_BKGRD;
		}
		else if(colorInput == "GREEN_BKGRD") {
			GREEN_BKGRD = "\u001B[42m";
			return GREEN_BKGRD;
		}
		else if(colorInput == "CYAN_BKGRD") {
			CYAN_BKGRD = "\u001B[46m";
			return CYAN_BKGRD;
		}
		else if(colorInput == "WHITE_TXT") {
			WHITE_TXT = "\u001B[37m";
			return WHITE_TXT;
		}
		return null;
	}
}
