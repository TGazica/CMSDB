package osc.tomislavgazica;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class News {

    private int _id;
    private String title;
    private Date date;
    private int author;
    private List<Integer> categoryID = new ArrayList<>();

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

    public int getAuthor() {
        return author;
    }

    public void setAuthor(int author) {
        this.author = author;
    }

    public List<Integer> getCategory() {
        return categoryID;
    }

    public void setCategory(List<Integer> categoryID) {
        this.categoryID = categoryID;
    }


}
