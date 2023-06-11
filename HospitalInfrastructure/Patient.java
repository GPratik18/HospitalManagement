package HospitalInfrastructure;

public class Patient {
	private int id;
	private String name;
	private String dateOfBirth;
	private String password;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public void setDateOfBirth(String dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPassword() {
		return password;
	}
	
	public boolean isEqualTo(Integer id, String password) {
		if(id==this.id && password.equals(this.password)) {
			return true;
		}
		return false;
	}
	@Override
	public String toString() {
		String str=new String();
		str="  Name: "+this.name+"\n  DOB : "+this.dateOfBirth;
		return str;
	}
}
