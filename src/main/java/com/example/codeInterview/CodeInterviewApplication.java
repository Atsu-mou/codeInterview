package com.example.codeInterview;

import com.example.codeInterview.questions.one.Solution;
import com.example.codeInterview.questions.two.Solution2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeInterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeInterviewApplication.class, args);

		//Question1
		Solution solution = new Solution();
		solution.solution(647);

		//Question2
		int[] someInts = {1,2,3,4,5,6};

		Solution2 solution2 = new Solution2();
		solution2.solution(someInts, 190000);

		int[] someInts1 = {9,3,9,3,9,7,9};
		solution2.solution1(someInts1);
		System.out.println(solution2.solution1(someInts1));

	}

}
