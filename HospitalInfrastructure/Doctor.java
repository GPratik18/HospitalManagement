package HospitalInfrastructure;

public class Doctor {
	private int id;
	private String name;
	private String dateOfBirth;
	private String speciality;
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
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public String getPassword() {
		return password;
	}
	public String getDateOfBirth() {
		return dateOfBirth;
	}
	public String getName() {
		return name;
	}
	public String getSpeciality() {
		return speciality;
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
		str="  Name: "+this.name+"\n  DOB : "+this.dateOfBirth+"\n  Speciality : "+this.speciality;
		return str;
	}
}
