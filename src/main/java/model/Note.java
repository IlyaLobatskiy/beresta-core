package model;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.time.LocalDateTime;

@AllArgsConstructor
@Getter
public abstract class Note {
    private String title;
    private String content;
    private LocalDateTime createdAt;


    public abstract void display();
}
