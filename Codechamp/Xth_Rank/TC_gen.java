/**
 * @author avcbcoder
 * last modified @03-Oct-2018 @6:27:23 AM
 * INC Problems - Codechamp.friends_on_x_axis
 * TODO
 */
package Codechamp.Xth_Rank;

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
	public static int n = 10, q = 100000;

	public static void main(String[] args) throws Exception {
		write = new FileWriter("E:\\input04.txt");
		pw = new PrintWriter(write);
		// PrintStream pw=System.out;
		pw.println(n + " " + (R.nextInt(n) + 1));
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < n; i++) {
			sb.append((R.nextInt(n) + 1) + " ");
		}
		pw.println(sb);
		pw.close();
	}

	public static InputStreamReader r = new InputStreamReader(System.in);

	public static BufferedReader br = new BufferedReader(r);

	public static Scanner sc = new Scanner(System.in);
}
