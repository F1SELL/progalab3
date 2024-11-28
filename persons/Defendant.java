package persons;
import java.util.LinkedList;
import java.util.Random;
import enums.*;
import interfaces.*;

public class Defendant extends Person implements Defence{
	public Defendant(){
		super("Безымянный");
		this.items = new LinkedList();
		this.items.add(Items.NOTHING);
		System.out.println("Безымянный создан.");
	}

	public Defendant(String name){
		super(name);
		this.items = new LinkedList();
		this.items.add(Items.NOTHING);
		System.out.println(this.toString() + " создан.");
	}

	@Override
	public void doSomething(){
		System.out.println(this.name + " тяжело вздыхает.");
	}

	@Override
	public final String giveResponse(){
		System.out.println(this.name + " не услышал вопрос.");
		return "Не услышал вопрос";
	}

	@Override
	public final String giveResponse(Ruler ruler){
		Random random = new Random();
		String answer = Responses.values()[random.nextInt(Responses.values().length)].getResponse();
		System.out.println(this.name +": " + answer + ", "+ ruler.toString());
		return answer;
	}
}