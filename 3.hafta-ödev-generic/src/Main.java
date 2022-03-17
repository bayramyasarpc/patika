import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        MyList<Integer> myList=new MyList<>();
        System.out.println("Dizideki eleman sayısı(size) : "+myList.size());
        System.out.println("Dizinin kapasitesi : "+myList.getCapacity());

        myList.add(10);
        myList.add(20);
        myList.add(30);

        System.out.println("Dizideki eleman sayısı : "+myList.size());
        System.out.println("Dizinin kapasitesi : "+myList.getCapacity());

        myList.add(40);

        System.out.println("Dizideki eleman sayısı : "+myList.size());
        System.out.println("Dizinin kapasitesi : "+myList.getCapacity());

        myList.add(50);
        myList.add(60);
        myList.add(70);
        myList.add(80);
        System.out.println("Dizideki eleman sayısı : "+myList.size());
        System.out.println("Dizinin kapasitesi : "+myList.getCapacity());

        //dizi index bastır
        myList.toStringArr();
        System.out.println("4.indisteki değer:"+myList.get(4));

        //verilen indisteki veriyi silmeli ve silinen indis sonrasında
        // ki verileri sol doğru kaydırmalı. Geçersiz indis girilerse null döndürür.
        System.out.println("\nListeden 4.indis silindi ve liste tekrar düzenlendi");
        myList.remove(4);
        myList.toStringArr();

        //get(int index): verilen indisteki değeri döndürür. Geçersiz indis girilerse null döndürür.
        System.out.println("2. indisdeki değer : "+myList.get(2)+"\n");

        //set(int index, T data) : verilen indisteki veriyi yenisi ile değiştirme işlemini yapmalıdır.
        // Geçersiz indis girilerse null döndürür.
        System.out.println("5.indisteki değer 51 olarak değişti");
        myList.set(5,51);
        myList.toStringArr();

        //int indexOf(T data) : Parametrede verilen nesnenin listedeki indeksini verir.
        // Nesne listede yoksa -1 değerini verir.

        System.out.println("listedeki index verir yoksa -1 basar : "+myList.indexOf(31)+"\n");

        myList.add(60);
        myList.add(70);
        myList.add(410);
        myList.toStringArr();
        System.out.println("sayının en son görüldüğü index basar:"+myList.lastIndexOf(70));

        System.out.println("\nListe boş mu değil mi : "+myList.isEmpty()+"\n");

        myList.toArray();
        myList.toStringArr();

        //Listenin elemanlarının silinmesi ve bos array olması;
        //myList.clear();
        System.out.println("Listein silinip boş array olması : "+myList.isEmpty()+"\n\n");

        //MyList<T> sublist(int start,int finish) : Parametrede verilen indeks aralığına ait bir liste döner.
        //start dahil finish değil
        System.out.println("Substring:");
        myList.sublist(3,7);
        myList.toStringArr();

        //boolean contains(T data) : Parametrede verilen değerin dizide olup olmadığını söyler.
        System.out.println("40 değeri listede var mı yok mu"+myList.contains(40));

    }
}
