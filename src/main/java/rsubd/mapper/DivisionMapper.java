package rsubd.mapper;

import org.springframework.jdbc.core.RowMapper;
import rsubd.entity.Division;
import rsubd.entity.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DivisionMapper implements RowMapper<Division> {

    public Division mapRow(ResultSet resultSet, int i) throws SQLException {
        Division division = new Division();
        division.setId(resultSet.getInt("id"));
        division.setName(resultSet.getString("name"));
        return division;
    }
}
