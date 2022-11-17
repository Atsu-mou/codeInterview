package com.example.codeInterview.questions.three;

import java.util.Arrays;

public class Solution3 {
    public int solution(int X,int Y, int D){

        int countJump = 0;
        int currentAddNum = X;

        Boolean jumpIsOk = true;

        if (X >= Y){
            return 0;
        }


        if (jumpIsOk){
           while (currentAddNum <= Y){
               currentAddNum += D;
               countJump ++;
           }
        }
        return countJump;
    }

    public int solution1(int[] A){
        for(int num = 1; 100000 >= num; num++){
            int finalNum = num;
            if(!Arrays.stream(A).anyMatch(i -> i == finalNum)){
                System.out.println(num);
                return num;
            }
        }
        return 0;
    }

    public int solution2(int[] A){

        int submitNum = 0;
        int addNum = 0;
        //配列のなかを半分に分けて、前半-後半した時に一番少ない整数になった数字を返しなさい
        //全部足して、その半分を出す
        //半分を超えた時に、一個前と一個あとを比較

        //+1 は配列の数はround robin
        //一つずつ確認
        //合計四つの場合、一つめと、他の三つ　→二つ目と他二つ　→
        //
        int arrayCount = (int) Arrays.stream(A).count();

        //int[] someInts4 = {3,1,2,4,3} 0 1234

        for(int someNum = 0; arrayCount >= someNum; someNum++){
            int fistHalf = 0;


            fistHalf = A[someNum];


        }
        System.out.println(submitNum + " submit num");

        return submitNum;
    }
}
