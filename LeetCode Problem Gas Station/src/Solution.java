class Solution {
	public int canCompleteCircuit(int[] gas, int[] cost) {
    	int i,j,n,lastI;
    	n=gas.length;
    	boolean flag=false;
    	
    	long gasSum=0;
    	i=0;
    	while(i<n)
    	{
    		j=i;
    		lastI=i;
    		gasSum=0;
    		flag=true;
    		do{

    			if(gasSum+gas[j]-cost[j]>=0)
    			{
    				gasSum=gasSum+gas[j]-cost[j];
    				j=j+1;
    				j=j%n;
    				
    			}
    			else
    			{
    				if(lastI>j)
    					i=lastI+1;
    				else
    				i=j+1;
    				
    				flag=false;
    				break;
    			}
    		}while(j!=i);
    			
    		if(flag)
    			return i;    			
    		
    }
    	return -1; 
}
}