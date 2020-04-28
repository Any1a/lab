# lab
import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
	public static void main (String[] args) throws java.lang.Exception
	{
		for (int i = 0; i < args.length; i++) { 
			String s = args[i];
			if (IsPalindrome(s)) {
				System.out.println(s + " - палиндром");
			} else {
				System.out.println(s + " - не палиндром");
			}
		}
	}
 
	public static String reverseString(String s) {
		String word = "";
		for (int i = s.length() - 1; i>=0; i--) {
			word += s.charAt(i);
		}
		return word;
	}
 
	public static boolean IsPalindrome(String s) {
		return s.equals(reverseString(s));
	}
}
