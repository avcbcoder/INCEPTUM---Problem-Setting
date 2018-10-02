/**
 * @author avcbcoder
 * last modified @03-Oct-2018 @2:42:54 AM
 * INC Problems - CPL.diff_btw_ends
 * TODO
 */
package Coding_Premire_League.diff_btw_ends;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution {
	public static InputStreamReader r = new InputStreamReader(System.in);
	public static BufferedReader br = new BufferedReader(r);

	public static void main(String[] args) throws Exception {
		int n = new Integer(br.readLine());
		long[] arr = new long[n];
		String[] ip = br.readLine().split(" ");
		for (int i = 0; i < n; i++)
			arr[i] = new Integer(ip[i]);
		long ans = 0, sum = arr[0];
		for (int i = 1; i < ip.length; i++) {
			ans += arr[i] * i - sum;
			sum += arr[i];
		}
		System.out.println(ans);
	}

}
