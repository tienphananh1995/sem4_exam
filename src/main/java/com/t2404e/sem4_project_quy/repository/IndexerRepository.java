package com.t2404e.sem4_project_quy.repository;

import com.t2404e.sem4_project_quy.entity.Indexer;
import com.t2404e.sem4_project_quy.entity.Player;

import java.util.List;

public interface IndexerRepository {
    List<Indexer> findAll();
}
