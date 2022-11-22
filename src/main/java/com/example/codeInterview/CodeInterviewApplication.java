package com.example.codeInterview;

import com.example.codeInterview.questions.eight.Solution8;
import com.example.codeInterview.questions.four.Solution4;
import com.example.codeInterview.questions.one.Solution;
import com.example.codeInterview.questions.seven.Solution7;
import com.example.codeInterview.questions.six.Solution6;
import com.example.codeInterview.questions.three.Solution3;
import com.example.codeInterview.questions.two.Solution2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeInterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeInterviewApplication.class, args);

		//Question1
		Solution solution1 = new Solution();
		solution1.solution(647);

		//Question2
		int[] someInts = {1,2,3,4,5,6};

		Solution2 solution2 = new Solution2();
		solution2.solution(someInts, 190000);

		int[] someInts1 = {9,3,9,3,9,7,9};
		solution2.solution1(someInts1);
		System.out.println(solution2.solution1(someInts1));

//		Question 3
		Solution3 solution3 = new Solution3();
		int answer3 = solution3.solution(10,85,30);
		System.out.println(answer3);

		int[] someInts3 = {1,2,3,4,6};
		solution3.solution1(someInts3);

		int[] someInts4 = {3,1,2,4,3};
		solution3.solution2(someInts4);


		//Question 4
		int[] someInts5 = {1,3,1,4,2,3,5,4};
		Solution4 solution4 = new Solution4();
		solution4.solution(5,someInts5);

		int [] someInts6 = {4,1,3,2,5};
		int answer = solution4.solution2(someInts6);
		System.out.println(answer);

		int [] someInts7 = {3,4,4,6,1,4,4};
		solution4.solution3(5,someInts7);

		int [] someInts8 = {1,3,6,4,1,2};
		solution4.solution4(someInts8);

		int[] someInts9 = {2,1,1,2,3,1,4};
		Solution6 solution6 = new Solution6();
		solution6.solution(someInts9);
		int[] someInts10 = {-3,1,2,-2,5,6};
		solution6.solution1(someInts10);

		int[] someIntts11 = {10,2,5,1,8,20};
		int[] someIntts12 = {10,50,5,1};
		System.out.println(solution6.solution2(someIntts11));
		solution6.solution2(someIntts11);
		Solution7 solution7 = new Solution7();
		solution7.solution("{[()()]}");
		System.out.println(solution7.nesting("(()(())())"));

		int[] someArr = {3,4,3,2,3,-1,3,3};
		Solution8 solution8 = new Solution8();
		System.out.println(solution8.solution(someArr));
	}

}
