package webscrape;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

public class WebScrape {

  public static void main(String[] args) {
    final String url =
            "https://store.steampowered.com/genre/Free%20to%20Play/";

    try {
      final Document document = Jsoup.connect(url).get();

      System.out.println(document.outerHtml());

    }
    catch (Exception ex) {
      ex.printStackTrace();

    }


  }
}
