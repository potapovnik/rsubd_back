package rsubd.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rsubd.DAO.EmployeeDao;
import rsubd.DAO.EmployeeStageDao;
import rsubd.entity.Employee;
import rsubd.entity.EmployeeStage;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeStageService {
    private final EmployeeStageDao employeeStageDao;

    public List<EmployeeStage> findAll() {
        return employeeStageDao.findAll();
    }

    public int add(EmployeeStage employee) {
        return employeeStageDao.add(employee);
    }

    public int delete(EmployeeStage employee) {
        return employeeStageDao.delete(employee);
    }

    public int update(EmployeeStage employee) {
        return employeeStageDao.update(employee);
    }
}
