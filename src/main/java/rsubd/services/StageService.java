package rsubd.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rsubd.DAO.NameStageDao;
import rsubd.DAO.StageDao;
import rsubd.entity.NameStage;
import rsubd.entity.Stage;

import java.util.List;

@Service
@AllArgsConstructor
public class StageService {
    private final StageDao stageDao;

    public List<Stage> findAll() {
        return stageDao.findAll();
    }

    public int add(Stage stage) {

        return stageDao.add(stage);
    }

    public int delete(Stage stage) {
        return stageDao.delete(stage);
    }

    public int update(Stage stage) {
        return stageDao.update(stage);
    }
}
