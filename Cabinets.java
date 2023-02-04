
import java.util.*;
import java.util.InputMismatchException;
import java.util.Scanner;

class Cabinets
 {     

  	private String Platename;
  	private double Price;
  	private String Speciality;
  	private String Suitable;

  public Cabinets(String Platename, double Price, String Speciality, String Suitable) 
  {
    this.Platename = Platename;
    this.Price = Price;
    this.Speciality = Speciality;
    this.Suitable = Suitable;
  }
  
  
  public String getPlatename() {
	return Platename;
}


public void setPlatename(String platename) {
	this.Platename = platename;
}


public double getPrice() {
	return Price;
}


public void setPrice(double price) {
	this.Price = price;
}


public String getSpeciality() {
	return Speciality;
}


public void setSpeciality(String speciality) {
	this.Speciality = speciality;
}


public String getSuitable() {
	return Suitable;
}


public void setSuitable(String suitable) {
	this.Suitable = suitable;
}


public void printDetails() 
{
    System.out.println("Platename: " +Platename);
    System.out.println("Price: " +Price + " Rupees");
    System.out.println("Speciality: " +Speciality);
    System.out.println("Suitable for:" +Suitable);
  }
  
}

class Mumbai extends Cabinets
 {
	
	//public double dish;
  	public Mumbai(String Platename, int Price, String Speciality, String Suitable) 
{
   	super(Platename,Price,Speciality,Suitable);
    //	this.dish = dish;
  }

  public void mumbaiDetails() 
{
    printDetails();
   // System.out.println("dish: " + dish );
  }

}

class feedback
{
	public static void feedback()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please gives us feedback");
			System.out.println("Enter your Name:  ");
			String sc1=sc.nextLine();
		
				
			
		
		
		
		System.out.println("Enter your phone no. :");
		long sc2=sc.nextLong();
		if(sc2 <= 9 && sc2 >10)
		{
			System.out.println("Please Enter 10 digit no.");
		}
		System.out.println("Do you like the food?: ");
		System.out.println("Enter 1 for YES:");
		System.out.println("Enter 2 for NO:");
		Scanner sc6 = new Scanner(System.in);
	    int f1 = sc.nextInt();
		switch(f1) 
		{
		case 1: 
			System.out.println("Thank you so much for your valuable feedback");
			break;
		case 2: 
			System.out.println("Sorry for inconvience, Please visit again");
			break;

		default:
			System.out.println("Invalid");
		}
          //return;
		
		}
	}


abstract class Registeration
{
	abstract void Register();
	{
		
		
		
	}
} 

class Registered extends Registeration
{
		public void Register()
		{
			Scanner nm = new Scanner(System.in);
			System.out.println("Enter your Details to continue your Registeration: ");
			System.out.println("Enter your Name: ");
			Scanner nm2 = new Scanner(System.in);
			System.out.println("Enter your Email: ");
			String dg = nm2.nextLine();
			String de = nm.nextLine();
			System.out.println("Enter your Phone no: ");
			Long df = nm.nextLong();
			if(df < 10 && df >10)
			{
				System.out.println("Enter 10 digit phone number");
			}
			else
			{	
			System.out.println("Registeration Successful, Thank you, you can Proceed Further ");
			}
			//System.out.println("Enter Valid Email");
			
		}
}

class payment
{
	public static void payment()
	{
		feedback f8=new feedback();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 1 for Order confirming  ");
		System.out.println("Enter 2 for Order Cancelling");
		int d = sc.nextInt();
		switch (d)
		{
		case 1:
			System.out.println("Select Your payment option:");
			System.out.println("select 1 for online:");
			System.out.println("select 2 for offline:");
			int e = sc.nextInt();
			switch (e)
			{
			case 1:
				System.out.println("select 1 for GPay:");
				System.out.println("select 2 for netbanking :");
				int f = sc.nextInt();
				switch (f)
				{
				case 1:
					System.out.println("Enter your Phone no:");
					Scanner sc1 = new Scanner(System.in);
					long gp = sc1.nextLong();
					
					
					System.out.println("Thank You for Placing Order!");
					System.out.println("Visit Again!!!!!");
				    f8.feedback();
					//}
					break;
				case 2:
					System.out.println("Enter your card number:");
					//System.out.println("Thank You for Placing Order!");
					Scanner sc2 = new Scanner(System.in);
					String gp1 = sc2.nextLine();
					System.out.println("Thank you for Placing order!");
					f8.feedback();
					break;
				default:
					System.out.println("invalid input");
				
				}
			
				return;
			case 2:
				System.out.println("Thank you for paying in cash!");
				f8.feedback();
				break;
				default:
					System.out.println("invalid input");
				
			}
			return;
		
		
		case 2:
			System.out.println("Sorry for inconvinence, Please visit again!");
			
			
		
				
			
				
				
				
		}

		}
	

	}

class Pune extends Cabinets
 {       
	
      public String dishStyle;

      public Pune(String Platename, int Price, String Speciality, String Suitable)
	 {
        super(Platename,Price,Speciality,Suitable);  
       // this.dishStyle = dishStyle;       
     }

      public void puneDetails()
      {  
        printDetails();         
       // System.out.println("Dish Style: " + dishStyle);
      } 
  
}

class Bangalore extends Cabinets
{       
	
     //public String dishStyle;

     public Bangalore(String Platename, int Price, String Speciality, String Suitable)
	 {
       super(Platename,Price,Speciality,Suitable);  
       //this.dishStyle = dishStyle;       
    	 }

     public void bangaloreDetails() 
     {  
       printDetails();         
      // System.out.println("Dish Style: " + dishStyle);
     }
 
} 
class Hyderabad extends Cabinets
{

    public Hyderabad(String Platename, int Price, String Speciality, String Suitable)
	 {
      super(Platename,Price,Speciality,Suitable);  
      //this.dishStyle = dishStyle;       
   	 }

    public void hyderabadDetails() 
    {  
      printDetails();         
     // System.out.println("Dish Style: " + dishStyle);
    }

}

class Delhi extends Cabinets
{

    public Delhi(String Platename, int Price, String Speciality, String Suitable)
	 {
      super(Platename,Price,Speciality,Suitable);  
      //this.dishStyle = dishStyle;       
   	 }

    public void delhiDetails() 
    {  
      printDetails();         
     // System.out.println("Dish Style: " + dishStyle);
    }

}

class Chennai extends Cabinets
{

    public Chennai(String Platename, int Price, String Speciality, String Suitable)
	 {
      super(Platename,Price,Speciality,Suitable);  
      //this.dishStyle = dishStyle;       
   	 }

    public void chennaiDetails() 
    {  
      printDetails();         
     // System.out.println("Dish Style: " + dishStyle);
    }

}

class Kolkata extends Cabinets
{

    public Kolkata(String Platename, int Price, String Speciality, String Suitable)
	 {
      super(Platename,Price,Speciality,Suitable);  
      //this.dishStyle = dishStyle;       
   	 }

    public void kolkataDetails() 
    {  
      printDetails();         
     // System.out.println("Dish Style: " + dishStyle);
    }

}

class Rajkot extends Cabinets
{

    public Rajkot(String Platename, int Price, String Speciality, String Suitable)
	 {
      super(Platename,Price,Speciality,Suitable);  
      //this.dishStyle = dishStyle;       
   	 }

    public void rajkotDetails() 
    {  
      printDetails();         
     // System.out.println("Dish Style: " + dishStyle);
    }

}

class Jodhpur extends Cabinets
{

    public Jodhpur(String Platename, int Price, String Speciality, String Suitable)
	 {
      super(Platename,Price,Speciality,Suitable);  
      //this.dishStyle = dishStyle;       
   	 }

    public void jodhpurDetails() 
    {  
      printDetails();         
     // System.out.println("Dish Style: " + dishStyle);
    }

}

class Veg extends Mumbai 
{

      public Veg(String Platename, int Price, String Speciality, String Suitable) 
	{
        super(Platename,Price,Speciality,Suitable);
    
      }

      public void VegDetails() 
	{
        VegDetails();
        
       } 
  
}

class Nonveg extends Mumbai
 {

  public Nonveg(String Platename, int Price, String Speciality, String Suitable) 
 {
    super(Platename,Price,Speciality,Suitable);
       
  }
  
  public void nonvegDetails()
 {

    nonvegDetails();
    
  }
}



class Chinese extends Mumbai
{

 public Chinese(String Platename, int Price, String Speciality, String Suitable) 
{
   super(Platename,Price,Speciality,Suitable);
      
 }
 
 public void chineseDetails()
{

   chineseDetails();
  }
}



class Italian extends Mumbai
{

 public Italian(String Platename, int Price, String Speciality, String Suitable) 
{
   super(Platename,Price,Speciality,Suitable);
      
 }
 
 public void italianDetails()
{

   italianDetails();
   
 }
}

class Korean extends Mumbai
{

 public Korean(String Platename, int Price, String Speciality, String Suitable) 
{
   super(Platename,Price,Speciality,Suitable);
      
 }
 
 public void koreanDetails()
{

   koreanDetails();
  }
}

class German extends Mumbai
{

 public German(String Platename, int Price, String Speciality, String Suitable) 
{
   super(Platename,Price,Speciality,Suitable);
      
 }
 
 public void germanDetails()
{

   germanDetails();
  }
}


class Carribean extends Mumbai
{

 public Carribean(String Platename, int Price, String Speciality, String Suitable) 
{
   super(Platename,Price,Speciality,Suitable);
      
 }
 
 public void carribeanDetails()
{

   carribeanDetails();
  }
}


class Japanese extends Mumbai
{

 public Japanese(String Platename, int Price, String Speciality, String Suitable) 
{
   super(Platename,Price,Speciality,Suitable);
      
 }
 
 public void japaneseDetails()
{

   japaneseDetails();
  }
}


class Arabic extends Mumbai
{

 public Arabic(String Platename, int Price, String Speciality, String Suitable) 
{
   super(Platename,Price,Speciality,Suitable);
      
 }
 
 public void arabicDetails()
{

   arabicDetails();
  }
}


