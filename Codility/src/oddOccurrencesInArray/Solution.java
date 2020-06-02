package oddOccurrencesInArray;

import java.util.HashMap;
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
		HashMap<Integer, Integer> map = new HashMap<>();

		IntConsumer action = (i) -> {
			Integer count = map.get(i);
			map.put(i, count == null ? 1 : count + 1);
		};
		IntStream.of(A).forEach(action);
		Predicate<? super Entry<Integer, Integer>> action2 = e -> e.getValue() % 2 == 1;
		return map.entrySet().stream().filter(action2).findFirst().get().getKey().intValue();
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int[] A = { 9, 3, 9, 3, 9, 7, 9 };
		System.out.println(solution.solution(A));
	}

}
