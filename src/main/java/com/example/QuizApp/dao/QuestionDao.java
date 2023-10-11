package com.example.QuizApp.dao;

import com.example.QuizApp.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Repository
public interface QuestionDao extends JpaRepository<Question, Integer> {

    List<Question> findByDifficultylevel(String diff);

    @Query(value = "SELECT * FROM question q WHERE q.difficultylevel = :difficultylevel ORDER BY RAND() LIMIT :numQ", nativeQuery = true)
    List<Question> findRandomQuestionsByDifficultylevel(@RequestParam("difficultylevel") String difficultylevel, @RequestParam("numQ") int numQ);
}
