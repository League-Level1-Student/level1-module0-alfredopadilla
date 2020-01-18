class Platypus {
	private String name;
	//private String PlatypusName;
	
	
	public void sayHi() {
		System.out.println("The platypus " + name + " is smarter than your average platypus.");

	}

	public class IntroductiontoConstructors {
	}



	public Platypus(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPlatypusName() {
		return name;
	}

}