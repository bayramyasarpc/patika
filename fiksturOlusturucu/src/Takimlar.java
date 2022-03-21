import java.util.*;

public class Takimlar {
    Scanner input=new Scanner(System.in);
    public Takimlar() {
    }

    public List<String> takimlar(){
        List<String> takimlar=new ArrayList<>();

        System.out.println("Olusturmak istediğiniz liğ takımlarını giriniz");
        System.out.println("takımlarınızı olusturduktan sonra bitti yazıp fiktürünüze bakabilirsiniz : ");
        while(true){
            String newTakim=input.next();
            if(newTakim.equals("bitti"))break;
            takimlar.add(newTakim);
        }

        System.out.println("\n");
        return takimlar;
    }


}
