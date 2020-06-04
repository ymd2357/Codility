package permMissingElem;

/**
 * Lesson3:Time Complexity:PermMissingElem
 *
 * @see https://app.codility.com/programmers/lessons/3-time_complexity/perm_missing_elem/
 */
class Solution {
	public int solution(int[] A) {
		if (A.length == 0) {
			return 1;
		}

		int sum = 0;
		for (int i : A) {
			sum += i;
		}
		long sum2 = ((long) A.length + 1) * ((long) A.length + 2) / 2;

		return (int) (sum2 - sum);
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] A = { 2, 3, 1, 5 };
		int result = solution.solution(A);
		System.out.println(result);
	}
}