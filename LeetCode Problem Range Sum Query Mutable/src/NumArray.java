class NumArray {

	int a[];
	int segment[];
	int n;

	public NumArray(int[] nums) {
		a = nums;
		if (nums.length > 0)
		{
			n=nums.length;
			while(n%2==0)
				n=n/2;
			if(n==1 && nums.length>1)
				n=2*nums.length-1;
			else
			n = 2 * nextPowerOfTwo(nums.length) - 1;
			segment = new int[n];

			createSegmentTree(a, segment, 0, a.length - 1, 0);
		}
			
	}

	private int nextPowerOfTwo(int x) {
		int counter = 0;
		while (x > 0)
		{
			counter++;
			x = x >> 1;
		}
		return (1 << counter);
	}

	private void createSegmentTree(int[] a, int[] segment, int l, int h, int pos) {
		if (l == h)
			segment[pos] = a[l];
		else {
			int mid = (l + h) / 2;
			createSegmentTree(a, segment, l, mid, 2 * pos + 1);
			createSegmentTree(a, segment, mid + 1, h, 2 * pos + 2);
			segment[pos] = segment[2 * pos + 1] + segment[2 * pos + 2];
		}
	}

	public void update(int i, int val) {

		updateSegmentTree(a, segment, 0, a.length - 1, i, val, 0);
	}

	private int updateSegmentTree(int[] a, int[] segment, int l, int h, int i, int val, int pos) {

		if (l == i && h == i) {
			a[i] = val;
			segment[pos] = val;
			return segment[pos];
		} else if (h < i || l > i)
			return segment[pos];
		else {
			int mid = (l + h) / 2;
			updateSegmentTree(a, segment, l, mid, i, val, 2 * pos + 1);
			updateSegmentTree(a, segment, mid + 1, h, i, val, 2 * pos + 2);
			segment[pos] = segment[2 * pos + 1] + segment[2 * pos + 2];
			return segment[pos];
		}

	}

	public int sumRange(int i, int j) {
		if(a.length>0)
		return getSumRange(segment, 0, a.length - 1, i, j, 0);
		return 0;
	}

	private int getSumRange(int[] segment, int l, int h, int ql, int qh, int pos) {
		if (h < ql || l > qh)
			return 0;
		else if (l >= ql && h <= qh)
			return segment[pos];
		else {
			int mid = (l + h) / 2;
			int left = getSumRange(segment, l, mid, ql, qh, 2 * pos + 1);
			int right = getSumRange(segment, mid + 1, h, ql, qh, 2 * pos + 2);
			return left+right;
		}
	}

}
