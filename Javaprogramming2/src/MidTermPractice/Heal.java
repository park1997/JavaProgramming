package MidTermPractice;

public class Heal {
    private int height;
    private String type;
    public Heal(int height, String type) {
        this.height = height;
        this.type = type;
    }

    public void show() {
        System.out.println("굽높이: "+this.height+"mm, 굽종류: "+this.type);
    }

    public int getHeight() {
        return height;
    }

    public String getType() {
        return type;
    }
}
