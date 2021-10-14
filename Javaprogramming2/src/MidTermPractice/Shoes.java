package MidTermPractice;

public class Shoes {
    private int size;
    private Heal heal;

    public Shoes(int size, int height, String type) {
        this.size = size;
        heal = new Heal(height,type);
    }

    public void show() {
        System.out.println("신발크기: "+this.size+"mm, 굽높이: "+heal.getHeight()+", 굽종류: "+heal.getType());
    }

}
