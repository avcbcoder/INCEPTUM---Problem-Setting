/**
 * @author avcbcoder
 * last modified @01-Oct-2018 @2:08:51 AM
 * INC Problems - basement_dp
 * TODO
 */
package basement_dp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Solution {
	public static InputStreamReader r = new InputStreamReader(System.in);
	public static BufferedReader br = new BufferedReader(r);

	public static void main(String[] args) throws Exception {
		int t = new Integer(br.readLine());
		while (t-- > 0) {
			int n = new Integer(br.readLine());
			int[] arr = new int[n];
			int[] pre = new int[n];
			int[] suff = new int[n];
			String[] ip = br.readLine().split(" ");
			for (int i = 0; i < arr.length; i++)
				arr[i] = new Integer(ip[i]);

			pre[0] = arr[0];
			for (int i = 1; i < pre.length; i++)
				pre[i] = Math.min(arr[i], pre[i - 1] + 1);

			suff[n - 1] = arr[n - 1];
			for (int i = n - 2; i >= 0; i--)
				suff[i] = Math.min(suff[i + 1] + 1, arr[i]);

			int q = new Integer(br.readLine());
			while (q-- > 0) {
				int x = new Integer(br.readLine());
				System.out.println(Math.min(pre[x - 1], suff[x - 1]));
			}
		}
	}
}
