package com.company.Managers;

import com.company.Entities.Game;
import com.company.Interfaces.GameService;

public class GameManager implements GameService {
    @Override
    public void add(Game game) {
        System.out.println(game.getName()+" oyunu eklendi.");
    }

    @Override
    public void delete(Game game) {
        System.out.println(game.getName()+" oyunu silindi.");
    }

    @Override
    public void update(Game game) {
        System.out.println(game.getName()+" oyunu güncellendi.");
    }

    @Override
    public void getAll(Game[] games) {
        System.out.println("Mevcut oyunlar aşağıdaki gibidir...");
        for(Game game:games){
            System.out.println(game.getName());
        }
    }
}
