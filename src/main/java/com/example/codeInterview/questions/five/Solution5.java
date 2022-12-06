package com.example.codeInterview.questions.five;

import java.util.Arrays;

public class Solution5 {
    public int passingCars(){
        int[] someInts = {0,1,0,1,1};

        int passedCar = 0;

        for(int count = 0; count < someInts.length; count++){
            int eachInt = someInts[count];
            if (eachInt == 0){
                for (int secondCount = count +1; secondCount < someInts.length; secondCount++){
                    if (someInts[secondCount] == 1){
                        passedCar++;
                    }
                }
            }
        }
        System.out.println(passedCar);
        return passedCar;
    }

    public int countDiv(int A, int B, int K){

        int lastCount = 0;
        for (int count = K; count <= B; count += K){
            if (A <= count && count <= B){
                lastCount++;
            }
        }


        return lastCount;
    }

    public int[] solution(String S, int[] P, int[] Q){


        String [] arrayString = S.split("");
        System.out.println(Arrays.toString(arrayString));
        int [] backArray = new int[P.length];

        String a = "A";
        String c = "C";
        String g = "G";
        String t = "T";


        for (int count = 0; count <= P.length -1; count++){
            int firstNum = P[count];
            int secondNum = Q[count];
            System.out.println(firstNum +" first num " + secondNum +" second num");
            for (int secondCount = firstNum; secondCount <= secondNum; secondCount++){
                String eachString = arrayString[secondCount];

                if (eachString.equals(a)){
                    backArray[count] = 1;
                }
                if (eachString.equals(c)){
                    if (2 < backArray[count]){
                        backArray[count] = 2;
                    }
                }
                if (eachString.equals(g)){
                    if (3 < backArray[count]){
                        backArray[count] = 3;
                    }
                }
                if (eachString.equals(t)){
                    if (backArray[count] == 0){
                        backArray[count] = 4;
                    }
                }
            }
        }

        System.out.println(Arrays.toString(backArray));
        return P;
    };

}
