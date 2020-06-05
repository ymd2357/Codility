package countingElements;

import java.util.Set;
import java.util.TreeSet;

/**
 * Lesson 4:Counting Elements: FrogRiverOne
 *
 * @see https://app.codility.com/programmers/lessons/4-counting_elements/frog_river_one/
 */
class Solution {
	public int solution(int X, int[] A) {
		Set<Integer> map = new TreeSet<>();
		for (int i = 0; i < A.length; i++) {
			map.add(A[i]);
			if (map.size() == X)
				return i;
		}
		return -1;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int X = 5;
		int[] A = { 1, 3, 1, 4, 2, 3, 5, 4 };
		int result = solution.solution(X, A);
		System.out.println(result);
	}
}