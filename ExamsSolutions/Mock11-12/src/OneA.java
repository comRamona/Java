public class OneA {
	public static double geometricMean(int[] nums) {
		int s = 0;
		for (int i : nums)
			s += i;
		return Math.pow((double) s, 1.0 / nums.length);
	}


}
