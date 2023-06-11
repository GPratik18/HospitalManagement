package UserInterface;

import java.util.ArrayList;
import java.util.Scanner;

public class ConsoleInteraction {
	private int choice;
	Scanner scanner=new Scanner(System.in);
	public void displayMainMenu() {
		System.out.println("===================================================================");
		System.out.println("        Welcome to Jadhav Hospital           ");
		System.out.println("=============================================");
		System.out.println("     1]	DOCTOR REGISTRATION                  ");
		System.out.println("     2]	DOCTOR LOGIN                         ");
		System.out.println("     3]	PATIENT REGISTRATION                 ");
		System.out.println("     4]	PATIENT LOGIN                        ");
		System.out.println("     5]	DOCTORS IN THE HOSPITAL              ");
		System.out.println("=============================================");
	}
	public void displayDoctorsMenu() {
		System.out.println("=============================================");
		System.out.println("     1]	ALL PATIENTS                         ");
		System.out.println("     2]	ALL APPOINTMENTS                     ");
		System.out.println("     3]	LOGOUT                               ");
		System.out.println("=============================================");
	}
	public void displayPatientsMenu() {
		System.out.println("=============================================");
		System.out.println("     1]	BOOK APPOINMENT                      ");
		System.out.println("     2]	MY APPOINTMENTS                      ");
		System.out.println("     3]	LOGOUT                               ");
		System.out.println("=============================================");
	}
	
	public ArrayList<String> LoginForm() {
		ArrayList<String> formData=new ArrayList<String>();
		Scanner s=new Scanner(System.in);
		System.out.println("=============================================");
		System.out.println("     ENTER ID :");
		formData.add(scanner.next());
		System.out.println("     ENTER PASSWORD :");
		formData.add(scanner.next());
		System.out.println("=============================================");
		return formData;
	}
	
	
	public ArrayList<String> doctorRegistrationForm() {
		ArrayList<String> formData=new ArrayList<String>();
		System.out.println("=============================================");
		System.out.println("     ENTER NAME :");
		formData.add(scanner.next());
		System.out.println("     ENTER DOB [DDMMYYYY] :");
		formData.add(scanner.next());
		System.out.println("     SPECIALITY :");
		formData.add(scanner.next());
		System.out.println("     NEW PASSWORD :");
		formData.add(scanner.next());
		System.out.println("     RE-ENTER NEW PASSWORD :");
		formData.add(scanner.next());
		System.out.println("=============================================");
		return formData;
	}
	
	public ArrayList<String> patientRegistrationForm() {
		ArrayList<String> formData=new ArrayList<String>();
		System.out.println("=============================================");
		System.out.println("     ENTER NAME :");
		formData.add(scanner.next());
		System.out.println("     ENTER DOB [DDMMYYYY] :");
		formData.add(scanner.next());
		System.out.println("     NEW PASSWORD :");
		formData.add(scanner.next());
		System.out.println("     RE-ENTER NEW PASSWORD :");
		formData.add(scanner.next());
		System.out.println("=============================================");
		return formData;
	}
	public String[] appointmentForm() {
		String[] formData=new String[2];
		System.out.println("=============================================");
		System.out.println("     ENTER NAME :");
		formData[0]=scanner.next();
		System.out.println("     ENTER PURPOSE :");
		formData[1]=scanner.next();
		System.out.println("=============================================");
		return formData;
	}
	public int getChoice() {
		return choice;
	}
	
	public void showError() {
		System.out.println("Login error");
	}
	public void getChoiceInput(){
		System.out.println("Enter your choice here : ");
		choice= scanner.nextInt();
	}
	public int getApIdInput() {
		System.out.println("Enter appointments id :");
		return scanner.nextInt();
	}
}