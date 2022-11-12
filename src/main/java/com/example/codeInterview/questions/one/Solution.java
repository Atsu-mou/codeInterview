package com.example.codeInterview.questions.one;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import static java.lang.Integer.toBinaryString;

public class Solution {


    public int solution(int N){
        String binary1 = "1";
        String binary0 = "0";
        int value = 0;

       String binary =  toBinaryString(N);
       String[] eachNum = binary.split("");
       int nextValue = 0;
       Iterator<String>iterator =  Arrays.stream(eachNum).iterator();
       while (iterator.hasNext()){
          String targetString = iterator.next();

          if (targetString.equals(binary0)){
              nextValue++;
              if (!iterator.hasNext()){
                  break;
              }
          }

          if(targetString.equals(binary1) & nextValue > value){
                  value = nextValue;
                  if (iterator.hasNext()){
                      nextValue = 0;
                  }
          }
      }

       System.out.println(binary + " is the binary for int "+N + " and the solution Value is " + value);
        return value;
    };
}
