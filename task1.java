// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.



import java.util.ArrayDeque;

public class task1 {

    public static ArrayDeque<Integer> GetReversDeque(int count) {
        ArrayDeque<Integer> deque = new ArrayDeque<>();
        ArrayDeque<Integer> reverseDeque = new ArrayDeque<>();

        for (int i = 0; i < count; i++) {
            int random = (int) (Math.random() * (100 - 1));
            deque.addFirst(random);
        }
        System.out.println(deque);

        for (int i = 0; i < count; i++) {
            reverseDeque.addFirst(deque.getFirst());
            deque.removeFirst();
        }
        return reverseDeque;
    }

    public static void main(String[] args) {

        System.out.println(GetReversDeque(15));

    }

}