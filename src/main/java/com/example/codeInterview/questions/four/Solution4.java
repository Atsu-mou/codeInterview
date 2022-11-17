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

        int[] answer = new int[N];
        System.out.println(Arrays.toString(answer));
        int count = 0;
        int maxNum = 0;

//配列を分ける
        for(int arrayNum : A){
            //配列の中が+1か確かめる
            System.out.println("array num "+arrayNum);
            if(arrayNum <= N && 1 <= arrayNum){
                //answer numの array numの数値の場所を1増やす
                int addNum = answer[arrayNum -1];
                answer[arrayNum -1] = addNum + 1;
                System.out.println(Arrays.toString(answer));
            }if (arrayNum == N+ 1){
            for (int answerInt :answer){
                //最大数　に合わせる
                if (maxNum < answerInt){
                    maxNum = answerInt;
                    for (int countNum = 0; A.length <= countNum; countNum++){
                        answer[countNum] = maxNum;
                        System.out.println(Arrays.toString(answer));
                    }
                }
            }
            }
        }
        System.out.println(Arrays.toString(answer));
        return answer;
    };
}
