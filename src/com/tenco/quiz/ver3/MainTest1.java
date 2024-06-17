package com.tenco.quiz.ver3;

import java.sql.SQLException;

public class MainTest1 {

	public static void main(String[] args) {

		QuizRepositoryImpl quizRepositoryImpl = new QuizRepositoryImpl();
		try {
//			List<QuizDTO> quizDtos = quizRepositoryImpl.viewQuizQuestion();
//			for (QuizDTO quizDTO : quizDtos) {
//				System.out.println(quizDTO);		
//			}

			QuizDTO dto = quizRepositoryImpl.playQuizGame();
			System.out.println(dto);

			System.out.println("정답을 맞춰 주세요");
			System.out.println(dto.getQuestion());
			String userInput = "대한민국"; // 스캐너쓰기
			if (dto.getAnswer().equalsIgnoreCase(userInput)) {
				System.out.println("정답입니다.");
			} else {
				System.out.println("오답입니다.");
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	} // end of main

}
