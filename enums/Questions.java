package enums;

public enum Questions{
	Q1(" ты готов?"),
	Q2(" ты украл все деньги из казны?"),
	Q3(" ты организовал революцию?"),
	Q4(" это ты в дедлайн не уложился?"),
	Q5(" курсач по дискре написал?"),
	Q6(" ты вчера прокрался в мои царские ложи?");
	private String description;

	Questions(String describe){
		this.description = describe;
	}
	
	public String getQuestion(){
		return this.description;
	}

}