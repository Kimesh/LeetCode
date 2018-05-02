import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
	int index;

	public int[] findOrder(int numCourses, int[][] a) {

		int i, n;
		boolean flag = true;
		n = a.length;
		int ans[] = new int[numCourses];

		HashMap<Integer, List<Integer>> map = new HashMap<>();

		for (i = 0; i < n; i++) {
			ArrayList<Integer> temp;
			if (!map.containsKey(a[i][1])) {
				temp = new ArrayList<>();
				temp.add(a[i][0]);
				map.put(a[i][1], temp);
			} else {
				temp = (ArrayList<Integer>) map.get(a[i][1]);
				temp.add(a[i][0]);
				map.put(a[i][1], temp);
			}

		}

		int temp[] = new int[numCourses];

		for (i = 0; i < a.length; i++)
			temp[a[i][0]]++;

		Queue<Integer> queue = new LinkedList<Integer>();
		for (i = 0; i < numCourses; i++) {
			if (temp[i] == 0)
				queue.add(i);
		}
		while (!queue.isEmpty()) {
			Integer node = queue.poll();
			ans[index++] = node.intValue();
			if (map.containsKey(node)) 
			{
				List<Integer> list = map.get(node);
				for (i = 0; i < list.size(); i++)
				{
					temp[list.get(i)]--;
					if(temp[list.get(i)]==0)
						queue.add(list.get(i));
						
				}
			map.remove(node);
			}
			
		}
		
		if(index!=numCourses)
			ans= new int[0];
		return ans;
	}
}