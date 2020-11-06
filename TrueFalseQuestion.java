import javax.swing.JOptionPane;
public class TrueFalseQuestion extends Question{
   public TrueFalseQuestion(String question,String answer) {
       this.question="TRUE or FALSE: "+question;
       this.correctAnswer=answer;
   }
   @Override
   String ask() {
       String printresult="";
       nQuestions += 1;
       boolean flag = true;
       while (flag) {
           String answer = JOptionPane.showInputDialog(question);
           answer=answer.toUpperCase();
           if(answer.equals("T") || answer.equals("TRUE") || answer.equals("Y") || answer.equals("YES")) {
               answer="TRUE";
           }
           else if(answer.equals("F") || answer.equals("FALSE") || answer.equals("N") || answer.equals("NO")) {
               answer="FALSE";
           }
           if (answer.equals(correctAnswer)) {
               nCorrect += 1;
               flag=false;
               printresult = "Correct";
           }
           else if (answer.equals("TRUE") || answer.equals("FALSE")) {
               flag=false;
               printresult = "Incorrect. The correct answer is "+correctAnswer+".";
           } else {
               flag = true;
               JOptionPane.showMessageDialog(null,"Invalid answer. Please enter TRUE or FALSE");
           }
       }
       return printresult;
   }

}