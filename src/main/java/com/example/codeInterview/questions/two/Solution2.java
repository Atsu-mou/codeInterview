package com.example.codeInterview.questions.two;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import static java.lang.Integer.toBinaryString;

public class Solution2 {

    public int[] solution(int [] A, int K){

        int countOfList = 0;
        int countForNewPlace = 0;
        long numberOfArray = Arrays.stream(A).count();
        Map<Integer, Integer> valueMap = new HashMap();
        if (K >numberOfArray){
            K= K %6;
        }
        for(int eachNum : A ){
            countOfList++;
            countForNewPlace = countOfList + K -1;
            valueMap.put(countForNewPlace,A[countOfList -1]);
        }

        for (Integer keyNum : valueMap.keySet()){
            int secondKeyNumber = 0;
            if(keyNum >= countOfList){
                int thirdKeyNum = keyNum - countOfList;
                A[thirdKeyNum] = valueMap.get(keyNum);
            }else {
                A[keyNum] = valueMap.get(keyNum);
            }
        }
        System.out.println(Arrays.toString(A));
        return A;
    }

    public int solution1(int[] A){
        for(int num = 0; num < 10 ;num++){
            int count = 0;
            for(int eachNum : A ){
                if(eachNum == num){
                    count++;
                }
            }
            if ( 1 == count % 2){
                return num;
            }
        }
        return 0;
    }
}
