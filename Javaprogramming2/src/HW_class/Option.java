package HW_class;

public class Option {
    private boolean headless; // 이거 할건지말건지
    private int width;  // 가로길이 정해주기
    private int height; // 높이정해 주기
    private int interval;
    private String translate_url = "https://papago.naver.com/";
    private String windowSize;

    public Option() {
        this.headless = false;
        this.interval = 1000;
        this.width = 1920;
        this.height = 1080;
        this.windowSize = String.format("window-size=%sx%s",width,height);
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
