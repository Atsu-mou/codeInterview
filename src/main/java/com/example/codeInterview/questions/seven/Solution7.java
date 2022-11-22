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
