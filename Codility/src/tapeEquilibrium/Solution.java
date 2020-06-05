package tapeEquilibrium;

/**
 * Lesson3:Time Complexity: TapeEquilibrium
 *
 *
 * 2 <= N <= 100,000
 * -1,000 <= A <= 1,000
 *
 * @see https://app.codility.com/programmers/lessons/3-time_complexity/tape_equilibrium/
 */
class Solution {
	public int solution(int[] A) {
		int N = A.length;
		int temp = Integer.MAX_VALUE;
		int total = 0;
		for (int P = 0; P < N; P++) {
			total += A[P];
		}
		for (int P = 1; P < N; P++) {
			total -= A[P-1] * 2;
			int abs = Math.abs(total);
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