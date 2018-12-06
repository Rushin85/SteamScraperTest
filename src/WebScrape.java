package webscrape;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WebScrape {

  public static void main(String[] args) {
    final String url =
            "https://www.gamestop.com/browse/games/playstation-4?nav=28-xu0,131dc-ffff2418";

    try {
      final Document document = Jsoup.connect(url).get();

      System.out.println(document.outerHtml());

    }
    catch (Exception ex) {
      ex.printStackTrace();

    }


  }
}
