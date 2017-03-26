import java.util.Scanner;

/**
 * Created by pilot on 26.03.2017.
 */
public class dz2lecciya2 {
    public static void main(String[] args) {
        System.out.println("Введите год основания Одессы:");

        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = 1794;
                if (a < b)
            System.out.println("Вы ошиблись. Одесса была основана в 1794 году.");

                else if (a >b)

                        System.out.println("Вы ошиблись. Одесса была основана в 1794 году.");

                else
            System.out.println("Ваш ответ верен. Одесса была основана в 1794 году.");


        }
    }

