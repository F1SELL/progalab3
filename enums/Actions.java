package enums;

public enum Actions{
	ORDER(" велел "),
	BRING("привести "),
	INTERROGATE("учинить допрос "),
	SIT(" уселся рядом с "),
	SUGGEST(" подсказывать"),
	INTERROGATING(" вести допрос ");
	private String description;

	Actions(String description){
		this.description = description;
	}

	public String getDescription(){
		return this.description;
	}
}//BlowNose, Sit, Write, Suggest,  Interrogate