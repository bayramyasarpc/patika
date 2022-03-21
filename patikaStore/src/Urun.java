import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Urun {

    static Scanner input=new Scanner(System.in);

    private String markalar;
    private String adi;
    private int id;
    private  static int notebookID=0;
    private static int ceptelefonID=0;
    private double fiyati;
    private int indirimOrani;
    private int stokMiktari;
    private int depolama;
    private double ekranBoyutu;
    private double pilGucu;
    private int RAM;
    private String renk;

    private static HashMap<String, ArrayList<Urun>> urunler=new HashMap<>(){{
            put("Notebook",new ArrayList<>());
            put("Cep Telefon",new ArrayList<>());
    }};

    //cep telefonu
    public Urun(String markalar, String adi, int id, double fiyati, int depolama, double ekranBoyutu, double pilGucu, int RAM, String renk) {
        this.markalar = markalar;
        this.adi = adi;
        this.id = id;
        this.fiyati = fiyati;
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
        this.pilGucu = pilGucu;
        this.RAM = RAM;
        this.renk = renk;



    }

    // notebook
    public Urun(String markalar, String adi, int id, double fiyati,int depolama, double ekranBoyutu, int RAM) {
        this.markalar = markalar;
        this.adi = adi;
        this.id = id;
        this.fiyati = fiyati;
        this.depolama = depolama;
        this.ekranBoyutu = ekranBoyutu;
        this.RAM = RAM;


    }

    public static void islemler(int i) {
        if(i==1){
            System.out.println("\nNotebook");

        }else{
            System.out.println("\nCep Telefonu");

        }
        while(true) {
            System.out.println("-------------------------------------------------------------------------------------\n");
            System.out.println("1-Urun Listele");
            System.out.println("2-Urun Ekleme");
            System.out.println("3-Urun Silme");
            System.out.println("4-Urun Filtreleme");
            System.out.println("0-Çıkış");

            int val = input.nextInt();
            if(val==0)break;
            switch (val) {
                case 1:
                    urunListeleme(i);
                    break;
                case 2:
                    urunEkleme(i);
                    break;
                case 3:
                    System.out.println("Silmek istediğiniz ürünün id'sini giriniz : ");
                    urunSilme(i,input.nextInt());
                    break;
                case 4:
                    urunFiltreleme(i);
                    break;
                default:
                    break;
            }
        }
    }

    private static void urunFiltreleme(int i) {
        System.out.println("Filtrelemek istediğiniz alanın numarasını giriniz : ");
        System.out.println("1-Id ye göre filtrelenir");
        System.out.println("2-Markasına göre filtrelenir");
        System.out.println("Çıkmak için 0 basınız");

        int num=input.nextInt();
        if(num==1 && i==1){
            ArrayList<Urun> notebook = urunler.get("Notebook");
            for(Urun u: notebook){
                if(u.getId()==num)
                    urunListeleme(i);
            }
        }
    }

    private static void urunSilme(int i,int id) {
        if(i==1){
            urunler.get("Notebook").remove(id-1);
        }else if(i==2){
            urunler.get("Cep Telefon").remove(id-1);
        }

        System.out.println("%s li ürün silinmiştir".formatted(id));
    }

    private static void urunEkleme(int i) {
        System.out.print("Ürün adı : ");
        String ad=input.next();

        System.out.println("Fiyatı : ");
        double fiyat=input.nextInt();

        System.out.println("Markası : ");
        String marka=input.next();

        System.out.println("Depolama alanı : ");
        int depolama=input.nextInt();

        System.out.println("Ekran : ");
        double ekran=input.nextInt();

        System.out.println("RAM : ");
        int ram=input.nextInt();

        System.out.println("Pil");
        double pil=input.nextInt();

        System.out.println("Renk : ");
        String renk =input.next();
        if(i==1){

            notebookID++;
            Urun urun=new Urun(marka,ad,notebookID,fiyat,depolama,ekran,ram);
            urunler.get("Notebook").add(urun);
        }else if(i==2){


            ceptelefonID++;

            Urun urun=new Urun(marka,ad,ceptelefonID,fiyat,depolama,ekran,pil,ram,renk);
            urunler.get("Cep Telefon").add(urun);
        }
    }

    private static void urunListeleme(int i) {
        if(i==1){

            System.out.println("Notebook Listesi");
            System.out.println("------------------------------------------------------------------------------------------");
            System.out.println("| ID | Ürün Adı              | Fiyat       | Marka       |Depolama     | Ekran   |RAM     |");
            System.out.println("------------------------------------------------------------------------------------------");

            urunBastir(i);
        }else if (i==2){


            System.out.println("Cep Telefonu Listesi\n");
            System.out.println("--------------------------------------------------------------------------------------------------------");
            System.out.println("| ID | Ürün Adı              | Fiyat       | Marka       |Depolama     | Ekran    |Pil    |RAM |  Renk |");
            System.out.println("--------------------------------------------------------------------------------------------------------");

            urunBastir(i);
        }
    }

    private static void urunBastir(int i) {
        if(i==1) {
            ArrayList<Urun> notebook = urunler.get("Notebook");
            if (!notebook.isEmpty()) {
                for (Urun u : notebook) {
                    System.out.printf("| %-2s | %-21s | %-11s | %-11s | %-11s | %-7s | %-6s |\n", u.getId(), u.getAdi()+" "+u.getMarkalar(),
                                                            u.getFiyati(), u.getMarkalar(), u.getDepolama(), u.getEkranBoyutu(), u.getRAM());
                }

            }
            else{
                System.out.println("Herhangi bir ürün yoktur");
            }
        }else {
            ArrayList<Urun> cep_telefonu = urunler.get("Cep Telefon");
            if(!cep_telefonu.isEmpty()){
                for(Urun u : cep_telefonu){
                    System.out.printf("| %-2s | %-21s | %-11s | %-11s | %-11s | %-7s | %-6s | %-2s | %-2s |\n", u.getId(),u.getMarkalar()+" "+u.getAdi(),
                            u.getFiyati(),u.getMarkalar(),u.getDepolama(),u.getEkranBoyutu(),u.getPilGucu(),u.getRAM(),u.getRenk());
                }
            }else{
                System.out.println("Herhangi bir ürün yoktur");
            }
        }
    }


    public static Scanner getInput() {
        return input;
    }

    public static void setInput(Scanner input) {
        Urun.input = input;
    }

    public String getMarkalar() {
        return markalar;
    }

    public void setMarkalar(String markalar) {
        this.markalar = markalar;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getFiyati() {
        return fiyati;
    }

    public void setFiyati(double fiyati) {
        this.fiyati = fiyati;
    }

    public int getIndirimOrani() {
        return indirimOrani;
    }

    public void setIndirimOrani(int indirimOrani) {
        this.indirimOrani = indirimOrani;
    }

    public int getStokMiktari() {
        return stokMiktari;
    }

    public void setStokMiktari(int stokMiktari) {
        this.stokMiktari = stokMiktari;
    }

    public int getDepolama() {
        return depolama;
    }

    public void setDepolama(int depolama) {
        this.depolama = depolama;
    }

    public double getEkranBoyutu() {
        return ekranBoyutu;
    }

    public void setEkranBoyutu(double ekranBoyutu) {
        this.ekranBoyutu = ekranBoyutu;
    }

    public double getPilGucu() {
        return pilGucu;
    }

    public void setPilGucu(double pilGucu) {
        this.pilGucu = pilGucu;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getNotebookID() {
        return notebookID;
    }

    public void setNotebookID(int notebookID) {
        this.notebookID = notebookID;
    }

    public int getCeptelefonID() {
        return ceptelefonID;
    }

    public void setCeptelefonID(int ceptelefonID) {
        this.ceptelefonID = ceptelefonID;
    }
}
