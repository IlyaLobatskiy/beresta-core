package model;

import java.time.LocalDateTime;

public class TextNote extends Note {

    public TextNote(String title, String content, LocalDateTime createdAt) {
        super(title, content, createdAt);
    }

    @Override
    public void display() {
        System.out.println(getTitle() + " создана");
    }
}
