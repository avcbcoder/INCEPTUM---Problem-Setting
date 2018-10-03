/**
 * @author avcbcoder
 * last modified @03-Oct-2018 @6:45:01 AM
 * INC Problems - Codechamp.star_pattern
 * TODO
 */
package Codechamp.star_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		int t = sc.nextInt();
		while (t-- > 0)
			solve();
	}

	// **SOLUTION**
	public static void solve() throws Exception {
		int n = sc.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
	}

	public static InputStreamReader r = new InputStreamReader(System.in);

	public static BufferedReader br = new BufferedReader(r);

	public static Scanner sc = new Scanner(System.in);
}
