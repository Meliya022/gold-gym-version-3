package com.skillspire.goldgym.controllers;

import com.skillspire.goldgym.dtos.GymDto;
import com.skillspire.goldgym.models.Gym;
import com.skillspire.goldgym.services.GymService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gyms")
public class GymController {
    @Autowired
    private GymService gymService;

    @PostMapping
    public ResponseEntity<GymDto> createGym(@RequestBody Gym gymDto) {
        GymDto createdGym = gymService.createGym(gymDto);
        return ResponseEntity.ok(createdGym);
    }

    @PutMapping("/{id}")
    public ResponseEntity<GymDto> updateGym(@PathVariable Long id, @RequestBody Gym gymDto) {
        GymDto updatedGym = gymService.updateGym(id, gymDto);
        return ResponseEntity.ok(updatedGym);
    }

    @GetMapping("/{id}")
    public ResponseEntity<GymDto> getGymById(@PathVariable Long id) {
        GymDto gymDto = gymService.getGymById(id);
        return ResponseEntity.ok(gymDto);
    }

    @GetMapping
    public ResponseEntity<List<GymDto>> getAllGyms() {
        List<GymDto> gyms = gymService.getAllGyms();
        return ResponseEntity.ok(gyms);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteGym(@PathVariable Long id) {
        gymService.deleteGym(id);
        return ResponseEntity.noContent().build();
    }
}
