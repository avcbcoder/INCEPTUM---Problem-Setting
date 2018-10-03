/**
 * @author avcbcoder
 * last modified @03-Oct-2018 @6:27:23 AM
 * INC Problems - Codechamp.friends_on_x_axis
 * TODO
 */
package Codechamp.char_in_range;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Random;

public class TC_gen {
	public static FileWriter write;
	public static PrintWriter pw;
	public static Random R = new Random();
	public static int n = 100000, q = 100000;

	public static void main(String[] args) throws Exception {
		write = new FileWriter("E:\\input02.txt");
		pw = new PrintWriter(write);
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < n; i++) {
			sb.append((char) (R.nextInt(26) + 'a'));
		}
		pw.println(sb);
		pw.println(q);
		for (int i = 0; i < q; i++) {
			pw.println((R.nextInt(n)));
		}
		pw.close();
	}

}
