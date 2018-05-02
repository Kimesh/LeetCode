class MyCalendarTwo {

	Calendar calender;
    public MyCalendarTwo() {
    	calender=null;
    }
    
    public boolean book(int start, int end) {
        Calendar p=calender;
        Calendar q = null;
        while(p!=null)
        {
        	q=p;
        	if(p.end<start)
        		p=p.right;
        	else if(p.start<=start && p.end>=start && p.end<=end)
        	{
        		p.count++;
        		p=p.right;
        	}
        	else if(p.start>end)
        		p=p.left;
        	else if(end>=p.start && end<=p.end && p.count==2)
        		return false;
        		
        }
    	p=new Calendar(start,end);
    	if(q!=null)
    	{
    		if(q.end<p.start)
        		q.right=p;
    		else if(q.start>p.end)
    			q.left=p;
    	}
    	else
    		calender=p;
    	
    	
    	return true;
    }
}
class Calendar{
	int count;
	int start;
	int end;
	Calendar left;
	Calendar right;
	public Calendar(int start, int end)
	{
		this.count=1;
		this.left=null;
		this.right=null;
		this.start=start;
		this.end=end;
	}
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */