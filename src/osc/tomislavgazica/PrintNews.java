package osc.tomislavgazica;

import java.util.Date;
import java.util.List;

public class PrintNews {

    public static void printNewsByAuthors(Authors author, List<News> news) {
        News printNews;

        for (int i = 0; i < news.size(); i++) {

            if (author.get_id() == news.get(i).get_id()) {
                printNews=news.get(i);
                System.out.println(printNews);
            }

        }

    }

    public static void printNewsByCategories(Category category, List<News> news) {
        News printNews;

        for (int i = 0; i < news.size(); i++) {
            for (int j = 0; i<news.get(i).getCategory().size(); j++)

            if (category.get_id() == news.get(i).getCategory().get(j).get_id()) {
                printNews=news.get(i);
                System.out.println(printNews);
            }

        }

    }


    public static void printNewsByDate(Date date, List<News> news) {
        News printNews;

        for (int i = 0; i < news.size(); i++) {

            if (date.equals(news.get(i).getDate())) {
                printNews=news.get(i);
                System.out.println(printNews);
            }

        }

    }
}
