package modelo;

public class Persona {

    private String firstName;
    private String lastName;
    private String gender;
    private Integer age;
    private String number;


    public Persona()
    {

    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public Integer getAge() {
        return age;
    }


    public void setAge(Integer age) {
        this.age = age;
    }


    public String getNumber() {
        return number;
    }


    public void setNumber(String number) {
        this.number = number;
    }


    @Override
    public String toString() {
        return "Persona [firstName=" + firstName + ", age=" + age + "]";
    }

    
    
}
