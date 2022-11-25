package com.example.codeInterview.questions.fifteen;

import java.util.ArrayList;
import java.util.List;

public class Solution15 {

    public int absDistinct(int[] A){

        List<Integer> numList = new ArrayList<>();
        for(int count = 0; count < A.length; count++){
            int absoluteNum =  A[count];
            if (!numList.contains(Math.abs(absoluteNum))){
                numList.add(Math.abs(absoluteNum));
            }
        }
        System.out.println(numList.size());
        return numList.size();
    }
}
