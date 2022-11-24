package com.example.codeInterview.questions.nine;

public class Solution9 {

    //for分で　0で全部　1で全部　2で全部
    //次の数が低い場合
    public int solution(int[] A){

        int gapNum = 0;

        //一番低い数
        int preCheckNum = 0;
        int mostLowNum = 0;

        for(int count = 0; count < A.length; count++){


            //最も低い数を作る
            if (mostLowNum > A[count] || count == 0){
                mostLowNum = A[count];
                preCheckNum++;
            }

            //最も高い数と最も低い数を引く
            int minusNum = A[count] - mostLowNum;
            if (minusNum > gapNum){
                gapNum = minusNum;
            }
        }

        if (preCheckNum == A.length -1){
            return 0;
        }
        return gapNum;
    }
}
