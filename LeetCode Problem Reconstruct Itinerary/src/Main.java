import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String[][] a= {{"MUC","LHR"},{"JFK","MUC"},{"SFO","SJC"},{"LHR","SFO"}};
	//	String[][] a= {{"JFK","SFO"},{"JFK","ALT"},{"SFO","ALT"},{"ALT","JFK"},{"ALT","SFO"}};
		String[][] a= {{"JFK","KUL"},{"JFK","NRT"},{"NRT","JFK"}};
		Solution s=new Solution();
		List<String> ans=s.findItinerary(a);
		for(int i=0;i<ans.size();i++)
			System.out.println(ans.get(i));
	}

}
