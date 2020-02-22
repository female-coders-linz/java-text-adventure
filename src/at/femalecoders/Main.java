package at.femalecoders;

import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        getPlayerInfo();
        firstStepsInProgramming();
    }

    private static void firstStepsInProgramming() {
        System.out.println("You found an interesting study group called female coders and you can now choose a course.\nDo you want to participate? (true/false)");
        Scanner scanner = new Scanner(System.in);
        boolean joinCourse = scanner.nextBoolean();
        scanner.nextLine();
        if (joinCourse) {
            System.out.println("Nice that join our study group. You now have different possibilities:\n- Python (python)\n- HTML/CSS (web)\n- javascript (js)");
            String course;
            do {
                course = scanner.nextLine();
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
                        System.out.println("You input was not properly. Try it again!");
                }
            } while (!course.equals("python") && !course.equals("web") && !course.equals("js"));
            System.out.println("You are totally into your exercise, but then you smell pizza. What are you going to do next?\n(1) Stay with your exercise"
                    + " \n(2) Quickly grab a piece and continue working\n(3) Enjoy pizza with the others and talk to another woman about her progress and experiences today.");
            int option;
            do {
                option = scanner.nextInt();
                switch (option) {
                    case 1:
                        System.out.println("You are doing great progress and solved your problem. The others hear your stomach rumbling. Your performance afterwards decreases as your body is lacking energy.");
                        break;
                    case 2:
                        System.out.println("Your throw your pizza at your keyboard and spent 10 minutes cleaning it. You pressed something strange on keyboard and have no idea where have been.");
                        break;
                    case 3:
                        eatPizza();
                        break;
                    default:
                        System.out.println("Reenter your option.");
                }
            } while (option > 3 || option < 0);
        } else {
            System.out.println("Game over! :(");
        }
    }

    private static void eatPizza() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("The pizza is awesome. How many pieces of pizza do you want to eat?");
        int pizzaPieces;
        do {
            pizzaPieces = scanner.nextInt();
            if (pizzaPieces < 1) {
                System.out.println("Heeee - you wanted pizza, so try at least one piece!");
            } else {
                System.out.println("You are enjoy pizza together with Ada and found a new friend.");
                if (pizzaPieces >= 3) {
                    System.out.println("Ada has a quite similar problem in her exercises and after sharing your experiences you were able to solve your problem afterwards.");
                    if (pizzaPieces > 8) {
                        System.out.println("Furthermore Ada compliments your eating skills.");
                    }
                }
            }
        } while (pizzaPieces < 1);
    }

    private static void getPlayerInfo() {
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
