/**
 * @author avcbcoder
 * last modified @26-Sep-2018 @3:42:11 PM
 * INC Problems - equal_ends
 * TODO
 */
package equal_ends;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Check {
	public static Random R = new Random();

	public static void main(String[] args) throws Exception {
		int n = R.nextInt(100000) + 1;
		int[]arr=new int[n];
		for (int i = 0; i < args.length; i++) {

		}
	}

	public static long actual(int[] arr) {
		long ans = 0;
		HashMap<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			ans += (hm.containsKey(arr[i]) ? hm.get(arr[i]) : 0);
			if (!hm.containsKey(arr[i]))
				hm.put(arr[i], 0);
			hm.put(arr[i], hm.get(arr[i]) + 1);
		}
		return ans;
	}

	public static long brute(int[] arr) {
		long ans = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j])
					ans++;
			}
		}
		return ans;
	}

	public static InputStreamReader r = new InputStreamReader(System.in);

	public static BufferedReader br = new BufferedReader(r);

	public static Scanner sc = new Scanner(System.in);
}
