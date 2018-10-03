/**
 * @author avcbcoder
 * last modified @03-Oct-2018 @6:19:33 AM
 * INC Problems - Codechamp.friends_on_x_axis
 * TODO
 */
package Codechamp.friends_on_x_axis;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		int n = sc.nextInt();
		int[] f = new int[1001];
		for (int i = 0; i < n; i++)
			f[sc.nextInt()]++;
		for (int i = 1; i < f.length; i++)
			f[i] += f[i - 1];
		
		int q = sc.nextInt();
		while (q-- > 0) {
			int l = sc.nextInt();
			int r = sc.nextInt();
			System.out.println(f[r] - f[l - 1]);
		}
	}

	public static InputStreamReader r = new InputStreamReader(System.in);

	public static BufferedReader br = new BufferedReader(r);

	public static Scanner sc = new Scanner(System.in);
}
