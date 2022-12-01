import java.util.Scanner;
  
class Main {
   
   public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     
     System.out.print("Enter your final average [0-100] : ");
     double finalGrade = input.nextDouble();
     
        String finalLetter;
        if (finalGrade >= 90) {
            finalLetter = "A";
        } else if (finalGrade >= 80) {
            finalLetter = "B";
        } else if (finalGrade >= 70) {
            finalLetter = "C";
        } else if (finalGrade >= 60) {
            finalLetter = "D";
        } else {
            finalLetter = "F";
        }
      System.out.println(finalLetter);
    }
}
