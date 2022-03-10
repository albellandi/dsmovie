package com.devsuperior.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entititeis.Score;
import com.devsuperior.dsmovie.entititeis.ScorePk;

public interface ScoreRepository extends JpaRepository<Score, ScorePk>{

}
