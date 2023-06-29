package ch00.test;

class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 - num2;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().solution(6, 3));
    }
}
