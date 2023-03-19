
import java.util.LinkedList;
import java.util.Random;

// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди,
// dequeue() - возвращает первый элемент из очереди и удаляет его,
// first() - возвращает первый элемент из очереди, не удаляя.


public class HW_2 {
    public static void main(String[] args) {
       
              Random rdm = new Random();
              LinkedList<Integer> rdm_list = new LinkedList<Integer>();
              for (int i = 0; i < 10; i ++){
                  rdm_list.add(rdm.nextInt(1, 10));
              }
              
              System.out.println("Исходный список: " + rdm_list);

              System.out.println(enqueue(rdm_list, 45)); // поместили элемент в конец очереди
              System.out.println(rdm_list);

              System.out.println(dequeue(rdm_list)); // удалили первый элемент
              System.out.println(rdm_list);
      
              System.out.println(first(rdm_list)); // вывели первый элемент
              System.out.println(rdm_list); 
          }
      
          public static int enqueue(LinkedList<Integer> lst, int num) {// помещает элемент в конец очереди
              lst.addLast(num);
              return num;
          }
      
          public static int dequeue(LinkedList<Integer> lst) { // возвращает первый элемент из очереди и удаляет его
              int num = lst.get(0);
              lst.remove(0);
              return num;
          }
      
          public static int first(LinkedList<Integer> lst) { // возвращает первый элемент из очереди, не удаляя
              int num = lst.get(0);
              return num;
          }


            }
        