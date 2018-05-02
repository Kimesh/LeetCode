import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Queue;

class Solution {
	public int networkDelayTime(int[][] times, int N, int k) {

		HashMap<Integer, LinkedHashMap<Integer, Integer>> map=new HashMap<>();
		HashSet<Integer> hashSet=new HashSet<>();
		Queue<Integer> queue=new LinkedList<>();
		int i,j,n,max,index,source,dest,weight;
		boolean flag;
		n=times.length;
		
		for(i=0;i<n;i++)
		{
			source=times[i][0];
			dest=times[i][1];
			weight=times[i][2];
			
			if(!map.containsKey(source))
			{
				LinkedHashMap<Integer, Integer> temp=new LinkedHashMap<>();
				temp.put(dest, weight);
				map.put(source, temp);
			}
			else
			{
				LinkedHashMap<Integer, Integer> temp=map.get(source);
				temp.put(dest,weight);
				map.put(source,temp);
			}
		}
		
		int arr[]=new int[N+1];
		for(i=0;i<=N;i++)
			arr[i]=Integer.MAX_VALUE;
		arr[k]=0;
	
		queue.add(k);
		while(!queue.isEmpty())
		{
			flag=false;
			Integer node=queue.poll();
			LinkedHashMap<Integer, Integer>linkedHashMap= map.get(node);
			if(linkedHashMap!=null)
			{
				for(Integer key: linkedHashMap.keySet())
				{
					 weight=linkedHashMap.get(key);
					 if(arr[key]>arr[node]+weight)
					 {
						 arr[key]=arr[node]+weight;
						 flag=true;
					 }
						 if(flag)
					 queue.add(key);
				}
			}
			hashSet.add(node);
		}
		
		max=Integer.MIN_VALUE;
		for(i=1;i<=N;i++)
		{
		//	System.out.println(" "+i+" : "+arr[i]);
			
			if(arr[i]>max)
				max=arr[i];
		}
		if(max==Integer.MAX_VALUE)
			max=-1;
		
		return max;
}
}