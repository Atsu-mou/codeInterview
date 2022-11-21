package com.example.codeInterview.questions.six;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution6 {

    //goal -> look inside array and count number of numbers
    // loop でAを分ける
    //list に入れる　→　条件　同じものが存在したら代入しない
    //listのsizeを返す
    public int solution(int[] A){
        List<Integer> countList = new ArrayList<>();
        for (int eachNum : A){
            if (!countList.contains(eachNum)){
                countList.add(eachNum);
            }
        }
        System.out.println(countList.size());
        return countList.size();
    };

    public int solution1(int[] A){
        //並び帰る
        //−を二つしたと一番大きい比較一番大きい三つ
        //
        int topThree = 0;
        int minusTopThree = 0;
        Arrays.sort(A);

        if (A.length >= 3){
            int first = A[A.length -1];
            int second = A[A.length -2];
            int third = A[A.length -3];
            topThree = first * second * third;

            if (A[1] < 0){
                int minusFirst = A[0];
                int minuseSecond = A[1];
                int third2 = A[A.length -1];
                minusTopThree = minusFirst * minuseSecond * third2;
                if (topThree < minusTopThree){
                    topThree = minusTopThree;
                }
            }
        }
        System.out.println(topThree);
        return topThree;
    }

    public int solution2(int[] A){
        //並び帰る
        //−を二つしたと一番大きい比較一番大きい三つ
        //
        int first = 0;
        int second = 0;
        int third = 0;
        Arrays.sort(A);

        for (int count = 0; count <= A.length -4; count++){
            first = A[count];
            second = A[count + 1];
            third = A[count + 2];
            if (first + second > third && second + third > first && third + first > second){
                return 1;
            }
        }
        return 0;
    }
}
