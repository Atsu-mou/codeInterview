package com.example.codeInterview.questions.twelvle;

import java.util.ArrayList;
import java.util.List;

public class Solution12 {

    // 10 を 4 で足す
    // 4
    // 8
    // 4*3 = 12
    // 12 - 10

    public int solution(int N, int M){
        int secondCount = 0;
        List<Integer> numList = new ArrayList<>();

        for(int count = 1;  count >= secondCount; count++){

            //N より低い場合
           int checkCount = M * count;
           if (N > checkCount){
               numList.add(checkCount);
           }else {
               //Nより高い場合
               while (N < checkCount){
                   checkCount = checkCount - N;
               }
               if (!numList.contains(checkCount)){
                   numList.add(checkCount);
               } else {
                   return numList.size();
               }
           }

        }
        return 0;
    }
}
