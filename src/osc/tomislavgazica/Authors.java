package osc.tomislavgazica;

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

    @Override
    public String toString() {
        System.out.println("ID:" + _id + ", " + firstName + " " + lastName + ", age: " + age);
        return null;
    }
}
