package br.com.coutsprojects.mangako.api.manga.service;

import br.com.coutsprojects.mangako.api.manga.dto.MangaRequestDTO;
import br.com.coutsprojects.mangako.api.manga.dto.MangaResponseDTO;
import br.com.coutsprojects.mangako.api.manga.repository.MangaRepository;
import br.com.coutsprojects.mangako.api.manga.domain.Manga;
import br.com.coutsprojects.mangako.api.manga.mapper.MangaMapper;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MangaService {
    private final MangaRepository repository;
    private final MangaMapper mapper;

    public MangaService(MangaRepository mangaRepository, MangaMapper mangaMapper){
        this.repository = mangaRepository;
        this.mapper = mangaMapper;
    }


    public MangaResponseDTO addManga(MangaRequestDTO request){
        Manga manga = mapper.toEntity(request);
        manga = repository.save(manga);
        return mapper.toResponse(manga);
    }

    public MangaResponseDTO findByTitle(String title){
        Manga manga = repository.findByTitle(title)
                .orElseThrow(() -> new RuntimeException("Manga notFund"));
        return mapper.toResponse(manga);
    }

    public List<MangaResponseDTO> findAll(){
        List<Manga> manga = repository.findAll();
        return mapper.toResponseList(manga);
    }
}
