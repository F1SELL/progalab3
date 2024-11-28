package enums;

public enum Items{
	NOTHING("ничего нет"),
	HANKY("клетчатый платок ");

	private String type;

	Items(String type){
		this.type = type;
	}

	public String Type(){
		return this.type;
	}
}