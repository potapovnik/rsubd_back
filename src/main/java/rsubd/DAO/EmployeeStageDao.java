package rsubd.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import rsubd.entity.Division;
import rsubd.entity.EmployeeStage;
import rsubd.mapper.DivisionMapper;
import rsubd.mapper.EmployeeStageMapper;

import javax.sql.DataSource;
import java.util.List;

@Component
public class EmployeeStageDao {
    private final String findAll = "select * from employee_stage";
    private final String add = "insert into employee_stage(employee_id, stage_id) values (?,?)";
    private final String delete = "delete from employee_stage where id=?";
    private final String update = "update employee_stage set employee_id=?,stage_id=? where id=?";

    JdbcTemplate jdbcTemplate;
    @Autowired
    public EmployeeStageDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public List<EmployeeStage> findAll() {
        return jdbcTemplate.query(findAll, new EmployeeStageMapper());
    }

    public int add(EmployeeStage employeeStage) {
        return jdbcTemplate.update(add, employeeStage.getEmployee_id(),employeeStage.getStage_id());
    }

    public int delete(EmployeeStage employeeStage) {
        return jdbcTemplate.update(delete, employeeStage.getId());
    }

    public int update(EmployeeStage employeeStage) {
        return jdbcTemplate.update(update,employeeStage.getEmployee_id(),employeeStage.getStage_id(),employeeStage.getId());
    }
}
