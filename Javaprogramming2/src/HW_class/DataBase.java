package HW_class;

public class DataBase {

    private String password;
    private String k_list[] = new String[100];
    private String e_list[] = new String[100];
    private String c_list[] = new String[100];
    private int k_len = 0;
    private int e_len = 0;
    private int c_len = 0;

    public DataBase() {

    }


    public int getK_len() {
        return k_len;
    }

    public void setK_len(int k_ien) {
        this.k_len = k_ien;
    }

    public int getE_len() {
        return e_len;
    }

    public void setE_len(int e_len) {
        this.e_len = e_len;
    }

    public int getC_len() {
        return c_len;
    }

    public void setC_len(int c_len) {
        this.c_len = c_len;
    }



    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String[] getK_list() {
        return k_list;
    }

    public void setK_list(String[] k_list) {
        this.k_list = k_list;
    }

    public String[] getE_list() {
        return e_list;
    }

    public void setE_list(String[] e_list) {
        this.e_list = e_list;
    }

    public String[] getC_list() {
        return c_list;
    }

    public void setC_list(String[] c_list) {
        this.c_list = c_list;
    }
}
