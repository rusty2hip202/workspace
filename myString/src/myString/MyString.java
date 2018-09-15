package myString;

public class MyString {

	public static void append(char[] s1, char[] s2) {
		int i;
		for(i = 0; s1[i] != 0; i++) {}
		for(int j = 0; s2[j] != 0; j++) {
			s1[i+j] = s2[j];
		}
	}
	
	public static String toString(char[] s1) {
		StringBuffer sb = new StringBuffer();
		int i = 0;
		while(s1[i] != 0) {
			sb.append(s1[i]);
			i++;
		}
		return sb.toString();
	}
	
	public static boolean equ(char[] s1, char[] s2) {
		char c1 = 0, c2 = 0; boolean e1 = false, e2 = false;
		int i = 0;
		
		while(true) {
			try {
				c1 = s1[i];
			}catch(Exception e) {
				e1 = true;
			}
			try {
				c2 = s2[i];
			}catch(Exception e) {
				e2 = true;
			}
			
			if((e1 || c1 == 0) && (e2 || c2 == 0)) {
				return true;
			}
			
			//System.out.println(String.format("c1: \nc2: ", c1, c2));
			
			if(c1 != c2) {
				return false;
			}
			
			i++;
		}
	}
	
	public MyString(char[] c, String s) {
		for(int i = 0; i < s.length() && i < c.length; i++) {
			c[i] = s.charAt(i);
		}
	}
}
