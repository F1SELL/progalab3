package interfaces;
import persons.*;
import enums.*;


public interface Attack{
	public String askQuestion();
	public String askQuestion(Defendant def, Questions question);
	public void showAnswers(Writer writer);
}