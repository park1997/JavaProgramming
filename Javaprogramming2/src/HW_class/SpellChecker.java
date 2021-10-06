package HW_class;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class SpellChecker extends DataBase{
    public SpellChecker() {
    }

    public String checker(String text,Option option) throws InterruptedException {
        // option class 에서 interval 속성을 가져옴
        int interval = option.getInterval();
        String windowSize = option.getWindowSize();

        // 해당 메소드를 실행시키기 위한 올바른 url을 option class 에서 일부 가져옴
        String url = "https://search.naver.com/search.naver?where=nexearch&sm=top_sly.hst&fbm=0&acr=1&acq=%EB%A7%9E%EC%B6%A4&qdt=0&ie=utf8&query=%EB%A7%9E%EC%B6%A4%EB%B2%95%EA%B2%80%EC%82%AC%EA%B8%B0";

        ChromeOptions options = new ChromeOptions();
        // chrome창을 보이게 할건지 안보이게할건지 option class 에서 boolean값을 가져옴
        if (option.isHeadless()) {
            options.addArguments("--headless");
        }

        // 본인 컴퓨터의 USER-AGENT
//        options.addArguments("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36");
//        options.addArguments("disable-gpu");
//        options.addArguments("--disable-gpu");
//        options.addArguments("lang=ko_KR");
        options.addArguments(windowSize); // 이거 안해주면 headless 때문에 안되고 useragent 넣어줘도 안됨

        ChromeDriver driver = new ChromeDriver(options);

        // Chrome 열기
        driver.get(url);
        Thread.sleep(interval);// interval초 만큼 쉬어줌
        // 한국말을 입력할 창을 찾기
        WebElement input = driver.findElementByXPath("//*[@id=\"grammar_checker\"]/div/div[2]/div[1]/div[1]/div/div[1]/textarea");
        input.sendKeys(text); // 번역할 text 입력
        WebElement button = driver.findElementByXPath("//*[@id=\"grammar_checker\"]/div/div[2]/div[1]/div[1]/div/div[2]/button");
        button.click();
        Thread.sleep(interval); // 1초 쉬어줌

        Document doc = Jsoup.parse(driver.getPageSource());
        Elements output_tag = doc.select("div.text_area p");
        driver.quit();

        // Data 저장
        String temp_list[] = super.getC_list();
        temp_list[super.getC_len()] = output_tag.text();
        super.setK_list(temp_list);
        super.setC_len(super.getC_len()+1); // index 번호 1 추가

        return output_tag.text();
    }

}
