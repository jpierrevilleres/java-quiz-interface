import javax.swing.JOptionPane;

public class Quiz {
   static int nQuestions = 0;
   static int nCorrect = 0;

   public static void main(String[] args) {
	   
	   Question question = new MultipleChoiceQuestion("What is the first mechanical calculator?\n",
			 "Pascalines\n",
			 "Abacus\n",
			 "Casio FX-91ES\n",
			 "Elektronika\n",
			 "HP-65\n",
			 "a");
       question.check();
       
       question = new MultipleChoiceQuestion(
			 "What is the first free and open-source software?\n",
			 "Turing Machine\n",
			 "Chess Software\n",
			 "A-0 System\n",
			 "Windows\n",
			 "Linux\n",
			 "c");
       question.check();

       question = new MultipleChoiceQuestion("Who designed the Java Programming Language?\n",
			 "Bill Gates\n",
			 "James Gosling\n",
			 "Charles Babbage\n",
			 "Jack Kirby\n",
			 "Jeff Bezos\n",
			 "b");
       question.check();

       question = new MultipleChoiceQuestion("What does API mean?\n",
			 "Automatic Programmer Intelligence\n",
			 "Application Programmatic Interconnect\n",
			 "Apple Programmer Intel\n",
			 "Application Programming Interface\n",
			 "Automatic Programming Interface\n",
			 "d");
       question.check();

       question = new MultipleChoiceQuestion("What does OOP mean for Java?\n",
			 "Object Ornamental Programmer\n",
			 "Obfuscated Object Programming\n",
			 "Obvious Objective Programming\n",
			 "Opportunistic Oriented Programmer\n",
			 "Object Oriented Programming\n",
			 "e");
       question.check();

       Question.showResults();
      
       Question question1 = new TrueFalseQuestion("Is 4 an even number?", "TRUE");
       JOptionPane.showMessageDialog(null,question1.ask());
      
       question1 = new TrueFalseQuestion("Is Mt Everest the largest mountain in the world?", "TRUE");
       JOptionPane.showMessageDialog(null,question1.ask());
      
       question1 = new TrueFalseQuestion("Is skin the largest human organ?", "TRUE");
       JOptionPane.showMessageDialog(null,question1.ask());
      
       question1 = new TrueFalseQuestion("Does sound travel farthest in gas?", "FALSE");
       JOptionPane.showMessageDialog(null,question1.ask());
      
       question1 = new TrueFalseQuestion("Does India have the largest population in the world?", "FALSE");
       JOptionPane.showMessageDialog(null,question1.ask());
          
       Question.showResults();

   }
}