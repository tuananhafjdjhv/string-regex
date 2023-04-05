package thuc_hanh.crawl_bai_hat;

import java.net.MalformedURLException;
import java.net.URL;

public class CrawlSongExample {
    public static void main(String[] args) {
        try {
            URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
        } catch (MalformedURLException e){
            e.printStackTrace();
        }
    }
}
