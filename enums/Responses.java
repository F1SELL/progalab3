package enums;

public enum Responses{
	YES("Да"),
	NO("Нет"),
	DONTKNOW("Я лучок-пучок");
	private String description;

	Responses(String describe){
		this.description = describe;
	}
	
	public String getResponse(){
		return this.description;
	}

}