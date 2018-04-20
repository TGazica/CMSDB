package osc.tomislavgazica;

import java.lang.invoke.WrongMethodTypeException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static int authorID = 0;
    private static int newsID = 0;
    private static int categoryID = 0;

    static List<Authors> authors = new ArrayList<>();
    static List<Category> categories = new ArrayList<>();
    static List<News> news = new ArrayList<>();

    public static int getAuthorID() {
        return authorID;
    }

    public static void setAuthorID(int authorID) {
        Main.authorID = authorID;
    }

    public static int getNewsID() {
        return newsID;
    }

    public static void setNewsID(int newsID) {
        Main.newsID = newsID;
    }

    public static int getCategoryID() {
        return categoryID;
    }

    public static void setCategoryID(int categoryID) {
        Main.categoryID = categoryID;
    }

    public static void addToAuthors(Authors addAuthor) {
        authors.add(addAuthor);
    }

    public static void addToCategories(Category addCategory) {
        categories.add(addCategory);
    }

    public static void addToNews(News addNews) {
        news.add(addNews);
    }

    public void removeAuthor() {
        Scanner in = new Scanner(System.in);
        int choice;

        for (int i = 0; i < authors.size(); i++) {
            System.out.println(authors.get(i).toString());
        }

        System.out.print("Chose author id: ");
        choice = in.nextInt();

        for (int i = 0; i < authors.size(); i++) {
            if (authors.get(i).get_id() == choice) {
                authors.remove(i);
            }
        }

    }

    public void removeCategory() {
        Scanner in = new Scanner(System.in);
        int choice;

        for (int i = 0; i < categories.size(); i++) {
            System.out.println(categories.get(i).toString());
        }

        System.out.print("Chose category id: ");
        choice = in.nextInt();

        for (int i = 0; i < categories.size(); i++) {
            if (categories.get(i).get_id() == choice) {
                categories.remove(i);
            }
        }

    }

    public void removeNews() {
        Scanner in = new Scanner(System.in);
        int choice;

        for (int i = 0; i < news.size(); i++) {
            System.out.println(news.get(i).toString());
        }

        System.out.print("Chose author id: ");
        choice = in.nextInt();

        for (int i = 0; i < news.size(); i++) {
            if (news.get(i).get_id() == choice) {
                news.remove(i);
            }
        }
    }

    public Main() {
        Scanner in = new Scanner(System.in);
        int choice;
        int year, month, day;
        News getNews;
        Authors getAuthor;
        Category getCategory;

        while (true) {
            System.out.println("What do you wish to do: ");
            System.out.println("1)List news");
            System.out.println("2)Edit news");
            System.out.println("3)Edit authors");
            System.out.println("4)Edit categories");

            choice = in.nextInt();

            switch (choice) {

                case 1:
                    System.out.println("List news by:");
                    System.out.println("1)Author");
                    System.out.println("2)Category");
                    System.out.println("3)Date");
                    System.out.println("Choice:");
                    choice = in.nextInt();

                    switch (choice) {

                        case 1:
                            PrintNews.printNewsByAuthors(GetFromList.getAuthorFromList(authors), news);
                            break;

                        case 2:
                            PrintNews.printNewsByCategories(GetFromList.getCategoryFromList(categories), news);
                            break;

                        case 3:
                            System.out.print("Enter year:");
                            year = in.nextInt();
                            System.out.print("Enter month:");
                            month = in.nextInt();
                            System.out.print("Enter day:");
                            day = in.nextInt();
                            PrintNews.printNewsByDate(new Date(year, month, day), news);
                            break;

                        default:
                            System.out.println("Wrong choice.");
                            break;
                    }

                case 2:
                    getNews = GetFromList.getNewsFromList(news);
                    getNews.updateNews();
                    break;

                case 3:
                    getAuthor = GetFromList.getAuthorFromList(authors);
                    getAuthor.updateAuthor();
                    break;

                case 4:
                    getCategory = GetFromList.getCategoryFromList(categories);
                    getCategory.updateCategory();
                    break;

                default:
                    break;

            }

            System.out.println("Do you wish to exit the application:");

        }

    }


    public static void main(String[] args) {


        new Main();


    }

}
