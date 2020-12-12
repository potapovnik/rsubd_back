package rsubd.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import rsubd.entity.Employee;
import rsubd.entity.Task;
import rsubd.services.EmployeeService;
import rsubd.services.TaskService;

import java.util.List;

@RestController()
@RequestMapping("/task")
@AllArgsConstructor
public class TaskController {
    private final TaskService taskService;

    @GetMapping("/all")
    public List<Task> findAll() {
        return taskService.findAll();
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable int id) {
        Task task = new Task();
        task.setId(id);
        return taskService.delete(task);
    }

    @PostMapping
    public int create(@RequestBody Task task) throws Exception {
        return taskService.add(task);
    }

    @PutMapping
    public int update(@RequestBody Task task) {
        return taskService.update(task);
    }
}
