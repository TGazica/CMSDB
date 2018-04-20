package osc.tomislavgazica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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

    @Override
    public String toString() {
        System.out.print(title + ", date:" + date.toString() + ", author:" + author.getFirstName() + " " + author.getLastName() + ", category: ");
        listNewsCategory();
        return null;
    }
}
