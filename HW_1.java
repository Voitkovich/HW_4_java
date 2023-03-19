
import java.util.LinkedList;
import java.util.Random;

// Пусть дан LinkedList с несколькими элементами. 
// Реализуйте метод(не void), который вернет “перевернутый” список.



public class HW_1 {
    public static void main(String[] args) {
       
              Random rdm = new Random();
              LinkedList<Integer> rdm_list = new LinkedList<Integer>();
              for (int i = 0; i < 10; i ++){
                  rdm_list.add(rdm.nextInt(1, 10));
              }
              
              System.out.println("Исходный список: " + rdm_list);


// вызываем метод, возвращающий перевернутый список
LinkedList revers_list = reverseLinkedList(rdm_list);

// выводим перевернутый список
System.out.println("Перевернутый список: " + revers_list);
}

public static LinkedList reverseLinkedList(LinkedList list){
    // создаем новый LinkedList для хранения перевернутого списка
LinkedList revers_list = new LinkedList<>();

// проходим по элементам исходного списка в обратном порядке
// и добавляем их в новый список
for (int i = list.size() - 1; i >= 0; i--) {
Integer el = (int) list.get(i);
revers_list.add(el);
}

// возвращаем перевернутый список
return revers_list;

}
        }
    
