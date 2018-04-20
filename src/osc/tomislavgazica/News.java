package osc.tomislavgazica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import static osc.tomislavgazica.Main.authors;

public class News {

    private int _id;
    private String title;
    private Date date;
    private Authors author;
    private List<Category> category = new ArrayList<>();

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Authors getAuthor() {
        return author;
    }

    public void setAuthor(Authors author) {
        this.author = author;
    }

    public List<Category> getCategory() {
        return category;
    }

    public void setCategory(List<Category> category) {
        this.category = category;
    }

    public News() {
    }

    public News(String title, Date date, Authors author, List<Category> category) {
        this.title = title;
        this.date = date;
        this.author = author;
        this.category = category;
        _id = Main.getNewsID();
        Main.setNewsID(_id + 1);
    }

    public void listNewsCategory() {
        for (int i = 0; i < category.size(); i++) {
            category.get(i).toString();
            if (i != 0 || i < category.size() - 1) {
                System.out.print(", ");
            }
        }

    }

    public static void showNews(List<News> news){
        for (News showNews: news) {
            System.out.print(showNews.get_id() + ": " + showNews.getTitle());
        }

    }

    public void updateNews() {
        Scanner in = new Scanner(System.in);
        int choice;
        String string;
        Category updateCategory;

        while (true) {

            System.out.println("What do you wish to update:");
            System.out.print("1)Title\n2)Author\n3)Date\n4)Categories\nChoice:");
            choice = in.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the new title: ");
                    string = in.nextLine();
                    setTitle(string);
                    break;

                case 2:
                    System.out.print("1)Edit current author\n2)Replace with existing author\n3)Add new author\nChoice: ");
                    choice = in.nextInt();

                    switch (choice) {
                        case 1:
                            author.updateAuthor();
                            for (int i = 0; i<authors.size(); i++){
                                if(authors.get(i).get_id()==author.get_id()){
                                    authors.get(i).setAuthor(author);
                                }
                            }
                            break;

                        case 2:
                            author = GetFromList.getAuthorFromList(authors);
                            break;

                        case 3:
                            author = Create.createAuthor();
                            break;

                        default:
                            System.out.println("Wrong choice.");
                    }

                case 3:
                    int year;
                    int month;
                    int day;
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
                    setDate(new Date(year, month, day));
                    break;

                case 4:

                    while (true) {
                        System.out.print("1)Add new category\n2)Add existing category\n3)Rename category\n4)Remove category\nChoice: ");
                        choice = in.nextInt();

                        switch (choice) {
                            case 1:
                                updateCategory = Create.createCategory();
                                category.add(updateCategory);
                                break;

                            case 2:
                                category.add(GetFromList.getCategoryFromList(Main.categories));
                                break;

                            case 3:
                                Category.showCategories(category);
                                System.out.print("Enter category id: ");
                                choice = in.nextInt();
                                for (int i = 0; i < category.size(); i++) {
                                    if (category.get(i).get_id() == choice) {
                                        category.get(i).updateCategory();
                                    }
                                }
                                break;

                            case 4:
                                Category.showCategories(category);
                                System.out.print("Enter category id: ");
                                choice = in.nextInt();
                                for (int i = 0; i < category.size(); i++) {
                                    if (category.get(i).get_id() == choice) {
                                        category.remove(i);
                                    }
                                }


                            default:
                                System.out.println("Wrong choice.");
                                break;
                        }

                        System.out.print("Continue editing categories: \n1)Yes\n2)No");
                        choice = in.nextInt();
                        if (choice == 1) {
                            break;
                        }

                    }
                default:
                    System.out.println("Wrong choice");
                    break;

            }

            System.out.print("Continue editing this news: \n1)Yes\n2)No");
            choice = in.nextInt();
            if (choice == 1) {
                break;
            }

        }

    }

    @Override
    public String toString() {
        return "News{" +
                "_id=" + _id +
                ", title='" + title + '\'' +
                ", date=" + date +
                ", author=" + author +
                ", category=" + category +
                '}'+ "\n";
    }
}
