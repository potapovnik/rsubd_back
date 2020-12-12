package rsubd.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import rsubd.entity.Division;
import rsubd.entity.Task;
import rsubd.mapper.DivisionMapper;
import rsubd.mapper.TaskMapper;

import javax.sql.DataSource;
import java.util.List;

@Component
public class TaskDao {
    private final String findAll = "select * from task";
    private final String add = "insert into task(name, date_start, real_date_end, date_end) values (?,?,?,?)";
    private final String delete = "delete from task where id=?";
    private final String update = "update task set name=?,date_start=?, real_date_end=?, date_end=? where id=?";

    JdbcTemplate jdbcTemplate;

    @Autowired
    public TaskDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Task> findAll() {
        return jdbcTemplate.query(findAll, new TaskMapper());
    }

    public int add(Task task) throws Exception {
        try {

            return jdbcTemplate.update(add, task.getName(), task.getDateStart(), task.getRealDateEnd(), task.getDateEnd());
        } catch (Exception e) {
            throw new Exception("Такое имя уже существует");
        }
    }

    public int delete(Task task) {
        return jdbcTemplate.update(delete, task.getId());
    }

    public int update(Task task) {
        return jdbcTemplate.update(update, task.getName(), task.getDateStart(), task.getRealDateEnd(), task.getDateEnd(), task.getId());
    }
}
