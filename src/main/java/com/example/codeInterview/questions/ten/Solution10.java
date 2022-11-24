package com.example.codeInterview.questions.ten;

import java.util.HashMap;

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

    public int minPerRec(int N){
        int backNum = 0;

        for(int count = 1; count <= N;count++){
            if (N % count == 0){
                int secondFactor = N / count;
                int addNum = (count + secondFactor) *2;
                if (addNum < backNum || count == 1){
                    backNum = addNum;
                }
            }
        }
        return backNum;
    };
}
