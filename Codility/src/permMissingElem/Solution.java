package permMissingElem;

import java.util.function.IntPredicate;
import java.util.stream.IntStream;

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

		IntPredicate predicate = i -> IntStream.of(A).noneMatch(j -> i == j);
		int ret = IntStream.range(1, A.length + 2).filter(predicate).findFirst().getAsInt();

		return ret;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] A = { 2, 3, 1, 5 };
		int result = solution.solution(A);
		System.out.println(result);
	}
}