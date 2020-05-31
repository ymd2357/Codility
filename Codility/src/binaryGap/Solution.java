package binaryGap;

import java.util.function.IntConsumer;

/**
 * Lesson1:Iteration BinaryGap
 *
 *
 * @see https://app.codility.com/programmers/lessons/1-iterations/binary_gap/
 *
 * @author yamada2357
 *
 */
//you can also use imports, for example:
//import java.util.*;

//you can write to stdout for debugging purposes, e.g.
//System.out.println("this is a debug message");
class Solution {
	boolean bool = false;
	int tmp = 0;
	int ret = 0;

	/**
	 * N is an integer within the range [1..2,147,483,647].
	 * @param N
	 * @return
	 */
	public int solution(int N) {
        // write your code in Java SE 8
		IntConsumer action = (i) -> {
			if((char)i == '1') {
				bool = true;
				ret = Math.max(ret, tmp);
				tmp = 0;
			} else {
				if(bool) {
					tmp++;
				}
			}

//			System.out.println((char) i + ": tmp = " + tmp + ": ret = " + ret);
		};
		Integer.toBinaryString(N).chars().forEach(action);
		return ret;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		solution.solution(32);
	}
}