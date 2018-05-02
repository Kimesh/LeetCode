
class Solution {

	int count = 0;

	public int reversePairs(int[] a) {
		int i, j, k, n;
		n = a.length;
		if(n<2)
			return 0;
		
		int[] b = MergeSort(a, 0, n - 1);

		return count;
	}

	private int[] MergeSort(int[] a, int l, int u) {
		if (l == u) {
			int temp[] = new int[1];
			temp[0] = a[l];
			return temp;
		}

		else if (l > u)
			return null;
		else {
			int mid = (l + u) / 2;
			int b[] = MergeSort(a, l, mid);
			int c[] = MergeSort(a, mid + 1, u);

			if (b == null && c == null)
				return null;
			else if (b == null && c != null)
				return c;
			else if (b != null && c == null)
				return b;
			return Merge(b, c, b.length, c.length);
		}
	}

	private int[] Merge(int[] b, int[] c, int l1, int l2) {
		int temp[] = new int[l1 + l2];
		int i, j, k;

		for (i = 0, j = 0; i < l1 && j < l2;) {
//			long var2=(long)2*c[j];
//			long var1=(long)b[i];
			if ((long)b[i]>(long)2*c[j]) {
				count = count + (l1 - i);
				j++;
			} else
				i++;
		}

		for (i = 0, j = 0, k = 0; k < l1 + l2 && i < l1 && j < l2; k++) {
			if (b[i] > c[j]) {
				temp[k] = c[j];
				j++;
			} else {
				temp[k] = b[i];
				i++;
			}

		}
		while (i < l1) {
			temp[k] = b[i];
			i++;
			k++;
		}
		while (j < l2) {
			temp[k] = c[j];
			j++;
			k++;
		}

		return temp;
	}

}
