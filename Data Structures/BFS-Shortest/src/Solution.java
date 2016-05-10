import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int m = 0; m < n; m++) {
			int nodes = sc.nextInt();
			int edges = sc.nextInt();
			List<Integer>[] adj;
			adj = new List[nodes + 1];
			for (int i = 1; i <= nodes; i++)
				adj[i] = new ArrayList<Integer>();
			for (int j = 1; j <= edges; j++) {
				int a = sc.nextInt();
				int b = sc.nextInt();
				adj[a].add(b);
				adj[b].add(a);

			}
			int[] cost = new int[nodes + 1];
			for (int i = 1; i <= nodes; i++)
				cost[i] = -1;
			int[] visited = new int[nodes + 1];
			for (int i = 1; i <= nodes; i++)
				visited[i] = 0;
			int start = sc.nextInt();
			cost[start] = 0;
			visited[start] = 1;
			LinkedList<Integer> queue = new LinkedList<Integer>();
			queue.add(start);
			while (!queue.isEmpty()) {
				int top = queue.removeFirst();
				for (Integer k : adj[top]) {
					if (visited[k] == 0) {
						visited[k] = 1;
						queue.add(k);
						cost[k] = cost[top] + 6;
					}
				}
			}
			for (int i = 1; i <= nodes; i++) {
				if (i != start)
					System.out.print(cost[i] + " ");
			}
			System.out.println();

		}
		sc.close();
	}
}
