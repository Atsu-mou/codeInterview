package com.example.codeInterview.questions.ten;

public class Solution10 {

    //全体割る for
    public int countFactor(int N){
        int countFactor = 0;
        for (int count = 1; count <= N; count++){
            if (N % count == 0){
                countFactor++;
            }
        }
        System.out.println(countFactor);
        return countFactor;
    };
}
