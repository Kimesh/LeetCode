class Solution {
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		int smaller[] = nums1.length >= nums2.length ? nums2 : nums1;
		int larger[] = nums1.length >= nums2.length ? nums1 : nums2;

		return findMedian(smaller, larger, 0, smaller.length, smaller.length, larger.length);
	}

	private double findMedian(int[] smaller, int[] larger, int l, int u, int smallerSize, int largerSize) {

		if (l <= u) {
			int midSmaller = (l + u) / 2;
			int midLarger = (smallerSize + largerSize + 1) / 2 - midSmaller;

			int maxLeftSmaller = midSmaller == 0 ? Integer.MIN_VALUE : smaller[midSmaller - 1];
			int minRightSmaller = midSmaller == smallerSize ? Integer.MAX_VALUE : smaller[midSmaller];

			int maxLeftLarger = midLarger == 0 ? Integer.MIN_VALUE : larger[midLarger - 1];
			int minRightLarger = midLarger == largerSize ? Integer.MAX_VALUE : larger[midLarger];

			// int maxLeftSmaller=midSmaller>-1?smaller[midSmaller]:Integer.MIN_VALUE;
			// int
			// minRightSmaller=midSmaller<smallerSize-1?smaller[midSmaller+1]:Integer.MAX_VALUE;
			//
			// int maxLeftLarger=midLarger>-1?larger[midLarger]:Integer.MIN_VALUE;
			// int
			// minRightLarger=midLarger<largerSize-1?larger[midLarger+1]:Integer.MAX_VALUE;

			if (maxLeftSmaller <= minRightLarger && maxLeftLarger <= minRightSmaller) {
				if ((smallerSize + largerSize) % 2 == 0)
					return (double) (Math.max(maxLeftSmaller, maxLeftLarger)
							+ Math.min(minRightSmaller, minRightLarger)) / 2;
				else
					return (double) Math.max(maxLeftSmaller, maxLeftLarger);
			} else if (maxLeftSmaller >= minRightLarger)
				return findMedian(smaller, larger, l, midSmaller - 1, smallerSize, largerSize);
			else
				return findMedian(smaller, larger, midSmaller + 1, u, smallerSize, largerSize);
		}
		return -1;

	}

}