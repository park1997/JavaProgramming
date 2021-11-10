import java.util.ArrayList;

public class Database {
    private ArrayList<String> tech_arr;
    private ArrayList<String> tech_result;


    public ArrayList<String> getTech_arr() {
        return tech_arr;
    }

    public void setTech_arr(ArrayList<String> tech_arr) {
        this.tech_arr = tech_arr;
    }

    public void showDb() {
        System.out.print("검색할 최신 동향 기술 : ");
        for (int i = 0; i < tech_arr.size(); i++) {
            System.out.print(tech_arr.get(i) + " ");
        }
        System.out.println();
        System.out.println();
    }

    public ArrayList<String> getTech_result() {
        return tech_result;
    }

    public void setTech_result(ArrayList<String> tech_result) {
        this.tech_result = tech_result;
    }
}
