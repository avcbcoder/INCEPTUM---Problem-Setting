package Permutation_1toN;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

/**
 * @author avcbcoder last modified @26-Sep-2018 @2:18:09 PM INC Problems - TODO
 */

public class TC_Gen {
	public static FileWriter write;
	public static PrintWriter pw;
	public static Random R = new Random();

	public static void main(String[] args) throws Exception {
		write = new FileWriter("E:\\testout.txt");
		pw = new PrintWriter(write);
		pw.flush();
		// basic();
		// advance();
		pw.close();
	}

	private static void advance() {
		pw.println(1000);
		pw.println("1 1");
		pw.println("2 2");
		pw.println("1000 10");
		pw.println("100000 1");
		pw.println("100000 100000");
		for (int i = 0; i < 1000 - 5; i++) {
			int n = R.nextInt(100000) + 1;
			int s = R.nextInt(n) + 1;
			pw.println(n + " " + s);
		}
		pw.println();
	}

	// for n<=10 and t<=5
	private static void basic() {
		pw.println(5);
		pw.println("10 1");
		pw.println("10 2");
		pw.println("10 5");
		pw.println("10 9");
		pw.println("10 10");
		pw.println();
	}

}
