
import java.io.Serializable;



public class Person implements Serializable{
    
    private String name;
    private String age;
    private String gender;
    private String username;
    private String password;
    
    
    
    Person[] persons = new Person[10];
    int serial = persons.length;
    
    Person()
    {
        
    }

    public Person(String name, String age, String gender, String username, String password) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.username = username;
        this.password = password;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
