import java.util.Scanner;

public class session2assignment4{

	public static void main(String[] args){
	
		int months;
		Scanner month=new Scanner(System.in);
		System.out.print("Enter Month number\n");
		months=month.nextInt();
		
		  if(months==1 || months==3 || months==5 || months==7 || months==8 || months==10 || months==12){
		        System.out.println("this month have 31 days");
		    }

		    else if(months==4 || months==6 || months==9 || months==11){
		    	 System.out.println("this month has 30 days");
		    }

		    else if(months==2){
		    	 System.out.println("this month has 28 or 29 days");
		    }

		    else{
		    	 System.out.println("Invalid input! Please enter any  month between (1-12).\n");
		    }

		 

		} 