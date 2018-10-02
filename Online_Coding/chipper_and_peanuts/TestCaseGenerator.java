/**
 * @author avcbcoder
 * last modified @01-Oct-2018 @4:08:17 AM
 * INC Problems - chipper_and_peanuts
 * TODO
 */
package Online_Coding.chipper_and_peanuts;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class TestCaseGenerator {
	public static FileWriter write;
	public static PrintWriter pw;
	public static Random R = new Random();
	public static int n = 10000, q = 10000;

	public static void main(String[] args) throws Exception {
		write = new FileWriter("E:\\testout.txt");
		pw = new PrintWriter(write);
		// PrintStream pw = System.out;

		pw.flush();

		// N and M----------
		// int m = R.nextInt(Math.min(100, n)) + 1;
		// int m = Math.min(100, n) ;
		int m = 100;

		pw.println(n + " " + m);

		// M Peanuts ------
		boolean[] v = new boolean[n + 1];
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < m; i++) {
			int x = R.nextInt(n) + 1;
			while (v[x])
				x = R.nextInt(n) + 1;
			v[x] = true;
			sb.append(x + " ");
		}
		pw.println(sb.toString());

		// Tree description ---------
		for (int i = 0; i < n - 1; i++) {
			// int u = R.nextInt(i + 1) + 1;
			// pw.println(u + " " + (i + 2));
			pw.println((i + 1) + " " + (i + 2));
		}

		int w = m == 0 ? 0 : q / m;

		// Q - Queries
		pw.println(q);
		for (int i = 0; i < q; i++) {
			int t = 0;
			int x = R.nextInt(n) + 1;
			if (w == 0) {
				t = 2;
				w = m == 0 ? 0 : q / m;
			} else {
				w--;
				t = 1;
			}
			// Description
			pw.println(t + " " + x);
		}
		pw.close();
	}

	public static InputStreamReader r = new InputStreamReader(System.in);

	public static BufferedReader br = new BufferedReader(r);

	public static Scanner sc = new Scanner(System.in);
}
