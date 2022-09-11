import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Harry", "Potter", 15));
        clients.add(new Person("Tom", "Sawyer", 13));
        clients.add(new Person("Родион", "Раскольников", 9));
        clients.add(new Person("Кот", "Бегемот", 11));
        clients.add(new Person("Эраст", "Фандорин", 7));
        return clients;

    }

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.addAll(generateClients());
        System.out.println(queue);

        while (!queue.isEmpty()) {
            Person p = queue.poll();
            System.out.println(p.getName() + " " + p.getSurname() + " прокатился на аттракционе. ");
            int t = p.getTickets() - 1;
            p.setTickets(t);

            if (p.getTickets() > 0) {

                queue.offer(p);
            } 
        }

    }

}
