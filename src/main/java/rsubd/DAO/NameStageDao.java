package rsubd.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import rsubd.entity.Division;
import rsubd.entity.NameStage;
import rsubd.mapper.DivisionMapper;
import rsubd.mapper.NameStageMapper;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.List;

@Component
public class NameStageDao {
    private final String findAll = "select * from name_stage";
    private final String add = "insert into name_stage(name) values (?)";
    private final String delete = "delete from name_stage where id=?";
    private final String update = "update name_stage set name=? where id=?";

    JdbcTemplate jdbcTemplate;
    @Autowired
    public NameStageDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public List<NameStage> findAll() {
        return jdbcTemplate.query(findAll, new NameStageMapper());
    }

    public int add(NameStage nameStage) throws Exception {
        try {

            return jdbcTemplate.update(add, nameStage.getName());
        }
        catch(Exception e){
            throw new Exception("Такое имя уже существует");
        }
    }

    public int delete(NameStage nameStage) {
        return jdbcTemplate.update(delete, nameStage.getId());
    }

    public int update(NameStage nameStage) {
        return jdbcTemplate.update(update, nameStage.getName(), nameStage.getId());
    }
}
