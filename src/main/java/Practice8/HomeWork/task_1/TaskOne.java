package Practice8.HomeWork.task_1;

import java.io.FileReader;
import java.io.IOException;

public class TaskOne {
    public void openFile() {

        FileReader fileReader = null;

        try {
            fileReader = new FileReader("data.txt");
            System.out.println("Файл открыт");
        } catch (IOException e) {
            System.out.println("Файл не найден " + e.getMessage());
        } finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                    System.out.println("Файл закрыт");
                } catch (IOException e) {
                    System.out.println("Файл не удалось закрыть " + e.getMessage());
                }
            }
        }
    }
}
