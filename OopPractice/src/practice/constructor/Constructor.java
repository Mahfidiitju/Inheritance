package practice.constructor;

public class Constructor {
	public int roll;
	public String name,course;
	public Constructor()
	{
		
	}
	
	public Constructor(int roll,String name,String course)
	{
		this.roll=roll;
		this.name=name;
		this.course=course;
	}

	@Override
	public String toString() {
		return "Constructor [roll=" + roll + ", name=" + name + ", course=" + course + "]";
	}
	private String personalInfo;
	private String personalRoll;
	private int secretkey;
	
	
	public String getPersonalInfo() {
		return personalInfo;
	}

	public void setPersonalInfo(String personalInfo) {
		this.personalInfo = personalInfo;
	}

	public String getPersonalRoll() {
		return personalRoll;
	}

	public void setPersonalRoll(String personalRoll) {
		this.personalRoll = personalRoll;
	}

	public int getSecretkey() {
		return secretkey;
	}

	public void setSecretkey(int secretkey) {
		this.secretkey = secretkey;
	}
	
	
}
