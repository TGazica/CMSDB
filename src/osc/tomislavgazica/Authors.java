package osc.tomislavgazica;

import java.util.List;
import java.util.Scanner;

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
        _id = Main.getAuthorID();
        Main.setAuthorID(_id + 1);
    }

    public void showAuthors(List<Authors> authors) {

        for (Authors author : authors) {
            author.toString();
        }

    }

    public void updateAuthor() {
        Scanner in = new Scanner(System.in);
        int choice;
        String input;

        while (true) {

            System.out.print("What do you wish to update:\n1)First name\n2)Last name\n3)Age\nChoice: ");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    input = in.nextLine();
                    setFirstName(input);
                    break;

                case 2:
                    input = in.nextLine();
                    setLastName(input);
                    break;

                case 3:
                    choice = in.nextInt();
                    setAge(choice);
                    break;

                default:
                    System.out.println("Wrong choice.");
                    break;
            }

            System.out.print("Continue editing: \n1)Yes \n2)No\nChoice: ");
            choice=in.nextInt();

            if (choice==2){
                break;
            }

        }

    }

    @Override
    public String toString() {
        System.out.println(_id + ": " + firstName + " " + lastName + ", age: " + age);
        return null;
    }
}
