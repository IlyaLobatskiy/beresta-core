package model;

import java.time.LocalDateTime;

public class SecureNote extends TextNote{
    public SecureNote(String title, String content, LocalDateTime createdAt) {
        super(title, content, createdAt);
    }
}
