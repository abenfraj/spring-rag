package fr.efrei.rag.repository.dto;

public class SampleDto {
    private String value;

    public SampleDto() {
    }

    public SampleDto(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
