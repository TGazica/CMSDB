package osc.tomislavgazica;

import java.util.List;

public class Authors {

    private int _id;
    private String firstName;
    private String lastName;
    private int age;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Authors() {
    }

    public Authors(String name, String surname, int age) {
        this.firstName = name;
        this.lastName = surname;
        this.age = age;
        _id= Main.getAuthorID();
        Main.setAuthorID(_id+1);
    }

    public void showAuthors(List<Authors> authors){

        for (Authors author: authors) {
            author.toString();
        }

    }

    @Override
    public String toString() {
        System.out.println(_id + ": " + firstName + " " + lastName + ", age: " + age);
        return null;
    }
}
