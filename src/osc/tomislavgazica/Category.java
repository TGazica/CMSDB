package osc.tomislavgazica;

import java.util.List;
import java.util.Scanner;

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

    public void updateCategory(){
        Scanner in = new Scanner(System.in);
        String name;

        System.out.print("Edit category name: ");
        name=in.nextLine();
        setCategory(name);

    }

    @Override
    public String toString() {
        System.out.print(_id + ": " + category);
        return null;
    }
}
