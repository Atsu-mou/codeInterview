package com.example.codeInterview.questions.eight;

import java.util.Arrays;

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

    //for 文で一つずつ横に移動する
    //長さ5の場合、0 -> 1 - 4までのfor　文

    //前半　0 -> countまで　後半　count →max

    // 二つに別れたリストの中でリーダーがあるか判定 -> 別メソッド -> Arrayとどこからどこまで
    //　一つの目の数見る　一緒があった場合　count
    //count がリストの半分を超えたら　true 超えなきゃfalse

    public int equiLeader(int[] A){
        int equilCount1 = 0;

        int allInt = 0;

        for (int seperator = 1; seperator < A.length; seperator++){

            boolean firstHalfBoolean = false;

            //前半と後半で同じものを一つとしている
            //前半
            int baseInt = 0;
            int checkNum = 0;

            //前半
            //base numを決める
            int[] firstHalf = Arrays.copyOfRange(A,0,seperator);
            for(int count = 0; count < firstHalf.length; count++){
                int sameNumCount = 0;

                //base numにあっているものを探す
                baseInt = A[count];
                for (int secondCount = 0; secondCount < firstHalf.length; secondCount++){
                    if (baseInt == A[secondCount]){
                        sameNumCount++;
                    }
                    if (sameNumCount > checkNum && firstHalf.length < sameNumCount * 2){
                        checkNum = sameNumCount;
                        allInt = baseInt;
                        firstHalfBoolean = true;
                    }
                }

            }


            boolean secondHalfBoolean = false;

            int secondCount = 0;
            //後半
            int[] secondHalf = Arrays.copyOfRange(A,seperator,A.length);

            //base numにあっているものを探す
            for (int secondInt : secondHalf){
                if (allInt == secondInt){
                    secondCount++;
                }
                if (secondCount * 2 > secondHalf.length){
                    secondHalfBoolean = true;
                }
            }

            if (firstHalfBoolean == true && secondHalfBoolean == true){
                equilCount1++;
            }

        }
        return equilCount1;
    }

}
