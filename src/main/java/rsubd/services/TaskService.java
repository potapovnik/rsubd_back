package rsubd.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rsubd.DAO.StageDao;
import rsubd.DAO.TaskDao;
import rsubd.entity.Stage;
import rsubd.entity.Task;

import java.util.List;

@Service
@AllArgsConstructor
public class TaskService {
    private final TaskDao taskDao;

    public List<Task> findAll() {
        return taskDao.findAll();
    }

    public int add(Task task) throws Exception {

        return taskDao.add(task);
    }

    public int delete(Task task) {
        return taskDao.delete(task);
    }

    public int update(Task task) {
        return taskDao.update(task  );
    }
}
