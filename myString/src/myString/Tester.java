package myString;

public class Tester {

	public static void main(String[] args) {
		
		char[] s1 = new char[65];
		char[] s2 = new char[15];
		
		/*s1[0] = 'w';
		s1[1] = 'i';
		s1[2] = 'l';
		s1[3] = 'l';
		s1[4] = ' ';
		s2[0] = 'w';
		s2[1] = 'o';
		s2[2] = 'r';
		s2[3] = 'k';
		s2[4] = '?';

		System.out.println(MyString.toString(s1));
		System.out.println(MyString.toString(s2));
		MyString.append(s1, s2);
		System.out.println(MyString.toString(s1));*/
		
		new MyString(s1, "asda");
		new MyString(s2, "asd");
		
		System.out.println(MyString.equ(s1, s2));
		
		
		
	}
}
