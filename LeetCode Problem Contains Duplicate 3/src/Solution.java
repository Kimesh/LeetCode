import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

class Solution {
	public boolean containsNearbyAlmostDuplicate(int[] a, int k, int t) {
		int i, j, n;

		n = a.length;

		if (n <= 1 || t < 0 || k < 0)
			return false;

		List<Node> list = new ArrayList<>();

		for (i = 0; i < n; i++)
			list.add(new Node(a[i], i + 1));
		Collections.sort(list);
		
//		for(i=0;i<n;i++)
//			System.out.println(list.get(i));
		for (i = 0, j = n - 1; i < j; i++, j--) {
			if (Math.abs(list.get(j).value - list.get(i).value) <= t
					&& Math.abs(list.get(j).index - list.get(i).index) <= k)
				return true;
		}

		// TreeMap<Integer, Integer> map=new TreeMap<>();
		//
		// for(i=0;i<n;i++)
		// map.put(i+1, a[i]);
		//
		// Map.Entry<Integer, Integer> entry=map.pollFirstEntry();
		// Integer prevKey=entry.getKey();
		// Integer prevVal=entry.getValue();
		// for(Map.Entry<Integer,Integer> e : map.entrySet()) {
		// Integer key = e.getKey();
		// Integer value = e.getValue();
		//
		// if(Math.abs(key-prevKey)<=k && Math.abs(value-prevVal)<=t)
		// return true;
		// else
		// {
		// prevKey=key;
		// prevVal=value;
		// }
		//
		// //System.out.println(key + " => " + value);
		// }
		return false;
	}
}

class Node implements Comparable<Node> {
	int value;
	int index;

	public Node(int value, int index) {
		super();
		this.value = value;
		this.index = index;
	}
	@Override
	public String toString() {
		return "Node [value=" + value + ", index=" + index + "]";
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if (this.value < o.value)
			return -1;
		else if (this.value == o.value)
			return 0;
		else
			return 1;
	}

}