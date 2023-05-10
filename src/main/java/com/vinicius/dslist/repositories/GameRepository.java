package com.vinicius.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vinicius.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
