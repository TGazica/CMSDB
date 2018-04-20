package osc.tomislavgazica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Create {


    public static Authors createAuthor() {
        Scanner in = new Scanner(System.in);
        String firstName = null;
        String lastName = null;
        int age;

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
                System.out.print("Enter authors age: ");
                age = in.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("Please enter a round number");
                in.next();
            }
        }


        Authors author = new Authors(firstName, lastName, age);
        Main.addToAuthors(author);

        return author;
    }

    public static Category createCategory() {
        Scanner in = new Scanner(System.in);
        String categoryName = null;

        while (categoryName == null) {
            System.out.print("Enter the category name:");
            categoryName = in.nextLine();
        }

        Category category = new Category(categoryName);
        Main.addToCategories(category);

        return category;
    }

    public static News createNews(List<Authors> authors, List<Category> categories) {

        Scanner in = new Scanner(System.in);
        int year;
        int month;
        int day;
        int choice = 0;
        String name = null;
        Authors author = new Authors();
        Category addCategory;
        List<Category> category = new ArrayList<>();

        while (name == null) {
            System.out.print("Enter the title: ");
            name = in.nextLine();
        }

        while (true) {
            try {
                System.out.print("Enter year: ");
                year = in.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("Please enter a round number");
                in.next();
            }
        }

        while (true) {
            try {
                System.out.print("Enter month: ");
                month = in.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("Please enter a round number");
                in.next();
            }
        }

        while (true) {
            try {
                System.out.print("Enter day: ");
                day = in.nextInt();
                break;

            } catch (Exception e) {
                System.out.println("Please enter a round number");
                in.next();
            }
        }

        System.out.print("1)New author\n2)Existing author\nChoice:");
        choice = in.nextInt();


        if (choice == 1) {
            author = Create.createAuthor();
            Main.addToAuthors(author);
        } else if (choice == 2) {
            author = GetFromList.getAuthorFromList(authors);
        }


        while (true) {

            System.out.print("1)New category\n2)Existing category\nChoice:");
            choice = in.nextInt();
            if (choice == 1) {
                addCategory = Create.createCategory();
                Main.addToCategories(addCategory);
                category.add(addCategory);
            } else if (choice == 2) {
                category.add(GetFromList.getCategoryFromList(categories));
            }

            System.out.print("Do you wish to add another category:\n1)Yes\n2)No\nChoice:");
            choice = in.nextInt();

            if (choice == 2) {
                break;
            }
        }

        News news = new News(name, new Date(year, month, day), author, category);
        Main.addToNews(news);

        return news;
    }

}
