package at.femalecoders;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        getPlayerInfo();
        firstStepsInProgramming();
    }

    private static void firstStepsInProgramming() {
        System.out.println("You found an interesting study group called female coders and you can now choose a course.\nDo you want to participate? (true/false)");
        Scanner scanner = new Scanner(System.in);
        boolean joinCourse = scanner.nextBoolean();
        if (joinCourse) {
            System.out.println("Nice that join our study group. You now have different possibilities:\n- Python (python)\n- HTML/CSS (web)\n- javascript (js)");
            String course = scanner.nextLine();
            switch (course) {
                case "python":
                    System.out.println("Nice, first steps for becoming a data scientist!");
                    break;
                case "web":
                    System.out.println("Yeah, doing some fancy web stuff :)");
                    break;
                case "js":
                    System.out.println("You choose the dark side :D");
                    break;
                default:
                    System.out.println("You input was not properly. For now the game is over :(");
            }
        } else {
            System.out.println("Game over! :(");
        }
    }

    public static void getPlayerInfo() {
        String name;
        int age;
        boolean married;
        //TODO
        System.out.println("game intro text");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        name = scanner.nextLine();
        System.out.println("Please enter your age:");
        age = scanner.nextInt();
        System.out.println("Are you married (true/false):");
        married = scanner.nextBoolean();

        System.out.printf("Player %s is %d years old and %s.", name, age, married ? "married" : "not married");
    }
}
