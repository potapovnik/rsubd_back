package rsubd.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import rsubd.entity.Division;
import rsubd.entity.NameStage;
import rsubd.services.DivisionService;
import rsubd.services.NameStageService;

import java.util.List;

@RestController()
@RequestMapping("/nameStage")
@AllArgsConstructor
public class NameStageController {
    private final NameStageService nameStageService;

    @GetMapping("/all")
    public List<NameStage> findAll() {
        return nameStageService.findAll();
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable int id){
        NameStage nameStage = new NameStage();
        nameStage.setId(id);
        return nameStageService.delete(nameStage);
    }

    @PostMapping
    public int create(@RequestBody NameStage nameStage) throws Exception {
        return nameStageService.add(nameStage);
    }
    @PutMapping
    public int update(@RequestBody NameStage nameStage){
        return nameStageService.update(nameStage);
    }
}
