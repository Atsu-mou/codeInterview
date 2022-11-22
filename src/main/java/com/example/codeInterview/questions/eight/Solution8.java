package com.example.codeInterview.questions.eight;

public class Solution8 {

    public int solution(int[] A){


        for (int count = 0; count < A.length; count++){
            int validateNum = A[count];
            int countDom = 0;

            for (int counts = 0; counts < A.length; counts++){

                if (validateNum == A[counts]){
                    countDom++;
                }
            }
            if (countDom > A.length/2){
                return count;
            }
        }
        return -1;
    }
}
