package com.example.codeInterview.questions.five;

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
}
