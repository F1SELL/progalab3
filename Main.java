import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

import persons.*;
import enums.*;
import interfaces.*;

public class Main{
	public static void main(String[] args){
		Ruler ruler = new Ruler("Правитель");
		Defendant onion = new Defendant("Лук Порей");
		Writer senior = new Writer("Синьор Петрушка", onion);
		Other tomato = new Other("кавалер Помидор");
		ArrayList<Questions> questions = new ArrayList<>(Arrays.asList(Questions.Q1));
		Questions question;

		for(int i=0; i<3; i++){
			Random random = new Random();
			question = Questions.values()[random.nextInt(Questions.values().length)];
			while (questions.contains(question)){
				question = Questions.values()[random.nextInt(Questions.values().length)];
			}
			questions.add(question);
		}

		senior.addItem(Items.HANKY);
		System.out.println("");
		ruler.doSomething(Actions.ORDER, Actions.BRING, onion);
		ruler.doSomething(Actions.ORDER, Actions.INTERROGATE, onion);
		
		senior.doSomething();
		ruler.doSomething();
		senior.writeline(ruler.askQuestion(onion, questions.get(0)), onion.giveResponse(ruler));
		onion.doSomething();
		System.out.println("");
		tomato.doSomething(ruler);
		for(int i=1; i<(questions.size()); i++){
			senior.writeline(ruler.askQuestion(onion, questions.get(i)), onion.giveResponse(ruler));
		}

		System.out.println("");
		ruler.showAnswers(senior);

	}
}