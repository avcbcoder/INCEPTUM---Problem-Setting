/**
 * @author avcbcoder
 * last modified @01-Oct-2018 @12:09:23 AM
 * INC Problems - easy_prob
 * TODO
 */
package easy_prob;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		long mod = 1000000007;
		while (t-- > 0) {
			int n = sc.nextInt();
			long sum = 0;
			for (int i = 0; i < n; i++) {
				sum = (sum + sc.nextInt()) % mod;
			}
			System.out.println(((n - 1) * sum) % mod);
		}
	}
}
