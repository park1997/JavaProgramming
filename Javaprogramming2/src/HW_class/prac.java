package HW_class;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.nio.file.WatchEvent;
import java.util.Scanner;
public class prac {
    public static void main(String[] args) throws InterruptedException {

        Scanner sc = new Scanner(System.in);
        System.out.print("맞춤법 검사 할 말 입력해 >");
        String text = sc.nextLine();
        int interval = 1000;

        String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_sly.hst&fbm=0&acr=1&acq=%EB%A7%9E%EC%B6%A4&qdt=0&ie=utf8&query=%EB%A7%9E%EC%B6%A4%EB%B2%95%EA%B2%80%EC%82%AC%EA%B8%B0";

        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
//        options.addArguments("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36");
//        options.addArguments("disable-gpu");
//        options.addArguments("--disable-gpu");
//        options.addArguments("lang=ko_KR");
        options.addArguments("window-size=1920x1080"); // 이거 안해주면 headless 때문에 안되고 useragent 넣어줘도 안됨

        ChromeDriver driver = new ChromeDriver(options);

        // Chrome 열기
        driver.get(url);
        Thread.sleep(interval);// 1초 쉬어줌

        // 한국말을 입력할 창을 찾기
        WebElement input = driver.findElementByXPath("//*[@id=\"grammar_checker\"]/div/div[2]/div[1]/div[1]/div/div[1]/textarea");
        input.sendKeys(text); // 번역할 text 입력
        WebElement button = driver.findElementByXPath("//*[@id=\"grammar_checker\"]/div/div[2]/div[1]/div[1]/div/div[2]/button");
        button.click();
        Thread.sleep(interval); // 1초 쉬어줌

        Document doc = Jsoup.parse(driver.getPageSource());
        Elements output_tag = doc.select("div.text_area p");
        System.out.println(output_tag.text());
        driver.quit();
    }
}
