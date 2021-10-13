package Assignment;

public enum Size {
	S("Small"), M("Medium"), L("Large"), XL("Extra-Large");


	//instance variable
	private String size;

	//constructor
	Size(String size){
		this.size = size;
	}

	//method
	public String getSize(){
		return size;
	}


}
