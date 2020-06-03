package frogJmp;

/**
 * Lesson3:Time Complexity:FrogJmp
 *
 * @see https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
 */
public class Solution {

	public int solution(int X, int Y, int D) {
		double ret = Math.ceil((double)(Y - X) / D);
		return (int) ret;
	}

	public static void main(String[] args) {
		Solution solution = new Solution();
		int X = 10;
		int Y = 85;
		int D = 30;
		int result = solution.solution(X, Y, D);
		System.out.println(result);
	}

}
