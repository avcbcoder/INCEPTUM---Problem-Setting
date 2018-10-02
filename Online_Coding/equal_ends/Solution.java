/**
 * @author avcbcoder
 * last modified @01-Oct-2018 @1:58:49 AM
 * INC Problems - equal_ends
 * TODO
 */
package equal_ends;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Solution {
	public static InputStreamReader r = new InputStreamReader(System.in);
	public static BufferedReader br = new BufferedReader(r);

	public static void main(String[] args) throws Exception {
		int t = new Integer(br.readLine());
		while (t-- > 0) {
			long ans = 0;
			int n = new Integer(br.readLine());
			int[] arr = new int[n];
			HashMap<Integer, Long> count = new HashMap<>();
			String[]ip=br.readLine().split(" ");
			for (int i = 0; i < arr.length; i++) {
				int x = new Integer(ip[i]);
				if (!count.containsKey(x))
					count.put(x, 0L);
				count.put(x, count.get(x) + 1);
			}
			for (int x : count.keySet()) {
				long f = count.get(x);
				ans += (f * (f - 1)) / 2L;
			}
			System.out.println(ans);
		}
	}
}
