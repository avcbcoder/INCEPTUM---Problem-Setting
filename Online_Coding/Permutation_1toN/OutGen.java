package Permutation_1toN;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

/**
 * @author avcbcoder last modified @26-Sep-2018 @2:49:37 PM INC Problems - TODO
 */

public class OutGen {
	public static FileWriter write;
	public static PrintWriter pw;
	public static Random R = new Random();
	public static int mod = 1000000007;

	public static void main(String[] args) throws Exception {
		File f = new File("E:\\testout.txt");
		Scanner sc = new Scanner(f);
		write = new FileWriter("E:\\testans.txt");
		pw = new PrintWriter(write);
		pw.flush();

		long[] fact = new long[100001];
		fact[0] = 1;
		for (int i = 1; i < fact.length; i++) {
			fact[i] = (fact[i - 1] * i) % mod;
		}

		int t = sc.nextInt();
		while (t-- > 0) {
			int n = sc.nextInt();
			int s = sc.nextInt();
			long a = (n - s + 1) * 1L;
			long b = fact[s];
			long c = fact[n - s];
			pw.println(((a * ((b * c) % mod)) % mod) % mod);
		}

		pw.close();
	}
}
