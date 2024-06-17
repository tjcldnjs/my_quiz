package com.tenco.quiz.quiz_;

import java.util.Scanner;

public class QuizRepositoryTest1 {

	public static void main(String[] args) {

		// 메서드 호출해서 실행 확인 디버깅 확인 테스트
		// QuizRepository 구현 클래스 테스트
		// 실행에 흐름 여러분 직접 만들어 보세요s

		QuizRepositoryImpl quizRepositoryImpl = new QuizRepositoryImpl();

		try {
			QuizDTO dto = quizRepositoryImpl.playQuizGame();

			System.out.println(dto.getQuestion());
			Scanner scanner = new Scanner(System.in);

			if (dto.getAnswer().equalsIgnoreCase(scanner.nextLine())) {
				System.out.println("정답입니다.");
				System.out.println("점수 : ");
			} else {
				System.out.println("오답입니다.");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
