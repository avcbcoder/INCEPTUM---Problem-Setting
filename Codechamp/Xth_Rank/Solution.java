/**
 * @author avcbcoder
 * last modified @03-Oct-2018 @8:21:03 PM
 * INC Problems - Codechamp.Xth_Rank
 * TODO
 */
//package Codechamp.Xth_Rank;

import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		int n = sc.nextInt(), r = sc.nextInt();
		PriorityQueue<Integer> pq = new PriorityQueue<>();

		for (int i = 0; i < r; i++) {
			int x = sc.nextInt();
			pq.add(x);
		}

		System.out.println(pq.peek());

		for (int i = r; i < n; i++) {
			int x = sc.nextInt();
			int top = pq.peek();
			if (x > top) {
				pq.remove();
				pq.add(x);
			}
			System.out.println(pq.peek());
		}
	}
	public static Scanner sc = new Scanner(System.in);
}
