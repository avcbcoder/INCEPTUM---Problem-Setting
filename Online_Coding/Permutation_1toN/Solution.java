package Permutation_1toN;

import java.util.Scanner;

/**
 * @author avcbcoder last modified @26-Sep-2018 @2:10:43 PM INC Problems - TODO
 */

public class Solution {
	public static Scanner sc = new Scanner(System.in);
	public static long mod = 1000000007;

	public static void main(String[] args) throws Exception {
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
			System.out.println(((a * ((b * c) % mod)) % mod) % mod);
		}
	}
}
