
public class GuessGame {
	int x=5;
	public int guess(int mid) {
		// TODO Auto-generated method stub
		if(x<mid)
			return -1;
		else if(x>mid)
			return 1;
		
		return 0;
	}
	public void setX(int x) {
		this.x=x;
	}
}
