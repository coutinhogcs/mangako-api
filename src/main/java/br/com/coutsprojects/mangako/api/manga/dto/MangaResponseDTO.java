package br.com.coutsprojects.mangako.api.manga.dto;



import java.time.LocalDateTime;

public class MangaResponseDTO {
    private Long id;
    private String title;
    private String description;
    private String urlImage;
    private String author;
    private String gender;
    private LocalDateTime createdAt;

    public MangaResponseDTO() {
    }

    public MangaResponseDTO(Long id, LocalDateTime createdAt, String gender, String author, String urlImage, String description, String title) {
        this.id = id;
        this.createdAt = createdAt;
        this.gender = gender;
        this.author = author;
        this.urlImage = urlImage;
        this.description = description;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
