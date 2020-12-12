package rsubd.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import rsubd.entity.NameStage;
import rsubd.entity.Stage;
import rsubd.services.NameStageService;
import rsubd.services.StageService;

import java.util.List;

@RestController()
@RequestMapping("/stage")
@AllArgsConstructor
public class StageController {
    private final StageService stageService;

    @GetMapping("/all")
    public List<Stage> findAll() {
        return stageService.findAll();
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable int id) {
        Stage stage = new Stage();
        stage.setId(id);
        return stageService.delete(stage);
    }

    @PostMapping
    public int create(@RequestBody Stage stage) {
        return stageService.add(stage);
    }

    @PutMapping
    public int update(@RequestBody Stage stage) {
        return stageService.update(stage);
    }
}
