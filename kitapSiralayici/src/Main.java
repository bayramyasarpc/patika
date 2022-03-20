
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        TreeSet<Book> treeSet= new TreeSet<>();

        treeSet.add(new Book("kitap1",123,"author1","1-1-2022"));
        treeSet.add(new Book("kitap3",67,"author3","12-1-2022"));
        treeSet.add(new Book("kitap2",456,"author2","21-1-2022"));
        treeSet.add(new Book("kitap5",1232,"author5","13-1-2022"));
        treeSet.add(new Book("kitap4",100,"author4","15-1-2022"));

        for(Book book : treeSet ){
            System.out.println("Book name : "+book.getName()+"\tpageNum : "
                    +book.getPageNum()+"\t author : "+book.getAuthor()+"\tdate : "+book.getDate());
        }
        System.out.println("###########################");

        TreeSet<Book> treeSet1 =new TreeSet<>(new OrderByPageNum());
        treeSet1.add(new Book("kitap1",123,"author1","1-1-2022"));
        treeSet1.add(new Book("kitap3",67,"author3","12-1-2022"));
        treeSet1.add(new Book("kitap2",456,"author2","21-1-2022"));
        treeSet1.add(new Book("kitap5",1232,"author5","13-1-2022"));
        treeSet1.add(new Book("kitap4",100,"author4","15-1-2022"));

        for(Book book : treeSet1 ){
            System.out.println("Book name : "+book.getName()+"\tpageNum : "
                    +book.getPageNum()+"\t author : "+book.getAuthor()+"\tdate : "+book.getDate());
        }
    }
}
