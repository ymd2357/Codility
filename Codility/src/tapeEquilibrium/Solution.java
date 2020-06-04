package tapeEquilibrium;

/**
 * Lesson3:Time Complexity: TapeEquilibrium
 *
 * @see https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
 */
class Solution {
	public int solution(int[] A) {
		int temp = Integer.MAX_VALUE;
		for (int P = 1; P < A.length; P++) {
			int sum1 = 0;
			int sum2 = 0;
			for (int i = 0; i < A.length; i++) {
				if (i < P) {
					sum1 += A[i];
				} else {
					sum2 += A[i];
				}
			}
			int abs = Math.abs(sum1 - sum2);
//			System.out.println("P = " + P + " : " + abs);

			temp = Math.min(temp, abs);
		}
		return temp;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] A = { 3, 1, 2, 4, 3 };
		int result = solution.solution(A);
		System.out.println(result);
	}
}