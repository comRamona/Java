public class OneB {

	public static int longestSeq(int[] nums, int n) {
		if (nums.length == 0)
			return 0;
		if (n != 0 && n != 1)
			return 0;
		int s = 0, p = 0;
		for (int i = 0; i < nums.length; i++) {
			s = 0;
			if (nums[i] == n) {
				s++;
				for (int j = i + 1; j < nums.length; j++)
					if (nums[j] == n)
						s++;
					else {
						i = j;
						break;
					}
			}
			if (s > p)
				p = s;
		}
		return p;
	}

}
