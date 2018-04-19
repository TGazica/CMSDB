package osc.tomislavgazica;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static int authorID=0;
    private static int newsID=0;
    private static int categoryID=0;

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

    public void addToAuthors(Authors addAuthor){
        authors.add(addAuthor);
    }

    public void addToCategories(Category addCategory){
        categories.add(addCategory);
    }

    public void addToNews(News addNews){
        news.add(addNews);
    }

    public static void main(String[] args) {

        News news = new Create().createNews(authors, categories);
        news.toString();


    }

}
