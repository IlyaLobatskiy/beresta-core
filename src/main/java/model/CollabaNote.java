package model;

import lombok.Getter;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Getter
public class CollobarativeNote extends TextNote{
    private List<String> collobarators = new ArrayList<>();

    public CollobarativeNote(String title, String content, LocalDateTime createdAt, List<String> collobarators) {
        super(title, content, createdAt);
        this.collobarators = collobarators;
    }
}
