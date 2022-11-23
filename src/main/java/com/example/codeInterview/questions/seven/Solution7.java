package com.example.codeInterview.questions.seven;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;

public class Solution7 {

    //先は後
    //あとは先
    //空きであれば入れる、閉めるであれば pop で空きか
    public int solution(String S) {
        Deque<Character> stack = new ArrayDeque<>();

        if(1 == S.length() % 2){
            return 0;
        }

        for(int count = 0; count < S.length(); count++) {
            char eachChar = S.charAt(count);

            switch (eachChar){
                case ')':
                    if (stack.isEmpty() || stack.pop() != '(')
                        return 0;
                    break;
                case ']':
                    if (stack.isEmpty() || stack.pop() != '[')
                        return 0;
                    break;
                case '}':
                    if(stack.isEmpty() || stack.pop() != '{')
                        return 0;
                    break;

                default:
                    stack.push(eachChar);
                    break;
            }
        }

        return stack.isEmpty() ? 1 : 0;
    }

    // A is size
    // B is where they look
    // B が１の場合　int[1] int[2]と戦う
    public int fish(int[] A, int[] B){
        Deque<Integer> fishStack = new ArrayDeque<>();
        int minusCount = 0;

        for (int count = 0; count < A.length ; count++){
            if (B[count]== 0 && count == 0){
                // do nothing
            }
            if (B[count]== 1){
                for (int secountCount = count + 1; secountCount < A.length; secountCount++){
                    //1であれば 一個次の数の方向確認する　→　方向 0なら消す　1 ならbreak
                    if (B[secountCount] == 0){
                        if (A[count] > A[secountCount]){
                            minusCount ++;
                        }
//                        if ()
                    }
                }
            }

        }
        System.out.println(A.length - minusCount);
        return A.length - minusCount;
    };

    public int nesting(String S) {
        Deque<Character> stack = new ArrayDeque<>();
        for(int count = 0; count < S.length(); count++){
            char someChar = S.charAt(0);
            switch (someChar){
                case '(':
                    stack.push(someChar);
                    break;
                case ')':
                    if ('(' != stack.pop() || stack.isEmpty()){
                        return 0;
                    }
                    break;
            }

        }
        if (!stack.isEmpty()){
            return 0;
        }
        return 1;
    }
}
