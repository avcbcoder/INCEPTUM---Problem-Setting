/**
 * @author avcbcoder
 * last modified @01-Oct-2018 @6:16:49 PM
 * INC Problems - easy_prob
 * TODO
 */
package easy_prob;

import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Random;

public class TC_gen {
	public static FileWriter write;
	public static PrintWriter pw;
	public static Random R = new Random();
	public static int n = 10,t=10;

	public static void main(String[] args) throws Exception {
		// write = new FileWriter("E:\\testout.txt");
		// pw = new PrintWriter(write);
		PrintStream pw = System.out;

		pw.flush();

		pw.println(t);
		
		for (int i = 0; i < t; i++) {
			pw.println(n);
			StringBuilder sb=new StringBuilder("");
			for (int j = 1; j <= n; j++) {
				sb.append((j)+" ");	
			}
			pw.println(sb);
		}
		
		pw.close();
	}

}
