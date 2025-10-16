package com.t2404e.sem4_project_quy.repository;

import com.t2404e.sem4_project_quy.entity.Indexer;
import com.t2404e.sem4_project_quy.entity.Player;
import com.t2404e.sem4_project_quy.helper.MySqlHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MySqlIndexerRepository implements IndexerRepository {

    @Override
    public List<Indexer> findAll() {
        List<Indexer> indexers = new ArrayList<>();
        String sql = "SELECT * FROM indexer";

        try  {
            Connection connection = MySqlHelper.getConnection();
            PreparedStatement preparedStatement = connection.prepareStatement(sql);;
            ResultSet rs = preparedStatement.executeQuery();
            while (rs.next()) {
                Indexer indexer = new Indexer();
                indexer.setIndexId(rs.getInt("index_id"));
                indexer.setName(rs.getString("name"));
                indexers.add(indexer);
            }

            System.out.println("Get list success");

        } catch (SQLException e) {
            System.err.println("get list failed");
            e.printStackTrace();
        }

        return indexers;
    }
}
