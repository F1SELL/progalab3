package persons;

import java.util.ArrayList; 
import java.util.LinkedList; 
import java.util.List;

import enums.*;
import interfaces.*;

public class Writer extends Person implements Writing {
    private List<String> answersList; 
    private Dossier dossier;
    

    public Writer() {
        super("Безымянный");
        this.answersList = new ArrayList<>(); 
        this.dossier = new Dossier("Забыл имя", answersList); 
        this.items = new LinkedList<>();
        //this.items.add(Items.HANKY);
        System.out.println("Безымянный создан.");
    }

    public Writer(String name) {
        super(name);
        this.answersList = new ArrayList<>(); 
        this.dossier = new Dossier(name, answersList); 
        this.items = new LinkedList<>();
        //this.items.add(Items.HANKY);
        System.out.println(name + " создан.");
    }

    public Writer(String name, Defendant pers) {
        super(name);
        this.answersList = new ArrayList<>();
        this.dossier = new Dossier(pers.toString(), answersList);
        this.items = new LinkedList<>();
        //this.items.add(Items.HANKY);
        System.out.println(name + " создан.");
    }

    @Override
    public void writeline(String question, String answer) {
        List<String> newAnswers = new ArrayList<>(this.dossier.answers());
        if (this.dossier.answers().size() == 0){
        	System.out.println(this.name + " принялся записывать ответы допрашиваемого "+ this.dossier.name());
        }
        newAnswers.add(question + " " + answer);
        this.dossier = new Dossier(this.dossier.name(), newAnswers);}

    @Override
    public void show() {
        System.out.println("Досье на " + this.dossier.name());
        for (int i = 1; i < this.dossier.answers().size(); i++) {
            System.out.println((i) + ". " + this.dossier.answers().get(i)); 
        }
    }
    @Override
    public void doSomething(){
    	if(this.items.contains(Items.HANKY)){
    		System.out.println(this.name + " высморкался в свой " + Items.HANKY.Type());
    	}
    	else{
    		System.out.println(this.name + " высморкался в свой рукав");
    	}
    }
	
	public void setItems(Items... items){
		//this.items = new LinkedList<Items>();
		for(Items item: items){
			this.items.add(item);
		}
	}

	public void addItem(Items item){
		this.items.add(item);
	}
}
