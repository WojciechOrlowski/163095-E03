import java.time.LocalDate;
import java.util.LinkedList;

public class Z1 {
    public static void main(String[]args){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);

        System.out.println(linkedList);
        redukuj(linkedList, 2);
        System.out.println(linkedList);

        LinkedList<LocalDate> linkedList1 = new LinkedList<>();
        linkedList1.add(LocalDate.of(1999,1,1));
        linkedList1.add(LocalDate.of(2000,2,2));
        linkedList1.add(LocalDate.of(2001,3,3));
        linkedList1.add(LocalDate.of(2002,4,4));

        System.out.println(linkedList);
        redukuj(linkedList1, 2);
        System.out.println(linkedList1);
    }
    public static<T> void redukuj(LinkedList<T> lista, int index){
        int idx = index - 1;
        for(int i = 0; i< lista.size() - 1; i++){
            lista.remove(idx);
            idx += idx;
        }
    }
}
