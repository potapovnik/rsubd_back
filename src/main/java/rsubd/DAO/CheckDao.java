package rsubd.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import rsubd.entity.*;
import rsubd.mapper.*;

import javax.sql.DataSource;
import java.util.List;

@Component
public class CheckDao {

    JdbcTemplate jdbcTemplate;
    private final String divisionId = "select * from division where id=?";
    private final String EmployeeId = "select * from employee where id=?";
    private final String taskId = "select * from task where id=?";
    private final String nameStageId = "select * from name_stage where id=?";
    private final String stageId = "select * from stage where id=?";

    @Autowired
    public CheckDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Division> checkDivision(Long id) {
        return jdbcTemplate.query(divisionId, new Object[]{id},new DivisionMapper());
    }

    public List<Employee> checkEmployee(Long id) {
        return jdbcTemplate.query(EmployeeId,new Object[]{id}, new EmployeeMapper());
    }
    public List<NameStage> checkNameStage(Long id) {
        return jdbcTemplate.query(nameStageId, new Object[]{id},new NameStageMapper());
    }
    public List<Task> checkTask(Long id) {
        return jdbcTemplate.query(taskId,new Object[]{id}, new TaskMapper());
    }
    public List<Stage> checkStage(Long id) {
        return jdbcTemplate.query(stageId,new Object[]{id}, new StageMapper());
    }

}

