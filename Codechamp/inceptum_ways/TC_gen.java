/**
 * @author avcbcoder
 * last modified @03-Oct-2018 @6:27:23 AM
 * INC Problems - Codechamp.friends_on_x_axis
 * TODO
 */
package Codechamp.inceptum_ways;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class TC_gen {
	public static FileWriter write;
	public static PrintWriter pw;
	public static Random R = new Random();
	public static int n = 100000, q = 100000;

	public static void main(String[] args) throws Exception {
		write = new FileWriter("E:\\input04.txt");
		pw = new PrintWriter(write);
		int n = 100000;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append((char) (R.nextInt(26) + 'a'));
		}
		pw.println(sb);
		pw.close();
		write = new FileWriter("E:\\output04.txt");
		pw = new PrintWriter(write);
		solve(sb.toString());
		pw.close();
	}

	public static void solve(String s) throws Exception {
		f = new long[26];
		for (int i = 0; i < s.length(); i++)
			f[s.charAt(i) - 'a']++;
		long ans = mul(f('i'), f('n'), f('c'), f('e'), f('p'), f('t'), f('u'), f('m'));
		pw.println(ans);
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

	public static long[] f;
}
