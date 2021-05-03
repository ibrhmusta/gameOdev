package com.company.Interfaces;

import com.company.Entities.Game;

public interface GameService {
    void add(Game game);
    void delete(Game game);
    void update(Game game);
    void getAll(Game[] games);
}
