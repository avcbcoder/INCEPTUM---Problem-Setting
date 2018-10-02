package Permutation_1toN;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class PERM_check {
	public static Random R = new Random();
	public static int ans = 0;

	public static void main(String[] args) throws Exception {
		int t = 100;
		while (t-- > 0) {
			int n = 5 + R.nextInt(5);
			int s = 5;
			n = sc.nextInt();
			s = sc.nextInt();
			solve(n, s);
		}
	}

	// **SOLUTION**
	public static void solve(int n, int s) throws Exception {
		HashSet<Integer> hs = new HashSet<>();
		ans = 0;
		for (int i = 1; i <= s; i++)
			hs.add(i);
		rec(0, n, new int[n], s, new HashSet<>());
		long a = (n - s + 1) * fact(s) * fact(n - s);
		if (a != ans) {
			System.out.println("WRONG:" + a);
			System.out.println("Corr:" + ans);
			System.out.println("N:" + n + " S:" + s);
			System.out.println();
		}
		System.out.println(ans);
	}

	/**
	 * @param n
	 * @return
	 */
	private static int fact(int n) {
		int c = 1;
		for (int i = 1; i <= n; i++)
			c *= i;
		return c;
	}

	/**
	 * @param n
	 * @param is
	 * @param hs
	 */
	private static void rec(int c, int n, int[] is, int s, HashSet<Integer> dp) {
		if (c == n) {
			if (check(is, s)) {
				ans++;
			}
		}
		for (int i = 1; i <= n; i++) {
			if (dp.contains(i))
				continue;
			dp.add(i);
			is[c] = i;
			rec(c + 1, n, is, s, dp);
			dp.remove(i);
		}
	}

	private static boolean check(int[] is, int s) {
		for (int i = 0; i < is.length; i++) {
			if (i + s - 1 >= is.length) {
				return false;
			}
			boolean f = true;
			for (int j = i; j <= i + s - 1; j++) {
				if (is[j] >= 1 && is[j] <= s) {
				} else
					f = false;
			}
			if (f)
				return f;
		}
		return false;
	}

	public static InputStreamReader r = new InputStreamReader(System.in);

	public static BufferedReader br = new BufferedReader(r);

	public static Scanner sc = new Scanner(System.in);
}
