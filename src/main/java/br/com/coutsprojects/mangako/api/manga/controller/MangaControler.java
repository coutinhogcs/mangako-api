package br.com.coutsprojects.mangako.api.manga.controller;

import br.com.coutsprojects.mangako.api.manga.dto.MangaRequestDTO;
import br.com.coutsprojects.mangako.api.manga.dto.MangaResponseDTO;
import br.com.coutsprojects.mangako.api.manga.service.MangaService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/manga")
public class MangaControler {

    private final MangaService service;

    public MangaControler(MangaService service) {
        this.service = service;
    }


    @GetMapping("/title/{title}")
    public ResponseEntity<MangaResponseDTO> findByTitle(@PathVariable String title){
        return ResponseEntity.ok(service.findByTitle(title));
    }

    @GetMapping()
    public ResponseEntity<List<MangaResponseDTO>> findAll(){
        return ResponseEntity.ok(service.findAll());
    }

    @PostMapping
    public ResponseEntity<MangaResponseDTO> createManga(@RequestBody  MangaRequestDTO requestDTO){
        return ResponseEntity.ok(service.addManga(requestDTO));
    }

}
