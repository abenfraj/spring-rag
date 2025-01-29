package fr.efrei.rag.repository.dto;

public class DocumentDto {
    private Long id;
    private String title;

    public DocumentDto() {
    }

    public DocumentDto(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return "DocumentDTO(id=" + this.getId() + ", title=" + this.getTitle() + ")";
    }
}
