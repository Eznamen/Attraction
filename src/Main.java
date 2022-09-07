import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static List<Person> generateClients() {
        List<Person> clients = new ArrayList<>();
        clients.add(new Person("Harry", "Potter", 7));
        clients.add(new Person("Mark", "Twen", 12));
        clients.add(new Person("Родион", "Раскольников", 3));
        clients.add(new Person("Кот", "Бегемот", 4));
        clients.add(new Person("Эраст", "Фандорин", 15));
        return clients;

    }

    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>();
        queue.addAll(generateClients());
        System.out.println(queue);

        while (!queue.isEmpty()) {
            Person p = queue.poll();
            System.out.println(p.name + " " + p.surname + " прокатился на аттракционе. ");
            p.tickets = p.tickets - 1;
            if (p.tickets != 0) {
                queue.offer(p);
            }
        }

    }

}
