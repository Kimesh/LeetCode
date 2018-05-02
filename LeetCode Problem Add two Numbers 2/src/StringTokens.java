import java.util.StringTokenizer;

public class StringTokens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str=System.lineSeparator()+"Kimesh";
		StringTokenizer tokens=new StringTokenizer(str, "\n");
		while(tokens.hasMoreTokens())
		System.out.println(tokens.nextToken());
				
	}

}
