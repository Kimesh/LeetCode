class Solution {
	public boolean isScramble(String s1, String s2) {

		return fun(s1, s2, 0, s1.length());
	}

	private boolean fun(String s1, String s2, int l, int u) {
		if (l > u)
			return false;
		else if (u - l <= 2) {
			int i,j;
			boolean flag = true;
			for (i = u-1,j=l; i >= 0 && j<u; i--,j++) {
				if (s2.charAt(i) != s1.charAt(j)) {
					flag = false;
					break;
				}
			}
			if ((s1.substring(l, u).equals(s2.substring(l, u))) || flag)
				return true;
			else
				return false;
		} else {
			int mid = (l + u) / 2;
			if(fun(s1,s2,l,mid+1))
				return true;
			else
			{

			}
				
			return fun(s1,s2,l,mid+1) && fun(s1,s2,mid+1,u);
			
			
//			return fun(s1.substring(l, mid + 1), s2.substring(l, mid + 1), l, mid + 1)
//					&& fun(s1.substring(mid + 1, u), s2.substring(mid + 1, u), mid + 1, u);
		}
	}
}