package rsubd.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rsubd.DAO.DivisionDao;
import rsubd.entity.Division;

import java.util.List;

@Service
@AllArgsConstructor
public class DivisionService {
    private final DivisionDao divisionDao;

    public List<Division> findAll() {
        return divisionDao.findAll();
    }

    public int add(Division division) throws Exception {
        return divisionDao.add(division);
    }

    public int delete(Division division) {
        return divisionDao.delete(division);
    }

    public int update(Division division) {
        return divisionDao.update(division);
    }

}
