import model.CollabaNote;
import model.SecureNote;
import model.TextNote;

import java.time.LocalDateTime;
import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        TextNote textNote = new TextNote("Заметка", "Текст", LocalDateTime.now());
        TextNote secureNote = new SecureNote("Закрытая заметка", "Текст", LocalDateTime.now());
        TextNote collabaNote = new CollabaNote("Совместная заметка", "Текст", LocalDateTime.now(), new ArrayList<>());

        textNote.display();
        secureNote.display();
        collabaNote.display();
    }

}
