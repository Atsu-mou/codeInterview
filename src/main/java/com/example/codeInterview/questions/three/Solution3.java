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

        int inputNumber = 0;
        int answerNumber = 100;

        for (int countNum = 0; countNum < A.length; countNum++){
            inputNumber = getDiff(A,countNum);
            System.out.println("inputnumber is "+ inputNumber);
            if (inputNumber < answerNumber){
                answerNumber = inputNumber;
            }
        }

        System.out.println(answerNumber);
        return answerNumber;
    }

    public int getDiff(int A[], int index){

        int firstHalf = 0;
        int secondeHalf = 0;
        int diffNum = 0;
        int countFirstLoop = 0;
        //1 to 0
        // for true -> false
        System.out.println(index + " is the index");
        for (int countNum = index; -1 < countNum; countNum--){

            firstHalf = firstHalf + A[countNum];
            countFirstLoop++;
        }

            //2 to 4
        for (int countNumSecond = countFirstLoop ; A.length > countNumSecond; countNumSecond++){
            secondeHalf = secondeHalf +A[countNumSecond];
        }
        System.out.println("Firsthalf "+firstHalf);

        System.out.println(secondeHalf+" Second half");

        diffNum = firstHalf - secondeHalf;

        if (diffNum < 0){
            return Math.abs(diffNum);
        }

        System.out.println(diffNum);
        return diffNum;
    }
}
