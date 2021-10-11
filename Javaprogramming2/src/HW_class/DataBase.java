package HW_class;

public class DataBase {

    private String password;
    String k_list[] = new String[100];
    String e_list[] = new String[100];
    String c_list[] = new String[100];
    int k_len = 0;
    int e_len = 0;
    int c_len = 0;

    public DataBase() {

    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void append_k(String item) {
        k_list[k_len] = item;
    }

    public void append_e(String item) {
        e_list[e_len] = item;
    }

    public void append_c(String item) {
        c_list[c_len] = item;
    }
}
