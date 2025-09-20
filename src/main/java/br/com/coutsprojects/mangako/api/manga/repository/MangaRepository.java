package br.com.coutsprojects.mangako.api.manga.repository;

import br.com.coutsprojects.mangako.api.manga.domain.Manga;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MangaRepository extends JpaRepository<Manga, Long> {
    Optional<Manga> findByTitle(String title);
}
