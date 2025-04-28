import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Race race = new Race();

        for (int i = 0; i < 3; i++) {
            System.out.println("Введите название автомобиля №" + (i + 1) + ":");
            String name = scanner.next();

            int speed;
            while (true) {
                System.out.println("Введите скорость автомобиля №" + (i + 1) + " (0-250 км/ч):");
                if (scanner.hasNextInt()) {
                    speed = scanner.nextInt();
                    if (speed >= 0 && speed <= 250) {
                        break; // Выходим из цикла, если скорость допустима
                    } else {
                        System.out.println("Некорректная скорость. Повторите ввод.");
                    }

                } else {
                    scanner.next();
                    System.out.println("Некорректная скорость. Повторите ввод.");
                }
            }
            scanner.nextLine();
            Car car = new Car(name, speed);
            race.determineLeader(car); // Определяем лидера после ввода каждого автомобиля
        }

        System.out.println("Победитель гонки: " + race.getLeader()); // Выводим победителя
        scanner.close();
    }
}