package osc.tomislavgazica;

import java.util.List;
import java.util.Scanner;

public class Create {

    Scanner in = new Scanner(System.in);

    public Authors createAuthor() {
        String firstName = null;
        String lastName = null;
        int age = 0;

        while (firstName == null) {
            System.out.print("Enter authors first name: ");
            firstName = in.nextLine();
        }

        while (lastName == null) {
            System.out.print("Enter authors last name: ");
            lastName = in.nextLine();
        }

        while (true) {
            try {
                System.out.println("Enter authors age: ");
                age = in.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("Please enter a round number");
                in.next();
            }
        }


        Authors author = new Authors(firstName, lastName, age);

        return author;
    }

    public Category createCategory() {

        String categoryName = null;

        while (categoryName == null) {
            System.out.print("Enter the categories name:");
            categoryName = in.nextLine();
        }

        Category category = new Category(categoryName);

        return category;
    }

    public News createNews(List<Authors> author, List<Category> categories) {


        return null;
    }

}
