package hospitalVisit;

public class Appointment {
	private int id;
	private String name;
	private String purpose;
	private boolean checked=false;
	
	public Appointment(int id,String name,String purpose) {
		this.id=id;
		this.name=name;
		this.purpose=purpose;
	}
	
	@Override
	public String toString() {
		String string;
		string="Appointment number : "+(getId()+1)+"\nName : "+getName()+"\nPurpose : "+getPurpose()+"\nChecking Status :"+(isChecked()?"Checked":"Not Checked");
		return string;
	}
	
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getPurpose() {
		return purpose;
	}
	public boolean isChecked() {
		return checked;
	}
}
