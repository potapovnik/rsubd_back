package rsubd.mapper;

import org.springframework.jdbc.core.RowMapper;
import rsubd.entity.Stage;

import java.sql.ResultSet;
import java.sql.SQLException;


public class StageMapper implements RowMapper<Stage> {
    public Stage mapRow(ResultSet resultSet, int i) throws SQLException {
        Stage stage = new Stage();
        stage.setId(resultSet.getInt("id"));
        stage.setDateStart(resultSet.getTimestamp("date_start"));
        stage.setImportance(resultSet.getInt("importance"));
        stage.setReadinessDegree(resultSet.getInt("readiness_degree"));
        stage.setRealDateEnd(resultSet.getTimestamp("real_date_end"));
        stage.setDateEnd(resultSet.getTimestamp("date_end"));
        stage.setNameId(resultSet.getInt("name_id"));
        stage.setTaskId(resultSet.getInt("task_id"));
        stage.setResponsibleId(resultSet.getInt("responsible_id"));
        return stage;
    }
}
