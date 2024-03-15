package fosalgo;

import java.util.ArrayList;

public class Test002 {
    public static void main(String[] args) {
        ArrayList data = new ArrayList();
        data.add(37.219);
        data.add(83.21);
        data.add(876.2345);
        data.add("Iwan Firgiawan");
        System.out.println(data);
        data.remove(1);
        System.out.println(data);
    }
}
