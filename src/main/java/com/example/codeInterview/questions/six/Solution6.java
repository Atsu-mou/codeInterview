package com.example.codeInterview.questions.six;

import java.util.ArrayList;
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
        List<Integer> countList = new ArrayList<>();
        for (int eachNum : A){
            if (!countList.contains(eachNum)){
                countList.add(eachNum);
            }
        }
        System.out.println(countList.size());
        return countList.size();
    };
}
