package com.eomcs.crawlling;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
public class scrapingTest {
  public static void main(String[] args) {

    try {
      String url = "https://programmers.co.kr/job";
      Document doc = Jsoup.connect(url).get();

      Element title = doc.select("ul.company-info").get(0);
      //      Elements title = doc.select("h5.position-title");
      Elements companyName = doc.select("li");
      System.out.println(title);



      for(Element el : companyName) {
        System.out.println(el.text());
      }


    } catch (IOException e) {
      e.printStackTrace();
    }

  }
}