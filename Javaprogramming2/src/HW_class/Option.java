package HW_class;

public class Option {
    private boolean headless; // 이거 할건지말건지
    private int width;  // 가로길이 정해주기
    private int height; // 높이정해 주기
    private int interval;
    private String translate_url = "https://papago.naver.com/";
    private String spellcheck_url = "https://search.naver.com/search.naver?where=nexearch&sm=top_sly.hst&fbm=0&acr=1&acq=%EB%A7%9E%EC%B6%A4&qdt=0&ie=utf8&query=%EB%A7%9E%EC%B6%A4%EB%B2%95%EA%B2%80%EC%82%AC%EA%B8%B0";
    private String windowSize;

    public Option() {
        this.headless = false;
        this.interval = 1000;
        this.width = 1920;
        this.height = 1080;
        this.windowSize = String.format("window-size=%sx%s",width,height);
    }

    public String getSpellcheck_url() {
        return spellcheck_url;
    }

    public void setSpellcheck_url(String spellcheck_url) {
        this.spellcheck_url = spellcheck_url;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isHeadless() {
        return headless;
    }

    public void setHeadless(boolean headless) {
        this.headless = headless;
    }

    public int getInterval() {
        return interval;
    }

    public void setInterval(int interval) {
        this.interval = interval;
    }

    public String getTranslate_url() {
        return translate_url;
    }

    public void setTranslate_url(String translate_url) {
        this.translate_url = translate_url;
    }

    public String getWindowSize() {
        return windowSize;
    }

    public void setWindowSize(String windowSize) {
        this.windowSize = windowSize;
    }
}
