package rsubd.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import rsubd.services.CheckService;

@RestController
@RequestMapping("/check")
@AllArgsConstructor
public class CheckController {
    private final CheckService checkService;
    @GetMapping("/employee")
    public boolean checkEmployee(@RequestParam Long id){
        return checkService.checkForEmployee(id);
    }
    @GetMapping("/stage")
    public boolean[] checkStage(@RequestParam Long empl,@RequestParam Long task,@RequestParam Long name){
        return checkService.checkForStage(empl,task,name);
    } @GetMapping("/employeeStage")
    public boolean[] checkEmployeeAndStage(@RequestParam Long empl,@RequestParam Long stage){
        return checkService.employeeAndStage(empl,stage);
    }
}
