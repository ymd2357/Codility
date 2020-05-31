package cyclicRotation;

//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");
/**
 * lesson2:Arrays CyclicRotation
 *
 * @see https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/
 */
class Solution {
	public int[] solution(int[] A, int K) {
		if (A.length == 0)
			return A;

		int k = K % A.length;
		int[] ret = new int[A.length];
		for (int i = 0; i < k; i++)
			ret[i] = A[i + A.length - k];
		for (int i = 0; i < A.length - k; i++)
			ret[i + k] = A[i];
		return ret;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] A = { 3, 8, 9, 7, 6 };
		int K = 3;
		solution.solution(A, K);
	}
}
