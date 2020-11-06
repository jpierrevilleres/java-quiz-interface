import javax.swing.JOptionPane;

public class MultipleChoiceQuestion extends Question{

   MultipleChoiceQuestion(String query, String a, String b, String c, String d, String e, String answer) {

       question = query + "\n";
       question += "A. " + a + "\n";
       question += "B. " + b + "\n";
       question += "C. " + c + "\n";
       question += "D. " + d + "\n";
       question += "E. " + e + "\n";
       correctAnswer = answer.toUpperCase();
   }

   String ask() {
       return JOptionPane.showInputDialog(question);
   }
}