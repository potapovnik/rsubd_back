package rsubd.mapper;

import org.springframework.jdbc.core.RowMapper;
import rsubd.entity.Task;

import java.sql.ResultSet;
import java.sql.SQLException;

public class TaskMapper implements RowMapper<Task> {

    public Task mapRow(ResultSet resultSet, int i) throws SQLException {
        Task task = new Task();
        task.setId(resultSet.getInt("id"));
        task.setName(resultSet.getString("name"));
        task.setDateStart(resultSet.getTimestamp("date_start"));
        task.setRealDateEnd(resultSet.getTimestamp("real_date_end"));
        task.setDateEnd(resultSet.getTimestamp("date_end"));
        return task;
    }
}
