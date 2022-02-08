package Netherite.UI;

import Netherite.Utils;

public class UIColor {
	public static int Black = UIColor.FromRGBA(0, 0, 0, 255);
	public static int TransBlack = UIColor.FromRGBA(0, 0, 0, 160);
	
	public static int Red = UIColor.FromRGBA(255, 0, 0, 255);
	public static int TransRed = UIColor.FromRGBA(255, 0, 0, 160);
	
	public static int Green = UIColor.FromRGBA(0, 255, 0, 255);
	public static int TransGreen = UIColor.FromRGBA(0, 255, 0, 160);
	
	public static int Blue = UIColor.FromRGBA(0, 0, 255, 255);
	public static int TransBlue = UIColor.FromRGBA(0, 0, 255, 160);
	
	public static int White = UIColor.FromRGBA(255, 255, 255, 255);
	public static int TransWhite = UIColor.FromRGBA(255, 255, 255, 160);
	
	public static int FromRGBA(int r, int g, int b, int a) { // RGBA 2 HEX (this took hours)
		int output = 0;

		String RED = Integer.toHexString(r);
		String GREEN = Integer.toHexString(g);
		String BLUE = Integer.toHexString(b);
		String ALPHA = Integer.toHexString(a);

		if (RED.length() == 1) RED = "0" + RED;
		if (GREEN.length() == 1) GREEN = "0" + GREEN;
		if (BLUE.length() == 1) BLUE = "0" + BLUE;
		if (ALPHA.length() == 1) ALPHA = "0" + ALPHA;
		
		String HEXSTR = ALPHA + RED + GREEN + BLUE;
		
		output = (int)Long.parseUnsignedLong(HEXSTR, 16);
		
		return output;
	}
}
