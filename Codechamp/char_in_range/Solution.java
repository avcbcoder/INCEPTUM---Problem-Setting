/**
 * @author avcbcoder
 * last modified @03-Oct-2018 @7:39:39 AM
 * INC Problems - Codechamp.char_in_range
 * TODO
 */
package Codechamp.char_in_range;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Solution {
	public static void main(String[] args) throws Exception {
		char[] a = br.readLine().toCharArray();
		Arrays.sort(a);
		String s = new String(a);
		System.out.println(s);
		int q = new Integer(br.readLine());
		while (q-- > 0)
			System.out.println(s.charAt(new Integer(br.readLine())));
	}

	public static InputStreamReader r = new InputStreamReader(System.in);
	public static BufferedReader br = new BufferedReader(r);
}
