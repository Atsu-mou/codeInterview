package com.example.codeInterview.questions.four;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution4 {

    public int solution(int X, int[] A){

        List<Integer> integerList = new ArrayList<>();
        for (int count = 1; X >= count; count++){
            integerList.add(count);
        }
        int countLoop = 0;
        for (int eachLeaf :A){
            countLoop++;
            if(integerList.contains(eachLeaf)){
                Integer integer = eachLeaf;
                integerList.remove(integer);
                if (integerList.isEmpty()){
                    return countLoop -1;
                }
            }
        }

        return -1;
    };

    public int solution2(int[] A){

        //ArrayList A[] = {4,1,3,2};
        int minusCount = 0;
        List<Integer> integerList = new ArrayList<>();
        for(int eachNum: A){
            if (eachNum >  A.length){
                return 0;
            }
            if (integerList.contains(Integer.valueOf(eachNum))){
                return 0;
            }
            integerList.add(eachNum);
        }
        for(int count = 0; A.length >= count; count++){
            Integer subNum = A[count];
            integerList.remove(subNum);
            minusCount++;
            if(integerList.isEmpty() & minusCount == A.length){
                return 1;
            }
        }
        return 0;
    };

    public int[] solution3(int N,int[] A){
        int maxCount = N + 1;

        int[] answerArray = new int[N];
        for(int eachAInt : A){

            //boolean for set as max
            if (eachAInt == maxCount){
                answerArray = adjustAsMax(answerArray);
            }
            //if 1 ≤ X ≤ N as 1 to target
            if(1 <= eachAInt && eachAInt <= N){
                int addNum = answerArray[eachAInt - 1];
                answerArray[eachAInt - 1] = addNum +1;
                System.out.println(Arrays.toString(answerArray));
            }

        }
        System.out.println(Arrays.toString(answerArray));
        return answerArray;
    };

    public int[] adjustAsMax(int[] answerArray){
        int maxIntA = 0;


        //Maxを取得する
        for(int eachAIntForMax : answerArray){
            if (eachAIntForMax > maxIntA){
                maxIntA = eachAIntForMax;
            }
        }
        //Maxを代入する
        for (int count = 0; answerArray.length -1 >= count; count++){
            System.out.println("Max as " + maxIntA);

            answerArray[count] = maxIntA;
            System.out.println(Arrays.toString(answerArray));
        }
        return answerArray;
    }

    public int solution4(int[] A){
        return 1;
    };
}
