package com.example.codeInterview;

import com.example.codeInterview.questions.one.Solution;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CodeInterviewApplication {

	public static void main(String[] args) {
		SpringApplication.run(CodeInterviewApplication.class, args);
		Solution solution = new Solution();
		solution.solution(647);
	}

}
