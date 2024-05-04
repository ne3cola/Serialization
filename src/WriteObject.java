import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void writeFile(String path, Person person) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(path);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(person);
            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Фаил успешно записан!");
    }
}
