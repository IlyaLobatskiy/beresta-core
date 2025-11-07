package model;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class CollabaNote extends TextNote{
    private List<String> collobarators = new ArrayList<>();

    public CollabaNote(String title, String content, LocalDateTime createdAt, List<String> collobarators) {
        super(title, content, createdAt);
        this.collobarators = collobarators;
    }
}
