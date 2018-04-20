package osc.tomislavgazica;

import java.util.*;

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


    public static void removeAuthor() {
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

    public static void removeCategory() {
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

    public static void removeNews() {
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

    public static void main(String[] args) {

        String printAuthor;
        String printCategory;
        String printNews;

        authors.add(new Authors("Tomislav", "Gazica", 24));
        authors.add(new Authors("Krešimir", "Žižek", 33));
        authors.add(new Authors("Josip", "Sudar", 36));
        authors.add(new Authors("Luka", "Mislioc", 21));
        authors.add(new Authors("Androd", "Academy", 56));

        categories.add(new Category("Development"));
        categories.add(new Category("Sports"));
        categories.add(new Category("World"));
        categories.add(new Category("Croatia"));
        categories.add(new Category("Yellow papers"));

        List<Category> category1 = new ArrayList<>();
        category1.add(categories.get(0));

        List<Category> category2 = new ArrayList<>();
        category2.add(categories.get(1));
        category2.add(categories.get(2));

        List<Category> category3 = new ArrayList<>();
        category3.add(categories.get(3));
        category3.add(categories.get(4));

        List<Category> category4 = new ArrayList<>();
        category4.add(categories.get(0));

        List<Category> category5 = new ArrayList<>();
        category5.add(categories.get(0));

        news.add(new News("Android development", new Date(2018, 5, 4), authors.get(0), category1));
        news.add(new News("Android development", new Date(2018, 5, 4), authors.get(1), category2));
        news.add(new News("Android development", new Date(2016, 4, 13), authors.get(2), category3));
        news.add(new News("Android development", new Date(2015, 4, 13), authors.get(3), category4));
        news.add(new News("Android development", new Date(2014, 4, 13), authors.get(4), category5));
        news.add(new News("Android development", new Date(2013, 4, 13), authors.get(0), category1));
        news.add(new News("Android development", new Date(2012, 4, 13), authors.get(1), category2));
        news.add(new News("Android development", new Date(2010, 4, 13), authors.get(2), category3));
        news.add(new News("Android development", new Date(2009, 4, 13), authors.get(3), category4));
        news.add(new News("Android development", new Date(2008, 4, 13), authors.get(4), category5));

        Scanner in = new Scanner(System.in);
        int choice;
        int year, month, day;

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
                    while (true) {
                        try {
                            choice = in.nextInt();
                            if (choice == 1 || choice == 2 || choice == 3 || choice==4) {
                                break;
                            } else {
                                System.out.println("Enter 1, 2, 3 or 4");
                            }
                        } catch (Exception e) {
                            System.out.println("Enter 1, 2, 3 or 4");
                            in.next();
                        }
                    }

                    switch (choice) {

                        case 1:
                            PrintNews.printNewsByAuthors(GetFromList.getAuthorFromList(authors), news);
                            break;

                        case 2:
                            PrintNews.printNewsByCategories(GetFromList.getCategoryFromList(categories), news);
                            break;

                        case 3:
                            System.out.print("Enter year:");

                            while (true) {
                                try {
                                    year = in.nextInt();
                                    break;
                                }catch (Exception e){
                                    System.out.println("Enter a numerical year: ");
                                    in.next();
                                }
                            }

                            while (true) {
                                try {
                                    System.out.print("Enter month:");
                                    month = in.nextInt();
                                    if(month>0 && month<13){
                                        break;
                                    }else {
                                        System.out.println("Enter a valid month numerically.");
                                    }
                                }catch (Exception e){
                                    System.out.println("Enter a numerical month: ");
                                    in.next();
                                }
                            }

                            while (true) {
                                try {
                                    System.out.print("Enter day:");
                                    day = in.nextInt();
                                    if(day>0 && day<13){
                                        break;
                                    }else {
                                        System.out.println("Enter a valid day numerically.");
                                    }
                                }catch (Exception e){
                                    System.out.println("Enter a numerical day: ");
                                    in.next();
                                }
                            }

                            PrintNews.printNewsByDate(new Date(year, month, day), news);
                            break;

                        default:
                            System.out.println("Wrong choice.");
                            break;
                    }
                    break;

                case 2:
                    System.out.print("1)New \n2)Edit \n3)Remove");
                    while (true) {
                        try {
                            choice = in.nextInt();
                            if (choice == 1 || choice == 2 || choice == 3) {
                                break;
                            } else {
                                System.out.println("Enter 1, 2 or 3");
                            }
                        } catch (Exception e) {
                            System.out.println("Enter 1, 2 or 3");
                            in.next();
                        }
                    }

                    switch (choice) {
                        case 1:
                            Create.createNews(authors, categories);
                            break;

                        case 2:
                            News.showNews(news);
                            System.out.print("Enter id: ");
                            choice = in.nextInt();
                            for (int i = 0; i < news.size(); i++) {
                                if (news.get(i).get_id() == choice) {
                                    news.get(i).updateNews();
                                }
                            }
                            break;

                        case 3:
                            Main.removeNews();
                            break;

                        default:
                            System.out.println("Wrong choice.");
                    }
                    break;


                case 3:
                    System.out.print("1)New \n2)Edit \n3)Remove");
                    while (true) {
                        try {
                            choice = in.nextInt();
                            if (choice == 1 || choice == 2 || choice == 3) {
                                break;
                            } else {
                                System.out.println("Enter 1, 2 or 3");
                            }
                        } catch (Exception e) {
                            System.out.println("Enter 1, 2 or 3");
                            in.next();
                        }
                    }

                    switch (choice) {

                        case 1:
                            Create.createAuthor();
                            break;

                        case 2:
                            Authors.showAuthors(authors);
                            System.out.print("Enter id: ");

                            while (true) {
                                try {
                                    choice = in.nextInt();
                                    if (choice == 1 || choice == 2 || choice == 3) {
                                        break;
                                    } else {
                                        System.out.println("Enter id");
                                    }
                                } catch (Exception e) {
                                    System.out.println("Enter id number");
                                    in.next();
                                }
                            }

                            for (int i = 0; i < authors.size(); i++) {
                                if (choice == authors.get(i).get_id())
                                    authors.get(i).updateAuthor();
                                for (int j = 0; j < news.size(); j++) {
                                    if (news.get(j).getAuthor().get_id() == choice) {
                                        news.get(j).setAuthor(authors.get(i));
                                    }
                                }
                            }

                            break;

                        case 3:
                            Main.removeAuthor();
                            break;

                        default:
                            System.out.println("Wrong choice.");
                            break;

                    }
                    break;

                case 4:
                    System.out.print("1)New \n2)Edit \n3)Remove");
                    while (true) {
                        try {
                            choice = in.nextInt();
                            if (choice == 1 || choice == 2 || choice == 3) {
                                break;
                            } else {
                                System.out.println("Enter 1, 2 or 3");
                            }
                        } catch (Exception e) {
                            System.out.println("Enter 1, 2 or 3");
                            in.next();
                        }
                    }

                    switch (choice) {

                        case 1:
                            Create.createCategory();
                            break;

                        case 2:
                            Category.showCategories(categories);
                            System.out.print("Enter id: ");
                            choice = in.nextInt();
                            for (int i = 0; i < categories.size(); i++) {
                                if (choice == categories.get(i).get_id())
                                    categories.get(i).updateCategory();
                                for (int j = 0; j < news.size(); j++) {
                                    for (int k = 0; k < news.get(j).getCategory().size(); k++)
                                        if (news.get(j).getCategory().get(k).get_id() == choice) {
                                            news.get(j).getCategory().get(k).setCategory(categories.get(i).getCategory());
                                        }
                                }
                            }

                            break;

                        case 3:
                            Main.removeCategory();
                            break;

                        default:
                            System.out.println("Wrong choice.");
                            break;

                    }
                    break;

                default:
                    break;

            }

            System.out.println("Do you wish to exit the application:");
            System.out.println("1)Yes");
            System.out.println("2)No");
            while (true) {
                try {
                    choice = in.nextInt();
                    if (choice == 1 || choice == 2) {
                        break;
                    } else {
                        System.out.println("Enter 1 or 2");
                    }
                } catch (Exception e) {
                    System.out.println("Enter 1 or 2");
                    in.next();
                }
            }

            if (choice == 1) {
                break;
            }

        }


    }

}
