package com.t2404e.sem4_project_quy.repository;

import com.t2404e.sem4_project_quy.entity.Player;
import com.t2404e.sem4_project_quy.helper.MySqlHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlPlayerRepository implements PlayerRepository {

    @Override
    public Player save(Player player) {
        String sql = "insert into player (name, full_name, age, index_id) values (?,?,?,?)";
        try {
            Connection connection = MySqlHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, player.getName());
            preparedStatement.setString(2, player.getFullName());
            preparedStatement.setInt(3, player.getAge());
            preparedStatement.setInt(4, player.getIndexId());
            preparedStatement.execute();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return player;
    }

    @Override
    public Player update(int id, Player player) {
        return null;
    }

    @Override
    public Player delete(int id) {
        return null;
    }

    @Override
    public List<Player> findAll() {
        List<Player> players = new ArrayList<>();
        String sql = "SELECT * FROM player";

        try  {
            Connection connection = MySqlHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);;
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Player player = new Player();
                player.setPlayerId(rs.getInt("player_id"));
                player.setName(rs.getString("name"));
                player.setFullName(rs.getString("full_name"));
                player.setAge(rs.getInt("age"));
                player.setIndexId(rs.getInt("index_id"));
                players.add(player);
            }

            System.out.println("Get list success");

        } catch (SQLException e) {
            System.err.println("get list failed");
            e.printStackTrace();
        }

        return players;
    }
}
