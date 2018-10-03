/**
 * @author avcbcoder
 * last modified @03-Oct-2018 @7:05:07 AM
 * INC Problems - Codechamp.inceptum_ways
 * TODO
 */
package Codechamp.inceptum_ways;

import java.util.Scanner;

public class Solution {
	public static long[] f;

	public static void main(String... a) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		f = new long[26];
		for (int i = 0; i < s.length(); i++)
			f[s.charAt(i) - 'a']++;
		long ans = mul(f('i'), f('n'), f('c'), f('e'), f('p'), f('t'), f('u'), f('m'));
		System.out.println(ans);
	}

	private static long mul(long... f) {
		long ans = 1;
		for (int i = 0; i < f.length; i++) {
			ans = (ans * f[i]) % 1000000007;
		}
		return ans;
	}

	private static long f(char c) {
		return f[c - 'a'];
	}
}
