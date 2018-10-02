/**
 * @author avcbcoder
 * last modified @01-Oct-2018 @4:49:56 AM
 * INC Problems - basement_dp
 * TODO
 */
package basement_dp;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class TC_gen {
	public static FileWriter write;
	public static PrintWriter pw;
	public static Random R = new Random();
	public static int t = 20, n = 100000, ai = 1000000000, q = 1000;

	public static void main(String[] args) throws Exception {
		write = new FileWriter("E:\\testout.txt");
		pw = new PrintWriter(write);
		// PrintStream pw = System.out;
		pw.println(t);
		for (int x = 0; x < t; x++) {
			pw.println(n);
			StringBuilder sb = new StringBuilder("");
			for (int i = 1; i <= n; i++) {
				sb.append((R.nextInt(ai)) + " ");
			}
			pw.println(sb);
			pw.println(q);
			for (int i = 1; i <= q; i++) {
				int y = (R.nextInt(n) + 1);
				while (y < 1 || y > n)
					y = (R.nextInt(n) + 1);
				pw.println(y);
			}
		}
		pw.close();
	}

	public static InputStreamReader r = new InputStreamReader(System.in);

	public static BufferedReader br = new BufferedReader(r);

	public static Scanner sc = new Scanner(System.in);
}
