package osc.tomislavgazica;

import java.util.List;

public class Category {

    private int _id;
    private String category;

    public int get_id() {
        return _id;
    }

    public void set_id(int _id) {
        this._id = _id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Category() {
    }

    public Category(String category) {
        this.category = category;
        _id = Main.getCategoryID();
        Main.setCategoryID(_id + 1);
    }

    public void showCategories(List<Category> categories){

        for (Category showCategories: categories) {
            showCategories.toString();
        }

    }

    @Override
    public String toString() {
        System.out.print(category);
        return null;
    }
}
