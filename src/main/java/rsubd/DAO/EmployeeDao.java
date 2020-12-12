package rsubd.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import rsubd.entity.Division;
import rsubd.entity.Employee;
import rsubd.mapper.DivisionMapper;
import rsubd.mapper.EmployeeMapper;

import javax.sql.DataSource;
import java.util.List;

@Component
public class EmployeeDao {
    private final String findAll = "select * from employee";
    private final String add = "insert into employee(name,surname,is_boss,division_id) values (?,?,?,?)";
    private final String delete = "delete from employee where id=?";
    private final String update = "update employee set name=?,surname=?,is_boss=?,division_id=? where id=?";

    JdbcTemplate jdbcTemplate;
    @Autowired
    public EmployeeDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public List<Employee> findAll() {
        return jdbcTemplate.query(findAll, new EmployeeMapper());
    }

    public int add(Employee employee) {
        return jdbcTemplate.update(add, employee.getName(),employee.getSurname(),employee.getIsBoss(),employee.getDivisionId());
    }

    public int delete(Employee employee) {
        return jdbcTemplate.update(delete, employee.getId());
    }

    public int update(Employee employee) {
        return jdbcTemplate.update(update, employee.getName(),employee.getSurname(),employee.getIsBoss(),employee.getDivisionId(), employee.getId());
    }
}
