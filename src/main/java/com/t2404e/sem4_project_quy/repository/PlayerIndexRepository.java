package com.t2404e.sem4_project_quy.repository;

import com.t2404e.sem4_project_quy.entity.PlayerIndex;

import java.util.List;

public interface PlayerIndexRepository {
    List<PlayerIndex> findAll();
}
