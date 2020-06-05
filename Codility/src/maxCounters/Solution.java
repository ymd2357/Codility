package maxCounters;

import java.util.stream.IntStream;

/**
 * Lesson 4:Counting Elements: MaxCounters
 *
 * N and M are integers within the range [1..100,000]; each element of array A
 * is an integer within the range [1..N + 1].
 *
 * @see https://app.codility.com/programmers/lessons/4-counting_elements/max_counters/fa
 */
class Solution {
	public int[] solution(int N, int[] A) {
		int[] result = new int[N];
		for (int i : A) {
			if (1 <= i && i <= N)
				result[i - 1]++;
			if (i == N + 1) {
				int max = IntStream.of(result).max().getAsInt();
				for (int j = 0; j < result.length; j++)
					result[j] = max;
			}
		}
		return result;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int N = 5;
		int[] A = { 3, 4, 4, 6, 1, 4, 4 };
		int[] result = solution.solution(N, A);
		System.out.println(result);
	}
}