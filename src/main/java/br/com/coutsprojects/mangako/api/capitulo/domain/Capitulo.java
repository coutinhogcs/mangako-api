package br.com.coutsprojects.mangako.api.capitulo.domain;

import br.com.coutsprojects.mangako.api.manga.domain.Manga;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Entity
@Table(name = "chapter")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Capitulo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "manga_id", nullable = false)
    private Manga manga;

    @Column(name = "numbers")
    private Integer number;

    @Column(name = "title")
    private String titleChapter;

    @Column(name = "images")
    private String images;

    @Column(name = "publication_date")
    private LocalDateTime publicationDate;
}
