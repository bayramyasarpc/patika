
import java.util.Arrays;

public class MyList <T>{
    T[] arr;

    public MyList() {
        this.arr= (T[]) new Object[3];
    }

    public MyList(int capacity) {
        this.arr = (T[]) new Object[capacity];
    }

    public int size(){
        int count=0;
        for(T i:arr){
            if(i!=null){
                count++;
            }
        }
        return count;
    }
    public int getCapacity(){
        return this.arr.length;
    }
    public void add(T data){
        for(int i=0;i<this.arr.length;i++){
            if(arr[i]==null){
                arr[i]=data;
                break;
            }
            else if(arr[i]!=null && i== arr.length-1){
                arr= Arrays.copyOf(arr,arr.length*2);
                arr[arr.length/2]=data;
                break;
            }
        }
    }

    public T get(int index){
        try {
            if (arr[index]!=null){
                return arr[index];
            }else return null;

        }catch (Exception ignored){
            return null;
        }
    }

    public void remove(int index){
        T value;
        try {
            value=get(index);
            if (arr[index] != null) {
                if (size() - index >= 0) System.arraycopy(arr, index + 1, arr, index, size() - index);
            }
        } catch (Exception ignored) {
            System.out.println("index of array value nor found");
        }

    }

    public void set(int index,T data){
        try{
            if(arr[index]!=null){
                arr[index]=data;
            }
        }catch (Exception e){
            System.out.println("hatalı işlem");
        }
    }

    public void toStringArr(){
        for(int i=0;i<arr.length;i++){
            //if(arr[i]!=null)
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n\n");
    }

    public int indexOf(T data){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==data){
                return i;
            }
        }
        return -1;
    }
    public int lastIndexOf(T data){
        int index=-1;
        for(int i=size()-1;i>=0;i--){
            if(arr[i]==data){
                return i;
            }
        }
        return index;
    }
    public boolean isEmpty(){
        return size()==0;
    }
    public T[] toArray() {
        return Arrays.copyOfRange(arr, 0, size());
    }

    public void clear(){
        this.arr= (T[]) new Object[10];
    }
    public T[] sublist(int start,int finish){
        return this.arr=Arrays.copyOfRange(arr,start,finish);
    }
    public boolean contains(T data){
        boolean flag=false;
        for(int i=0;i<size();i++){
            if(arr[i]==data){
                flag=true;
            }
        }
        return flag;
    }
}
