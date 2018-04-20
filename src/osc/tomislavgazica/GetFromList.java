package osc.tomislavgazica;

import java.util.List;
import java.util.Scanner;

public class GetFromList {

    public static Authors getAuthorFromList(List<Authors> author){

        Scanner in = new Scanner(System.in);
        int choice;
        Authors getAuthor = new Authors();

        for (Authors authors: author){
            authors.toString();
        }

        System.out.print("Chose author ID: ");
        choice=in.nextInt();

        for (int i = 0; i< author.size(); i++) {
            if(author.get(i).get_id()==choice){
                getAuthor=author.get(i);
            }
        }

        return getAuthor;
    }

    public static Category getCategoryFromList(List<Category> category){

        Scanner in = new Scanner(System.in);
        int choice;
        Category getCategory = new Category();

        for (Category categories: category){
            categories.toString();
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

        for (News listNews: News){
            listNews.toString();
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
