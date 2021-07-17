import java.util.Scanner; 
import java.io.IOException;
import java.io.File; 
import java.io.*; 


public class project1 {

	
public static void main (String[] args) {  
		
	
	int userInput; 
	userInput = first();
	
	 switch (userInput) {
	    case 1:
	       first();
	        break; 
	    case 2: 
	    	sec(); 
	    	break; 
	    case 0 :  
	    	System.out.print("Bye");
	    	 break; 
         } 
	 
    }

		
 
	public static int  first (){ 

		
		   int choice;
	// display first menu 
		   do {
		System.out.println("=============");
        System.out.println("FIRST M E N U");  
        System.out.println("============="); 
        System.out.println("1-Show Files"); 
        System.out.println("2-Go To the Second Menu");
        System.out.println("3-Exit"); 
        System.out.println("Enter Your Choice : "); 

        
        Scanner in = new Scanner(System.in);   
        
             
       choice = in.nextInt();    
       
       switch (choice) { 
       
       case 1 :  
    	
    	   File show = new File("C:\\Users\\salwa\\Desktop\\Salwa-Alahmadi-Sda\\Project1");
           String[] children = show.list();
           
           if (children == null) {
              System.out.println("does not exist or is not a directory");
           } else {
              for (int i = 0; i < children.length; i++) {
                 String filename = children[i];
                 System.out.println(filename);
              }  
           }
    	   
break; 
       case 2 :  
    	   
    	choice = sec();
break; 
       case 3 : 
    	   System.out.println("Exiting Program...");
           System.exit(0);
            break;
       default :
                System.out.println("This is not a valid Menu Option! Please Select Another");
                break;
  
    	 
       }
		   } 
		   while(choice != 3);
		      
	return choice;

	
	} 
	  
       public static int sec () {  
    	
           int choice2;
    	do {    
        // display
   		System.out.println("=============");
           System.out.println("Seconed M E N U");  
           System.out.println("============="); 
           System.out.println("1-Add File"); 
           System.out.println("2-Delete File");
           System.out.println("3-Search file");  
           System.out.println("4-Back To The First Menu");
           System.out.println("Enter Your Choice : "); 
           
           Scanner sc = new Scanner(System.in);   
           
           choice2 = sc.nextInt();       
           //Add
           try {
     	      File myObj = new File("MenuProject.txt");
     	      if (myObj.createNewFile()) {
     	        System.out.println("File created: " + myObj.getName());
     	      }     	      
     	    } catch (IOException e) {
     	      System.out.println("An error occurred.");
     	      e.printStackTrace();
     	    }   
         
           
           switch (choice2) { 
           
           case 1 :   
        	   try {
          	      File myObj = new File("Menu2.txt");
          	      if (myObj.createNewFile()) {
          	        System.out.println("File created: " + myObj.getName());
          	      }     	      
          	    } catch (IOException e) {
          	      System.out.println("An error occurred.");
          	      e.printStackTrace();
          	    }   

    break; 
           case 2 :  
        	  File DF = new File("MenuProject.txt"); 
        	    if (DF.delete()) { 
        	      System.out.println("Deleted the file: " + DF.getName());
        	   } else {
        	    System.out.println("Failed to delete the file.");
        
        	      }    
        	
    break; 
           case 3 : 
        	   
        	   File dir = new File("search");
               String[] children = dir.list();
               
               if (children == null) {
                  System.out.println("does not exist or is not a directory");
               } else {
                  for (int i = 0; i < children.length; i++) {
                     String filename = children[i];
                     System.out.println(filename);
                  }  
               }
        	   
        	   break; 
           case 4:   
         choice2=first();  
         break;
           default :
               System.out.println("This is not a valid Menu Option! Please Select Another");
               break;
 
              
           }    
    	}
           while(choice2 != 4 );
           return choice2; 
       
    	
         
       }
       
}

