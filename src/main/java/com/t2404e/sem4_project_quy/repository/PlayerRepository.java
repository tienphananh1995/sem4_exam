package com.t2404e.sem4_project_quy.repository;

import com.t2404e.sem4_project_quy.entity.Player;

import java.util.List;

public interface PlayerRepository {
    Player save(Player player);
    Player update(int id, Player player);
    Player delete(int id);
    List<Player> findAll();
}
