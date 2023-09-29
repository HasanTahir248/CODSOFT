import java.text.DecimalFormat;
import java.util.Scanner;

class Main {
  public static void main(String[] args) {
//Created all the values which will be used in the project along with declaring the scanner and decimal formatter
    Scanner in = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
     double marks = 0;
    double total_marks = 100;
    double num_of_subjects;
    double percentage;
    String grade;
//getting the number of subjects for the result
    System.out.println("\n*************** STUDENT GRADE CALCULATOR ***************\n");
    System.out.println("Enter number of Subjects: \n");
    num_of_subjects = in.nextInt();
//Getting marks of every subject for total marks
    int i = 1;
    while(i <= num_of_subjects){
      System.out.println("\nEnter Marks of subject " + i + " out of "+ total_marks+": \n");
      marks += in.nextInt();
      i++;
    } 
//Calculating average percentage of total marks
    percentage = (marks/ (total_marks * num_of_subjects)) * 100;
//Calculating grade
    if (percentage >= 90){
      grade = "A+";
    } else if (percentage >= 80 && percentage < 90){
      grade = "A";
    } else if (percentage >= 70 && percentage < 80){
      grade = "B";
    } else if (percentage >= 60 && percentage < 70){
      grade = "C";
    } else if (percentage >= 50 && percentage < 60){
      grade = "D";
    } else {
      grade = "F";
    }
//Showing results
    System.out.println("\n******************** STUDENT RESULT ********************\n");
    System.out.println(" TOTAL MARKS: "+marks+ " OUT OF "+(total_marks * num_of_subjects)+"\n");
    System.out.println(" AVERAGE PERCENTAGE: "+df.format(percentage)+ "% \n");
    System.out.println(" GRADE: "+grade+"\n");
    
  }
}