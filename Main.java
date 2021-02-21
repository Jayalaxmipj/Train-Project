package trainProject;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		Train train=new Train();
		
		System.out.println("enter source");
		train.setSource(scan.nextLine());
		System.out.println("enter destination");
		train.setDestination(scan.nextLine());
		System.out.println("enter train name");
		train.setTrainName(scan.nextLine());
		System.out.println("enter train number");
		train.setTrainNo(scan.nextInt());
		System.out.println("enter travel date");
		train.setTravelDate(scan.nextInt());
		
		Passenger pass=new Passenger();
		System.out.println("enter name");
		pass.setName(scan.nextLine());
		System.out.println("enter age\n");
		pass.setAge(scan.nextInt());
		System.out.println("enter gender");
		//pass.setGender(scan.next());
		
		
		System.out.println("source: "+train.getSource());
		System.out.println("destination: "+train.getDestination());
		System.out.println("train name: "+train.getTrainName());
		System.out.println("train number: "+train.getTrainNo());
		System.out.println("name: "+pass.getName());
		System.out.println("age: "+pass.getAge());
		System.out.println(" gender: "+pass.getGender());
		System.out.println("travel date: "+train.getTravelDate());
		
		
	}

}

