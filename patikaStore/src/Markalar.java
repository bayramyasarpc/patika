import java.util.ArrayList;
import java.util.List;

public class Markalar {
    public List<String> list=new ArrayList<>();
    public Markalar() {
    }

    public void ekleme(){
        list.add("Apple");
        list.add("Asus");
        list.add("Casper");
        list.add("HP");
        list.add("Huawei");
        list.add("Lenova");
        list.add("Monster");
        list.add("Samsung");
        list.add("Xiami");
    }
    public  void printList(){
        for(String s: getList()){
            System.out.println("-"+s);
        }
    }

    public List<String> getList() {
        return list;
    }


}
