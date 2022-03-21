import java.util.*;

public class FiksturOlustur {
    public void fikstur(){
        Takimlar takimlar=new Takimlar();
        List<String> takimlar1 = takimlar.takimlar();

        System.out.println("Takımlar");
        for(String s: takimlar1){
            System.out.println("- "+s);
        }
        System.out.println("\n");

        if(takimlar1.size()%2==1){
            takimlar1.add("Bay");
        }

        int haftaSayisi=takimlar1.size()-1;

        List<String> ev=new ArrayList<>();
        List<String> deplasman =new ArrayList<>();


        int depSize=takimlar1.size()/2;

        for(int i=0;i<takimlar1.size()/2;i++){
            ev.add(takimlar1.get(i));
            deplasman.add(takimlar1.get(depSize));
            depSize++;
        }
        //İLK YARI FİKSTÜRÜ
        for (int k=1;k<=haftaSayisi;k++) {
            System.out.println("Round "+(k));
            for (int j = 0; j < ev.size(); j++) {
                System.out.println(ev.get(j) + " vs " + deplasman.get(j));
            }
            String sonEleman=ev.get(ev.size()-1);//son elemanı tut
            ev.add(0,deplasman.get(0));//0 index e koy
            ev.remove(ev.size()-1);//sondaki elemanı sil
            deplasman.remove(0);
            deplasman.add(deplasman.size()-1,sonEleman);
            System.out.println("\n");
        }
        System.out.println("###################################\n");
        //İKİNCİ YARI FİKSTÜRÜ
        for (int k=haftaSayisi+1;k<=haftaSayisi*2;k++) {
            System.out.println("Round "+(k));
            for (int j = 0; j < ev.size(); j++) {
                System.out.println(deplasman.get(j) + " vs " + ev.get(j));
            }
            ev.add(0,deplasman.get(0));
            deplasman.remove(0);
            deplasman.add(deplasman.size()-1,ev.get(ev.size()-1));
            ev.remove(ev.size()-1);
            System.out.println("\n");
        }
    }
}
