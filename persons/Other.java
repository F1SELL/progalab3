package persons;
import java.util.LinkedList;
import java.util.Random;

import enums.*;
import interfaces.*;

public class Other extends Person{

	public Other(){
		super("Безымянный");
		this.items = new LinkedList<>();
		this.items.add(Items.NOTHING);
		System.out.println("Безымянный создан.");
	}
	public Other(String name){
		super(name);
		this.items = new LinkedList<>();
		this.items.add(Items.NOTHING);
		System.out.println(name + " создан.");
	}

	@Override
	public void doSomething(){
		System.out.println(this.name + " хитро улыбается.");
	}

	public void doSomething(Ruler ruler){
		System.out.println(this.name + Actions.SIT.getDescription() + ruler.toString() + ", чтобы"+ Actions.SUGGEST.getDescription() + ", как" + Actions.INTERROGATING.getDescription());
	}
}