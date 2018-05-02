import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

class Solution {
    public List<int[]> getSkyline(int[][] buildings) {
    
    	int i,j,k,n,max=0;
    	n=buildings.length;
    	BuildingPoint[] buildingArray=new BuildingPoint[2*n];
    	
    	for(i=0,j=0;i<n;i++)
    	{
    		buildingArray[j++]=new BuildingPoint(buildings[i][0], buildings[i][2], true);
    		buildingArray[j++]=new BuildingPoint(buildings[i][1], buildings[i][2], false);
    	}
    	Arrays.sort(buildingArray);
//    	for(i=0;i<2*n;i++)
//    	{
//    		System.out.println(buildingArray[i].point+" : "+buildingArray[i].height+" : "+buildingArray[i].flag);
//    	}
    	
    	List<int[]> list=new ArrayList<>();
    	PriorityQueue<Integer> queue=new PriorityQueue<>(Collections.reverseOrder());
    	queue.add(0);
    	max=0;
    	for(i=0;i<2*n;i++)
    	{
    		BuildingPoint b=buildingArray[i];
    		if(b.flag)
    			queue.add(b.height);
    		else
    			queue.remove(b.height);
    		
    		if(queue.peek()!=max)
    		{
    			max=queue.peek();
    			int temp[]=new int[2];
    			temp[0]=b.point;
    			temp[1]=max;
    			list.add(temp);
    		}
    	}
    	return list;
        
    }
}

class BuildingPoint implements Comparable<BuildingPoint>{
	int point,height;
	boolean flag;
	public BuildingPoint(int point, int height, boolean flag) {
		this.point = point;
		this.height = height;
		this.flag = flag;
	}
	@Override
	public int compareTo(BuildingPoint o) {
		// TODO Auto-generated method stub
		if(this.point>o.point)
			return 1;
		else if(this.point<o.point)
			return -1;
		else if(this.flag && o.flag)
		{
			if(this.height>=o.height)
				return -1;
			else
				return 1;
		}
		else if(!this.flag && !o.flag)
		{
			if(this.height>=o.height)
				return 1;
			else 
				return -1;
		}
		else if(this.flag && !o.flag)
			return -1;
		else if(!this.flag && o.flag)
			return 1;
		return 0;
	}
}