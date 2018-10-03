/**
 * @author avcbcoder
 * last modified @03-Oct-2018 @6:45:01 AM
 * INC Problems - Codechamp.star_pattern
 * TODO
 */
package Codechamp.star_pattern;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;

public class Solution {
	public static FileWriter write;
	public static PrintWriter pw;
	public static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) throws Exception {
		write = new FileWriter("E:\\input03.txt");
		pw = new PrintWriter(write);
		int n = sc.nextInt();
		pw.println(n);
		pw.close();
		write = new FileWriter("E:\\output03.txt");
		pw = new PrintWriter(write);
		int t=1;
		for (int r = 0; r < n; r++) {
			int s=n-1-r;
			for (int i = 0; i < s; i++) 
				pw.print(' ');
			for (int i = 0; i < t; i++) 
				pw.print("*");
			t+=2;
			pw.println();
		}
		pw.close();
	}

}
