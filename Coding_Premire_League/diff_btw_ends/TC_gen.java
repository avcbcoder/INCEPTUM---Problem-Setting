/**
 * @author avcbcoder
 * last modified @03-Oct-2018 @3:34:34 AM
 * INC Problems - Coding_Premire_League.diff_btw_ends
 * TODO
 */
package Coding_Premire_League.diff_btw_ends;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Random;
import java.util.Scanner;

public class TC_gen {
	public static FileWriter write;
	public static PrintWriter pw;
	public static Random R = new Random();

	public static void main(String[] args) throws Exception {
		write = new FileWriter("E:\\t7i.txt");
		pw = new PrintWriter(write);
		int n = 100000;
		pw.println(n);
		int[] arr = new int[n];
		StringBuilder sb = new StringBuilder("");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = R.nextInt(1000000001);
			sb.append(arr[i] + " ");
		}
		pw.println(sb);
		pw.close();
	}

	public static InputStreamReader r = new InputStreamReader(System.in);

	public static BufferedReader br = new BufferedReader(r);

	public static Scanner sc = new Scanner(System.in);
}
