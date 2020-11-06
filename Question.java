import javax.swing.JOptionPane;

public abstract class Question {
  
   static int nQuestions = 0;
   static int nCorrect = 0;

   String question;
   String correctAnswer;
  
   abstract String ask();
  
   void check() {
       nQuestions += 1;
       while (true) {
           String answer = (ask());
           answer = answer.toUpperCase();
           if (answer.contentEquals(correctAnswer)) {
               JOptionPane.showMessageDialog(null, "Correct");
               nCorrect += 1;
               return;
           }
           if (answer.equals("A") || answer.equals("B") || answer.equals("C") || answer.equals("D")
                   || answer.equals("E")) {
               JOptionPane.showMessageDialog(null,"Incorrect. The correct answer is "+correctAnswer+".");
               return;
           } else {
               JOptionPane.showMessageDialog(null, "Invalid answer. Please enter A,B,C,D,E");
           }
       }
   }
  
   static void showResults() {
       JOptionPane.showMessageDialog(null, nCorrect + " correct out of " + nQuestions + " questions ");
   }

}