class Project
 {  
	
	static
	{
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("| WELCOME TO CABINETS INDIA   |");
		System.out.println(" ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	} 
	
 

  public static void main(String[] args) 
	{
	  //register();
	  Registered py = new Registered();
	  feedback f8 = new feedback();
	  payment p=new payment();
	  py.Register();
	  //Scanner sc = new Scanner(System.in);
	  System.out.println("Please Select the Place you would love to dine:");
	 	Scanner sc = new Scanner(System.in);
		System.out.println("Press 1 for Mumbai:");
		System.out.println("Press 2 for Pune:");
		System.out.println("Press 3 for Bangalore:");
		System.out.println("Press 4 for Hyderabad:");
		System.out.println("Press 5 for Delhi:");
		System.out.println("Enter 6 for Chennai:");
		System.out.println("Enter 7 for Kolkata:");
		System.out.println("Enter 8 for Rajkot:");
		System.out.println("Enter 9 for Surat:");
		int a= sc.nextInt();
		switch(a)
	 {
		case 1://Mumbai
		System.out.println("Thankyou for choosing Mumbai");
		System.out.println("Select the option from below categories");
		System.out.println("1. Veg Cuisine");
		System.out.println("2. NonVeg Cuisine");
		System.out.println("3. Chinese Cuisine");
		System.out.println("4. Italian Cuisine");
		System.out.println("5. Korean Cuisine");
		System.out.println("6. German Cuisine");
		System.out.println("7. Carribean Cuisine");
		System.out.println("8. Japanese Cuisine");
		System.out.println("9. Arabic Cuisine");
		System.out.println("****************");
		int b = sc.nextInt();
		switch (b)
		{
		case 1://Veg
			System.out.println("Select the Dish");
			System.out.println("1. Tawa Pulav");
			System.out.println("2. PavBhaji");
			System.out.println("3. Chole Bhatore");
			System.out.println("4. Shahi Paneer");
			System.out.println("5. Soyabean");
			System.out.println("6. Puranpoli");
			System.out.println("7. Veg Kofta Roti");
			System.out.println("8. Veg Korma Rice");
			System.out.println("9. Veg Biryani");
			
		    System.out.println("****************");
            int c = sc.nextInt();
             switch (c) 
             {
			case 1://case dish
				
				Mumbai Veg = new Mumbai("Tawa Pulav", 210, "Basmati Rice","2 Peoples");
				Veg.mumbaiDetails();
			   System.out.println(Veg.getPlatename());
			   Veg.setPlatename("Veg Biryani");
			   System.out.println(Veg.getPlatename());
				//System.out.println("Enter 1 for Order confirming  ");
				
				p.payment();
				
				
						
					
						
				break;
			case 2:
				Mumbai Veg1 = new Mumbai("PavBhaji", 210, "Basmati Rice","3 Peoples");
				Veg1.mumbaiDetails();
				p.payment();
				break;
			case 3:
				Mumbai Veg2 = new Mumbai("Chole Bhatore", 210, "Basmati Rice","2 Peoples");
				Veg2.mumbaiDetails();
				p.payment();
				break;
			case 4:
				Mumbai Veg3 = new Mumbai("Shahi Paneer", 210, "Basmati Rice","3 Peoples");
				Veg3.mumbaiDetails();
				p.payment();
				break;	
			case 5: 
				Mumbai Veg4 = new Mumbai("Soyabean", 410, "Soyabean", " 4 peoples");
				Veg4.mumbaiDetails();
				p.payment();
				break;
			case 6: 
				Mumbai Veg5 = new Mumbai("Puranpoli", 410, "Soyabean", " 4 peoples");
				Veg5.mumbaiDetails();
				p.payment();
				break;
			case 7: 
				Mumbai Veg6 = new Mumbai("Veg Kofta Roti", 410, "Soyabean", " 4 peoples");
				Veg6.mumbaiDetails();
				p.payment();
				break;
			case 8: 
				Mumbai Veg7 = new Mumbai("Veg Korma Rice", 410, "Soyabean", " 4 peoples");
				Veg7.mumbaiDetails();
				p.payment();
				break;
			case 9: 
				Mumbai Veg8 = new Mumbai("Veg Biryani", 410, "Soyabean", " 4 peoples");
				Veg8.mumbaiDetails();
				p.payment();
				break;	
				default:
					System.out.println("invalid select correct options");
					
             }
             return;
		case 2://Non-veg
			System.out.println("Select the Dish");
			System.out.println("1. Chicken Curry");
			System.out.println("2. Butter Chicken");
			System.out.println("3. Chicken Tikka Masala");
			System.out.println("4. Afgani Chicken");
			System.out.println("5. Fried Chicken Rassa");
			System.out.println("6. Prawn Curry Masala");
			System.out.println("7. Mutton Curry");
			System.out.println("8. Chicken Biryani");
			System.out.println("9. Chicken Shorma");
		    System.out.println("****************");
            int d = sc.nextInt();
             switch (d) 
             {
			case 1:
				
				Mumbai NonVeg = new Mumbai("Chicken Curry", 400, "Chicken","3 Peoples");
				NonVeg.mumbaiDetails();
				p.payment();
				break;
			case 2:
				Mumbai NonVeg1 = new Mumbai("Butter Chicken", 360, "Butter","2 Peoples");
				NonVeg1.mumbaiDetails();
				p.payment();
				break;
			case 3:
				Mumbai NonVeg2 = new Mumbai("Chicken Tikka Masala", 210, "Masala","6 Peoples");
				NonVeg2.mumbaiDetails();
				p.payment();
				break;
			case 4:
				Mumbai NonVeg3 = new Mumbai("Afgani Chicken", 600, "Masala","3 Peoples");
				NonVeg3.mumbaiDetails();
				p.payment();
				break;
			case 5:
				Mumbai NonVeg4 = new Mumbai("Fried Chicken Rassa", 360, "Masala","4 Peoples");
				NonVeg4.mumbaiDetails();
				p.payment();
				break;	
			case 6:
				Mumbai NonVeg5 = new Mumbai("Prawn Curry Masala", 360, "Butter","2 Peoples");
				NonVeg5.mumbaiDetails();
				p.payment();
				break;
			case 7:
				Mumbai NonVeg6 = new Mumbai("Mutton Curry", 210, "Masala","6 Peoples");
				NonVeg6.mumbaiDetails();
				p.payment();
				break;
			case 8:
				Mumbai NonVeg7 = new Mumbai("Chicken Biryani", 600, "Masala","3 Peoples");
				NonVeg7.mumbaiDetails();
				p.payment();
				break;
			case 9:
				Mumbai NonVeg8 = new Mumbai("Chicken Shorma", 360, "Masala","4 Peoples");
				NonVeg8.mumbaiDetails();
				p.payment();
				break;	
			default:
				System.out.println("invalid select correct options");
             }
             return; 
	 
			
		case 3: //Chinese
				System.out.println("Select the Dish");
				System.out.println("1. Chicken Fried Rice");
				System.out.println("2. Chicken Noodles");
				System.out.println("3. Chicken Chilly");
				System.out.println("4. Triple Rice");
				System.out.println("5. Triple Noodles");
				System.out.println("6. Chicken 65");
				System.out.println("7. Tandoori Chicken");
				System.out.println("8. Chicken Soup");
				System.out.println("9. Crispy Chicken");
			    System.out.println("****************");
	            int e = sc.nextInt();
	             switch (e) 
	             {
				case 1:
					Mumbai Chinese1 = new Mumbai("Chicken Fried Rice", 400, "Chicken","3 Peoples");
					Chinese1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai Chinese2 = new Mumbai("Chicken Noodles", 360, "Butter","2 Peoples");
					Chinese2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Chinese3 = new Mumbai("Chicken Chilly", 210, "Masala","6 Peoples");
					Chinese3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Chinese4 = new Mumbai("Triple Rice", 600, "Masala","3 Peoples");
					Chinese4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai Chinese5 = new Mumbai("Triple Noodles", 360, "Masala","4 Peoples");
					Chinese5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai Chinese6 = new Mumbai("Chicken 65", 360, "Butter","2 Peoples");
					Chinese6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai Chinese7 = new Mumbai("Tandoori Chicken", 210, "Masala","6 Peoples");
					Chinese7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai Chinese8 = new Mumbai("Chicken Soup", 600, "Masala","3 Peoples");
					Chinese8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai Chinese9 = new Mumbai("Crispy Chicken", 360, "Masala","4 Peoples");
					Chinese9.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
			
	             }
	             return;
		case 4: //Itailian
			System.out.println("Select the Dish");
			System.out.println("1. Polento");
			System.out.println("2. Ravioli");
			System.out.println("3. Ribollita");
			System.out.println("4. Italian Pasta");
			System.out.println("5. Arancini");
			System.out.println("6. Risotto Alla Milanse");
			System.out.println("7. Lasagne");
			System.out.println("8. Osso Buco");
			System.out.println("9. Neapolitan Pizza");
			
			
		    System.out.println("****************");
            int f = sc.nextInt();
             switch (f) 
             {
			case 1:
				Mumbai Itailian1 = new Mumbai("Polento", 400, "Chicken","3 Peoples");
				Itailian1.mumbaiDetails();
				p.payment();
				break;
			case 2:
				Mumbai Itailian2 = new Mumbai("Ravioli", 360, "Butter","2 Peoples");
				Itailian2.mumbaiDetails();
				p.payment();
				break;
			case 3:
				Mumbai Itailian3 = new Mumbai("Ribollita", 210, "Masala","6 Peoples");
				Itailian3.mumbaiDetails();
				p.payment();
				break;
			case 4:
				Mumbai Itailian4 = new Mumbai("Italian Pasta", 600, "Masala","3 Peoples");
				Itailian4.mumbaiDetails();
				p.payment();
				break;
			case 5:
				Mumbai Itailian5 = new Mumbai("Arancini", 360, "Masala","4 Peoples");
				Itailian5.mumbaiDetails();
				p.payment();
				break;		
			case 6:
				Mumbai Itailian6 = new Mumbai("Risotto Alla Milanse", 360, "Butter","2 Peoples");
				Itailian6.mumbaiDetails();
				p.payment();
				break;
			case 7:
				Mumbai Itailian7 = new Mumbai("Lasagne", 210, "Masala","6 Peoples");
				Itailian7.mumbaiDetails();
				p.payment();
				break;
			case 8:
				Mumbai Itailian8 = new Mumbai("Osso Buco", 600, "Masala","3 Peoples");
				Itailian8.mumbaiDetails();
				p.payment();
				break;
			case 9:
				Mumbai Itailian9 = new Mumbai("Neapolitan Pizza", 360, "Masala","4 Peoples");
				Itailian9.mumbaiDetails();
				p.payment();
				break;	
			default:
				System.out.println("invalid select correct options");
				
		
             }
             return;
		//}
		case 5: //Korean
			System.out.println("Select the Dish");
			System.out.println("1. Hangover stew  ");
			System.out.println("2. Kimchi ");
			System.out.println("3. Soft Tofu Stew ");
			System.out.println("4. Samgyeopsal ");
			System.out.println("5. Jjajangmyeon ");
			System.out.println("6. Chimaek ");
			System.out.println("7. Instant noodles ");
			System.out.println("8. Kimchi Stew ");
			System.out.println("9. Korean Special Resto");
			
			
		    System.out.println("************************************************");
            int g = sc.nextInt();
             switch (g) 
             {
			case 1:
				Mumbai korean1 = new Mumbai("Hangover stew ", 400, "Chicken","3 Peoples");
				korean1.mumbaiDetails();
				p.payment();
				break;
			case 2:
				Mumbai korean2 = new Mumbai("Kimchi ", 360, "Butter","2 Peoples");
				korean2.mumbaiDetails();
				p.payment();
				break;
			case 3:
				Mumbai korean3 = new Mumbai("Soft Tofu Stew ", 210, "Masala","6 Peoples");
				korean3.mumbaiDetails();
				p.payment();
				break;
			case 4:
				Mumbai korean4 = new Mumbai("Samgyeopsal ", 600, "Masala","3 Peoples");
				korean4.mumbaiDetails();
				p.payment();
				break;
			case 5:
				Mumbai korean5 = new Mumbai("Jjajangmyeon ", 360, "Masala","4 Peoples");
				korean5.mumbaiDetails();
				p.payment();
				break;		
			case 6:
				Mumbai korean6 = new Mumbai("Chimaek ", 360, "Butter","2 Peoples");
				korean6.mumbaiDetails();
				p.payment();
				break;
			case 7:
				Mumbai korean7 = new Mumbai("Instant noodles ", 210, "Masala","6 Peoples");
				korean7.mumbaiDetails();
				p.payment();
				break;
			case 8:
				Mumbai korean8 = new Mumbai("Kimchi Stew ", 600, "Masala","3 Peoples");
				korean8.mumbaiDetails();
				p.payment();
				break;
			case 9:
				Mumbai korean9 = new Mumbai("Korean Special Resto", 360, "Masala","4 Peoples");
				korean9.mumbaiDetails();
				p.payment();
				break;
			default:
				System.out.println("invalid select correct options");
		
             }
             return;
	//	}
		case 6: //German 
		System.out.println("Select the Dish");
		System.out.println("1. Doner Kebab");
		System.out.println("2. Currywurst");
		System.out.println("3. Bratwurst");
		System.out.println("4. Sauerbraten");
		System.out.println("5. Marzipan");
		System.out.println("6. Kohlrouloda");
		System.out.println("7. Stollen");
		System.out.println("8. Spatzle");
		System.out.println("9. German Sandwich");
		
		
	    System.out.println("****************");
        int h = sc.nextInt();
         switch (h) 
         {
		case 1:
			Mumbai german1 = new Mumbai("Doner Kebab", 400, "Chicken","3 Peoples");
			german1.mumbaiDetails();
			p.payment();
			break;
		case 2:
			Mumbai german2 = new Mumbai("Currywurst", 360, "Butter","2 Peoples");
			german2.mumbaiDetails();
			p.payment();
			break;
		case 3:
			Mumbai german3 = new Mumbai("Bratwurst", 210, "Masala","6 Peoples");
			german3.mumbaiDetails();
			p.payment();
			break;
		case 4:
			Mumbai german4 = new Mumbai("Sauerbraten", 600, "Masala","3 Peoples");
			german4.mumbaiDetails();
			p.payment();
			break;
		case 5:
			Mumbai german5 = new Mumbai("Marzipan", 360, "Masala","4 Peoples");
			german5.mumbaiDetails();
			p.payment();
			break;		
		case 6:
			Mumbai german6 = new Mumbai("Kohlrouloda", 360, "Butter","2 Peoples");
			german6.mumbaiDetails();
			p.payment();
			break;
		case 7:
			Mumbai german7 = new Mumbai("Stollen", 210, "Masala","6 Peoples");
			german7.mumbaiDetails();
			p.payment();
			break;
		case 8:
			Mumbai german8 = new Mumbai("Spatzle", 600, "Masala","3 Peoples");
			german8.mumbaiDetails();
			p.payment();
			break;
		case 9:
			Mumbai german9 = new Mumbai("German Sandwich", 360, "Masala","4 Peoples");
			german9.mumbaiDetails();
			p.payment();
			break;	
		default:
			System.out.println("invalid select correct options");
	
         }
         return;
         
         
		case 7: //Carribean 
			System.out.println("Select the Dish");
			System.out.println("1. Flying Fish");
			System.out.println("2. Cou-Cou");
			System.out.println("3. Baiga Choka(Roasted Eggplant)");
			System.out.println("4. Conch Ceviche");
			System.out.println("5. Pineapple Chow");
			System.out.println("6. Gizzada");
			System.out.println("7. Carribean Roasted Bean");
			System.out.println("8. Goat Water");
			System.out.println("9. Mofongo");
			
			
		    System.out.println("****************");
	        int i = sc.nextInt();
	         switch (i) 
	         {
			case 1:
				Mumbai carribean1 = new Mumbai("Flying Fish", 400, "Chicken","3 Peoples");
				carribean1.mumbaiDetails();
				p.payment();
				break;
			case 2:
				Mumbai carribean2 = new Mumbai("Cou-Cou", 360, "Butter","2 Peoples");
				carribean2.mumbaiDetails();
				p.payment();
				break;
			case 3:
				Mumbai carribean3 = new Mumbai("Baiga Choka(Roasted Eggplant)", 210, "Masala","6 Peoples");
				carribean3.mumbaiDetails();
				p.payment();
				break;
			case 4:
				Mumbai carribean4 = new Mumbai("Conch Ceviche", 600, "Masala","3 Peoples");
				carribean4.mumbaiDetails();
				p.payment();
				break;
			case 5:
				Mumbai carribean5 = new Mumbai("Pineapple Chow", 360, "Masala","4 Peoples");
				carribean5.mumbaiDetails();
				p.payment();
				break;		
			case 6:
				Mumbai carribean6 = new Mumbai("Gizzada", 360, "Butter","2 Peoples");
				carribean6.mumbaiDetails();
				p.payment();
				break;
			case 7:
				Mumbai carribean7 = new Mumbai("Carribean Roasted Bean", 210, "Masala","6 Peoples");
				carribean7.mumbaiDetails();
				p.payment();
				break;
			case 8:
				Mumbai carribean8 = new Mumbai("Goat Water", 600, "Masala","3 Peoples");
				carribean8.mumbaiDetails();
				p.payment();
				break;
			case 9:
				Mumbai carribean9 = new Mumbai("Mofongo", 360, "Masala","4 Peoples");
				carribean9.mumbaiDetails();
				p.payment();
				break;	
			default:
				System.out.println("invalid select correct options");
		
	         }
	         return;
	         
		case 8: //Japanese 
			System.out.println("Select the Dish");
			System.out.println("1. Hayashi Rice");
			System.out.println("2. Kamameshi");
			System.out.println("3. Katemeshi");
			System.out.println("4. Mochi");
			System.out.println("5. Mugi Gohan");
			System.out.println("6. Ochazuke");
			System.out.println("7. Okowa");
			System.out.println("8. Omurice");
			System.out.println("9. Onigiri");
			
			
		    System.out.println("****************");
	        int j = sc.nextInt();
	         switch (j) 
	         {
			case 1:
				Mumbai carribean1 = new Mumbai("Hayashi Rice", 400, "Chicken","3 Peoples");
				carribean1.mumbaiDetails();
				p.payment();
				break;
			case 2:
				Mumbai carribean2 = new Mumbai("Kamameshi", 360, "Butter","2 Peoples");
				carribean2.mumbaiDetails();
				p.payment();
				break;
			case 3:
				Mumbai carribean3 = new Mumbai("Katemeshi", 210, "Masala","6 Peoples");
				carribean3.mumbaiDetails();
				p.payment();
				break;
			case 4:
				Mumbai carribean4 = new Mumbai("Mochi", 600, "Masala","3 Peoples");
				carribean4.mumbaiDetails();
				p.payment();
				break;
			case 5:
				Mumbai carribean5 = new Mumbai("Mugi Gohan", 360, "Masala","4 Peoples");
				carribean5.mumbaiDetails();
				p.payment();
				break;		
			case 6:
				Mumbai carribean6 = new Mumbai("Ochazuke", 360, "Butter","2 Peoples");
				carribean6.mumbaiDetails();
				p.payment();
				break;
			case 7:
				Mumbai carribean7 = new Mumbai("Okowa", 210, "Masala","6 Peoples");
				carribean7.mumbaiDetails();
				p.payment();
				break;
			case 8:
				Mumbai carribean8 = new Mumbai(" Omurice", 600, "Masala","3 Peoples");
				carribean8.mumbaiDetails();
				p.payment();
				break;
			case 9:
				Mumbai carribean9 = new Mumbai("Onigiri", 360, "Masala","4 Peoples");
				carribean9.mumbaiDetails();
				p.payment();
				break;	
			default:
				System.out.println("invalid select correct options");
		
	         }
	         return;     
		case 9: //Arabic
			System.out.println("Select the Dish");
			System.out.println("1. Hummus");
			System.out.println("2. Manakeesh");
			System.out.println("3. Grilled halloumi");
			System.out.println("4. Foul meddamas");
			System.out.println("5. Falafel");
			System.out.println("6. Tabouleh");
			System.out.println("7. Moutabal/baba ghanoush");
			System.out.println("8. Fattoush");
			System.out.println("9. Arabic Special");
			
			
		    System.out.println("*********************************");
	        int k = sc.nextInt();
	         switch (k) 
	         {
			case 1:
				Mumbai arabic1 = new Mumbai("Hummus", 400, "Chicken","3 Peoples");
				arabic1.mumbaiDetails();
				p.payment();
				break;
			case 2:
				Mumbai arabic2 = new Mumbai("Manakeesh", 360, "Butter","2 Peoples");
				arabic2.mumbaiDetails();
				p.payment();
				break;
			case 3:
				Mumbai arabic3 = new Mumbai("Grilled halloumi", 210, "Masala","6 Peoples");
				arabic3.mumbaiDetails();
				p.payment();
				break;
			case 4:
				Mumbai arabic4 = new Mumbai("Foul meddamas", 600, "Masala","3 Peoples");
				arabic4.mumbaiDetails();
				p.payment();
				break;
			case 5:
				Mumbai arabic5 = new Mumbai("Falafel", 360, "Masala","4 Peoples");
				arabic5.mumbaiDetails();
				p.payment();
				break;		
			case 6:
				Mumbai arabic6 = new Mumbai("Tabouleh", 360, "Butter","2 Peoples");
				arabic6.mumbaiDetails();
				p.payment();
				break;
			case 7:
				Mumbai arabic7 = new Mumbai("Moutabal/baba ghanoush", 210, "Masala","6 Peoples");
				arabic7.mumbaiDetails();
				p.payment();
				break;
			case 8:
				Mumbai arabic8 = new Mumbai("Fattoush", 600, "Masala","3 Peoples");
				arabic8.mumbaiDetails();
				p.payment();
				break;
			case 9:
				Mumbai arabic9 = new Mumbai("", 360, "Masala","4 Peoples");
				arabic9.mumbaiDetails();
				p.payment();
				break;			
		
	         }
		default:
			System.out.println("invalid select correct options");
	         
	        
	         return;       
		 
	       
	       
	}
		
		
		
		
		case 2://Pune
			System.out.println("Thankyou for choosing Pune");
			System.out.println("Select the option from below categories");
			System.out.println("1. Veg Cuisine");
			System.out.println("2. NonVeg Cuisine");
			System.out.println("3. Chinese Cuisine");
			System.out.println("4. Italian Cuisine");
			System.out.println("5. Korean Cuisine");
			System.out.println("6. German Cuisine");
			System.out.println("7. Carribean Cuisine");
			System.out.println("8. Japanese Cuisine");
			System.out.println("9. Arabic Cuisine");
			System.out.println("****************");
			int b1 = sc.nextInt();
			switch (b1)
			{
			case 1://Veg
				System.out.println("Select the Dish");
				System.out.println("1. Tawa Pulav");
				System.out.println("2. PavBhaji");
				System.out.println("3. Chole Bhatore");
				System.out.println("4. Shahi Paneer");
				System.out.println("5. Soyabean");
				System.out.println("6. Puranpoli");
				System.out.println("7. Veg Kofta Roti");
				System.out.println("8. Veg Korma Rice");
				System.out.println("9. Veg Biryani");
				
			    System.out.println("****************");
	            int c = sc.nextInt();
	             switch (c) 
	             {
				case 1://case dish
					//String Platename, int Price, String Speciality, String Suitable
					Mumbai Veg = new Mumbai("Tawa Pulav", 210, "Basmati Rice","2 Peoples");
					Veg.mumbaiDetails();
				   //System.out.println(Veg.getPlatename());
				   //Veg.setPlatename("Veg Biryani");
				   //System.out.println(Veg.getPlatename());
					//System.out.println("Enter 1 for Order confirming  ");
					
					p.payment();
							
					break;
				case 2:
					Mumbai Veg1 = new Mumbai("PavBhaji", 210, "Basmati Rice","3 Peoples");
					Veg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Veg2 = new Mumbai("Chole Bhatore", 210, "Basmati Rice","2 Peoples");
					Veg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Veg3 = new Mumbai("Shahi Paneer", 210, "Basmati Rice","3 Peoples");
					Veg3.mumbaiDetails();
					p.payment();
					break;	
				case 5: 
					Mumbai Veg4 = new Mumbai("Soyabean", 410, "Soyabean", " 4 peoples");
					Veg4.mumbaiDetails();
					p.payment();
					break;
				case 6: 
					Mumbai Veg5 = new Mumbai("Puranpoli", 410, "Soyabean", " 4 peoples");
					Veg5.mumbaiDetails();
					p.payment();
					break;
				case 7: 
					Mumbai Veg6 = new Mumbai("Veg Kofta Roti", 410, "Soyabean", " 4 peoples");
					Veg6.mumbaiDetails();
					p.payment();
					break;
				case 8: 
					Mumbai Veg7 = new Mumbai("Veg Korma Rice", 410, "Soyabean", " 4 peoples");
					Veg7.mumbaiDetails();
					p.payment();
					break;
				case 9: 
					Mumbai Veg8 = new Mumbai("Veg Biryani", 410, "Soyabean", " 4 peoples");
					Veg8.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
	             }
	             return;
			case 2://Non-veg
				System.out.println("Select the Dish");
				System.out.println("1. Chicken Curry");
				System.out.println("2. Butter Chicken");
				System.out.println("3. Chicken Tikka Masala");
				System.out.println("4. Afgani Chicken");
				System.out.println("5. Fried Chicken Rassa");
				System.out.println("6. Prawn Curry Masala");
				System.out.println("7. Mutton Curry");
				System.out.println("8. Chicken Biryani");
				System.out.println("9. Chicken Shorma");
			    System.out.println("****************");
	            int d = sc.nextInt();
	             switch (d) 
	             {
				case 1:
					
					Mumbai NonVeg = new Mumbai("Chicken Curry", 400, "Chicken","3 Peoples");
					NonVeg.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai NonVeg1 = new Mumbai("Butter Chicken", 360, "Butter","2 Peoples");
					NonVeg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai NonVeg2 = new Mumbai("Chicken Tikka Masala", 210, "Masala","6 Peoples");
					NonVeg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai NonVeg3 = new Mumbai("Afgani Chicken", 600, "Masala","3 Peoples");
					NonVeg3.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai NonVeg4 = new Mumbai("Fried Chicken Rassa", 360, "Masala","4 Peoples");
					NonVeg4.mumbaiDetails();
					p.payment();
					break;	
				case 6:
					Mumbai NonVeg5 = new Mumbai("Prawn Curry Masala", 360, "Butter","2 Peoples");
					NonVeg5.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai NonVeg6 = new Mumbai("Mutton Curry", 210, "Masala","6 Peoples");
					NonVeg6.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai NonVeg7 = new Mumbai("Chicken Biryani", 600, "Masala","3 Peoples");
					NonVeg7.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai NonVeg8 = new Mumbai("Chicken Shorma", 360, "Masala","4 Peoples");
					NonVeg8.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
	             }
	             return; 
		 
				
			case 3: //Chinese
					System.out.println("Select the Dish");
					System.out.println("1. Chicken Fried Rice");
					System.out.println("2. Chicken Noodles");
					System.out.println("3. Chicken Chilly");
					System.out.println("4. Triple Rice");
					System.out.println("5. Triple Noodles");
					System.out.println("6. Chicken 65");
					System.out.println("7. Tandoori Chicken");
					System.out.println("8. Chicken Soup");
					System.out.println("9. Crispy Chicken");
				    System.out.println("****************");
		            int e = sc.nextInt();
		             switch (e) 
		             {
					case 1:
						Mumbai Chinese1 = new Mumbai("Chicken Fried Rice", 400, "Chicken","3 Peoples");
						Chinese1.mumbaiDetails();
						p.payment();
						break;
					case 2:
						Mumbai Chinese2 = new Mumbai("Chicken Noodles", 360, "Butter","2 Peoples");
						Chinese2.mumbaiDetails();
						p.payment();
						break;
					case 3:
						Mumbai Chinese3 = new Mumbai("Chicken Chilly", 210, "Masala","6 Peoples");
						Chinese3.mumbaiDetails();
						p.payment();
						break;
					case 4:
						Mumbai Chinese4 = new Mumbai("Triple Rice", 600, "Masala","3 Peoples");
						Chinese4.mumbaiDetails();
						p.payment();
						break;
					case 5:
						Mumbai Chinese5 = new Mumbai("Triple Noodles", 360, "Masala","4 Peoples");
						Chinese5.mumbaiDetails();
						p.payment();
						break;		
					case 6:
						Mumbai Chinese6 = new Mumbai("Chicken 65", 360, "Butter","2 Peoples");
						Chinese6.mumbaiDetails();
						p.payment();
						break;
					case 7:
						Mumbai Chinese7 = new Mumbai("Tandoori Chicken", 210, "Masala","6 Peoples");
						Chinese7.mumbaiDetails();
						p.payment();
						break;
					case 8:
						Mumbai Chinese8 = new Mumbai("Chicken Soup", 600, "Masala","3 Peoples");
						Chinese8.mumbaiDetails();
						p.payment();
						break;
					case 9:
						Mumbai Chinese9 = new Mumbai("Crispy Chicken", 360, "Masala","4 Peoples");
						Chinese9.mumbaiDetails();
						p.payment();
						break;
					default:
						System.out.println("invalid select correct options");
				
		             }
		             return;
			case 4: //Itailian
				System.out.println("Select the Dish");
				System.out.println("1. Polento");
				System.out.println("2. Ravioli");
				System.out.println("3. Ribollita");
				System.out.println("4. Italian Pasta");
				System.out.println("5. Arancini");
				System.out.println("6. Risotto Alla Milanse");
				System.out.println("7. Lasagne");
				System.out.println("8. Osso Buco");
				System.out.println("9. Neapolitan Pizza");
				
				
			    System.out.println("***********************************");
	            int f = sc.nextInt();
	             switch (f) 
	             {
				case 1:
					Mumbai Itailian1 = new Mumbai("Polento", 400, "Chicken","3 Peoples");
					Itailian1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai Itailian2 = new Mumbai("Ravioli", 360, "Butter","2 Peoples");
					Itailian2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Itailian3 = new Mumbai("Ribollita", 210, "Masala","6 Peoples");
					Itailian3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Itailian4 = new Mumbai("Italian Pasta", 600, "Masala","3 Peoples");
					Itailian4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai Itailian5 = new Mumbai("Arancini", 360, "Masala","4 Peoples");
					Itailian5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai Itailian6 = new Mumbai("Risotto Alla Milanse", 360, "Butter","2 Peoples");
					Itailian6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai Itailian7 = new Mumbai("Lasagne", 210, "Masala","6 Peoples");
					Itailian7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai Itailian8 = new Mumbai("Osso Buco", 600, "Masala","3 Peoples");
					Itailian8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai Itailian9 = new Mumbai("Neapolitan Pizza", 360, "Masala","4 Peoples");
					Itailian9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
					
			
	             }
	             return;
			//}
			case 5: //Korean
				System.out.println("Select the Dish");
				System.out.println("1. Hangover stew  ");
				System.out.println("2. Kimchi ");
				System.out.println("3. Soft Tofu Stew ");
				System.out.println("4. Samgyeopsal ");
				System.out.println("5. Jjajangmyeon ");
				System.out.println("6. Chimaek ");
				System.out.println("7. Instant noodles ");
				System.out.println("8. Kimchi Stew ");
				System.out.println("9. Korean Special Resto");
				
				
			    System.out.println("************************************************");
	            int g = sc.nextInt();
	             switch (g) 
	             {
				case 1:
					Mumbai korean1 = new Mumbai("Hangover stew ", 400, "Chicken","3 Peoples");
					korean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai korean2 = new Mumbai("Kimchi ", 360, "Butter","2 Peoples");
					korean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai korean3 = new Mumbai("Soft Tofu Stew ", 210, "Masala","6 Peoples");
					korean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai korean4 = new Mumbai("Samgyeopsal ", 600, "Masala","3 Peoples");
					korean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai korean5 = new Mumbai("Jjajangmyeon ", 360, "Masala","4 Peoples");
					korean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai korean6 = new Mumbai("Chimaek ", 360, "Butter","2 Peoples");
					korean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai korean7 = new Mumbai("Instant noodles ", 210, "Masala","6 Peoples");
					korean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai korean8 = new Mumbai("Kimchi Stew ", 600, "Masala","3 Peoples");
					korean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai korean9 = new Mumbai("Korean Special Resto", 360, "Masala","4 Peoples");
					korean9.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
			
	             }
	             return;
		//	}
			case 6: //German 
			System.out.println("Select the Dish");
			System.out.println("1. Doner Kebab");
			System.out.println("2. Currywurst");
			System.out.println("3. Bratwurst");
			System.out.println("4. Sauerbraten");
			System.out.println("5. Marzipan");
			System.out.println("6. Kohlrouloda");
			System.out.println("7. Stollen");
			System.out.println("8. Spatzle");
			System.out.println("9. German Sandwich");
			
			
		    System.out.println("****************");
	        int h = sc.nextInt();
	         switch (h) 
	         {
			case 1:
				Mumbai german1 = new Mumbai("Doner Kebab", 400, "Chicken","3 Peoples");
				german1.mumbaiDetails();
				p.payment();
				break;
			case 2:
				Mumbai german2 = new Mumbai("Currywurst", 360, "Butter","2 Peoples");
				german2.mumbaiDetails();
				p.payment();
				break;
			case 3:
				Mumbai german3 = new Mumbai("Bratwurst", 210, "Masala","6 Peoples");
				german3.mumbaiDetails();
				p.payment();
				break;
			case 4:
				Mumbai german4 = new Mumbai("Sauerbraten", 600, "Masala","3 Peoples");
				german4.mumbaiDetails();
				p.payment();
				break;
			case 5:
				Mumbai german5 = new Mumbai("Marzipan", 360, "Masala","4 Peoples");
				german5.mumbaiDetails();
				p.payment();
				break;		
			case 6:
				Mumbai german6 = new Mumbai("Kohlrouloda", 360, "Butter","2 Peoples");
				german6.mumbaiDetails();
				p.payment();
				break;
			case 7:
				Mumbai german7 = new Mumbai("Stollen", 210, "Masala","6 Peoples");
				german7.mumbaiDetails();
				p.payment();
				break;
			case 8:
				Mumbai german8 = new Mumbai("Spatzle", 600, "Masala","3 Peoples");
				german8.mumbaiDetails();
				p.payment();
				break;
			case 9:
				Mumbai german9 = new Mumbai("German Sandwich", 360, "Masala","4 Peoples");
				german9.mumbaiDetails();
				p.payment();
				break;
			default:
				System.out.println("invalid select correct options");
		
	         }
	         return;
	         
	         
			case 7: //Carribean 
				System.out.println("Select the Dish");
				System.out.println("1. Flying Fish");
				System.out.println("2. Cou-Cou");
				System.out.println("3. Baiga Choka(Roasted Eggplant)");
				System.out.println("4. Conch Ceviche");
				System.out.println("5. Pineapple Chow");
				System.out.println("6. Gizzada");
				System.out.println("7. Carribean Roasted Bean");
				System.out.println("8. Goat Water");
				System.out.println("9. Mofongo");
				
				
			    System.out.println("****************");
		        int i = sc.nextInt();
		         switch (i) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Flying Fish", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Cou-Cou", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Baiga Choka(Roasted Eggplant)", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Conch Ceviche", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Pineapple Chow", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Gizzada", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Carribean Roasted Bean", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai("Goat Water", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Mofongo", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;
		         
			case 8: //Japanese 
				System.out.println("Select the Dish");
				System.out.println("1. Hayashi Rice");
				System.out.println("2. Kamameshi");
				System.out.println("3. Katemeshi");
				System.out.println("4. Mochi");
				System.out.println("5. Mugi Gohan");
				System.out.println("6. Ochazuke");
				System.out.println("7. Okowa");
				System.out.println("8. Omurice");
				System.out.println("9. Onigiri");
				
				
			    System.out.println("****************");
		        int j = sc.nextInt();
		         switch (j) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Hayashi Rice", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Kamameshi", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Katemeshi", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Mochi", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Mugi Gohan", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Ochazuke", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Okowa", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai(" Omurice", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Onigiri", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;     
			case 9: //Arabic
				System.out.println("Select the Dish");
				System.out.println("1. Hummus");
				System.out.println("2. Manakeesh");
				System.out.println("3. Grilled halloumi");
				System.out.println("4. Foul meddamas");
				System.out.println("5. Falafel");
				System.out.println("6. Tabouleh");
				System.out.println("7. Moutabal/baba ghanoush");
				System.out.println("8. Fattoush");
				System.out.println("9. Arabic Special");
				
				
			    System.out.println("*********************************");
		        int k = sc.nextInt();
		         switch (k) 
		         {
				case 1:
					Mumbai arabic1 = new Mumbai("Hummus", 400, "Chicken","3 Peoples");
					arabic1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai arabic2 = new Mumbai("Manakeesh", 360, "Butter","2 Peoples");
					arabic2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai arabic3 = new Mumbai("Grilled halloumi", 210, "Masala","6 Peoples");
					arabic3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai arabic4 = new Mumbai("Foul meddamas", 600, "Masala","3 Peoples");
					arabic4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai arabic5 = new Mumbai("Falafel", 360, "Masala","4 Peoples");
					arabic5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai arabic6 = new Mumbai("Tabouleh", 360, "Butter","2 Peoples");
					arabic6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai arabic7 = new Mumbai("Moutabal/baba ghanoush", 210, "Masala","6 Peoples");
					arabic7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai arabic8 = new Mumbai("Fattoush", 600, "Masala","3 Peoples");
					arabic8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai arabic9 = new Mumbai("", 360, "Masala","4 Peoples");
					arabic9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;       
			}
		case 3://Bangalore
			System.out.println("Thankyou for choosing Bangalore");
			System.out.println("Select the option from below categories");
			System.out.println("1. Veg Cuisine");
			System.out.println("2. NonVeg Cuisine");
			System.out.println("3. Chinese Cuisine");
			System.out.println("4. Italian Cuisine");
			System.out.println("5. Korean Cuisine");
			System.out.println("6. German Cuisine");
			System.out.println("7. Carribean Cuisine");
			System.out.println("8. Japanese Cuisine");
			System.out.println("9. Arabic Cuisine");
			System.out.println("****************");
			int b2 = sc.nextInt();
			switch (b2)
			{
			case 1://Veg
				System.out.println("Select the Dish");
				System.out.println("1. Tawa Pulav");
				System.out.println("2. PavBhaji");
				System.out.println("3. Chole Bhatore");
				System.out.println("4. Shahi Paneer");
				System.out.println("5. Soyabean");
				System.out.println("6. Puranpoli");
				System.out.println("7. Veg Kofta Roti");
				System.out.println("8. Veg Korma Rice");
				System.out.println("9. Veg Biryani");
				
			    System.out.println("****************");
	            int c = sc.nextInt();
	             switch (c) 
	             {
				case 1://case dish
					//String Platename, int Price, String Speciality, String Suitable
					Mumbai Veg = new Mumbai("Tawa Pulav", 210, "Basmati Rice","2 Peoples");
					Veg.mumbaiDetails();
				   //System.out.println(Veg.getPlatename());
				   //Veg.setPlatename("Veg Biryani");
				   //System.out.println(Veg.getPlatename());
					//System.out.println("Enter 1 for Order confirming  ");
					
					p.payment();
					
					
			
							
					break;
				case 2:
					Mumbai Veg1 = new Mumbai("PavBhaji", 210, "Basmati Rice","3 Peoples");
					Veg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Veg2 = new Mumbai("Chole Bhatore", 210, "Basmati Rice","2 Peoples");
					Veg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Veg3 = new Mumbai("Shahi Paneer", 210, "Basmati Rice","3 Peoples");
					Veg3.mumbaiDetails();
					p.payment();
					break;	
				case 5: 
					Mumbai Veg4 = new Mumbai("Soyabean", 410, "Soyabean", " 4 peoples");
					Veg4.mumbaiDetails();
					p.payment();
					break;
				case 6: 
					Mumbai Veg5 = new Mumbai("Puranpoli", 410, "Soyabean", " 4 peoples");
					Veg5.mumbaiDetails();
					p.payment();
					break;
				case 7: 
					Mumbai Veg6 = new Mumbai("Veg Kofta Roti", 410, "Soyabean", " 4 peoples");
					Veg6.mumbaiDetails();
					p.payment();
					break;
				case 8: 
					Mumbai Veg7 = new Mumbai("Veg Korma Rice", 410, "Soyabean", " 4 peoples");
					Veg7.mumbaiDetails();
					p.payment();
					break;
				case 9: 
					Mumbai Veg8 = new Mumbai("Veg Biryani", 410, "Soyabean", " 4 peoples");
					Veg8.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
	             }
	             return;
			case 2://Non-veg
				System.out.println("Select the Dish");
				System.out.println("1. Chicken Curry");
				System.out.println("2. Butter Chicken");
				System.out.println("3. Chicken Tikka Masala");
				System.out.println("4. Afgani Chicken");
				System.out.println("5. Fried Chicken Rassa");
				System.out.println("6. Prawn Curry Masala");
				System.out.println("7. Mutton Curry");
				System.out.println("8. Chicken Biryani");
				System.out.println("9. Chicken Shorma");
			    System.out.println("****************");
	            int d = sc.nextInt();
	             switch (d) 
	             {
				case 1:
					
					Mumbai NonVeg = new Mumbai("Chicken Curry", 400, "Chicken","3 Peoples");
					NonVeg.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai NonVeg1 = new Mumbai("Butter Chicken", 360, "Butter","2 Peoples");
					NonVeg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai NonVeg2 = new Mumbai("Chicken Tikka Masala", 210, "Masala","6 Peoples");
					NonVeg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai NonVeg3 = new Mumbai("Afgani Chicken", 600, "Masala","3 Peoples");
					NonVeg3.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai NonVeg4 = new Mumbai("Fried Chicken Rassa", 360, "Masala","4 Peoples");
					NonVeg4.mumbaiDetails();
					p.payment();
					break;	
				case 6:
					Mumbai NonVeg5 = new Mumbai("Prawn Curry Masala", 360, "Butter","2 Peoples");
					NonVeg5.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai NonVeg6 = new Mumbai("Mutton Curry", 210, "Masala","6 Peoples");
					NonVeg6.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai NonVeg7 = new Mumbai("Chicken Biryani", 600, "Masala","3 Peoples");
					NonVeg7.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai NonVeg8 = new Mumbai("Chicken Shorma", 360, "Masala","4 Peoples");
					NonVeg8.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
	             }
	             return; 
		 
				
			case 3: //Chinese
					System.out.println("Select the Dish");
					System.out.println("1. Chicken Fried Rice");
					System.out.println("2. Chicken Noodles");
					System.out.println("3. Chicken Chilly");
					System.out.println("4. Triple Rice");
					System.out.println("5. Triple Noodles");
					System.out.println("6. Chicken 65");
					System.out.println("7. Tandoori Chicken");
					System.out.println("8. Chicken Soup");
					System.out.println("9. Crispy Chicken");
				    System.out.println("****************");
		            int e = sc.nextInt();
		             switch (e) 
		             {
					case 1:
						Mumbai Chinese1 = new Mumbai("Chicken Fried Rice", 400, "Chicken","3 Peoples");
						Chinese1.mumbaiDetails();
						p.payment();
						break;
					case 2:
						Mumbai Chinese2 = new Mumbai("Chicken Noodles", 360, "Butter","2 Peoples");
						Chinese2.mumbaiDetails();
						p.payment();
						break;
					case 3:
						Mumbai Chinese3 = new Mumbai("Chicken Chilly", 210, "Masala","6 Peoples");
						Chinese3.mumbaiDetails();
						p.payment();
						break;
					case 4:
						Mumbai Chinese4 = new Mumbai("Triple Rice", 600, "Masala","3 Peoples");
						Chinese4.mumbaiDetails();
						p.payment();
						break;
					case 5:
						Mumbai Chinese5 = new Mumbai("Triple Noodles", 360, "Masala","4 Peoples");
						Chinese5.mumbaiDetails();
						p.payment();
						break;		
					case 6:
						Mumbai Chinese6 = new Mumbai("Chicken 65", 360, "Butter","2 Peoples");
						Chinese6.mumbaiDetails();
						p.payment();
						break;
					case 7:
						Mumbai Chinese7 = new Mumbai("Tandoori Chicken", 210, "Masala","6 Peoples");
						Chinese7.mumbaiDetails();
						p.payment();
						break;
					case 8:
						Mumbai Chinese8 = new Mumbai("Chicken Soup", 600, "Masala","3 Peoples");
						Chinese8.mumbaiDetails();
						p.payment();
						break;
					case 9:
						Mumbai Chinese9 = new Mumbai("Crispy Chicken", 360, "Masala","4 Peoples");
						Chinese9.mumbaiDetails();
						p.payment();
						break;
					default:
						System.out.println("invalid select correct options");
				
		             }
		             return;
			case 4: //Itailian
				System.out.println("Select the Dish");
				System.out.println("1. Polento");
				System.out.println("2. Ravioli");
				System.out.println("3. Ribollita");
				System.out.println("4. Italian Pasta");
				System.out.println("5. Arancini");
				System.out.println("6. Risotto Alla Milanse");
				System.out.println("7. Lasagne");
				System.out.println("8. Osso Buco");
				System.out.println("9. Neapolitan Pizza");
				
				
			    System.out.println("****************");
	            int f = sc.nextInt();
	             switch (f) 
	             {
				case 1:
					Mumbai Itailian1 = new Mumbai("Polento", 400, "Chicken","3 Peoples");
					Itailian1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai Itailian2 = new Mumbai("Ravioli", 360, "Butter","2 Peoples");
					Itailian2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Itailian3 = new Mumbai("Ribollita", 210, "Masala","6 Peoples");
					Itailian3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Itailian4 = new Mumbai("Italian Pasta", 600, "Masala","3 Peoples");
					Itailian4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai Itailian5 = new Mumbai("Arancini", 360, "Masala","4 Peoples");
					Itailian5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai Itailian6 = new Mumbai("Risotto Alla Milanse", 360, "Butter","2 Peoples");
					Itailian6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai Itailian7 = new Mumbai("Lasagne", 210, "Masala","6 Peoples");
					Itailian7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai Itailian8 = new Mumbai("Osso Buco", 600, "Masala","3 Peoples");
					Itailian8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai Itailian9 = new Mumbai("Neapolitan Pizza", 360, "Masala","4 Peoples");
					Itailian9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
					
			
	             }
	             return;
			//}
			case 5: //Korean
				System.out.println("Select the Dish");
				System.out.println("1. Hangover stew  ");
				System.out.println("2. Kimchi ");
				System.out.println("3. Soft Tofu Stew ");
				System.out.println("4. Samgyeopsal ");
				System.out.println("5. Jjajangmyeon ");
				System.out.println("6. Chimaek ");
				System.out.println("7. Instant noodles ");
				System.out.println("8. Kimchi Stew ");
				System.out.println("9. Korean Special Resto");
				
				
			    System.out.println("************************************************");
	            int g = sc.nextInt();
	             switch (g) 
	             {
				case 1:
					Mumbai korean1 = new Mumbai("Hangover stew ", 400, "Chicken","3 Peoples");
					korean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai korean2 = new Mumbai("Kimchi ", 360, "Butter","2 Peoples");
					korean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai korean3 = new Mumbai("Soft Tofu Stew ", 210, "Masala","6 Peoples");
					korean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai korean4 = new Mumbai("Samgyeopsal ", 600, "Masala","3 Peoples");
					korean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai korean5 = new Mumbai("Jjajangmyeon ", 360, "Masala","4 Peoples");
					korean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai korean6 = new Mumbai("Chimaek ", 360, "Butter","2 Peoples");
					korean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai korean7 = new Mumbai("Instant noodles ", 210, "Masala","6 Peoples");
					korean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai korean8 = new Mumbai("Kimchi Stew ", 600, "Masala","3 Peoples");
					korean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai korean9 = new Mumbai("Korean Special Resto", 360, "Masala","4 Peoples");
					korean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
	             }
	             return;
		//	}
			case 6: //German 
			System.out.println("Select the Dish");
			System.out.println("1. Doner Kebab");
			System.out.println("2. Currywurst");
			System.out.println("3. Bratwurst");
			System.out.println("4. Sauerbraten");
			System.out.println("5. Marzipan");
			System.out.println("6. Kohlrouloda");
			System.out.println("7. Stollen");
			System.out.println("8. Spatzle");
			System.out.println("9. German Sandwich");
			
			
		    System.out.println("****************");
	        int h = sc.nextInt();
	         switch (h) 
	         {
			case 1:
				Mumbai german1 = new Mumbai("Doner Kebab", 400, "Chicken","3 Peoples");
				german1.mumbaiDetails();
				p.payment();
				break;
			case 2:
				Mumbai german2 = new Mumbai("Currywurst", 360, "Butter","2 Peoples");
				german2.mumbaiDetails();
				p.payment();
				break;
			case 3:
				Mumbai german3 = new Mumbai("Bratwurst", 210, "Masala","6 Peoples");
				german3.mumbaiDetails();
				p.payment();
				break;
			case 4:
				Mumbai german4 = new Mumbai("Sauerbraten", 600, "Masala","3 Peoples");
				german4.mumbaiDetails();
				p.payment();
				break;
			case 5:
				Mumbai german5 = new Mumbai("Marzipan", 360, "Masala","4 Peoples");
				german5.mumbaiDetails();
				p.payment();
				break;		
			case 6:
				Mumbai german6 = new Mumbai("Kohlrouloda", 360, "Butter","2 Peoples");
				german6.mumbaiDetails();
				p.payment();
				break;
			case 7:
				Mumbai german7 = new Mumbai("Stollen", 210, "Masala","6 Peoples");
				german7.mumbaiDetails();
				p.payment();
				break;
			case 8:
				Mumbai german8 = new Mumbai("Spatzle", 600, "Masala","3 Peoples");
				german8.mumbaiDetails();
				p.payment();
				break;
			case 9:
				Mumbai german9 = new Mumbai("German Sandwich", 360, "Masala","4 Peoples");
				german9.mumbaiDetails();
				p.payment();
				break;	
			default:
				System.out.println("invalid select correct options");
		
	         }
	         return;
	         
	         
			case 7: //Carribean 
				System.out.println("Select the Dish");
				System.out.println("1. Flying Fish");
				System.out.println("2. Cou-Cou");
				System.out.println("3. Baiga Choka(Roasted Eggplant)");
				System.out.println("4. Conch Ceviche");
				System.out.println("5. Pineapple Chow");
				System.out.println("6. Gizzada");
				System.out.println("7. Carribean Roasted Bean");
				System.out.println("8. Goat Water");
				System.out.println("9. Mofongo");
				
				
			    System.out.println("****************");
		        int i = sc.nextInt();
		         switch (i) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Flying Fish", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Cou-Cou", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Baiga Choka(Roasted Eggplant)", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Conch Ceviche", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Pineapple Chow", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Gizzada", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Carribean Roasted Bean", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai("Goat Water", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Mofongo", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;
		         
			case 8: //Japanese 
				System.out.println("Select the Dish");
				System.out.println("1. Hayashi Rice");
				System.out.println("2. Kamameshi");
				System.out.println("3. Katemeshi");
				System.out.println("4. Mochi");
				System.out.println("5. Mugi Gohan");
				System.out.println("6. Ochazuke");
				System.out.println("7. Okowa");
				System.out.println("8. Omurice");
				System.out.println("9. Onigiri");
				
				
			    System.out.println("****************");
		        int j = sc.nextInt();
		         switch (j) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Hayashi Rice", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Kamameshi", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Katemeshi", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Mochi", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Mugi Gohan", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Ochazuke", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Okowa", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai(" Omurice", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Onigiri", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;     
			case 9: //Arabic
				System.out.println("Select the Dish");
				System.out.println("1. Hummus");
				System.out.println("2. Manakeesh");
				System.out.println("3. Grilled halloumi");
				System.out.println("4. Foul meddamas");
				System.out.println("5. Falafel");
				System.out.println("6. Tabouleh");
				System.out.println("7. Moutabal/baba ghanoush");
				System.out.println("8. Fattoush");
				System.out.println("9. Arabic Special");
				
				
			    System.out.println("*********************************");
		        int k = sc.nextInt();
		         switch (k) 
		         {
				case 1:
					Mumbai arabic1 = new Mumbai("Hummus", 400, "Chicken","3 Peoples");
					arabic1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai arabic2 = new Mumbai("Manakeesh", 360, "Butter","2 Peoples");
					arabic2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai arabic3 = new Mumbai("Grilled halloumi", 210, "Masala","6 Peoples");
					arabic3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai arabic4 = new Mumbai("Foul meddamas", 600, "Masala","3 Peoples");
					arabic4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai arabic5 = new Mumbai("Falafel", 360, "Masala","4 Peoples");
					arabic5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai arabic6 = new Mumbai("Tabouleh", 360, "Butter","2 Peoples");
					arabic6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai arabic7 = new Mumbai("Moutabal/baba ghanoush", 210, "Masala","6 Peoples");
					arabic7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai arabic8 = new Mumbai("Fattoush", 600, "Masala","3 Peoples");
					arabic8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai arabic9 = new Mumbai("", 360, "Masala","4 Peoples");
					arabic9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;       
	             
	 }
		case 4://Hyderabad
			System.out.println("Thankyou for choosing Hyderabad");
			System.out.println("Select the option from below categories");
			System.out.println("1. Veg Cuisine");
			System.out.println("2. NonVeg Cuisine");
			System.out.println("3. Chinese Cuisine");
			System.out.println("4. Italian Cuisine");
			System.out.println("5. Korean Cuisine");
			System.out.println("6. German Cuisine");
			System.out.println("7. Carribean Cuisine");
			System.out.println("8. Japanese Cuisine");
			System.out.println("9. Arabic Cuisine");
			System.out.println("****************");
			int b3 = sc.nextInt();
			switch (b3)
			{
			case 1://Veg
				System.out.println("Select the Dish");
				System.out.println("1. Tawa Pulav");
				System.out.println("2. PavBhaji");
				System.out.println("3. Chole Bhatore");
				System.out.println("4. Shahi Paneer");
				System.out.println("5. Soyabean");
				System.out.println("6. Puranpoli");
				System.out.println("7. Veg Kofta Roti");
				System.out.println("8. Veg Korma Rice");
				System.out.println("9. Veg Biryani");
				
			    System.out.println("****************");
	            int c = sc.nextInt();
	             switch (c) 
	             {
				case 1://case dish
					//String Platename, int Price, String Speciality, String Suitable
					Mumbai Veg = new Mumbai("Tawa Pulav", 210, "Basmati Rice","2 Peoples");
					Veg.mumbaiDetails();
				   //System.out.println(Veg.getPlatename());
				   //Veg.setPlatename("Veg Biryani");
				   //System.out.println(Veg.getPlatename());
					//System.out.println("Enter 1 for Order confirming  ");
					
					p.payment();
					
					
			
							
					break;
				case 2:
					Mumbai Veg1 = new Mumbai("PavBhaji", 210, "Basmati Rice","3 Peoples");
					Veg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Veg2 = new Mumbai("Chole Bhatore", 210, "Basmati Rice","2 Peoples");
					Veg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Veg3 = new Mumbai("Shahi Paneer", 210, "Basmati Rice","3 Peoples");
					Veg3.mumbaiDetails();
					p.payment();
					break;	
				case 5: 
					Mumbai Veg4 = new Mumbai("Soyabean", 410, "Soyabean", " 4 peoples");
					Veg4.mumbaiDetails();
					p.payment();
					break;
				case 6: 
					Mumbai Veg5 = new Mumbai("Puranpoli", 410, "Soyabean", " 4 peoples");
					Veg5.mumbaiDetails();
					p.payment();
					break;
				case 7: 
					Mumbai Veg6 = new Mumbai("Veg Kofta Roti", 410, "Soyabean", " 4 peoples");
					Veg6.mumbaiDetails();
					p.payment();
					break;
				case 8: 
					Mumbai Veg7 = new Mumbai("Veg Korma Rice", 410, "Soyabean", " 4 peoples");
					Veg7.mumbaiDetails();
					p.payment();
					break;
				case 9: 
					Mumbai Veg8 = new Mumbai("Veg Biryani", 410, "Soyabean", " 4 peoples");
					Veg8.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
	             }
	             return;
			case 2://Non-veg
				System.out.println("Select the Dish");
				System.out.println("1. Chicken Curry");
				System.out.println("2. Butter Chicken");
				System.out.println("3. Chicken Tikka Masala");
				System.out.println("4. Afgani Chicken");
				System.out.println("5. Fried Chicken Rassa");
				System.out.println("6. Prawn Curry Masala");
				System.out.println("7. Mutton Curry");
				System.out.println("8. Chicken Biryani");
				System.out.println("9. Chicken Shorma");
			    System.out.println("****************");
	            int d = sc.nextInt();
	             switch (d) 
	             {
				case 1:
					
					Mumbai NonVeg = new Mumbai("Chicken Curry", 400, "Chicken","3 Peoples");
					NonVeg.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai NonVeg1 = new Mumbai("Butter Chicken", 360, "Butter","2 Peoples");
					NonVeg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai NonVeg2 = new Mumbai("Chicken Tikka Masala", 210, "Masala","6 Peoples");
					NonVeg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai NonVeg3 = new Mumbai("Afgani Chicken", 600, "Masala","3 Peoples");
					NonVeg3.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai NonVeg4 = new Mumbai("Fried Chicken Rassa", 360, "Masala","4 Peoples");
					NonVeg4.mumbaiDetails();
					p.payment();
					break;	
				case 6:
					Mumbai NonVeg5 = new Mumbai("Prawn Curry Masala", 360, "Butter","2 Peoples");
					NonVeg5.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai NonVeg6 = new Mumbai("Mutton Curry", 210, "Masala","6 Peoples");
					NonVeg6.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai NonVeg7 = new Mumbai("Chicken Biryani", 600, "Masala","3 Peoples");
					NonVeg7.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai NonVeg8 = new Mumbai("Chicken Shorma", 360, "Masala","4 Peoples");
					NonVeg8.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
	             }
	             return; 
		 
				
			case 3: //Chinese
					System.out.println("Select the Dish");
					System.out.println("1. Chicken Fried Rice");
					System.out.println("2. Chicken Noodles");
					System.out.println("3. Chicken Chilly");
					System.out.println("4. Triple Rice");
					System.out.println("5. Triple Noodles");
					System.out.println("6. Chicken 65");
					System.out.println("7. Tandoori Chicken");
					System.out.println("8. Chicken Soup");
					System.out.println("9. Crispy Chicken");
				    System.out.println("****************");
		            int e = sc.nextInt();
		             switch (e) 
		             {
					case 1:
						Mumbai Chinese1 = new Mumbai("Chicken Fried Rice", 400, "Chicken","3 Peoples");
						Chinese1.mumbaiDetails();
						p.payment();
						break;
					case 2:
						Mumbai Chinese2 = new Mumbai("Chicken Noodles", 360, "Butter","2 Peoples");
						Chinese2.mumbaiDetails();
						p.payment();
						break;
					case 3:
						Mumbai Chinese3 = new Mumbai("Chicken Chilly", 210, "Masala","6 Peoples");
						Chinese3.mumbaiDetails();
						p.payment();
						break;
					case 4:
						Mumbai Chinese4 = new Mumbai("Triple Rice", 600, "Masala","3 Peoples");
						Chinese4.mumbaiDetails();
						p.payment();
						break;
					case 5:
						Mumbai Chinese5 = new Mumbai("Triple Noodles", 360, "Masala","4 Peoples");
						Chinese5.mumbaiDetails();
						p.payment();
						break;		
					case 6:
						Mumbai Chinese6 = new Mumbai("Chicken 65", 360, "Butter","2 Peoples");
						Chinese6.mumbaiDetails();
						p.payment();
						break;
					case 7:
						Mumbai Chinese7 = new Mumbai("Tandoori Chicken", 210, "Masala","6 Peoples");
						Chinese7.mumbaiDetails();
						p.payment();
						break;
					case 8:
						Mumbai Chinese8 = new Mumbai("Chicken Soup", 600, "Masala","3 Peoples");
						Chinese8.mumbaiDetails();
						p.payment();
						break;
					case 9:
						Mumbai Chinese9 = new Mumbai("Crispy Chicken", 360, "Masala","4 Peoples");
						Chinese9.mumbaiDetails();
						p.payment();
						break;	
					default:
						System.out.println("invalid select correct options");
				
		             }
		             return;
			case 4: //Itailian
				System.out.println("Select the Dish");
				System.out.println("1. Polento");
				System.out.println("2. Ravioli");
				System.out.println("3. Ribollita");
				System.out.println("4. Italian Pasta");
				System.out.println("5. Arancini");
				System.out.println("6. Risotto Alla Milanse");
				System.out.println("7. Lasagne");
				System.out.println("8. Osso Buco");
				System.out.println("9. Neapolitan Pizza");
				
				
			    System.out.println("****************");
	            int f = sc.nextInt();
	             switch (f) 
	             {
				case 1:
					Mumbai Itailian1 = new Mumbai("Polento", 400, "Chicken","3 Peoples");
					Itailian1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai Itailian2 = new Mumbai("Ravioli", 360, "Butter","2 Peoples");
					Itailian2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Itailian3 = new Mumbai("Ribollita", 210, "Masala","6 Peoples");
					Itailian3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Itailian4 = new Mumbai("Italian Pasta", 600, "Masala","3 Peoples");
					Itailian4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai Itailian5 = new Mumbai("Arancini", 360, "Masala","4 Peoples");
					Itailian5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai Itailian6 = new Mumbai("Risotto Alla Milanse", 360, "Butter","2 Peoples");
					Itailian6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai Itailian7 = new Mumbai("Lasagne", 210, "Masala","6 Peoples");
					Itailian7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai Itailian8 = new Mumbai("Osso Buco", 600, "Masala","3 Peoples");
					Itailian8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai Itailian9 = new Mumbai("Neapolitan Pizza", 360, "Masala","4 Peoples");
					Itailian9.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
					
			
	             }
	             return;
			//}
			case 5: //Korean
				System.out.println("Select the Dish");
				System.out.println("1. Hangover stew  ");
				System.out.println("2. Kimchi ");
				System.out.println("3. Soft Tofu Stew ");
				System.out.println("4. Samgyeopsal ");
				System.out.println("5. Jjajangmyeon ");
				System.out.println("6. Chimaek ");
				System.out.println("7. Instant noodles ");
				System.out.println("8. Kimchi Stew ");
				System.out.println("9. Korean Special Resto");
				
				
			    System.out.println("************************************************");
	            int g = sc.nextInt();
	             switch (g) 
	             {
				case 1:
					Mumbai korean1 = new Mumbai("Hangover stew ", 400, "Chicken","3 Peoples");
					korean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai korean2 = new Mumbai("Kimchi ", 360, "Butter","2 Peoples");
					korean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai korean3 = new Mumbai("Soft Tofu Stew ", 210, "Masala","6 Peoples");
					korean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai korean4 = new Mumbai("Samgyeopsal ", 600, "Masala","3 Peoples");
					korean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai korean5 = new Mumbai("Jjajangmyeon ", 360, "Masala","4 Peoples");
					korean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai korean6 = new Mumbai("Chimaek ", 360, "Butter","2 Peoples");
					korean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai korean7 = new Mumbai("Instant noodles ", 210, "Masala","6 Peoples");
					korean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai korean8 = new Mumbai("Kimchi Stew ", 600, "Masala","3 Peoples");
					korean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai korean9 = new Mumbai("Korean Special Resto", 360, "Masala","4 Peoples");
					korean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
	             }
	             return;
		//	}
			case 6: //German 
			System.out.println("Select the Dish");
			System.out.println("1. Doner Kebab");
			System.out.println("2. Currywurst");
			System.out.println("3. Bratwurst");
			System.out.println("4. Sauerbraten");
			System.out.println("5. Marzipan");
			System.out.println("6. Kohlrouloda");
			System.out.println("7. Stollen");
			System.out.println("8. Spatzle");
			System.out.println("9. German Sandwich");
			
			
		    System.out.println("****************");
	        int h = sc.nextInt();
	         switch (h) 
	         {
			case 1:
				Mumbai german1 = new Mumbai("Doner Kebab", 400, "Chicken","3 Peoples");
				german1.mumbaiDetails();
				p.payment();
				break;
			case 2:
				Mumbai german2 = new Mumbai("Currywurst", 360, "Butter","2 Peoples");
				german2.mumbaiDetails();
				p.payment();
				break;
			case 3:
				Mumbai german3 = new Mumbai("Bratwurst", 210, "Masala","6 Peoples");
				german3.mumbaiDetails();
				p.payment();
				break;
			case 4:
				Mumbai german4 = new Mumbai("Sauerbraten", 600, "Masala","3 Peoples");
				german4.mumbaiDetails();
				p.payment();
				break;
			case 5:
				Mumbai german5 = new Mumbai("Marzipan", 360, "Masala","4 Peoples");
				german5.mumbaiDetails();
				p.payment();
				break;		
			case 6:
				Mumbai german6 = new Mumbai("Kohlrouloda", 360, "Butter","2 Peoples");
				german6.mumbaiDetails();
				p.payment();
				break;
			case 7:
				Mumbai german7 = new Mumbai("Stollen", 210, "Masala","6 Peoples");
				german7.mumbaiDetails();
				p.payment();
				break;
			case 8:
				Mumbai german8 = new Mumbai("Spatzle", 600, "Masala","3 Peoples");
				german8.mumbaiDetails();
				p.payment();
				break;
			case 9:
				Mumbai german9 = new Mumbai("German Sandwich", 360, "Masala","4 Peoples");
				german9.mumbaiDetails();
				p.payment();
				break;	
			default:
				System.out.println("invalid select correct options");
		
	         }
	         return;
	         
	         
			case 7: //Carribean 
				System.out.println("Select the Dish");
				System.out.println("1. Flying Fish");
				System.out.println("2. Cou-Cou");
				System.out.println("3. Baiga Choka(Roasted Eggplant)");
				System.out.println("4. Conch Ceviche");
				System.out.println("5. Pineapple Chow");
				System.out.println("6. Gizzada");
				System.out.println("7. Carribean Roasted Bean");
				System.out.println("8. Goat Water");
				System.out.println("9. Mofongo");
				
				
			    System.out.println("****************");
		        int i = sc.nextInt();
		         switch (i) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Flying Fish", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Cou-Cou", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Baiga Choka(Roasted Eggplant)", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Conch Ceviche", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Pineapple Chow", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Gizzada", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Carribean Roasted Bean", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai("Goat Water", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Mofongo", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;
		         
			case 8: //Japanese 
				System.out.println("Select the Dish");
				System.out.println("1. Hayashi Rice");
				System.out.println("2. Kamameshi");
				System.out.println("3. Katemeshi");
				System.out.println("4. Mochi");
				System.out.println("5. Mugi Gohan");
				System.out.println("6. Ochazuke");
				System.out.println("7. Okowa");
				System.out.println("8. Omurice");
				System.out.println("9. Onigiri");
				
				
			    System.out.println("****************");
		        int j = sc.nextInt();
		         switch (j) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Hayashi Rice", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Kamameshi", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Katemeshi", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Mochi", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Mugi Gohan", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Ochazuke", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Okowa", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai(" Omurice", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Onigiri", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;     
			case 9: //Arabic
				System.out.println("Select the Dish");
				System.out.println("1. Hummus");
				System.out.println("2. Manakeesh");
				System.out.println("3. Grilled halloumi");
				System.out.println("4. Foul meddamas");
				System.out.println("5. Falafel");
				System.out.println("6. Tabouleh");
				System.out.println("7. Moutabal/baba ghanoush");
				System.out.println("8. Fattoush");
				System.out.println("9. Arabic Special");
				
				
			    System.out.println("*********************************");
		        int k = sc.nextInt();
		         switch (k) 
		         {
				case 1:
					Mumbai arabic1 = new Mumbai("Hummus", 400, "Chicken","3 Peoples");
					arabic1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai arabic2 = new Mumbai("Manakeesh", 360, "Butter","2 Peoples");
					arabic2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai arabic3 = new Mumbai("Grilled halloumi", 210, "Masala","6 Peoples");
					arabic3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai arabic4 = new Mumbai("Foul meddamas", 600, "Masala","3 Peoples");
					arabic4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai arabic5 = new Mumbai("Falafel", 360, "Masala","4 Peoples");
					arabic5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai arabic6 = new Mumbai("Tabouleh", 360, "Butter","2 Peoples");
					arabic6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai arabic7 = new Mumbai("Moutabal/baba ghanoush", 210, "Masala","6 Peoples");
					arabic7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai arabic8 = new Mumbai("Fattoush", 600, "Masala","3 Peoples");
					arabic8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai arabic9 = new Mumbai("", 360, "Masala","4 Peoples");
					arabic9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;       
			
	 }
			
		case 5://Delhi
			System.out.println("Thankyou for choosing Delhi");
			System.out.println("Select the option from below categories");
			System.out.println("1. Veg Cuisine");
			System.out.println("2. NonVeg Cuisine");
			System.out.println("3. Chinese Cuisine");
			System.out.println("4. Italian Cuisine");
			System.out.println("5. Korean Cuisine");
			System.out.println("6. German Cuisine");
			System.out.println("7. Carribean Cuisine");
			System.out.println("8. Japanese Cuisine");
			System.out.println("9. Arabic Cuisine");
			System.out.println("****************");
			int b4 = sc.nextInt();
			switch (b4)
			{
			case 1://Veg
				System.out.println("Select the Dish");
				System.out.println("1. Tawa Pulav");
				System.out.println("2. PavBhaji");
				System.out.println("3. Chole Bhatore");
				System.out.println("4. Shahi Paneer");
				System.out.println("5. Soyabean");
				System.out.println("6. Puranpoli");
				System.out.println("7. Veg Kofta Roti");
				System.out.println("8. Veg Korma Rice");
				System.out.println("9. Veg Biryani");
				
			    System.out.println("****************");
	            int c = sc.nextInt();
	             switch (c) 
	             {
				case 1://case dish
					//String Platename, int Price, String Speciality, String Suitable
					Mumbai Veg = new Mumbai("Tawa Pulav", 210, "Basmati Rice","2 Peoples");
					Veg.mumbaiDetails();
				   //System.out.println(Veg.getPlatename());
				   //Veg.setPlatename("Veg Biryani");
				   //System.out.println(Veg.getPlatename());
					//System.out.println("Enter 1 for Order confirming  ");
					
					p.payment();
					
					
			
							
					break;
				case 2:
					Mumbai Veg1 = new Mumbai("PavBhaji", 210, "Basmati Rice","3 Peoples");
					Veg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Veg2 = new Mumbai("Chole Bhatore", 210, "Basmati Rice","2 Peoples");
					Veg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Veg3 = new Mumbai("Shahi Paneer", 210, "Basmati Rice","3 Peoples");
					Veg3.mumbaiDetails();
					p.payment();
					break;	
				case 5: 
					Mumbai Veg4 = new Mumbai("Soyabean", 410, "Soyabean", " 4 peoples");
					Veg4.mumbaiDetails();
					p.payment();
					break;
				case 6: 
					Mumbai Veg5 = new Mumbai("Puranpoli", 410, "Soyabean", " 4 peoples");
					Veg5.mumbaiDetails();
					p.payment();
					break;
				case 7: 
					Mumbai Veg6 = new Mumbai("Veg Kofta Roti", 410, "Soyabean", " 4 peoples");
					Veg6.mumbaiDetails();
					p.payment();
					break;
				case 8: 
					Mumbai Veg7 = new Mumbai("Veg Korma Rice", 410, "Soyabean", " 4 peoples");
					Veg7.mumbaiDetails();
					p.payment();
					break;
				case 9: 
					Mumbai Veg8 = new Mumbai("Veg Biryani", 410, "Soyabean", " 4 peoples");
					Veg8.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
	             }
	             return;
			case 2://Non-veg
				System.out.println("Select the Dish");
				System.out.println("1. Chicken Curry");
				System.out.println("2. Butter Chicken");
				System.out.println("3. Chicken Tikka Masala");
				System.out.println("4. Afgani Chicken");
				System.out.println("5. Fried Chicken Rassa");
				System.out.println("6. Prawn Curry Masala");
				System.out.println("7. Mutton Curry");
				System.out.println("8. Chicken Biryani");
				System.out.println("9. Chicken Shorma");
			    System.out.println("****************");
	            int d = sc.nextInt();
	             switch (d) 
	             {
				case 1:
					
					Mumbai NonVeg = new Mumbai("Chicken Curry", 400, "Chicken","3 Peoples");
					NonVeg.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai NonVeg1 = new Mumbai("Butter Chicken", 360, "Butter","2 Peoples");
					NonVeg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai NonVeg2 = new Mumbai("Chicken Tikka Masala", 210, "Masala","6 Peoples");
					NonVeg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai NonVeg3 = new Mumbai("Afgani Chicken", 600, "Masala","3 Peoples");
					NonVeg3.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai NonVeg4 = new Mumbai("Fried Chicken Rassa", 360, "Masala","4 Peoples");
					NonVeg4.mumbaiDetails();
					p.payment();
					break;	
				case 6:
					Mumbai NonVeg5 = new Mumbai("Prawn Curry Masala", 360, "Butter","2 Peoples");
					NonVeg5.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai NonVeg6 = new Mumbai("Mutton Curry", 210, "Masala","6 Peoples");
					NonVeg6.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai NonVeg7 = new Mumbai("Chicken Biryani", 600, "Masala","3 Peoples");
					NonVeg7.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai NonVeg8 = new Mumbai("Chicken Shorma", 360, "Masala","4 Peoples");
					NonVeg8.mumbaiDetails();
					p.payment();
					break;	
	             }
	             return; 
		 
				
			case 3: //Chinese
					System.out.println("Select the Dish");
					System.out.println("1. Chicken Fried Rice");
					System.out.println("2. Chicken Noodles");
					System.out.println("3. Chicken Chilly");
					System.out.println("4. Triple Rice");
					System.out.println("5. Triple Noodles");
					System.out.println("6. Chicken 65");
					System.out.println("7. Tandoori Chicken");
					System.out.println("8. Chicken Soup");
					System.out.println("9. Crispy Chicken");
				    System.out.println("****************");
		            int e = sc.nextInt();
		             switch (e) 
		             {
					case 1:
						Mumbai Chinese1 = new Mumbai("Chicken Fried Rice", 400, "Chicken","3 Peoples");
						Chinese1.mumbaiDetails();
						p.payment();
						break;
					case 2:
						Mumbai Chinese2 = new Mumbai("Chicken Noodles", 360, "Butter","2 Peoples");
						Chinese2.mumbaiDetails();
						p.payment();
						break;
					case 3:
						Mumbai Chinese3 = new Mumbai("Chicken Chilly", 210, "Masala","6 Peoples");
						Chinese3.mumbaiDetails();
						p.payment();
						break;
					case 4:
						Mumbai Chinese4 = new Mumbai("Triple Rice", 600, "Masala","3 Peoples");
						Chinese4.mumbaiDetails();
						p.payment();
						break;
					case 5:
						Mumbai Chinese5 = new Mumbai("Triple Noodles", 360, "Masala","4 Peoples");
						Chinese5.mumbaiDetails();
						p.payment();
						break;		
					case 6:
						Mumbai Chinese6 = new Mumbai("Chicken 65", 360, "Butter","2 Peoples");
						Chinese6.mumbaiDetails();
						p.payment();
						break;
					case 7:
						Mumbai Chinese7 = new Mumbai("Tandoori Chicken", 210, "Masala","6 Peoples");
						Chinese7.mumbaiDetails();
						p.payment();
						break;
					case 8:
						Mumbai Chinese8 = new Mumbai("Chicken Soup", 600, "Masala","3 Peoples");
						Chinese8.mumbaiDetails();
						p.payment();
						break;
					case 9:
						Mumbai Chinese9 = new Mumbai("Crispy Chicken", 360, "Masala","4 Peoples");
						Chinese9.mumbaiDetails();
						p.payment();
						break;
					default:
						System.out.println("invalid select correct options");
				
		             }
		             return;
			case 4: //Itailian
				System.out.println("Select the Dish");
				System.out.println("1. Polento");
				System.out.println("2. Ravioli");
				System.out.println("3. Ribollita");
				System.out.println("4. Italian Pasta");
				System.out.println("5. Arancini");
				System.out.println("6. Risotto Alla Milanse");
				System.out.println("7. Lasagne");
				System.out.println("8. Osso Buco");
				System.out.println("9. Neapolitan Pizza");
				
				
			    System.out.println("****************");
	            int f = sc.nextInt();
	             switch (f) 
	             {
				case 1:
					Mumbai Itailian1 = new Mumbai("Polento", 400, "Chicken","3 Peoples");
					Itailian1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai Itailian2 = new Mumbai("Ravioli", 360, "Butter","2 Peoples");
					Itailian2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Itailian3 = new Mumbai("Ribollita", 210, "Masala","6 Peoples");
					Itailian3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Itailian4 = new Mumbai("Italian Pasta", 600, "Masala","3 Peoples");
					Itailian4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai Itailian5 = new Mumbai("Arancini", 360, "Masala","4 Peoples");
					Itailian5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai Itailian6 = new Mumbai("Risotto Alla Milanse", 360, "Butter","2 Peoples");
					Itailian6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai Itailian7 = new Mumbai("Lasagne", 210, "Masala","6 Peoples");
					Itailian7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai Itailian8 = new Mumbai("Osso Buco", 600, "Masala","3 Peoples");
					Itailian8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai Itailian9 = new Mumbai("Neapolitan Pizza", 360, "Masala","4 Peoples");
					Itailian9.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
					
			
	             }
	             return;
			//}
			case 5: //Korean
				System.out.println("Select the Dish");
				System.out.println("1. Hangover stew  ");
				System.out.println("2. Kimchi ");
				System.out.println("3. Soft Tofu Stew ");
				System.out.println("4. Samgyeopsal ");
				System.out.println("5. Jjajangmyeon ");
				System.out.println("6. Chimaek ");
				System.out.println("7. Instant noodles ");
				System.out.println("8. Kimchi Stew ");
				System.out.println("9. Korean Special Resto");
				
				
			    System.out.println("************************************************");
	            int g = sc.nextInt();
	             switch (g) 
	             {
				case 1:
					Mumbai korean1 = new Mumbai("Hangover stew ", 400, "Chicken","3 Peoples");
					korean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai korean2 = new Mumbai("Kimchi ", 360, "Butter","2 Peoples");
					korean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai korean3 = new Mumbai("Soft Tofu Stew ", 210, "Masala","6 Peoples");
					korean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai korean4 = new Mumbai("Samgyeopsal ", 600, "Masala","3 Peoples");
					korean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai korean5 = new Mumbai("Jjajangmyeon ", 360, "Masala","4 Peoples");
					korean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai korean6 = new Mumbai("Chimaek ", 360, "Butter","2 Peoples");
					korean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai korean7 = new Mumbai("Instant noodles ", 210, "Masala","6 Peoples");
					korean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai korean8 = new Mumbai("Kimchi Stew ", 600, "Masala","3 Peoples");
					korean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai korean9 = new Mumbai("Korean Special Resto", 360, "Masala","4 Peoples");
					korean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
	             }
	             return;
		//	}
			case 6: //German 
			System.out.println("Select the Dish");
			System.out.println("1. Doner Kebab");
			System.out.println("2. Currywurst");
			System.out.println("3. Bratwurst");
			System.out.println("4. Sauerbraten");
			System.out.println("5. Marzipan");
			System.out.println("6. Kohlrouloda");
			System.out.println("7. Stollen");
			System.out.println("8. Spatzle");
			System.out.println("9. German Sandwich");
			
			
		    System.out.println("****************");
	        int h = sc.nextInt();
	         switch (h) 
	         {
			case 1:
				Mumbai german1 = new Mumbai("Doner Kebab", 400, "Chicken","3 Peoples");
				german1.mumbaiDetails();
				p.payment();
				break;
			case 2:
				Mumbai german2 = new Mumbai("Currywurst", 360, "Butter","2 Peoples");
				german2.mumbaiDetails();
				p.payment();
				break;
			case 3:
				Mumbai german3 = new Mumbai("Bratwurst", 210, "Masala","6 Peoples");
				german3.mumbaiDetails();
				p.payment();
				break;
			case 4:
				Mumbai german4 = new Mumbai("Sauerbraten", 600, "Masala","3 Peoples");
				german4.mumbaiDetails();
				p.payment();
				break;
			case 5:
				Mumbai german5 = new Mumbai("Marzipan", 360, "Masala","4 Peoples");
				german5.mumbaiDetails();
				p.payment();
				break;		
			case 6:
				Mumbai german6 = new Mumbai("Kohlrouloda", 360, "Butter","2 Peoples");
				german6.mumbaiDetails();
				p.payment();
				break;
			case 7:
				Mumbai german7 = new Mumbai("Stollen", 210, "Masala","6 Peoples");
				german7.mumbaiDetails();
				p.payment();
				break;
			case 8:
				Mumbai german8 = new Mumbai("Spatzle", 600, "Masala","3 Peoples");
				german8.mumbaiDetails();
				p.payment();
				break;
			case 9:
				Mumbai german9 = new Mumbai("German Sandwich", 360, "Masala","4 Peoples");
				german9.mumbaiDetails();
				p.payment();
				break;
			default:
				System.out.println("invalid select correct options");
		
	         }
	         return;
	         
	         
			case 7: //Carribean 
				System.out.println("Select the Dish");
				System.out.println("1. Flying Fish");
				System.out.println("2. Cou-Cou");
				System.out.println("3. Baiga Choka(Roasted Eggplant)");
				System.out.println("4. Conch Ceviche");
				System.out.println("5. Pineapple Chow");
				System.out.println("6. Gizzada");
				System.out.println("7. Carribean Roasted Bean");
				System.out.println("8. Goat Water");
				System.out.println("9. Mofongo");
				
				
			    System.out.println("****************");
		        int i = sc.nextInt();
		         switch (i) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Flying Fish", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Cou-Cou", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Baiga Choka(Roasted Eggplant)", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Conch Ceviche", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Pineapple Chow", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Gizzada", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Carribean Roasted Bean", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai("Goat Water", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Mofongo", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;
		         
			case 8: //Japanese 
				System.out.println("Select the Dish");
				System.out.println("1. Hayashi Rice");
				System.out.println("2. Kamameshi");
				System.out.println("3. Katemeshi");
				System.out.println("4. Mochi");
				System.out.println("5. Mugi Gohan");
				System.out.println("6. Ochazuke");
				System.out.println("7. Okowa");
				System.out.println("8. Omurice");
				System.out.println("9. Onigiri");
				
				
			    System.out.println("****************");
		        int j = sc.nextInt();
		         switch (j) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Hayashi Rice", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Kamameshi", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Katemeshi", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Mochi", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Mugi Gohan", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Ochazuke", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Okowa", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai(" Omurice", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Onigiri", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;     
			case 9: //Arabic
				System.out.println("Select the Dish");
				System.out.println("1. Hummus");
				System.out.println("2. Manakeesh");
				System.out.println("3. Grilled halloumi");
				System.out.println("4. Foul meddamas");
				System.out.println("5. Falafel");
				System.out.println("6. Tabouleh");
				System.out.println("7. Moutabal/baba ghanoush");
				System.out.println("8. Fattoush");
				System.out.println("9. Arabic Special");
				
				
			    System.out.println("*********************************");
		        int k = sc.nextInt();
		         switch (k) 
		         {
				case 1:
					Mumbai arabic1 = new Mumbai("Hummus", 400, "Chicken","3 Peoples");
					arabic1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai arabic2 = new Mumbai("Manakeesh", 360, "Butter","2 Peoples");
					arabic2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai arabic3 = new Mumbai("Grilled halloumi", 210, "Masala","6 Peoples");
					arabic3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai arabic4 = new Mumbai("Foul meddamas", 600, "Masala","3 Peoples");
					arabic4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai arabic5 = new Mumbai("Falafel", 360, "Masala","4 Peoples");
					arabic5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai arabic6 = new Mumbai("Tabouleh", 360, "Butter","2 Peoples");
					arabic6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai arabic7 = new Mumbai("Moutabal/baba ghanoush", 210, "Masala","6 Peoples");
					arabic7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai arabic8 = new Mumbai("Fattoush", 600, "Masala","3 Peoples");
					arabic8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai arabic9 = new Mumbai("Arabic Special", 360, "Masala","4 Peoples");
					arabic9.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;       	
			
 }
			
		case 6://Chennai
			System.out.println("Thankyou for choosing Chennai");
			System.out.println("Select the option from below categories");
			System.out.println("1. Veg Cuisine");
			System.out.println("2. NonVeg Cuisine");
			System.out.println("3. Chinese Cuisine");
			System.out.println("4. Italian Cuisine");
			System.out.println("5. Korean Cuisine");
			System.out.println("6. German Cuisine");
			System.out.println("7. Carribean Cuisine");
			System.out.println("8. Japanese Cuisine");
			System.out.println("9. Arabic Cuisine");
			System.out.println("****************");
			int b5 = sc.nextInt();
			switch (b5)
			{
			case 1://Veg
				System.out.println("Select the Dish");
				System.out.println("1. Tawa Pulav");
				System.out.println("2. PavBhaji");
				System.out.println("3. Chole Bhatore");
				System.out.println("4. Shahi Paneer");
				System.out.println("5. Soyabean");
				System.out.println("6. Puranpoli");
				System.out.println("7. Veg Kofta Roti");
				System.out.println("8. Veg Korma Rice");
				System.out.println("9. Veg Biryani");
				
			    System.out.println("****************");
	            int c = sc.nextInt();
	             switch (c) 
	             {
				case 1://case dish
					//String Platename, int Price, String Speciality, String Suitable
					Mumbai Veg = new Mumbai("Tawa Pulav", 210, "Basmati Rice","2 Peoples");
					Veg.mumbaiDetails();
				   //System.out.println(Veg.getPlatename());
				   //Veg.setPlatename("Veg Biryani");
				   //System.out.println(Veg.getPlatename());
					//System.out.println("Enter 1 for Order confirming  ");
					
					p.payment();
					
					
			
							
					break;
				case 2:
					Mumbai Veg1 = new Mumbai("PavBhaji", 210, "Basmati Rice","3 Peoples");
					Veg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Veg2 = new Mumbai("Chole Bhatore", 210, "Basmati Rice","2 Peoples");
					Veg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Veg3 = new Mumbai("Shahi Paneer", 210, "Basmati Rice","3 Peoples");
					Veg3.mumbaiDetails();
					p.payment();
					break;	
				case 5: 
					Mumbai Veg4 = new Mumbai("Soyabean", 410, "Soyabean", " 4 peoples");
					Veg4.mumbaiDetails();
					p.payment();
					break;
				case 6: 
					Mumbai Veg5 = new Mumbai("Puranpoli", 410, "Soyabean", " 4 peoples");
					Veg5.mumbaiDetails();
					p.payment();
					break;
				case 7: 
					Mumbai Veg6 = new Mumbai("Veg Kofta Roti", 410, "Soyabean", " 4 peoples");
					Veg6.mumbaiDetails();
					p.payment();
					break;
				case 8: 
					Mumbai Veg7 = new Mumbai("Veg Korma Rice", 410, "Soyabean", " 4 peoples");
					Veg7.mumbaiDetails();
					p.payment();
					break;
				case 9: 
					Mumbai Veg8 = new Mumbai("Veg Biryani", 410, "Soyabean", " 4 peoples");
					Veg8.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
	             }
	             return;
			case 2://Non-veg
				System.out.println("Select the Dish");
				System.out.println("1. Chicken Curry");
				System.out.println("2. Butter Chicken");
				System.out.println("3. Chicken Tikka Masala");
				System.out.println("4. Afgani Chicken");
				System.out.println("5. Fried Chicken Rassa");
				System.out.println("6. Prawn Curry Masala");
				System.out.println("7. Mutton Curry");
				System.out.println("8. Chicken Biryani");
				System.out.println("9. Chicken Shorma");
			    System.out.println("****************");
	            int d = sc.nextInt();
	             switch (d) 
	             {
				case 1:
					
					Mumbai NonVeg = new Mumbai("Chicken Curry", 400, "Chicken","3 Peoples");
					NonVeg.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai NonVeg1 = new Mumbai("Butter Chicken", 360, "Butter","2 Peoples");
					NonVeg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai NonVeg2 = new Mumbai("Chicken Tikka Masala", 210, "Masala","6 Peoples");
					NonVeg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai NonVeg3 = new Mumbai("Afgani Chicken", 600, "Masala","3 Peoples");
					NonVeg3.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai NonVeg4 = new Mumbai("Fried Chicken Rassa", 360, "Masala","4 Peoples");
					NonVeg4.mumbaiDetails();
					p.payment();
					break;	
				case 6:
					Mumbai NonVeg5 = new Mumbai("Prawn Curry Masala", 360, "Butter","2 Peoples");
					NonVeg5.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai NonVeg6 = new Mumbai("Mutton Curry", 210, "Masala","6 Peoples");
					NonVeg6.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai NonVeg7 = new Mumbai("Chicken Biryani", 600, "Masala","3 Peoples");
					NonVeg7.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai NonVeg8 = new Mumbai("Chicken Shorma", 360, "Masala","4 Peoples");
					NonVeg8.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
	             }
	             return; 
		 
				
			case 3: //Chinese
					System.out.println("Select the Dish");
					System.out.println("1. Chicken Fried Rice");
					System.out.println("2. Chicken Noodles");
					System.out.println("3. Chicken Chilly");
					System.out.println("4. Triple Rice");
					System.out.println("5. Triple Noodles");
					System.out.println("6. Chicken 65");
					System.out.println("7. Tandoori Chicken");
					System.out.println("8. Chicken Soup");
					System.out.println("9. Crispy Chicken");
				    System.out.println("****************");
		            int e = sc.nextInt();
		             switch (e) 
		             {
					case 1:
						Mumbai Chinese1 = new Mumbai("Chicken Fried Rice", 400, "Chicken","3 Peoples");
						Chinese1.mumbaiDetails();
						p.payment();
						break;
					case 2:
						Mumbai Chinese2 = new Mumbai("Chicken Noodles", 360, "Butter","2 Peoples");
						Chinese2.mumbaiDetails();
						p.payment();
						break;
					case 3:
						Mumbai Chinese3 = new Mumbai("Chicken Chilly", 210, "Masala","6 Peoples");
						Chinese3.mumbaiDetails();
						p.payment();
						break;
					case 4:
						Mumbai Chinese4 = new Mumbai("Triple Rice", 600, "Masala","3 Peoples");
						Chinese4.mumbaiDetails();
						p.payment();
						break;
					case 5:
						Mumbai Chinese5 = new Mumbai("Triple Noodles", 360, "Masala","4 Peoples");
						Chinese5.mumbaiDetails();
						p.payment();
						break;		
					case 6:
						Mumbai Chinese6 = new Mumbai("Chicken 65", 360, "Butter","2 Peoples");
						Chinese6.mumbaiDetails();
						p.payment();
						break;
					case 7:
						Mumbai Chinese7 = new Mumbai("Tandoori Chicken", 210, "Masala","6 Peoples");
						Chinese7.mumbaiDetails();
						p.payment();
						break;
					case 8:
						Mumbai Chinese8 = new Mumbai("Chicken Soup", 600, "Masala","3 Peoples");
						Chinese8.mumbaiDetails();
						p.payment();
						break;
					case 9:
						Mumbai Chinese9 = new Mumbai("Crispy Chicken", 360, "Masala","4 Peoples");
						Chinese9.mumbaiDetails();
						p.payment();
						break;	
					default:
						System.out.println("invalid select correct options");
				
		             }
		             return;
			case 4: //Itailian
				System.out.println("Select the Dish");
				System.out.println("1. Polento");
				System.out.println("2. Ravioli");
				System.out.println("3. Ribollita");
				System.out.println("4. Italian Pasta");
				System.out.println("5. Arancini");
				System.out.println("6. Risotto Alla Milanse");
				System.out.println("7. Lasagne");
				System.out.println("8. Osso Buco");
				System.out.println("9. Neapolitan Pizza");
				
				
			    System.out.println("****************");
	            int f = sc.nextInt();
	             switch (f) 
	             {
				case 1:
					Mumbai Itailian1 = new Mumbai("Polento", 400, "Chicken","3 Peoples");
					Itailian1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai Itailian2 = new Mumbai("Ravioli", 360, "Butter","2 Peoples");
					Itailian2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Itailian3 = new Mumbai("Ribollita", 210, "Masala","6 Peoples");
					Itailian3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Itailian4 = new Mumbai("Italian Pasta", 600, "Masala","3 Peoples");
					Itailian4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai Itailian5 = new Mumbai("Arancini", 360, "Masala","4 Peoples");
					Itailian5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai Itailian6 = new Mumbai("Risotto Alla Milanse", 360, "Butter","2 Peoples");
					Itailian6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai Itailian7 = new Mumbai("Lasagne", 210, "Masala","6 Peoples");
					Itailian7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai Itailian8 = new Mumbai("Osso Buco", 600, "Masala","3 Peoples");
					Itailian8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai Itailian9 = new Mumbai("Neapolitan Pizza", 360, "Masala","4 Peoples");
					Itailian9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
					
			
	             }
	             return;
			//}
			case 5: //Korean
				System.out.println("Select the Dish");
				System.out.println("1. Hangover stew  ");
				System.out.println("2. Kimchi ");
				System.out.println("3. Soft Tofu Stew ");
				System.out.println("4. Samgyeopsal ");
				System.out.println("5. Jjajangmyeon ");
				System.out.println("6. Chimaek ");
				System.out.println("7. Instant noodles ");
				System.out.println("8. Kimchi Stew ");
				System.out.println("9. Korean Special Resto");
				
				
			    System.out.println("************************************************");
	            int g = sc.nextInt();
	             switch (g) 
	             {
				case 1:
					Mumbai korean1 = new Mumbai("Hangover stew ", 400, "Chicken","3 Peoples");
					korean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai korean2 = new Mumbai("Kimchi ", 360, "Butter","2 Peoples");
					korean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai korean3 = new Mumbai("Soft Tofu Stew ", 210, "Masala","6 Peoples");
					korean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai korean4 = new Mumbai("Samgyeopsal ", 600, "Masala","3 Peoples");
					korean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai korean5 = new Mumbai("Jjajangmyeon ", 360, "Masala","4 Peoples");
					korean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai korean6 = new Mumbai("Chimaek ", 360, "Butter","2 Peoples");
					korean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai korean7 = new Mumbai("Instant noodles ", 210, "Masala","6 Peoples");
					korean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai korean8 = new Mumbai("Kimchi Stew ", 600, "Masala","3 Peoples");
					korean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai korean9 = new Mumbai("Korean Special Resto", 360, "Masala","4 Peoples");
					korean9.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
			
	             }
	             return;
		//	}
			case 6: //German 
			System.out.println("Select the Dish");
			System.out.println("1. Doner Kebab");
			System.out.println("2. Currywurst");
			System.out.println("3. Bratwurst");
			System.out.println("4. Sauerbraten");
			System.out.println("5. Marzipan");
			System.out.println("6. Kohlrouloda");
			System.out.println("7. Stollen");
			System.out.println("8. Spatzle");
			System.out.println("9. German Sandwich");
			
			
		    System.out.println("****************");
	        int h = sc.nextInt();
	         switch (h) 
	         {
			case 1:
				Mumbai german1 = new Mumbai("Doner Kebab", 400, "Chicken","3 Peoples");
				german1.mumbaiDetails();
				p.payment();
				break;
			case 2:
				Mumbai german2 = new Mumbai("Currywurst", 360, "Butter","2 Peoples");
				german2.mumbaiDetails();
				p.payment();
				break;
			case 3:
				Mumbai german3 = new Mumbai("Bratwurst", 210, "Masala","6 Peoples");
				german3.mumbaiDetails();
				p.payment();
				break;
			case 4:
				Mumbai german4 = new Mumbai("Sauerbraten", 600, "Masala","3 Peoples");
				german4.mumbaiDetails();
				p.payment();
				break;
			case 5:
				Mumbai german5 = new Mumbai("Marzipan", 360, "Masala","4 Peoples");
				german5.mumbaiDetails();
				p.payment();
				break;		
			case 6:
				Mumbai german6 = new Mumbai("Kohlrouloda", 360, "Butter","2 Peoples");
				german6.mumbaiDetails();
				p.payment();
				break;
			case 7:
				Mumbai german7 = new Mumbai("Stollen", 210, "Masala","6 Peoples");
				german7.mumbaiDetails();
				p.payment();
				break;
			case 8:
				Mumbai german8 = new Mumbai("Spatzle", 600, "Masala","3 Peoples");
				german8.mumbaiDetails();
				p.payment();
				break;
			case 9:
				Mumbai german9 = new Mumbai("German Sandwich", 360, "Masala","4 Peoples");
				german9.mumbaiDetails();
				p.payment();
				break;	
			default:
				System.out.println("invalid select correct options");
		
	         }
	         return;
	         
	         
			case 7: //Carribean 
				System.out.println("Select the Dish");
				System.out.println("1. Flying Fish");
				System.out.println("2. Cou-Cou");
				System.out.println("3. Baiga Choka(Roasted Eggplant)");
				System.out.println("4. Conch Ceviche");
				System.out.println("5. Pineapple Chow");
				System.out.println("6. Gizzada");
				System.out.println("7. Carribean Roasted Bean");
				System.out.println("8. Goat Water");
				System.out.println("9. Mofongo");
				
				
			    System.out.println("****************");
		        int i = sc.nextInt();
		         switch (i) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Flying Fish", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Cou-Cou", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Baiga Choka(Roasted Eggplant)", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Conch Ceviche", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Pineapple Chow", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Gizzada", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Carribean Roasted Bean", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai("Goat Water", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Mofongo", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;
		         
			case 8: //Japanese 
				System.out.println("Select the Dish");
				System.out.println("1. Hayashi Rice");
				System.out.println("2. Kamameshi");
				System.out.println("3. Katemeshi");
				System.out.println("4. Mochi");
				System.out.println("5. Mugi Gohan");
				System.out.println("6. Ochazuke");
				System.out.println("7. Okowa");
				System.out.println("8. Omurice");
				System.out.println("9. Onigiri");
				
				
			    System.out.println("****************");
		        int j = sc.nextInt();
		         switch (j) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Hayashi Rice", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Kamameshi", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Katemeshi", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Mochi", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Mugi Gohan", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Ochazuke", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Okowa", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai(" Omurice", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Onigiri", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;     
			case 9: //Arabic
				System.out.println("Select the Dish");
				System.out.println("1. Hummus");
				System.out.println("2. Manakeesh");
				System.out.println("3. Grilled halloumi");
				System.out.println("4. Foul meddamas");
				System.out.println("5. Falafel");
				System.out.println("6. Tabouleh");
				System.out.println("7. Moutabal/baba ghanoush");
				System.out.println("8. Fattoush");
				System.out.println("9. Arabic Special");
				
				
			    System.out.println("*********************************");
		        int k = sc.nextInt();
		         switch (k) 
		         {
				case 1:
					Mumbai arabic1 = new Mumbai("Hummus", 400, "Chicken","3 Peoples");
					arabic1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai arabic2 = new Mumbai("Manakeesh", 360, "Butter","2 Peoples");
					arabic2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai arabic3 = new Mumbai("Grilled halloumi", 210, "Masala","6 Peoples");
					arabic3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai arabic4 = new Mumbai("Foul meddamas", 600, "Masala","3 Peoples");
					arabic4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai arabic5 = new Mumbai("Falafel", 360, "Masala","4 Peoples");
					arabic5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai arabic6 = new Mumbai("Tabouleh", 360, "Butter","2 Peoples");
					arabic6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai arabic7 = new Mumbai("Moutabal/baba ghanoush", 210, "Masala","6 Peoples");
					arabic7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai arabic8 = new Mumbai("Fattoush", 600, "Masala","3 Peoples");
					arabic8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai arabic9 = new Mumbai("", 360, "Masala","4 Peoples");
					arabic9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;       				
		
}
		case 7://Kolkata
			System.out.println("Thankyou for choosing Kolkata");
			System.out.println("Select the option from below categories");
			System.out.println("1. Veg Cuisine");
			System.out.println("2. NonVeg Cuisine");
			System.out.println("3. Chinese Cuisine");
			System.out.println("4. Italian Cuisine");
			System.out.println("5. Korean Cuisine");
			System.out.println("6. German Cuisine");
			System.out.println("7. Carribean Cuisine");
			System.out.println("8. Japanese Cuisine");
			System.out.println("9. Arabic Cuisine");
			System.out.println("****************");
			int b6 = sc.nextInt();
			switch (b6)
			{
			case 1://Veg
				System.out.println("Select the Dish");
				System.out.println("1. Tawa Pulav");
				System.out.println("2. PavBhaji");
				System.out.println("3. Chole Bhatore");
				System.out.println("4. Shahi Paneer");
				System.out.println("5. Soyabean");
				System.out.println("6. Puranpoli");
				System.out.println("7. Veg Kofta Roti");
				System.out.println("8. Veg Korma Rice");
				System.out.println("9. Veg Biryani");
				
			    System.out.println("****************");
	            int c = sc.nextInt();
	             switch (c) 
	             {
				case 1://case dish
					//String Platename, int Price, String Speciality, String Suitable
					Mumbai Veg = new Mumbai("Tawa Pulav", 210, "Basmati Rice","2 Peoples");
					Veg.mumbaiDetails();
				   //System.out.println(Veg.getPlatename());
				   //Veg.setPlatename("Veg Biryani");
				   //System.out.println(Veg.getPlatename());
					//System.out.println("Enter 1 for Order confirming  ");
					
					p.payment();
					
					
			
							
					break;
				case 2:
					Mumbai Veg1 = new Mumbai("PavBhaji", 210, "Basmati Rice","3 Peoples");
					Veg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Veg2 = new Mumbai("Chole Bhatore", 210, "Basmati Rice","2 Peoples");
					Veg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Veg3 = new Mumbai("Shahi Paneer", 210, "Basmati Rice","3 Peoples");
					Veg3.mumbaiDetails();
					p.payment();
					break;	
				case 5: 
					Mumbai Veg4 = new Mumbai("Soyabean", 410, "Soyabean", " 4 peoples");
					Veg4.mumbaiDetails();
					p.payment();
					break;
				case 6: 
					Mumbai Veg5 = new Mumbai("Puranpoli", 410, "Soyabean", " 4 peoples");
					Veg5.mumbaiDetails();
					p.payment();
					break;
				case 7: 
					Mumbai Veg6 = new Mumbai("Veg Kofta Roti", 410, "Soyabean", " 4 peoples");
					Veg6.mumbaiDetails();
					p.payment();
					break;
				case 8: 
					Mumbai Veg7 = new Mumbai("Veg Korma Rice", 410, "Soyabean", " 4 peoples");
					Veg7.mumbaiDetails();
					p.payment();
					break;
				case 9: 
					Mumbai Veg8 = new Mumbai("Veg Biryani", 410, "Soyabean", " 4 peoples");
					Veg8.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
	             }
	             return;
			case 2://Non-veg
				System.out.println("Select the Dish");
				System.out.println("1. Chicken Curry");
				System.out.println("2. Butter Chicken");
				System.out.println("3. Chicken Tikka Masala");
				System.out.println("4. Afgani Chicken");
				System.out.println("5. Fried Chicken Rassa");
				System.out.println("6. Prawn Curry Masala");
				System.out.println("7. Mutton Curry");
				System.out.println("8. Chicken Biryani");
				System.out.println("9. Chicken Shorma");
			    System.out.println("****************");
	            int d = sc.nextInt();
	             switch (d) 
	             {
				case 1:
					
					Mumbai NonVeg = new Mumbai("Chicken Curry", 400, "Chicken","3 Peoples");
					NonVeg.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai NonVeg1 = new Mumbai("Butter Chicken", 360, "Butter","2 Peoples");
					NonVeg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai NonVeg2 = new Mumbai("Chicken Tikka Masala", 210, "Masala","6 Peoples");
					NonVeg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai NonVeg3 = new Mumbai("Afgani Chicken", 600, "Masala","3 Peoples");
					NonVeg3.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai NonVeg4 = new Mumbai("Fried Chicken Rassa", 360, "Masala","4 Peoples");
					NonVeg4.mumbaiDetails();
					p.payment();
					break;	
				case 6:
					Mumbai NonVeg5 = new Mumbai("Prawn Curry Masala", 360, "Butter","2 Peoples");
					NonVeg5.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai NonVeg6 = new Mumbai("Mutton Curry", 210, "Masala","6 Peoples");
					NonVeg6.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai NonVeg7 = new Mumbai("Chicken Biryani", 600, "Masala","3 Peoples");
					NonVeg7.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai NonVeg8 = new Mumbai("Chicken Shorma", 360, "Masala","4 Peoples");
					NonVeg8.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
	             }
	             return; 
		 
				
			case 3: //Chinese
					System.out.println("Select the Dish");
					System.out.println("1. Chicken Fried Rice");
					System.out.println("2. Chicken Noodles");
					System.out.println("3. Chicken Chilly");
					System.out.println("4. Triple Rice");
					System.out.println("5. Triple Noodles");
					System.out.println("6. Chicken 65");
					System.out.println("7. Tandoori Chicken");
					System.out.println("8. Chicken Soup");
					System.out.println("9. Crispy Chicken");
				    System.out.println("****************");
		            int e = sc.nextInt();
		             switch (e) 
		             {
					case 1:
						Mumbai Chinese1 = new Mumbai("Chicken Fried Rice", 400, "Chicken","3 Peoples");
						Chinese1.mumbaiDetails();
						p.payment();
						break;
					case 2:
						Mumbai Chinese2 = new Mumbai("Chicken Noodles", 360, "Butter","2 Peoples");
						Chinese2.mumbaiDetails();
						p.payment();
						break;
					case 3:
						Mumbai Chinese3 = new Mumbai("Chicken Chilly", 210, "Masala","6 Peoples");
						Chinese3.mumbaiDetails();
						p.payment();
						break;
					case 4:
						Mumbai Chinese4 = new Mumbai("Triple Rice", 600, "Masala","3 Peoples");
						Chinese4.mumbaiDetails();
						p.payment();
						break;
					case 5:
						Mumbai Chinese5 = new Mumbai("Triple Noodles", 360, "Masala","4 Peoples");
						Chinese5.mumbaiDetails();
						p.payment();
						break;		
					case 6:
						Mumbai Chinese6 = new Mumbai("Chicken 65", 360, "Butter","2 Peoples");
						Chinese6.mumbaiDetails();
						p.payment();
						break;
					case 7:
						Mumbai Chinese7 = new Mumbai("Tandoori Chicken", 210, "Masala","6 Peoples");
						Chinese7.mumbaiDetails();
						p.payment();
						break;
					case 8:
						Mumbai Chinese8 = new Mumbai("Chicken Soup", 600, "Masala","3 Peoples");
						Chinese8.mumbaiDetails();
						p.payment();
						break;
					case 9:
						Mumbai Chinese9 = new Mumbai("Crispy Chicken", 360, "Masala","4 Peoples");
						Chinese9.mumbaiDetails();
						p.payment();
						break;	
					default:
						System.out.println("invalid select correct options");
				
		             }
		             return;
			case 4: //Itailian
				System.out.println("Select the Dish");
				System.out.println("1. Polento");
				System.out.println("2. Ravioli");
				System.out.println("3. Ribollita");
				System.out.println("4. Italian Pasta");
				System.out.println("5. Arancini");
				System.out.println("6. Risotto Alla Milanse");
				System.out.println("7. Lasagne");
				System.out.println("8. Osso Buco");
				System.out.println("9. Neapolitan Pizza");
				
				
			    System.out.println("****************");
	            int f = sc.nextInt();
	             switch (f) 
	             {
				case 1:
					Mumbai Itailian1 = new Mumbai("Polento", 400, "Chicken","3 Peoples");
					Itailian1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai Itailian2 = new Mumbai("Ravioli", 360, "Butter","2 Peoples");
					Itailian2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Itailian3 = new Mumbai("Ribollita", 210, "Masala","6 Peoples");
					Itailian3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Itailian4 = new Mumbai("Italian Pasta", 600, "Masala","3 Peoples");
					Itailian4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai Itailian5 = new Mumbai("Arancini", 360, "Masala","4 Peoples");
					Itailian5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai Itailian6 = new Mumbai("Risotto Alla Milanse", 360, "Butter","2 Peoples");
					Itailian6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai Itailian7 = new Mumbai("Lasagne", 210, "Masala","6 Peoples");
					Itailian7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai Itailian8 = new Mumbai("Osso Buco", 600, "Masala","3 Peoples");
					Itailian8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai Itailian9 = new Mumbai("Neapolitan Pizza", 360, "Masala","4 Peoples");
					Itailian9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
					
			
	             }
	             return;
			//}
			case 5: //Korean
				System.out.println("Select the Dish");
				System.out.println("1. Hangover stew  ");
				System.out.println("2. Kimchi ");
				System.out.println("3. Soft Tofu Stew ");
				System.out.println("4. Samgyeopsal ");
				System.out.println("5. Jjajangmyeon ");
				System.out.println("6. Chimaek ");
				System.out.println("7. Instant noodles ");
				System.out.println("8. Kimchi Stew ");
				System.out.println("9. Korean Special Resto");
				
				
			    System.out.println("************************************************");
	            int g = sc.nextInt();
	             switch (g) 
	             {
				case 1:
					Mumbai korean1 = new Mumbai("Hangover stew ", 400, "Chicken","3 Peoples");
					korean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai korean2 = new Mumbai("Kimchi ", 360, "Butter","2 Peoples");
					korean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai korean3 = new Mumbai("Soft Tofu Stew ", 210, "Masala","6 Peoples");
					korean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai korean4 = new Mumbai("Samgyeopsal ", 600, "Masala","3 Peoples");
					korean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai korean5 = new Mumbai("Jjajangmyeon ", 360, "Masala","4 Peoples");
					korean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai korean6 = new Mumbai("Chimaek ", 360, "Butter","2 Peoples");
					korean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai korean7 = new Mumbai("Instant noodles ", 210, "Masala","6 Peoples");
					korean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai korean8 = new Mumbai("Kimchi Stew ", 600, "Masala","3 Peoples");
					korean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai korean9 = new Mumbai("Korean Special Resto", 360, "Masala","4 Peoples");
					korean9.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
			
	             }
	             return;
		//	}
			case 6: //German 
			System.out.println("Select the Dish");
			System.out.println("1. Doner Kebab");
			System.out.println("2. Currywurst");
			System.out.println("3. Bratwurst");
			System.out.println("4. Sauerbraten");
			System.out.println("5. Marzipan");
			System.out.println("6. Kohlrouloda");
			System.out.println("7. Stollen");
			System.out.println("8. Spatzle");
			System.out.println("9. German Sandwich");
			
			
		    System.out.println("****************");
	        int h = sc.nextInt();
	         switch (h) 
	         {
			case 1:
				Mumbai german1 = new Mumbai("Doner Kebab", 400, "Chicken","3 Peoples");
				german1.mumbaiDetails();
				p.payment();
				break;
			case 2:
				Mumbai german2 = new Mumbai("Currywurst", 360, "Butter","2 Peoples");
				german2.mumbaiDetails();
				p.payment();
				break;
			case 3:
				Mumbai german3 = new Mumbai("Bratwurst", 210, "Masala","6 Peoples");
				german3.mumbaiDetails();
				p.payment();
				break;
			case 4:
				Mumbai german4 = new Mumbai("Sauerbraten", 600, "Masala","3 Peoples");
				german4.mumbaiDetails();
				p.payment();
				break;
			case 5:
				Mumbai german5 = new Mumbai("Marzipan", 360, "Masala","4 Peoples");
				german5.mumbaiDetails();
				p.payment();
				break;		
			case 6:
				Mumbai german6 = new Mumbai("Kohlrouloda", 360, "Butter","2 Peoples");
				german6.mumbaiDetails();
				p.payment();
				break;
			case 7:
				Mumbai german7 = new Mumbai("Stollen", 210, "Masala","6 Peoples");
				german7.mumbaiDetails();
				p.payment();
				break;
			case 8:
				Mumbai german8 = new Mumbai("Spatzle", 600, "Masala","3 Peoples");
				german8.mumbaiDetails();
				p.payment();
				break;
			case 9:
				Mumbai german9 = new Mumbai("German Sandwich", 360, "Masala","4 Peoples");
				german9.mumbaiDetails();
				p.payment();
				break;
			default:
				System.out.println("invalid select correct options");
		
	         }
	         return;
	         
	         
			case 7: //Carribean 
				System.out.println("Select the Dish");
				System.out.println("1. Flying Fish");
				System.out.println("2. Cou-Cou");
				System.out.println("3. Baiga Choka(Roasted Eggplant)");
				System.out.println("4. Conch Ceviche");
				System.out.println("5. Pineapple Chow");
				System.out.println("6. Gizzada");
				System.out.println("7. Carribean Roasted Bean");
				System.out.println("8. Goat Water");
				System.out.println("9. Mofongo");
				
				
			    System.out.println("****************");
		        int i = sc.nextInt();
		         switch (i) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Flying Fish", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Cou-Cou", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Baiga Choka(Roasted Eggplant)", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Conch Ceviche", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Pineapple Chow", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Gizzada", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Carribean Roasted Bean", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai("Goat Water", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Mofongo", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;
		         
			case 8: //Japanese 
				System.out.println("Select the Dish");
				System.out.println("1. Hayashi Rice");
				System.out.println("2. Kamameshi");
				System.out.println("3. Katemeshi");
				System.out.println("4. Mochi");
				System.out.println("5. Mugi Gohan");
				System.out.println("6. Ochazuke");
				System.out.println("7. Okowa");
				System.out.println("8. Omurice");
				System.out.println("9. Onigiri");
				
				
			    System.out.println("****************");
		        int j = sc.nextInt();
		         switch (j) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Hayashi Rice", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Kamameshi", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Katemeshi", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Mochi", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Mugi Gohan", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Ochazuke", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Okowa", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai(" Omurice", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Onigiri", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;     
			case 9: //Arabic
				System.out.println("Select the Dish");
				System.out.println("1. Hummus");
				System.out.println("2. Manakeesh");
				System.out.println("3. Grilled halloumi");
				System.out.println("4. Foul meddamas");
				System.out.println("5. Falafel");
				System.out.println("6. Tabouleh");
				System.out.println("7. Moutabal/baba ghanoush");
				System.out.println("8. Fattoush");
				System.out.println("9. Arabic Special");
				
				
			    System.out.println("*********************************");
		        int k = sc.nextInt();
		         switch (k) 
		         {
				case 1:
					Mumbai arabic1 = new Mumbai("Hummus", 400, "Chicken","3 Peoples");
					arabic1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai arabic2 = new Mumbai("Manakeesh", 360, "Butter","2 Peoples");
					arabic2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai arabic3 = new Mumbai("Grilled halloumi", 210, "Masala","6 Peoples");
					arabic3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai arabic4 = new Mumbai("Foul meddamas", 600, "Masala","3 Peoples");
					arabic4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai arabic5 = new Mumbai("Falafel", 360, "Masala","4 Peoples");
					arabic5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai arabic6 = new Mumbai("Tabouleh", 360, "Butter","2 Peoples");
					arabic6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai arabic7 = new Mumbai("Moutabal/baba ghanoush", 210, "Masala","6 Peoples");
					arabic7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai arabic8 = new Mumbai("Fattoush", 600, "Masala","3 Peoples");
					arabic8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai arabic9 = new Mumbai("", 360, "Masala","4 Peoples");
					arabic9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;       	
 }
	
			
		case 8://Rajkot
			System.out.println("Thankyou for choosing Rajkot");
			System.out.println("Select the option from below categories");
			System.out.println("1. Veg Cuisine");
			System.out.println("2. NonVeg Cuisine");
			System.out.println("3. Chinese Cuisine");
			System.out.println("4. Italian Cuisine");
			System.out.println("5. Korean Cuisine");
			System.out.println("6. German Cuisine");
			System.out.println("7. Carribean Cuisine");
			System.out.println("8. Japanese Cuisine");
			System.out.println("9. Arabic Cuisine");
			System.out.println("****************");
			int b7 = sc.nextInt();
			switch (b7)
			{
			case 1://Veg
				System.out.println("Select the Dish");
				System.out.println("1. Tawa Pulav");
				System.out.println("2. PavBhaji");
				System.out.println("3. Chole Bhatore");
				System.out.println("4. Shahi Paneer");
				System.out.println("5. Soyabean");
				System.out.println("6. Puranpoli");
				System.out.println("7. Veg Kofta Roti");
				System.out.println("8. Veg Korma Rice");
				System.out.println("9. Veg Biryani");
				
			    System.out.println("****************");
	            int c = sc.nextInt();
	             switch (c) 
	             {
				case 1://case dish
					//String Platename, int Price, String Speciality, String Suitable
					Mumbai Veg = new Mumbai("Tawa Pulav", 210, "Basmati Rice","2 Peoples");
					Veg.mumbaiDetails();
				   //System.out.println(Veg.getPlatename());
				   //Veg.setPlatename("Veg Biryani");
				   //System.out.println(Veg.getPlatename());
					//System.out.println("Enter 1 for Order confirming  ");
					
					p.payment();
					
					
			
							
					break;
				case 2:
					Mumbai Veg1 = new Mumbai("PavBhaji", 210, "Basmati Rice","3 Peoples");
					Veg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Veg2 = new Mumbai("Chole Bhatore", 210, "Basmati Rice","2 Peoples");
					Veg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Veg3 = new Mumbai("Shahi Paneer", 210, "Basmati Rice","3 Peoples");
					Veg3.mumbaiDetails();
					p.payment();
					break;	
				case 5: 
					Mumbai Veg4 = new Mumbai("Soyabean", 410, "Soyabean", " 4 peoples");
					Veg4.mumbaiDetails();
					p.payment();
					break;
				case 6: 
					Mumbai Veg5 = new Mumbai("Puranpoli", 410, "Soyabean", " 4 peoples");
					Veg5.mumbaiDetails();
					p.payment();
					break;
				case 7: 
					Mumbai Veg6 = new Mumbai("Veg Kofta Roti", 410, "Soyabean", " 4 peoples");
					Veg6.mumbaiDetails();
					p.payment();
					break;
				case 8: 
					Mumbai Veg7 = new Mumbai("Veg Korma Rice", 410, "Soyabean", " 4 peoples");
					Veg7.mumbaiDetails();
					p.payment();
					break;
				case 9: 
					Mumbai Veg8 = new Mumbai("Veg Biryani", 410, "Soyabean", " 4 peoples");
					Veg8.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
	             }
	             return;
			case 2://Non-veg
				System.out.println("Select the Dish");
				System.out.println("1. Chicken Curry");
				System.out.println("2. Butter Chicken");
				System.out.println("3. Chicken Tikka Masala");
				System.out.println("4. Afgani Chicken");
				System.out.println("5. Fried Chicken Rassa");
				System.out.println("6. Prawn Curry Masala");
				System.out.println("7. Mutton Curry");
				System.out.println("8. Chicken Biryani");
				System.out.println("9. Chicken Shorma");
			    System.out.println("****************");
	            int d = sc.nextInt();
	             switch (d) 
	             {
				case 1:
					
					Mumbai NonVeg = new Mumbai("Chicken Curry", 400, "Chicken","3 Peoples");
					NonVeg.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai NonVeg1 = new Mumbai("Butter Chicken", 360, "Butter","2 Peoples");
					NonVeg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai NonVeg2 = new Mumbai("Chicken Tikka Masala", 210, "Masala","6 Peoples");
					NonVeg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai NonVeg3 = new Mumbai("Afgani Chicken", 600, "Masala","3 Peoples");
					NonVeg3.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai NonVeg4 = new Mumbai("Fried Chicken Rassa", 360, "Masala","4 Peoples");
					NonVeg4.mumbaiDetails();
					p.payment();
					break;	
				case 6:
					Mumbai NonVeg5 = new Mumbai("Prawn Curry Masala", 360, "Butter","2 Peoples");
					NonVeg5.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai NonVeg6 = new Mumbai("Mutton Curry", 210, "Masala","6 Peoples");
					NonVeg6.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai NonVeg7 = new Mumbai("Chicken Biryani", 600, "Masala","3 Peoples");
					NonVeg7.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai NonVeg8 = new Mumbai("Chicken Shorma", 360, "Masala","4 Peoples");
					NonVeg8.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
	             }
	             return; 
		 
				
			case 3: //Chinese
					System.out.println("Select the Dish");
					System.out.println("1. Chicken Fried Rice");
					System.out.println("2. Chicken Noodles");
					System.out.println("3. Chicken Chilly");
					System.out.println("4. Triple Rice");
					System.out.println("5. Triple Noodles");
					System.out.println("6. Chicken 65");
					System.out.println("7. Tandoori Chicken");
					System.out.println("8. Chicken Soup");
					System.out.println("9. Crispy Chicken");
				    System.out.println("****************");
		            int e = sc.nextInt();
		             switch (e) 
		             {
					case 1:
						Mumbai Chinese1 = new Mumbai("Chicken Fried Rice", 400, "Chicken","3 Peoples");
						Chinese1.mumbaiDetails();
						p.payment();
						break;
					case 2:
						Mumbai Chinese2 = new Mumbai("Chicken Noodles", 360, "Butter","2 Peoples");
						Chinese2.mumbaiDetails();
						p.payment();
						break;
					case 3:
						Mumbai Chinese3 = new Mumbai("Chicken Chilly", 210, "Masala","6 Peoples");
						Chinese3.mumbaiDetails();
						p.payment();
						break;
					case 4:
						Mumbai Chinese4 = new Mumbai("Triple Rice", 600, "Masala","3 Peoples");
						Chinese4.mumbaiDetails();
						p.payment();
						break;
					case 5:
						Mumbai Chinese5 = new Mumbai("Triple Noodles", 360, "Masala","4 Peoples");
						Chinese5.mumbaiDetails();
						p.payment();
						break;		
					case 6:
						Mumbai Chinese6 = new Mumbai("Chicken 65", 360, "Butter","2 Peoples");
						Chinese6.mumbaiDetails();
						p.payment();
						break;
					case 7:
						Mumbai Chinese7 = new Mumbai("Tandoori Chicken", 210, "Masala","6 Peoples");
						Chinese7.mumbaiDetails();
						p.payment();
						break;
					case 8:
						Mumbai Chinese8 = new Mumbai("Chicken Soup", 600, "Masala","3 Peoples");
						Chinese8.mumbaiDetails();
						p.payment();
						break;
					case 9:
						Mumbai Chinese9 = new Mumbai("Crispy Chicken", 360, "Masala","4 Peoples");
						Chinese9.mumbaiDetails();
						p.payment();
						break;	
					default:
						System.out.println("invalid select correct options");
				
		             }
		             return;
			case 4: //Itailian
				System.out.println("Select the Dish");
				System.out.println("1. Polento");
				System.out.println("2. Ravioli");
				System.out.println("3. Ribollita");
				System.out.println("4. Italian Pasta");
				System.out.println("5. Arancini");
				System.out.println("6. Risotto Alla Milanse");
				System.out.println("7. Lasagne");
				System.out.println("8. Osso Buco");
				System.out.println("9. Neapolitan Pizza");
				
				
			    System.out.println("****************");
	            int f = sc.nextInt();
	             switch (f) 
	             {
				case 1:
					Mumbai Itailian1 = new Mumbai("Polento", 400, "Chicken","3 Peoples");
					Itailian1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai Itailian2 = new Mumbai("Ravioli", 360, "Butter","2 Peoples");
					Itailian2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Itailian3 = new Mumbai("Ribollita", 210, "Masala","6 Peoples");
					Itailian3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Itailian4 = new Mumbai("Italian Pasta", 600, "Masala","3 Peoples");
					Itailian4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai Itailian5 = new Mumbai("Arancini", 360, "Masala","4 Peoples");
					Itailian5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai Itailian6 = new Mumbai("Risotto Alla Milanse", 360, "Butter","2 Peoples");
					Itailian6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai Itailian7 = new Mumbai("Lasagne", 210, "Masala","6 Peoples");
					Itailian7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai Itailian8 = new Mumbai("Osso Buco", 600, "Masala","3 Peoples");
					Itailian8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai Itailian9 = new Mumbai("Neapolitan Pizza", 360, "Masala","4 Peoples");
					Itailian9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
					
			
	             }
	             return;
			//}
			case 5: //Korean
				System.out.println("Select the Dish");
				System.out.println("1. Hangover stew  ");
				System.out.println("2. Kimchi ");
				System.out.println("3. Soft Tofu Stew ");
				System.out.println("4. Samgyeopsal ");
				System.out.println("5. Jjajangmyeon ");
				System.out.println("6. Chimaek ");
				System.out.println("7. Instant noodles ");
				System.out.println("8. Kimchi Stew ");
				System.out.println("9. Korean Special Resto");
				
				
			    System.out.println("************************************************");
	            int g = sc.nextInt();
	             switch (g) 
	             {
				case 1:
					Mumbai korean1 = new Mumbai("Hangover stew ", 400, "Chicken","3 Peoples");
					korean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai korean2 = new Mumbai("Kimchi ", 360, "Butter","2 Peoples");
					korean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai korean3 = new Mumbai("Soft Tofu Stew ", 210, "Masala","6 Peoples");
					korean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai korean4 = new Mumbai("Samgyeopsal ", 600, "Masala","3 Peoples");
					korean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai korean5 = new Mumbai("Jjajangmyeon ", 360, "Masala","4 Peoples");
					korean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai korean6 = new Mumbai("Chimaek ", 360, "Butter","2 Peoples");
					korean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai korean7 = new Mumbai("Instant noodles ", 210, "Masala","6 Peoples");
					korean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai korean8 = new Mumbai("Kimchi Stew ", 600, "Masala","3 Peoples");
					korean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai korean9 = new Mumbai("Korean Special Resto", 360, "Masala","4 Peoples");
					korean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
	             }
	             return;
		//	}
			case 6: //German 
			System.out.println("Select the Dish");
			System.out.println("1. Doner Kebab");
			System.out.println("2. Currywurst");
			System.out.println("3. Bratwurst");
			System.out.println("4. Sauerbraten");
			System.out.println("5. Marzipan");
			System.out.println("6. Kohlrouloda");
			System.out.println("7. Stollen");
			System.out.println("8. Spatzle");
			System.out.println("9. German Sandwich");
			
			
		    System.out.println("****************");
	        int h = sc.nextInt();
	         switch (h) 
	         {
			case 1:
				Mumbai german1 = new Mumbai("Doner Kebab", 400, "Chicken","3 Peoples");
				german1.mumbaiDetails();
				p.payment();
				break;
			case 2:
				Mumbai german2 = new Mumbai("Currywurst", 360, "Butter","2 Peoples");
				german2.mumbaiDetails();
				p.payment();
				break;
			case 3:
				Mumbai german3 = new Mumbai("Bratwurst", 210, "Masala","6 Peoples");
				german3.mumbaiDetails();
				p.payment();
				break;
			case 4:
				Mumbai german4 = new Mumbai("Sauerbraten", 600, "Masala","3 Peoples");
				german4.mumbaiDetails();
				p.payment();
				break;
			case 5:
				Mumbai german5 = new Mumbai("Marzipan", 360, "Masala","4 Peoples");
				german5.mumbaiDetails();
				p.payment();
				break;		
			case 6:
				Mumbai german6 = new Mumbai("Kohlrouloda", 360, "Butter","2 Peoples");
				german6.mumbaiDetails();
				p.payment();
				break;
			case 7:
				Mumbai german7 = new Mumbai("Stollen", 210, "Masala","6 Peoples");
				german7.mumbaiDetails();
				p.payment();
				break;
			case 8:
				Mumbai german8 = new Mumbai("Spatzle", 600, "Masala","3 Peoples");
				german8.mumbaiDetails();
				p.payment();
				break;
			case 9:
				Mumbai german9 = new Mumbai("German Sandwich", 360, "Masala","4 Peoples");
				german9.mumbaiDetails();
				p.payment();
				break;	
			default:
				System.out.println("invalid select correct options");
		
	         }
	         return;
	         
	         
			case 7: //Carribean 
				System.out.println("Select the Dish");
				System.out.println("1. Flying Fish");
				System.out.println("2. Cou-Cou");
				System.out.println("3. Baiga Choka(Roasted Eggplant)");
				System.out.println("4. Conch Ceviche");
				System.out.println("5. Pineapple Chow");
				System.out.println("6. Gizzada");
				System.out.println("7. Carribean Roasted Bean");
				System.out.println("8. Goat Water");
				System.out.println("9. Mofongo");
				
				
			    System.out.println("****************");
		        int i = sc.nextInt();
		         switch (i) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Flying Fish", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Cou-Cou", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Baiga Choka(Roasted Eggplant)", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Conch Ceviche", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Pineapple Chow", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Gizzada", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Carribean Roasted Bean", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai("Goat Water", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Mofongo", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;
		         
			case 8: //Japanese 
				System.out.println("Select the Dish");
				System.out.println("1. Hayashi Rice");
				System.out.println("2. Kamameshi");
				System.out.println("3. Katemeshi");
				System.out.println("4. Mochi");
				System.out.println("5. Mugi Gohan");
				System.out.println("6. Ochazuke");
				System.out.println("7. Okowa");
				System.out.println("8. Omurice");
				System.out.println("9. Onigiri");
				
				
			    System.out.println("****************");
		        int j = sc.nextInt();
		         switch (j) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Hayashi Rice", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Kamameshi", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Katemeshi", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Mochi", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Mugi Gohan", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Ochazuke", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Okowa", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai(" Omurice", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Onigiri", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;     
			case 9: //Arabic
				System.out.println("Select the Dish");
				System.out.println("1. Hummus");
				System.out.println("2. Manakeesh");
				System.out.println("3. Grilled halloumi");
				System.out.println("4. Foul meddamas");
				System.out.println("5. Falafel");
				System.out.println("6. Tabouleh");
				System.out.println("7. Moutabal/baba ghanoush");
				System.out.println("8. Fattoush");
				System.out.println("9. Arabic Special");
				
				
			    System.out.println("*********************************");
		        int k = sc.nextInt();
		         switch (k) 
		         {
				case 1:
					Mumbai arabic1 = new Mumbai("Hummus", 400, "Chicken","3 Peoples");
					arabic1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai arabic2 = new Mumbai("Manakeesh", 360, "Butter","2 Peoples");
					arabic2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai arabic3 = new Mumbai("Grilled halloumi", 210, "Masala","6 Peoples");
					arabic3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai arabic4 = new Mumbai("Foul meddamas", 600, "Masala","3 Peoples");
					arabic4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai arabic5 = new Mumbai("Falafel", 360, "Masala","4 Peoples");
					arabic5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai arabic6 = new Mumbai("Tabouleh", 360, "Butter","2 Peoples");
					arabic6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai arabic7 = new Mumbai("Moutabal/baba ghanoush", 210, "Masala","6 Peoples");
					arabic7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai arabic8 = new Mumbai("Fattoush", 600, "Masala","3 Peoples");
					arabic8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai arabic9 = new Mumbai("", 360, "Masala","4 Peoples");
					arabic9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;       		
 } 
			
		case 9://Surat
			System.out.println("Thankyou for choosing Surat");
			System.out.println("Select the option from below categories");
			System.out.println("1. Veg Cuisine");
			System.out.println("2. NonVeg Cuisine");
			System.out.println("3. Chinese Cuisine");
			System.out.println("4. Italian Cuisine");
			System.out.println("5. Korean Cuisine");
			System.out.println("6. German Cuisine");
			System.out.println("7. Carribean Cuisine");
			System.out.println("8. Japanese Cuisine");
			System.out.println("9. Arabic Cuisine");
			System.out.println("****************");
			int b8 = sc.nextInt();
			switch (b8)
			{
			case 1://Veg
				System.out.println("Select the Dish");
				System.out.println("1. Tawa Pulav");
				System.out.println("2. PavBhaji");
				System.out.println("3. Chole Bhatore");
				System.out.println("4. Shahi Paneer");
				System.out.println("5. Soyabean");
				System.out.println("6. Puranpoli");
				System.out.println("7. Veg Kofta Roti");
				System.out.println("8. Veg Korma Rice");
				System.out.println("9. Veg Biryani");
				
			    System.out.println("****************");
	            int c = sc.nextInt();
	             switch (c) 
	             {
				case 1://case dish
					//String Platename, int Price, String Speciality, String Suitable
					Mumbai Veg = new Mumbai("Tawa Pulav", 210, "Basmati Rice","2 Peoples");
					Veg.mumbaiDetails();
				   //System.out.println(Veg.getPlatename());
				   //Veg.setPlatename("Veg Biryani");
				   //System.out.println(Veg.getPlatename());
					//System.out.println("Enter 1 for Order confirming  ");
					
					p.payment();
					
					
			
							
					break;
				case 2:
					Mumbai Veg1 = new Mumbai("PavBhaji", 210, "Basmati Rice","3 Peoples");
					Veg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Veg2 = new Mumbai("Chole Bhatore", 210, "Basmati Rice","2 Peoples");
					Veg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Veg3 = new Mumbai("Shahi Paneer", 210, "Basmati Rice","3 Peoples");
					Veg3.mumbaiDetails();
					p.payment();
					break;	
				case 5: 
					Mumbai Veg4 = new Mumbai("Soyabean", 410, "Soyabean", " 4 peoples");
					Veg4.mumbaiDetails();
					p.payment();
					break;
				case 6: 
					Mumbai Veg5 = new Mumbai("Puranpoli", 410, "Soyabean", " 4 peoples");
					Veg5.mumbaiDetails();
					p.payment();
					break;
				case 7: 
					Mumbai Veg6 = new Mumbai("Veg Kofta Roti", 410, "Soyabean", " 4 peoples");
					Veg6.mumbaiDetails();
					p.payment();
					break;
				case 8: 
					Mumbai Veg7 = new Mumbai("Veg Korma Rice", 410, "Soyabean", " 4 peoples");
					Veg7.mumbaiDetails();
					p.payment();
					break;
				case 9: 
					Mumbai Veg8 = new Mumbai("Veg Biryani", 410, "Soyabean", " 4 peoples");
					Veg8.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
	             }
	             return;
			case 2://Non-veg
				System.out.println("Select the Dish");
				System.out.println("1. Chicken Curry");
				System.out.println("2. Butter Chicken");
				System.out.println("3. Chicken Tikka Masala");
				System.out.println("4. Afgani Chicken");
				System.out.println("5. Fried Chicken Rassa");
				System.out.println("6. Prawn Curry Masala");
				System.out.println("7. Mutton Curry");
				System.out.println("8. Chicken Biryani");
				System.out.println("9. Chicken Shorma");
			    System.out.println("****************");
	            int d = sc.nextInt();
	             switch (d) 
	             {
				case 1:
					
					Mumbai NonVeg = new Mumbai("Chicken Curry", 400, "Chicken","3 Peoples");
					NonVeg.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai NonVeg1 = new Mumbai("Butter Chicken", 360, "Butter","2 Peoples");
					NonVeg1.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai NonVeg2 = new Mumbai("Chicken Tikka Masala", 210, "Masala","6 Peoples");
					NonVeg2.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai NonVeg3 = new Mumbai("Afgani Chicken", 600, "Masala","3 Peoples");
					NonVeg3.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai NonVeg4 = new Mumbai("Fried Chicken Rassa", 360, "Masala","4 Peoples");
					NonVeg4.mumbaiDetails();
					p.payment();
					break;	
				case 6:
					Mumbai NonVeg5 = new Mumbai("Prawn Curry Masala", 360, "Butter","2 Peoples");
					NonVeg5.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai NonVeg6 = new Mumbai("Mutton Curry", 210, "Masala","6 Peoples");
					NonVeg6.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai NonVeg7 = new Mumbai("Chicken Biryani", 600, "Masala","3 Peoples");
					NonVeg7.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai NonVeg8 = new Mumbai("Chicken Shorma", 360, "Masala","4 Peoples");
					NonVeg8.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
	             }
	             return; 
		 
				
			case 3: //Chinese
					System.out.println("Select the Dish");
					System.out.println("1. Chicken Fried Rice");
					System.out.println("2. Chicken Noodles");
					System.out.println("3. Chicken Chilly");
					System.out.println("4. Triple Rice");
					System.out.println("5. Triple Noodles");
					System.out.println("6. Chicken 65");
					System.out.println("7. Tandoori Chicken");
					System.out.println("8. Chicken Soup");
					System.out.println("9. Crispy Chicken");
				    System.out.println("****************");
		            int e = sc.nextInt();
		             switch (e) 
		             {
					case 1:
						Mumbai Chinese1 = new Mumbai("Chicken Fried Rice", 400, "Chicken","3 Peoples");
						Chinese1.mumbaiDetails();
						p.payment();
						break;
					case 2:
						Mumbai Chinese2 = new Mumbai("Chicken Noodles", 360, "Butter","2 Peoples");
						Chinese2.mumbaiDetails();
						p.payment();
						break;
					case 3:
						Mumbai Chinese3 = new Mumbai("Chicken Chilly", 210, "Masala","6 Peoples");
						Chinese3.mumbaiDetails();
						p.payment();
						break;
					case 4:
						Mumbai Chinese4 = new Mumbai("Triple Rice", 600, "Masala","3 Peoples");
						Chinese4.mumbaiDetails();
						p.payment();
						break;
					case 5:
						Mumbai Chinese5 = new Mumbai("Triple Noodles", 360, "Masala","4 Peoples");
						Chinese5.mumbaiDetails();
						p.payment();
						break;		
					case 6:
						Mumbai Chinese6 = new Mumbai("Chicken 65", 360, "Butter","2 Peoples");
						Chinese6.mumbaiDetails();
						p.payment();
						break;
					case 7:
						Mumbai Chinese7 = new Mumbai("Tandoori Chicken", 210, "Masala","6 Peoples");
						Chinese7.mumbaiDetails();
						p.payment();
						break;
					case 8:
						Mumbai Chinese8 = new Mumbai("Chicken Soup", 600, "Masala","3 Peoples");
						Chinese8.mumbaiDetails();
						p.payment();
						break;
					case 9:
						Mumbai Chinese9 = new Mumbai("Crispy Chicken", 360, "Masala","4 Peoples");
						Chinese9.mumbaiDetails();
						p.payment();
						break;
					default:
						System.out.println("invalid select correct options");
				
		             }
		             return;
			case 4: //Itailian
				System.out.println("Select the Dish");
				System.out.println("1. Polento");
				System.out.println("2. Ravioli");
				System.out.println("3. Ribollita");
				System.out.println("4. Italian Pasta");
				System.out.println("5. Arancini");
				System.out.println("6. Risotto Alla Milanse");
				System.out.println("7. Lasagne");
				System.out.println("8. Osso Buco");
				System.out.println("9. Neapolitan Pizza");
				
				
			    System.out.println("****************");
	            int f = sc.nextInt();
	             switch (f) 
	             {
				case 1:
					Mumbai Itailian1 = new Mumbai("Polento", 400, "Chicken","3 Peoples");
					Itailian1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai Itailian2 = new Mumbai("Ravioli", 360, "Butter","2 Peoples");
					Itailian2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai Itailian3 = new Mumbai("Ribollita", 210, "Masala","6 Peoples");
					Itailian3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai Itailian4 = new Mumbai("Italian Pasta", 600, "Masala","3 Peoples");
					Itailian4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai Itailian5 = new Mumbai("Arancini", 360, "Masala","4 Peoples");
					Itailian5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai Itailian6 = new Mumbai("Risotto Alla Milanse", 360, "Butter","2 Peoples");
					Itailian6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai Itailian7 = new Mumbai("Lasagne", 210, "Masala","6 Peoples");
					Itailian7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai Itailian8 = new Mumbai("Osso Buco", 600, "Masala","3 Peoples");
					Itailian8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai Itailian9 = new Mumbai("Neapolitan Pizza", 360, "Masala","4 Peoples");
					Itailian9.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
					
			
	             }
	             return;
			//}
			case 5: //Korean
				System.out.println("Select the Dish");
				System.out.println("1. Hangover stew  ");
				System.out.println("2. Kimchi ");
				System.out.println("3. Soft Tofu Stew ");
				System.out.println("4. Samgyeopsal ");
				System.out.println("5. Jjajangmyeon ");
				System.out.println("6. Chimaek ");
				System.out.println("7. Instant noodles ");
				System.out.println("8. Kimchi Stew ");
				System.out.println("9. Korean Special Resto");
				
				
			    System.out.println("************************************************");
	            int g = sc.nextInt();
	             switch (g) 
	             {
				case 1:
					Mumbai korean1 = new Mumbai("Hangover stew ", 400, "Chicken","3 Peoples");
					korean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai korean2 = new Mumbai("Kimchi ", 360, "Butter","2 Peoples");
					korean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai korean3 = new Mumbai("Soft Tofu Stew ", 210, "Masala","6 Peoples");
					korean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai korean4 = new Mumbai("Samgyeopsal ", 600, "Masala","3 Peoples");
					korean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai korean5 = new Mumbai("Jjajangmyeon ", 360, "Masala","4 Peoples");
					korean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai korean6 = new Mumbai("Chimaek ", 360, "Butter","2 Peoples");
					korean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai korean7 = new Mumbai("Instant noodles ", 210, "Masala","6 Peoples");
					korean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai korean8 = new Mumbai("Kimchi Stew ", 600, "Masala","3 Peoples");
					korean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai korean9 = new Mumbai("Korean Special Resto", 360, "Masala","4 Peoples");
					korean9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
	             }
	             return;
		//	}
			case 6: //German 
			System.out.println("Select the Dish");
			System.out.println("1. Doner Kebab");
			System.out.println("2. Currywurst");
			System.out.println("3. Bratwurst");
			System.out.println("4. Sauerbraten");
			System.out.println("5. Marzipan");
			System.out.println("6. Kohlrouloda");
			System.out.println("7. Stollen");
			System.out.println("8. Spatzle");
			System.out.println("9. German Sandwich");
			
			
		    System.out.println("****************");
	        int h = sc.nextInt();
	         switch (h) 
	         {
			case 1:
				Mumbai german1 = new Mumbai("Doner Kebab", 400, "Chicken","3 Peoples");
				german1.mumbaiDetails();
				p.payment();
				break;
			case 2:
				Mumbai german2 = new Mumbai("Currywurst", 360, "Butter","2 Peoples");
				german2.mumbaiDetails();
				p.payment();
				break;
			case 3:
				Mumbai german3 = new Mumbai("Bratwurst", 210, "Masala","6 Peoples");
				german3.mumbaiDetails();
				p.payment();
				break;
			case 4:
				Mumbai german4 = new Mumbai("Sauerbraten", 600, "Masala","3 Peoples");
				german4.mumbaiDetails();
				p.payment();
				break;
			case 5:
				Mumbai german5 = new Mumbai("Marzipan", 360, "Masala","4 Peoples");
				german5.mumbaiDetails();
				p.payment();
				break;		
			case 6:
				Mumbai german6 = new Mumbai("Kohlrouloda", 360, "Butter","2 Peoples");
				german6.mumbaiDetails();
				p.payment();
				break;
			case 7:
				Mumbai german7 = new Mumbai("Stollen", 210, "Masala","6 Peoples");
				german7.mumbaiDetails();
				p.payment();
				break;
			case 8:
				Mumbai german8 = new Mumbai("Spatzle", 600, "Masala","3 Peoples");
				german8.mumbaiDetails();
				p.payment();
				break;
			case 9:
				Mumbai german9 = new Mumbai("German Sandwich", 360, "Masala","4 Peoples");
				german9.mumbaiDetails();
				p.payment();
				break;	
			default:
				System.out.println("invalid select correct options");
		
	         }
	         return;
	         
	         
			case 7: //Carribean 
				System.out.println("Select the Dish");
				System.out.println("1. Flying Fish");
				System.out.println("2. Cou-Cou");
				System.out.println("3. Baiga Choka(Roasted Eggplant)");
				System.out.println("4. Conch Ceviche");
				System.out.println("5. Pineapple Chow");
				System.out.println("6. Gizzada");
				System.out.println("7. Carribean Roasted Bean");
				System.out.println("8. Goat Water");
				System.out.println("9. Mofongo");
				
				
			    System.out.println("****************");
		        int i = sc.nextInt();
		         switch (i) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Flying Fish", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Cou-Cou", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Baiga Choka(Roasted Eggplant)", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Conch Ceviche", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Pineapple Chow", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Gizzada", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Carribean Roasted Bean", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai("Goat Water", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Mofongo", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;
		         
			case 8: //Japanese 
				System.out.println("Select the Dish");
				System.out.println("1. Hayashi Rice");
				System.out.println("2. Kamameshi");
				System.out.println("3. Katemeshi");
				System.out.println("4. Mochi");
				System.out.println("5. Mugi Gohan");
				System.out.println("6. Ochazuke");
				System.out.println("7. Okowa");
				System.out.println("8. Omurice");
				System.out.println("9. Onigiri");
				
				
			    System.out.println("****************");
		        int j = sc.nextInt();
		         switch (j) 
		         {
				case 1:
					Mumbai carribean1 = new Mumbai("Hayashi Rice", 400, "Chicken","3 Peoples");
					carribean1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai carribean2 = new Mumbai("Kamameshi", 360, "Butter","2 Peoples");
					carribean2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai carribean3 = new Mumbai("Katemeshi", 210, "Masala","6 Peoples");
					carribean3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai carribean4 = new Mumbai("Mochi", 600, "Masala","3 Peoples");
					carribean4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai carribean5 = new Mumbai("Mugi Gohan", 360, "Masala","4 Peoples");
					carribean5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai carribean6 = new Mumbai("Ochazuke", 360, "Butter","2 Peoples");
					carribean6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai carribean7 = new Mumbai("Okowa", 210, "Masala","6 Peoples");
					carribean7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai carribean8 = new Mumbai(" Omurice", 600, "Masala","3 Peoples");
					carribean8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai carribean9 = new Mumbai("Onigiri", 360, "Masala","4 Peoples");
					carribean9.mumbaiDetails();
					p.payment();
					break;
				default:
					System.out.println("invalid select correct options");
			
		         }
		         return;     
			case 9: //Arabic
				System.out.println("Select the Dish");
				System.out.println("1. Hummus");
				System.out.println("2. Manakeesh");
				System.out.println("3. Grilled halloumi");
				System.out.println("4. Foul meddamas");
				System.out.println("5. Falafel");
				System.out.println("6. Tabouleh");
				System.out.println("7. Moutabal/baba ghanoush");
				System.out.println("8. Fattoush");
				System.out.println("9. Arabic Special");
				
				
			    System.out.println("*********************************");
		        int k = sc.nextInt();
		         switch (k) 
		         {
				case 1:
					Mumbai arabic1 = new Mumbai("Hummus", 400, "Chicken","3 Peoples");
					arabic1.mumbaiDetails();
					p.payment();
					break;
				case 2:
					Mumbai arabic2 = new Mumbai("Manakeesh", 360, "Butter","2 Peoples");
					arabic2.mumbaiDetails();
					p.payment();
					break;
				case 3:
					Mumbai arabic3 = new Mumbai("Grilled halloumi", 210, "Masala","6 Peoples");
					arabic3.mumbaiDetails();
					p.payment();
					break;
				case 4:
					Mumbai arabic4 = new Mumbai("Foul meddamas", 600, "Masala","3 Peoples");
					arabic4.mumbaiDetails();
					p.payment();
					break;
				case 5:
					Mumbai arabic5 = new Mumbai("Falafel", 360, "Masala","4 Peoples");
					arabic5.mumbaiDetails();
					p.payment();
					break;		
				case 6:
					Mumbai arabic6 = new Mumbai("Tabouleh", 360, "Butter","2 Peoples");
					arabic6.mumbaiDetails();
					p.payment();
					break;
				case 7:
					Mumbai arabic7 = new Mumbai("Moutabal/baba ghanoush", 210, "Masala","6 Peoples");
					arabic7.mumbaiDetails();
					p.payment();
					break;
				case 8:
					Mumbai arabic8 = new Mumbai("Fattoush", 600, "Masala","3 Peoples");
					arabic8.mumbaiDetails();
					p.payment();
					break;
				case 9:
					Mumbai arabic9 = new Mumbai("", 360, "Masala","4 Peoples");
					arabic9.mumbaiDetails();
					p.payment();
					break;	
				default:
					System.out.println("invalid select correct options");
			
		         }
		        
		         return;       
 }
		default:
			System.out.println("invalid select correct options");
 }	
	
 }		
 }
