package com.t2404e.sem4_project_quy.controller;

import com.t2404e.sem4_project_quy.entity.Indexer;
import com.t2404e.sem4_project_quy.entity.Player;
import com.t2404e.sem4_project_quy.repository.IndexerRepository;
import com.t2404e.sem4_project_quy.repository.MySqlIndexerRepository;
import com.t2404e.sem4_project_quy.repository.MySqlPlayerRepository;
import com.t2404e.sem4_project_quy.repository.PlayerRepository;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class PlayerServlet extends HttpServlet {

    PlayerRepository playerRepository = new MySqlPlayerRepository();
    IndexerRepository IndexerRepository = new MySqlIndexerRepository();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Player> players = playerRepository.findAll();
        List<Indexer> indexers = IndexerRepository.findAll();
        req.setAttribute("Players", players);
        req.setAttribute("Indexers", indexers);
        req.getRequestDispatcher("player.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
