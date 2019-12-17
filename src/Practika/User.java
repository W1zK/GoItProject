package Practika;

public class User {
    private String name;
    private int id;
    private String surname;
    private String salary;
    private String gender;

    public User() {
    }

    public User(String name, int id, String surname, String salary, String gender) {
        this.name = name;
        this.id = id;
        this.surname = surname;
        this.salary = salary;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "name=" + name + "->" +
                "id=" + id;
    }
}
