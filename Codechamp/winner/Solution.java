
/**
 * @author avcbcoder
 * last modified @03-Oct-2018 @4:49:02 AM
 * INC Problems - Coding_Premire_League.cordinate_friends
 * TODO
 */
//package Codechamp.winner;
package Codechamp.winner;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class Solution {
	public static InputStreamReader r = new InputStreamReader(System.in);
	public static BufferedReader br = new BufferedReader(r);
	public static FileWriter write;
	public static FileReader read;
	public static PrintWriter pw;
	// public static Random R = new Random();

	public static void main(String[] args) throws Exception {
		File read = new File("E:\\output.txt");
		BufferedReader br = new BufferedReader(new FileReader(read)); 
		for (int i = 0; i < 5; i++) {
			System.out.println(br.readLine());
		}
		// pw.println("***** * * * ");
		// pw.println(" * * * ** ** ");
		// pw.println(" * ***** * * * ");
		// pw.println(" * * * * * ");
		// pw.println("***** * * * * ");
	}
}