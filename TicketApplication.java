package trainProject;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;



public class TicketApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====ticket application===");
		DateTimeFormatter pattern=DateTimeFormatter.ofPattern("YYYY/MM/DD");
		
		TrainDao trainDao=new TrainDao();
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the train id");
		int trainNo=scanner.nextInt();
		
		System.out.println("enter the travel date");
		String travelDate=scanner.next();
		
		Train train=trainDao.findTrain(trainNo);
		if( train!=null)
			System.out.println("trainname is "+train.getTrainName()+"train priceis "+train.getTicketPrice());
			
		else
			System.out.println("train not found");
		
		
		LocalDate date=LocalDate.parse(travelDate,pattern);		
		//System.out.println("travel date "+ date);
		//System.out.println("travel date"+date.format(pattern));
		
		Ticket ticket=new Ticket(date,train);
		
		
		System.out.println("enter number of passenger");
		int noofPassenger=scanner.nextInt();
		for(int i=0;i<noofPassenger;i++)
		{
		System.out.println("Passenger name :");
		String name=scanner.nextLine();
		
		System.out.println("Passenger age :");
		int age=scanner.nextInt();
		
		System.out.println("passenger gender :");
		char gender=scanner.next().charAt(0);
		
		ticket.addPassenger(name, age, gender);//new Passenger
		}
		
		System.out.println("PNR : "+ticket.generatePNR());
		System.out.println("Train no : "+train.getTrainNo());
		System.out.println("Train name : "+train.getTrainName());
		System.out.println("From: "+train.getSource());
		System.out.println("To : "+train.getDestination());	
		System.out.println("Travel date : "+travelDate);
		System.out.println();
		

	}

}
