package rsubd.mapper;

import org.springframework.jdbc.core.RowMapper;
import rsubd.entity.Employee;
import rsubd.entity.EmployeeStage;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeStageMapper implements RowMapper<EmployeeStage> {

    public EmployeeStage mapRow(ResultSet resultSet, int i) throws SQLException {
        EmployeeStage employee = new EmployeeStage();
        employee.setId(resultSet.getInt("id"));
        employee.setEmployee_id(resultSet.getInt("employee_id"));
        employee.setStage_id(resultSet.getInt("stage_id"));
        return employee;
    }
}
