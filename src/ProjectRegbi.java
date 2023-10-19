import java.util.Random;
public class ProjectRegbi {


        public static void main(String[] args) {
            int teamSize = 25;
            int[] team1Ages = new int[teamSize];
            int[] team2Ages = new int[teamSize];
            double team1AverageAge = 0;
            double team2AverageAge = 0;
            Random random = new Random();

            for (int i = 0; i < teamSize; i++) {
                team1Ages[i] = random.nextInt(23) + 18;
                team2Ages[i] = random.nextInt(23) + 18;
            }

            System.out.println("Вік гравців команди 1:");
            for (int age : team1Ages) {
                System.out.print(age + " ");
            }
            System.out.println();

            System.out.println("Вік гравців команди 2:");
            for (int age : team2Ages) {
                System.out.print(age + " ");
            }
            System.out.println();

            for (int age : team1Ages) {
                team1AverageAge += age;
            }
            team1AverageAge /= teamSize;

            System.out.println("Середній вік гравців команди 1: " + team1AverageAge);

            for (int age : team2Ages) {
                team2AverageAge += age;
            }
            team2AverageAge /= teamSize;

            System.out.println("Середній вік гравців команди 2: " + team2AverageAge);
        }
    }

