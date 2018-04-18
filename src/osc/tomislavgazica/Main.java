package osc.tomislavgazica;

import java.util.ArrayList;
import java.util.List;

public class Main {

    List<Authors> authors = new ArrayList<>();
    List<Category> categories = new ArrayList<>();
    List<News> news = new ArrayList<>();

    public static void main(String[] args) {

        Authors author = new Create().createAuthor();
        author.toString();

        Category category = new Create().createCategory();
        category.toString();


    }

}
