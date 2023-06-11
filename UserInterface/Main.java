package UserInterface;

import java.util.ArrayList;
import java.util.Iterator;

import javax.crypto.Cipher;

import HospitalInfrastructure.Doctor;
import HospitalInfrastructure.Hospital;
import HospitalInfrastructure.Patient;

public class Main {
	private boolean isOver=false;
	Hospital hospital = new Hospital();
	Doctor currentDoctor;
	Patient currentPatient;
	
	static {
		System.out.println("Please enter everything without using spaces");
		System.out.println("You can use _ instead");
	}
	public static void main(String[] args) {
		ConsoleInteraction ci=new ConsoleInteraction();
		Main main1=new Main();
		while(true) {
			ci.displayMainMenu();
			ci.getChoiceInput();		
			main1.mainMenuChoice(ci);
		}
	}
	
	protected void mainMenuChoice(ConsoleInteraction ci) {
		ArrayList  a;
		switch(ci.getChoice()) {
		case 1:
			a=ci.doctorRegistrationForm();
			if(!a.get(3).toString().equals(a.get(4).toString())) {
				System.out.println("Password and confirm password are not matching ");
				break;
			}
			hospital.newDoctor(hospital.getCurrentDoctorId(), a.get(0).toString(), a.get(1).toString(), a.get(2).toString(), a.get(3).toString());
			break;
			
		case 2:
			a= ci.LoginForm();
			if(hospital.authenticateDoctor(Integer.valueOf(a.get(0).toString()), a.get(1).toString())) {
				
				System.out.println("Login successful");
				doctorsLoginSession(ci);
			}
			else {
				ci.showError();
			}
			break;
		
		case 3:
			a=ci.patientRegistrationForm();
			if(!a.get(2).toString().equals(a.get(3).toString())) {
				System.out.println("Password and confirm password are not matching ");
				break;
			}
			hospital.newPatient(hospital.getCurrentPatientId(), a.get(0).toString(), a.get(1).toString(), a.get(2).toString());
			break;
			
		case 4:
			a=ci.LoginForm();
			if(hospital.authenticatePatient(Integer.valueOf(a.get(0).toString()), a.get(1).toString())) {
				System.out.println("Login successful");
				patientsLoginSession(ci);
			}
			else {
				ci.showError();
			}
			break;
		
		case 5:
			this.displayDoctors();
			break;
			
		default:
			System.out.println("Please enter valid choice ");
		}
	}
	
	private void displayDoctors() {
		Iterator itr= hospital.getDoctors().iterator();
		while(itr.hasNext()) {
			System.out.println("=====================================================");
			System.out.println(itr.next());
			System.out.println("======================================================");
		}
	}
	
	private void displayPatients() {
		Iterator itr= hospital.getPatients().iterator();
		while(itr.hasNext()) {
			System.out.println("=====================================================");
			System.out.println(itr.next());
			System.out.println("======================================================");
		}
	}
	private void displayAppointments() {
		Iterator itr= hospital.getAppointments().iterator();
		while(itr.hasNext()) {
			System.out.println("=====================================================");
			System.out.println(itr.next());
			System.out.println("======================================================");
		}
	}
	private void displayAppointment(int id) {
		System.out.println("=====================================================");
		if( hospital.getAppointment(id)==null) {
			System.out.println("No such appointment");
		}
		else {
			System.out.println(hospital.getAppointment(id));
		}
		System.out.println("=====================================================");
	}
	public void doctorsLoginSession(ConsoleInteraction ci) {
		boolean sessionOn=true;
		while(sessionOn==true) {
			ci.displayDoctorsMenu();
			ci.getChoiceInput();
			switch (ci.getChoice()) {
			case 1:
				displayPatients();
				break;
			case 2:
				displayAppointments();
				break;
				
			case 3:
				sessionOn=false;
				break;
				
			default:
				System.out.println("Please enter valid choice ");
			}
		}
	}
	
	public void patientsLoginSession(ConsoleInteraction ci) {
		boolean sessionOn=true;
		String [] arr;
		while(sessionOn==true) {
			ci.displayPatientsMenu();
			ci.getChoiceInput();
			switch (ci.getChoice()) {
			case 1:
				arr=ci.appointmentForm();
				hospital.newAppointment(arr[0], arr[1]);
				break;
			
			case 2:
				displayAppointment(ci.getApIdInput());
				break;
				
			case 3:
				sessionOn=false;
				break;
				
			default:
				System.out.println("Please enter valid choice ");
			}
		}
	}
}