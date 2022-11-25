package com.example.codeInterview.questions.eleven;

import java.util.Arrays;

public class Solution11 {

    //配列の中で約数ではないものの数を　新しい配列で返す
    public int[] solution(int[] A){
        //一個見て　全部と比較
        // 約数であれば　！　

        //create return array
        int[] backArray = new int[A.length];

        for (int count = 0; count < A.length; count++){
            int addCount = 0;

            for (int countSecond = 0; countSecond < A.length; countSecond++){
                if (A[count] % A[countSecond] != 0 &&  count != countSecond){
                   addCount++;
               }
            }

            System.out.println(addCount);

            // add count to list
            backArray[count] = addCount;
        }

        System.out.println(Arrays.toString(backArray));
        return backArray;
    }
}
