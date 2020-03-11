package com.dyominov.baccarat.repository;

import com.dyominov.baccarat.model.Game;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GameRepository extends MongoRepository<Game, String> {


    void deleteById(String id);
}
