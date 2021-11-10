import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import java.util.ArrayList;
import org.json.simple.JSONObject;


public class Github{
    private CrawlingOption option = new CrawlingOption();
    public void crawling(Database db) throws InterruptedException{
        option.setHeadless(true);
        ArrayList<String> tech_arr = db.getTech_arr();
        int interval = option.getInterval();
        String windowSize = option.getWindowSize();
        System.out.println(tech_arr.size());
        JSONObject jo1 = new JSONObject();

        for (int i = 0; i < tech_arr.size(); i++) {
            System.out.printf("\"%s\"에 대한 Repository를 Crawling 중입니다. 잠시만 기다려 주세요.",tech_arr.get(i));
            System.out.println();
            String url = String.format("https://github.com/topics/%s?o=desc&s=stars", tech_arr.get(i));

            ChromeOptions options = new ChromeOptions();
            // chrome창을 보이게 할건지 안보이게할건지 option class 에서 boolean값을 가져옴
            if (option.isHeadless()) {
                options.addArguments("--headless");
            }
            options.addArguments(windowSize); // 이거 안해주면 headless 때문에 안되고 useragent 넣어줘도 안됨

            ChromeDriver driver = new ChromeDriver(options);
            // Chrome 열기
            driver.get(url);
            Thread.sleep(interval);// interval초 만큼 쉬어줌
            // 현재 페이지 소스 가져오기
            Document doc = Jsoup.parse(driver.getPageSource());
            Elements project_name = doc.select("div.px-3 h3 a");
            int cnt = 0;
            String temp = "";
            ArrayList<String> pn_arr = new ArrayList<String>();
            for (Element pn : project_name) {
                if (cnt % 2 == 0) {
                    temp += pn.text();
                }else{
                    temp += "/" + pn.text();
                    pn_arr.add(temp);
                    temp = "";
                }
                cnt += 1;
            }
            System.out.println("-".repeat(10)+tech_arr.get(i)+"관련 open source 검색결과"+"-".repeat(10));
            for (int j = 0; j < pn_arr.size(); j++) {
                System.out.printf("%d. %s",j,pn_arr.get(j));
                System.out.println();
            }
            System.out.println();


        }
    }
    public void url_open(Database db) {
        ArrayList<String> tech_arr = db.getTech_arr();

        option.setHeadless(false);
        for (int i = 0; i < tech_arr.size(); i++) {
            System.out.println("\"" + db.getTech_arr().get(i) + "\" 에 대한 Github 웹사이트 Open");
            String url = String.format("https://github.com/topics/%s?o=desc&s=stars", tech_arr.get(i));
            int interval = option.getInterval();
            String windowSize = option.getWindowSize();
            ChromeOptions options = new ChromeOptions();
            // chrome창을 보이게 할건지 안보이게할건지 option class 에서 boolean값을 가져옴
            if (option.isHeadless()) {
                options.addArguments("--headless");
            }
            options.addArguments(windowSize); // 이거 안해주면 headless 때문에 안되고 useragent 넣어줘도 안됨

            ChromeDriver driver = new ChromeDriver(options);
            // Chrome 열기
            driver.get(url);
        }
    }
}
