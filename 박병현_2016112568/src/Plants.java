public class Plants {
    private Leaf leaf;
    private int water;

    public Plants(int water,int time) {
        this.leaf = new Leaf(time);
        this.water = water;
    }

    public void show() {
        System.out.print("물 : "+this.water+"l ");
        leaf.show();
    }

}
