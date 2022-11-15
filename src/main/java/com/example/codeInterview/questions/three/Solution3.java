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
}
