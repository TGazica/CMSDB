package osc.tomislavgazica;

import java.util.List;
import java.util.Scanner;

public class GetFromList {

    public static Authors getAuthorFromList(List<Authors> authors){

        Scanner in = new Scanner(System.in);
        int choice;
        Authors getAuthor = new Authors();
        String print;

        for (Authors author: authors){
            print=author.toString();
            System.out.println(print);
        }

        System.out.print("Chose author ID: ");
        choice=in.nextInt();

        for (int i = 0; i< authors.size(); i++) {
            if(authors.get(i).get_id()==choice){
                getAuthor=authors.get(i);
            }
        }

        return getAuthor;
    }

    public static Category getCategoryFromList(List<Category> category){

        Scanner in = new Scanner(System.in);
        int choice;
        Category getCategory = new Category();
        String print;

        for (Category categories: category){
            print=categories.toString();
            System.out.println(print);
        }

        System.out.print("Chose category ID: ");
        choice=in.nextInt();

        for (int i = 0; i< category.size(); i++) {
            if(category.get(i).get_id()==choice){
                getCategory=category.get(i);
            }
        }

        return getCategory;
    }

    public static News getNewsFromList(List<News> News){

        Scanner in = new Scanner(System.in);
        int choice;
        News getNews = new News();
        String print;

        for (News listNews: News){
            print=listNews.toString();
            System.out.println(print);
        }

        System.out.print("Chose news ID: ");
        choice=in.nextInt();

        for (int i = 0; i< News.size(); i++) {
            if(News.get(i).get_id()==choice){
                getNews=News.get(i);
            }
        }

        return getNews;
    }

}
