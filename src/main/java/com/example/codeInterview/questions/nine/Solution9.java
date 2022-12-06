package com.example.codeInterview.questions.nine;

public class Solution9 {

    //for分で　0で全部　1で全部　2で全部
    //次の数が低い場合
    public int solution(int[] A){

        int gapNum = 0;

        //一番低い数
        int preCheckNum = 0;
        int mostLowNum = 0;

        for(int count = 0; count < A.length; count++){


            //最も低い数を作る
            if (mostLowNum > A[count] || count == 0){
                mostLowNum = A[count];
                preCheckNum++;
            }

            //最も高い数と最も低い数を引く
            int minusNum = A[count] - mostLowNum;
            if (minusNum > gapNum){
                gapNum = minusNum;
            }
        }

        if (preCheckNum == A.length -1){
            return 0;
        }
        return gapNum;
    }
    public int maxSliceSum(){
        int[]A = new int[]{3, 2, -6, 4, 0};
        int secondNum = 0;

        for (int count = 0; count < A.length; count++){
            int checkInt = A[count];

            for (int secondCount = count +1 ; secondCount < A.length; secondCount++){
                checkInt += A[secondCount] ;
                if (secondNum < checkInt){
                    secondNum = checkInt;
                }
            }
        }

        System.out.println(secondNum);
        return secondNum;
    }

    //still need fix
    public int maxDoubleSliceSum(){
        // 0
        //一個増やして回す

        //左から増やしていく
        //
        //全体から[0]から一個ずつ減らして回す
        //

        int backNum = 0;
        int [] A = {3,2,6,-1,4,5,-1,2};
//
//        for(int firstNum = 0; firstNum < someInts.length - 4; firstNum++){
//
//            // + 4から一つずつ増やしていく
//            for (int lastNum = firstNum + 3; lastNum < someInts.length; lastNum++){
//
//                //countとsecondCountは外す
//                //一個ずつずらす
//                for (int middleNum = firstNum + 1; middleNum < lastNum; middleNum++){
//                    int addNum = 0;
//                    for (int checkNum = firstNum; checkNum < lastNum; checkNum++){
//                        if (checkNum != firstNum || checkNum != middleNum || checkNum != lastNum){
//                            addNum += someInts[checkNum];
//                            if (checkNum == lastNum -1 && backNum < addNum){
//                                System.out.println("first num " +firstNum + " mid num " + middleNum + " lastNum " + lastNum);
//                                backNum = addNum;
//                            }
//                        }
//                    }
//                }
//            }
//        }
        //copied for study
        int[] prevSubSum = new int[A.length];
        int[] postSubSum = new int[A.length];

        for (int i = 1; i < A.length - 1; i++) {
            prevSubSum[i] = Math.max(0, prevSubSum[i - 1] + A[i]);
        }
        for (int i = A.length - 2; i > 0; i--) {
            postSubSum[i] = Math.max(0, postSubSum[i + 1] + A[i]);
        }
        int globalMaxSum = 0;
        for (int i = 1; i < A.length - 1; i++) {
            globalMaxSum = Math.max(prevSubSum[i - 1] + postSubSum[i + 1], globalMaxSum);
        }
        System.out.println(globalMaxSum);
        return globalMaxSum;
    }
}
