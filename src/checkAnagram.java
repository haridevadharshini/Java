import java.util.*;
class checkAnagram 
{
	public static void main(String[] args) 
	{
		String a = "dogo";
		String b = "godo";
		char[] c = a.toCharArray();
		char[] d = b.toCharArray();
		if(c.length!=d.length) System.out.println("Not anagram");
		Arrays.sort(c);
		Arrays.sort(d);
		if(Arrays.equals(c,d)) System.out.println("Anagram"); 
		else System.out.println("Not anagram");
	}
}
