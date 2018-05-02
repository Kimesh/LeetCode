import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s="cccaaa";
		System.out.println(frequencySort(s));
	}
public static String frequencySort(String s) {
        StringBuffer res=new StringBuffer("");
        HashMap<Character, Integer> map=new HashMap<>();
        
        int i,n,j;
        n=s.length();
        
        List<Node> list=new ArrayList<Node>();
        for(i=0;i<n;i++)
        {
        	char c=s.charAt(i);
        	if(map.containsKey(c))
        		map.put(c, map.get(c)+1);
        	else
        		map.put(c, 1);
        }
        for(Map.Entry<Character,Integer> entry : map.entrySet()) 
      	  list.add(new Node(entry.getKey(),entry.getValue()));

        Collections.sort(list);

       for(i=0;i<list.size();i++)
       {
    	   Node x=list.get(i);
    	   while(x.value>0)
    	   {
    		   res.append(x.key);
    		   x.value--;
    	   }
       }
        return res.toString();
    }
}

class Node implements Comparable<Node>
{

	Character key;
	Integer value;
	public Node(Character key, Integer value) {
		// TODO Auto-generated constructor stub
		this.key=key;
		this.value=value;
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if(this.value<o.value)
			return 1;
		else if(this.value==o.value)
			return 0;
		else 
			return -1;
	}
	
}