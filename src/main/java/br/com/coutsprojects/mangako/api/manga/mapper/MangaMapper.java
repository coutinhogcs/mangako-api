package br.com.coutsprojects.mangako.api.manga.mapper;

import br.com.coutsprojects.mangako.api.manga.dto.MangaRequestDTO;
import br.com.coutsprojects.mangako.api.manga.dto.MangaResponseDTO;
import br.com.coutsprojects.mangako.api.manga.domain.Manga;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class MangaMapper {

    public Manga toEntity(MangaRequestDTO request) {
        Manga entity = new Manga();
        entity.setTitle(request.title());
        entity.setDescription(request.description());
        entity.setUrlImage(request.urlImage());
        entity.setAuthor(request.author());
        entity.setGender(request.gender());
        return entity;
    }

    public MangaResponseDTO toResponse(Manga entity) {
        MangaResponseDTO response = new MangaResponseDTO();
        response.setId(entity.getId());
        response.setTitle(entity.getTitle());
        response.setDescription(entity.getDescription());
        response.setUrlImage(entity.getUrlImage());
        response.setAuthor(entity.getAuthor());
        response.setGender(entity.getGender());
        response.setCreatedAt(entity.getCreatedAt());
        return response;
    }

    public List<MangaResponseDTO> toResponseList(List<Manga> entities) {
        List<MangaResponseDTO> responseList = new ArrayList<>();
        for (Manga entity : entities) {
            responseList.add(toResponse(entity));
        }
        return responseList;
    }
}
