package osc.tomislavgazica;

import java.util.Date;
import java.util.List;

public class PrintNews {

    public static void printNewsByAuthors(Authors author, List<News> news) {

        for (int i = 0; i < news.size(); i++) {

            if (author.get_id() == news.get(i).get_id()) {
                news.get(i).toString();
            }

        }

    }

    public static void printNewsByCategories(Category category, List<News> news) {

        for (int i = 0; i < news.size(); i++) {
            for (int j = 0; i<news.get(i).getCategory().size(); j++)

            if (category.get_id() == news.get(i).getCategory().get(j).get_id()) {
                news.get(i).toString();
            }

        }

    }


    public static void printNewsByDate(Date date, List<News> news) {

        for (int i = 0; i < news.size(); i++) {

            if (date.equals(news.get(i).getDate())) {
                news.get(i).toString();
            }

        }

    }
}
