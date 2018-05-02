class MyCalendar {

	BST root,temp,p;
    public MyCalendar() {
        root=null;
    }
    
    public boolean book(int start, int end) {
        if(root==null)
        {
        	root=new BST(start,end);
        	return true;
        }
        	
        else
        {
        	temp=root;
        	
        	while(temp!=null)
        	{
        		p=temp;
        		if(start>=temp.end)
        			temp=temp.right;
        		else if(end<=temp.start)
        			temp=temp.left;
        		else
        			break;
        	}
        	if(temp==null)
        	{
        		if(p.end<=start)
        			p.right=new BST(start,end);
        		else if(p.start>=end)
        			p.left=new BST(start,end);
        		return true;
        	}
        	return false;
        }
    }
}

class BST{
	int start;
	int end;
	
	BST left;
	BST right;
	public BST(int start, int end) {
		super();
		this.start = start;
		this.end = end;
		this.left=null;
		this.right=null;
	}
	
}