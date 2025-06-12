package task.tracker.dominio;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.IOException;

public class TaskTracker {
    public static void main(String[] args) {
        String fileName = "task.json";
        Path path = Paths.get(fileName);
        try {
            if (!Files.exists(path)) {
                Files.createFile(path);

                Files.writeString(path,"[]");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        }
    }
