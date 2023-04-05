package thuc_hanh.crawl_bai_hat;

import java.net.MalformedURLException;
import java.net.URL;

public class checkSong {
    URL url = new URL("https://www.nhaccuatui.com/bai-hat/nhac-tre-moi.html");
    public static String regex = "name_song\\\">(.*?)</a>";
    public static boolean check(String string){
        return string.matches(regex);
    }
    public checkSong() throws MalformedURLException {
        try {

        } catch (Exception e){

        }
    }
}
