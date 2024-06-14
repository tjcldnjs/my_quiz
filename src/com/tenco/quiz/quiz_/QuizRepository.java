package com.tenco.quiz.quiz_;

import java.sql.SQLException;
import java.util.List;

public interface QuizRepository {

	int addQuizQuestion(String question, String answer) throws SQLException;

	List<QuizDTO> viewQuizQuestion() throws SQLException;

	QuizDTO playQuizGame() throws SQLException;

}
