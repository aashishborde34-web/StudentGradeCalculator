import java.util.Scanner;
class StudentGradeCalculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter no. of Subjects=");
        int n = sc.nextInt();

        int TotalMarks = 0;

        // input marks of each subject
        for (int i = 1; i <= n; i++) {
            System.out.println("Enter marks obtained in " + i + " (out of 100):");
            int marks = sc.nextInt();

            if (marks < 0 || marks > 100) {
                System.out.println("Invalid marks! Please enter marks between 0 to 100");
                i--; 
                continue;
            }
            TotalMarks += marks; 
        }

        // calculate average percentage
        double averagePercentage = (double) TotalMarks / n;

        // calculate grade
        char grade;
        if (averagePercentage >= 90) {
            grade = 'A';
        } else if (averagePercentage >= 75) {
            grade = 'B';
        } else if (averagePercentage >= 50) {
            grade = 'C';
        } else if (averagePercentage >= 35) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        // display result
        System.out.println("----Student Result----");
        System.out.println("Total Marks = " + TotalMarks + "/" + (n * 100));
        System.out.println("Average Percentage = " + averagePercentage + "%");
        System.out.println("Grade = " + grade);

        sc.close(); 
    }
}

