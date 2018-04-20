package osc.tomislavgazica;

import java.util.Date;
import java.util.List;

public class PrintNews {

    public void printNewsByAuthors(Authors author, List<News> news) {

        for (News listNews : news) {

            if (listNews.getAuthor().equals(author)) {
                listNews.toString();
            }

        }

    }

    public void printNewsByCategories(Category category, List<News> news) {
        for (News listNews : news) {

            if (listNews.getCategory().equals(category)) {
                listNews.toString();
            }

        }
    }

    public void printNewsByDate(Date date, List<News> news) {

        for (News listNews : news) {

            if (listNews.getDate().equals(date)) {
                listNews.toString();
            }
        }
    }

}
