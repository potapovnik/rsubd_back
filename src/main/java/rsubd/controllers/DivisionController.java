package rsubd.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import rsubd.entity.Division;
import rsubd.services.DivisionService;

import java.util.List;

@RestController()
@RequestMapping("/division")
@AllArgsConstructor
public class DivisionController {
    private final DivisionService divisionService;

    @GetMapping("/all")
    public List<Division> findAll() {
        return divisionService.findAll();
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable int id) {
        Division division = new Division();
        division.setId(id);
        return divisionService.delete(division);
    }

    @PostMapping
    public int create(@RequestBody Division division) throws Exception {
        return divisionService.add(division);
    }

    @PutMapping
    public int update(@RequestBody Division division) {
        return divisionService.update(division);
    }
}
