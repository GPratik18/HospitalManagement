package HospitalInfrastructure;


import java.util.ArrayList;
import java.util.LinkedList;
import hospitalVisit.*;

public class Hospital {
	private int currentDoctorId=1000, currentPatientId=2000;
	private LinkedList<Doctor> doctors = new LinkedList<Doctor>();
	private LinkedList<Patient> patients = new LinkedList<Patient>();
	private ArrayList<Appointment> appointments = new ArrayList<Appointment>();
	
	public int getCurrentDoctorId() {
		return currentDoctorId;
	}
	
	public int getCurrentPatientId() {
		return currentPatientId;
	}
	
	public LinkedList<Doctor> getDoctors() {
		return doctors;
	}
	
	public LinkedList<Patient> getPatients() {
		return patients;
	}
	
	public ArrayList<Appointment> getAppointments() {
		return appointments;
	}
	public Appointment getAppointment(int givenId){
		for(int i=0;i<appointments.size();i++) {
			if(appointments.get(i).getId() ==givenId-1) {
				return appointments.get(i);
			}
		}
		return null;
	}
	public void newDoctor(int id,String name,String dateOfBirth, String speciality, String password) {
		Doctor d=new Doctor();
		d.setId(id);
		d.setName(name);
		d.setDateOfBirth(dateOfBirth);
		d.setSpeciality(speciality);
		d.setPassword(password);
		doctors.add(d);
		currentDoctorId++;
		System.out.println("Applied for doctor's registration ");
		System.out.println("Waiting for management's response ");
		try {
			Thread.sleep(5000);
		} catch (Exception e) {
			System.out.println("Something went wrong");
		}
		System.out.println("Doctor is added successfully");
		System.out.println("Doctors's id is "+(getCurrentDoctorId()-1));
	}
	
	public void newPatient(int id,String name,String dateOfBirth, String password) {
		Patient p= new Patient();
		p.setId(id);
		p.setName(name);
		p.setDateOfBirth(dateOfBirth);
		p.setPassword(password);
		patients.add(p);
		currentPatientId++;
		System.out.println("Patient is added successfully");
		System.out.println("Patient's ID is "+(getCurrentPatientId()-1));
	}
	
	public void newAppointment(String name, String purpose ) {
		Appointment ap =new Appointment(appointments.size(), name, purpose);
		appointments.add(ap);
		System.out.println("Appointment added successfully ");
		System.out.println("Appointment number is "+appointments.size());
	}
	public boolean authenticateDoctor(Integer givenId, String givenPassword) {
		for(int i=0;i<doctors.size();i++) {
			if(doctors.get(i).isEqualTo(givenId, givenPassword)) {
				return true;
			}
		}
		return false;
	}
	public boolean authenticatePatient(Integer givenId, String givenPassword) {
		for(int i=0;i<patients.size();i++) {
			if(patients.get(i).isEqualTo(givenId, givenPassword)) {
				return true;
			}
		}
		return false;
	}
	
}