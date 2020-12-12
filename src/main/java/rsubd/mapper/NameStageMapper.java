package rsubd.mapper;

import org.springframework.jdbc.core.RowMapper;
import rsubd.entity.NameStage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class NameStageMapper implements RowMapper<NameStage> {
    public NameStage mapRow(ResultSet resultSet, int i) throws SQLException {
        NameStage nameStage = new NameStage();
        nameStage.setId(resultSet.getInt("id"));
        nameStage.setName(resultSet.getString("name"));
        return nameStage;
    }

}
