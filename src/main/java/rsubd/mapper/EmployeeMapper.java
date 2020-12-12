package rsubd.mapper;

import org.springframework.jdbc.core.RowMapper;
import rsubd.entity.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EmployeeMapper implements RowMapper<Employee> {
    public Employee mapRow(ResultSet resultSet, int i) throws SQLException {
        Employee employee=new Employee();
        employee.setId(resultSet.getInt("id"));
        employee.setName(resultSet.getString("name"));
        employee.setSurname(resultSet.getString("surname"));
        employee.setIsBoss(resultSet.getBoolean("is_boss"));
        employee.setDivisionId(resultSet.getInt("division_id"));
        return employee;

    }
}
