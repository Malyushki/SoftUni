
/*
Дава 40/100 точки
 */


import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Scanner;

public class MathPotato_07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] names = scanner.nextLine().split("\\s+");
        PriorityQueue<String> queue = new PriorityQueue <>();
        for (String e:names) {
            queue.offer(e);
        }
        int n = Integer.parseInt(scanner.nextLine());
        int cycles = 1;
        while (queue.size()>1) {
            for (int i = 1; i <= n; i++) {
                queue.offer(queue.poll());
            }
            if (!isPrime(cycles)) {
                System.out.println("Removed " + queue.poll());
            }else {
                System.out.println("Prime "+queue.peek());


            }
            cycles++;
        }
        System.out.println("Last is "+queue.poll());
    }
    static boolean isPrime(int n) {
        if (n <= 1)
            return false;
        else if (n == 2)
            return true;
        else if (n % 2 == 0)
            return false;
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
