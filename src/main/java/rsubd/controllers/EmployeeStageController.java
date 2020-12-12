package rsubd.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import rsubd.DAO.EmployeeStageDao;
import rsubd.entity.Division;
import rsubd.entity.EmployeeStage;
import rsubd.services.DivisionService;
import rsubd.services.EmployeeStageService;

import java.util.List;

@RestController()
@RequestMapping("/employeeStage")
@AllArgsConstructor
public class EmployeeStageController {
    private final EmployeeStageService employeeStageService;

    @GetMapping("/all")
    public List<EmployeeStage> findAll() {
        return employeeStageService.findAll();
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable int id) {
        EmployeeStage employeeStage = new EmployeeStage();
        employeeStage.setId(id);
        return employeeStageService.delete(employeeStage);
    }

    @PostMapping
    public int create(@RequestBody EmployeeStage employeeStage) {
        return employeeStageService.add(employeeStage);
    }

    @PutMapping
    public int update(@RequestBody EmployeeStage employeeStage) {
        return employeeStageService.update(employeeStage);
    }
}
