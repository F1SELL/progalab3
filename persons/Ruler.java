package persons;
import java.util.LinkedList;
import java.util.Random;

import enums.*;
import interfaces.*;

public class Ruler extends Person implements Attack{
	//private LinkedList<Items> items;
	public Ruler(){
		super("Безымянный");
		this.items = new LinkedList();
		this.items.add(Items.NOTHING);
		System.out.println("Безымянный создан.");
	}

	public Ruler(String name){
		super(name);
		this.items = new LinkedList();
		this.items.add(Items.NOTHING);
		System.out.println(this.toString() + " создан.");
	}

	@Override
	public void doSomething(){
		System.out.println(this.name + " хитро улыбается.");
	}

	
	public void doSomething(Actions action, Person character){
		System.out.println(this.name + action.getDescription() + character.toString());
	}

	public void doSomething(Actions mainaction, Actions dopaction, Person character){
		System.out.println(this.name + mainaction.getDescription() + dopaction.getDescription() + character.toString());
	}

	@Override
	public final String askQuestion(){
		System.out.println(this.name + ": Ты понял?");
		return "Ты понял?";
	}

	@Override
	public final String askQuestion(Defendant def, Questions question){
		String quest = question.getQuestion();
		System.out.println(this.name +": " + def.toString()+  quest);
		return quest;
	}

	@Override
	public final void showAnswers(Writer writer){
		System.out.println(this.name + ": " + writer.toString() + ", покажи, что записал!");
		writer.show();
	}
}