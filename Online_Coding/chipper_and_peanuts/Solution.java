/**
 * @author avcbcoder
 * last modified @01-Oct-2018 @2:19:09 AM
 * INC Problems - chipper_and_peanuts
 * TODO
 */
package chipper_and_peanuts;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Scanner;

public class Solution {
	public static void main(String[] args) throws Exception {
		solve();
	}

	public static HashMap<Integer, Integer>[] peaDistance;
	public static HashSet<Integer> pea;
	public static HashSet<Integer>[] nodes;

	public static void solve() throws Exception {
		String[] ip = br.readLine().split(" ");
		int n = new Integer(ip[0]), m = new Integer(ip[1]);

		nodes = new HashSet[n + 1];
		peaDistance = new HashMap[n + 1];
		pea = new HashSet<>();

		for (int i = 0; i <= n; i++) {
			peaDistance[i] = new HashMap<>();
			nodes[i] = new HashSet<>();
		}

		ip = br.readLine().split(" ");
		// Input peanuts
		for (int i = 0; i < m; i++) {
			int p = new Integer(ip[i]);
			pea.add(p);
		}

		for (int i = 0; i < n - 1; i++) {
			ip = br.readLine().split(" ");
			int u = new Integer(ip[0]);
			int v = new Integer(ip[1]);
			nodes[u].add(v);
			nodes[v].add(u);
		}

		for (int p : pea)
			dfs2(p);
		// dfs(p, 0, p, new boolean[n + 1]);

		int q = new Integer(br.readLine());

		while (q-- > 0) {
			ip=br.readLine().split(" ");
			int t = new Integer(ip[0]);
			int x = new Integer(ip[1]);

			int a = -1, d = Integer.MAX_VALUE;
			for (int p : pea)
				if (peaDistance[x].get(p) < d) {
					d = peaDistance[x].get(p);
					a = p;
				}

			if (t == 2) {
				if (a != -1)
					pea.remove(a);
			} else {
				if (a == -1)
					System.out.println(-1);
				else
					System.out.println(d);
			}
		}
	}

	/**
	 * @param p
	 *            => pea
	 * @param d
	 *            => distance
	 * @param n
	 *            => current node
	 * @param v
	 *            => visit array
	 */
	private static void dfs(int p, int d, int n, boolean[] v) {
		if (v[n] == true)
			return;
		v[n] = true;
		// n is at distance d from n
		peaDistance[n].put(p, d);
		for (int c : nodes[n])
			dfs(p, d + 1, c, v);
	}

	private static void dfs2(int p) {
		boolean[] v = new boolean[nodes.length + 1];
		PriorityQueue<Pair> pq = new PriorityQueue<>();
		pq.add(new Pair(p, 0));
		while (!pq.isEmpty()) {
			Pair rp = pq.remove();
			if (v[rp.x])
				continue;
			v[rp.x] = true;
			peaDistance[rp.x].put(p, rp.d);
			for (int c : nodes[rp.x])
				pq.add(new Pair(c, rp.d + 1));
		}
	}

	public static class Pair implements Comparable<Pair> {
		int x, d;

		public Pair(int x, int d) {
			this.x = x;
			this.d = d;
		}

		@Override
		public int compareTo(Pair o) {
			return o.d - this.d;
		}

	}

	public static InputStreamReader r = new InputStreamReader(System.in);

	public static BufferedReader br = new BufferedReader(r);

	public static Scanner sc = new Scanner(System.in);
}
