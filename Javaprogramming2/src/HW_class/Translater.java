package HW_class;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeOptions;

public class Translater extends DataBase{


    public Translater() {
        super();
    }

    // 한국말을 영어로 번역
    // Option 클래스에대한 메시지 패싱
    public String translate_KtoE(String text,Option option) throws InterruptedException {
        // option class 에서 interval 속성을 가져옴
        int interval = option.getInterval();

        // 해당 메소드를 실행시키기 위한 올바른 url을 option class 에서 일부 가져옴
        String url_KtoE = String.format("%s%s",option.getTranslate_url(),"?sk=ko&tk=en");
        String windowSize = option.getWindowSize();

        ChromeOptions options = new ChromeOptions();
        if (option.isHeadless()) {
            options.addArguments("--headless");
        }
//        options.addArguments("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36");
//        options.addArguments("disable-gpu");
//        options.addArguments("--disable-gpu");
        options.addArguments("lang=ko_KR");
        options.addArguments(windowSize); // 이거 안해주면 headless 때문에 안되고 useragent 넣어줘도 안됨

        ChromeDriver driver = new ChromeDriver(options);

        // Chrome 열기
        driver.get(url_KtoE);
        Thread.sleep(interval);// interval초 만큼 쉬어줌

        // 한국말을 입력할 창을 찾기
        WebElement k_input = driver.findElementByXPath("//*[@id=\"txtSource\"]");
        k_input.sendKeys(text); // 번역할 text 입력
        Thread.sleep(interval); // interval초 만큼 쉬어줌

        Document doc = Jsoup.parse(driver.getPageSource());
        Elements e_output_tag = doc.select("div.edit_area___2iv-G div#txtTarget span");

        // 드라이버 종료
        driver.quit();

        // data 저장
        String temp_list[] = super.getK_list();
        temp_list[super.getK_len()] = e_output_tag.text();
        super.setK_list(temp_list);
        super.setK_len(super.getK_len()+1); // index 번호 1 추가

        return e_output_tag.text();
    }

    // 영어를 한국말로 번역
    // Option 클래스에대한 메시지 패싱
    public String translate_EtoK(String text,Option option) throws InterruptedException {
        // option class 에서 interval 속성을 가져옴
        int interval = option.getInterval();
        String windowSize = option.getWindowSize();

        // 해당 메소드를 실행시키기 위한 올바른 url을 option class 에서 일부 가져옴
        String url_EtoK = String.format("%s%s",option.getTranslate_url(),"?sk=en&tk=ko&hn=0");

        ChromeOptions options = new ChromeOptions();
        // chrome창을 보이게 할건지 안보이게할건지 option class 에서 boolean값을 가져옴
        if (option.isHeadless()) {
            options.addArguments("--headless");
        }

        // 본인 컴퓨터의 USER-AGENT
//        options.addArguments("Mozilla/5.0 (Macintosh; Intel Mac OS X 10_15_7) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/93.0.4577.63 Safari/537.36");
//        options.addArguments("disable-gpu");
//        options.addArguments("--disable-gpu");
        options.addArguments("lang=ko_KR");
        options.addArguments(windowSize); // 이거 안해주면 headless 때문에 안되고 useragent 넣어줘도 안됨

        ChromeDriver driver = new ChromeDriver(options);

        // Chrome 열기
        driver.get(url_EtoK);
        Thread.sleep(interval);// interval초 만큼 쉬어줌

        // 한국말을 입력할 창을 찾기
        WebElement e_input = driver.findElementByXPath("//*[@id=\"txtSource\"]");
        e_input.sendKeys(text); // 번역할 text 입력
        Thread.sleep(interval); // interval초 만큼 쉬어줌

        Document doc = Jsoup.parse(driver.getPageSource());
        Elements k_output_tag = doc.select("div.edit_area___2iv-G div#txtTarget span");

        // 드라이버 종료
        driver.quit();

        // data 저장
        String temp_list[] = super.getE_list();
        temp_list[super.getE_len()] = k_output_tag.text();
        super.setE_list(temp_list);
        super.setE_len(super.getE_len()+1); // index 번호 1 추가

        return k_output_tag.text();
    }


}
