import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Solution s=new Solution();
		//System.out.println(s.guessNumber(10));
		for(int i=0;i<10;i++)
		{
			Scanner sc=new Scanner(System.in);
			int x=sc.nextInt();
			s.setX(1702766719);
			System.out.println(s.guessNumber(2126753390));
		}
	}
	
//	2126753390
//	1702766719

}
