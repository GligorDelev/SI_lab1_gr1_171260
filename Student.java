class Student {
	String index;
	String firstName;
	String lastName;
	int labPoints[];

	//TODO constructor
	public Student(){
		
	}
	//TODO seters & getters
	public void setIndex(String index){this.index=index;}
	public void setFirstName(String firstName){this.firstName=firstName;}
	public void setLastName(String lastName){this.lastName=lastName;}
	public String getIndex(){return index;}
	public String getFirstName(){return firstName;}
	public String getLastName(){return lastName;}
	public void setLabPoints(int [] labPoints){this.labPoints=labPoints;}
	public int [] getLabPoints(){return labPoints;}

	public double getAverage() {
		//TODO
		int sum=0;
		foreach(int ocena:labPoints){
			sum+=ocena;	
		}
		return sum/labPoints.length;
	}

	public boolean hasSignature() {
		//TODO
		return labPoints.length>8;
	}
}
