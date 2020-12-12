package rsubd.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rsubd.DAO.EmployeeStageDao;
import rsubd.DAO.NameStageDao;
import rsubd.entity.EmployeeStage;
import rsubd.entity.NameStage;

import java.util.List;

@Service
@AllArgsConstructor
public class NameStageService {
    private final NameStageDao nameStageDao;

    public List<NameStage> findAll() {
        return nameStageDao.findAll();
    }

    public int add(NameStage nameStage) throws Exception {
        return nameStageDao.add(nameStage);
    }

    public int delete(NameStage nameStage) {
        return nameStageDao.delete(nameStage);
    }

    public int update(NameStage nameStage) {
        return nameStageDao.update(nameStage);
    }
}
