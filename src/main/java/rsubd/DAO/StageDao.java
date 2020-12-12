package rsubd.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import rsubd.entity.Division;
import rsubd.entity.Stage;
import rsubd.mapper.DivisionMapper;
import rsubd.mapper.StageMapper;

import javax.sql.DataSource;
import java.util.List;

@Component
public class StageDao {
    private final String findAll = "select * from stage";
    private final String add = "insert into stage(name_id, date_start, importance, responsible_id, readiness_degree, task_id, real_date_end, date_end)" +
            " values (?,?,?,?,?,?,?,?)";
    private final String delete = "delete from stage where id=?";
    private final String update = "update stage set name_id = ?, date_start = ?," +
            " importance= ?, responsible_id= ?, readiness_degree= ?, task_id= ?, real_date_end= ?, date_end= ? where id=?";


    JdbcTemplate jdbcTemplate;

    @Autowired
    public StageDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Stage> findAll() {
        return jdbcTemplate.query(findAll, new StageMapper());
    }

    public int add(Stage stage) {
        return jdbcTemplate.update(add, stage.getNameId(),stage.getDateStart(),
                stage.getImportance(),stage.getResponsibleId(),stage.getReadinessDegree(),stage.getTaskId(),stage.getRealDateEnd(),stage.getDateEnd());
    }

    public int delete(Stage stage) {
        return jdbcTemplate.update(delete, stage.getId());
    }

    public int update(Stage stage) {
        return jdbcTemplate.update(update, stage.getNameId(),stage.getDateStart(),
                stage.getImportance(),stage.getResponsibleId(),stage.getReadinessDegree(),stage.getTaskId(),stage.getRealDateEnd(),stage.getDateEnd(), stage.getId());
    }
}
