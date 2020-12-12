package rsubd.DAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import rsubd.entity.Division;
import rsubd.mapper.DivisionMapper;

import javax.sql.DataSource;
import java.util.List;

@Component
public class DivisionDao {

    JdbcTemplate jdbcTemplate;
    private final String findAll = "select * from division";
    private final String add = "insert into division(name) values (?)";
    private final String delete = "delete from division where id=?";
    private final String update = "update division set name=? where id=?";

    @Autowired
    public DivisionDao(DataSource dataSource) {
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Division> findAll() {
        return jdbcTemplate.query(findAll, new DivisionMapper());
    }

    public int add(Division newDivision) throws Exception {

        try {
            return jdbcTemplate.update(add, newDivision.getName());
        } catch (Exception e) {
            throw new Exception("Такое имя уже существует");
        }
    }

    public int delete(Division division) {
        return jdbcTemplate.update(delete, division.getId());
    }

    public int update(Division division) {
        return jdbcTemplate.update(update, division.getName(), division.getId());
    }
}
