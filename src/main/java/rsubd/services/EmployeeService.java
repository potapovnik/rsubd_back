package rsubd.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import rsubd.DAO.EmployeeDao;
import rsubd.entity.Division;
import rsubd.entity.Employee;

import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeService {
    private final EmployeeDao employeeDao;

    public List<Employee> findAll() {
        return employeeDao.findAll();
    }

    public int add(Employee employee) {
        return employeeDao.add(employee);
    }

    public int delete(Employee employee) {
        return employeeDao.delete(employee);
    }

    public int update(Employee employee) {
        return employeeDao.update(employee);
    }
}
