package oddOccurrencesInArray;

import java.util.HashSet;

/**
 * Lesson2:Arrays OddOccurrencesInArray
 *
 * @see https://app.codility.com/programmers/lessons/2-arrays/odd_occurrences_in_array/
 */
//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");
class Solution {
	public int solution(int[] A) {
		// write your code in Java SE 8
		HashSet<Integer> set = new HashSet<>();

		for(int i : A) {
			if(!set.remove(i)) {
				set.add(i);
			}
		}
		return set.iterator().next();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] A = { 9, 3, 9, 3, 9, 7, 9 };
		System.out.println(solution.solution(A));
	}

}
