import java.io.Serializable;

public class Person implements Serializable {
    private String userName;
    private String userPassword;
    private int age;
    private String email;

    public Person(String userName, String userPassword, int age, String email) {
        this.userName = userName;
        this.userPassword = userPassword;
        this.age = age;
        this.email = email;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Person{" +
                "userName='" + userName + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", age=" + age +
                ", email='" + email + '\'' +
                '}';
    }
}
