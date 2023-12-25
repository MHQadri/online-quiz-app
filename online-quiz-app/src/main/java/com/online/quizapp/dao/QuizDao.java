package com.online.quizapp.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online.quizapp.model.Quiz;

public interface QuizDao extends JpaRepository<Quiz,Integer> {
}
