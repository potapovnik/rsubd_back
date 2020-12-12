package rsubd.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import rsubd.entity.Division;
import rsubd.entity.Employee;
import rsubd.services.DivisionService;
import rsubd.services.EmployeeService;

import java.util.List;

@RestController()
@RequestMapping("/employee")
@AllArgsConstructor
public class EmployeeController {
    private final EmployeeService employeeService;

    @GetMapping("/all")
    public List<Employee> findAll() {
        return employeeService.findAll();
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable int id) {
        Employee employee = new Employee();
        employee.setId(id);
        return employeeService.delete(employee);
    }

    @PostMapping
    public int create(@RequestBody Employee employee) {
        return employeeService.add(employee);
    }

    @PutMapping
    public int update(@RequestBody Employee employee) {
        return employeeService.update(employee);
    }
}
