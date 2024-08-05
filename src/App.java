import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Get the number of students and their scores
        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();
        int[] scores = new int[numStudents];

        int bestScore = Integer.MIN_VALUE;

        for (int i = 0; i < numStudents; i++) {
            System.out.print("Score for student " + (i + 1) + ": ");
            scores[i] = input.nextInt();
            bestScore = Math.max(bestScore, scores[i]);
        }

        // Display grades
        for (int i = 0; i < numStudents; i++) {
            char grade;
            int scoreDifference = bestScore - scores[i];

            if (scoreDifference < 10) grade = 'A';
            else if (scoreDifference < 20) grade = 'B';
            else if (scoreDifference < 30) grade = 'C';
            else if (scoreDifference < 40) grade = 'D';
            else grade = 'F';

            System.out.println("Student " + (i + 1) + " score is " + scores[i] + " and grade is " + grade);
        }

        input.close();
    }
}