public class Main {
    public static void main(String[] args) {

        String path = "person.txt";
        Person person = new Person("Anna", "12345", 25, "ann@mail.ru");

        WriteObject.writeFile(path, person);
        Person a = ReadObject.readFile(path);
        System.out.println(a);
    }
}
