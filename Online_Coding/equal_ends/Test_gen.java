/**
 * @author avcbcoder
 * last modified @01-Oct-2018 @11:52:12 PM
 * INC Problems - equal_ends
 * TODO
 */
package equal_ends;

import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Random;

public class Test_gen {
	public static FileWriter write;
	public static PrintWriter pw;
	public static Random R = new Random();
	public static int T = 10, N = 100000, ai = 10;

	public static void main(String[] args) throws Exception {
		// PrintStream pw = System.out;
		write = new FileWriter("E:\\t10i.txt");
		pw = new PrintWriter(write);
		pw.flush();

		// int t = R.nextInt(T) + 1;
		int t = T;
		pw.println(t);
		for (int x = 0; x < t; x++) {
			// int n = R.nextInt(N) + 1;
			int n = N;
			pw.println(n);
			StringBuilder sb = new StringBuilder("");
			for (int i = 0; i < n; i++) {
				sb.append(1928034 + " ");
			}
			pw.println(sb);
		}

		pw.close();
	}
}
