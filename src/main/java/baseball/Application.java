package baseball;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);

        boolean isRestarted;
        do {
            isRestarted = BaseballRunner.run(scanner);
        } while (isRestarted);
    }
}
