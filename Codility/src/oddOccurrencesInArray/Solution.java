package oddOccurrencesInArray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map.Entry;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;

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

		IntConsumer action = (i) -> {
			if(!set.remove(i)) {
				set.add(i);
			}
		};
		IntStream.of(A).forEach(action);
		return set.stream().findFirst().get().intValue();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] A = { 9, 3, 9, 3, 9, 7, 9 };
		System.out.println(solution.solution(A));
	}

}
