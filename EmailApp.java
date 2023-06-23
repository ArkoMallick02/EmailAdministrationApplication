import java.util.Scanner;
 class Email {
   private String firstName;
   private String lastName;
   private String password;
   private String department;
   private String email;
   private String passwordSet;
   private int mailboxCapacity=500;
   private int defaultPasswordLength = 10;
   private String alternateEmail;
    private int depchoice;
    private String companySuffix = "aeycompany.com";
    
   // Constructor to receive the first name and last name
   public Email(String firstName, String lastName) {
       this.firstName = firstName;
       this.lastName = lastName;
       
       // Call a method for the department
       this.department = setDepartment();
       
       // Call amethod that returns a random password
       this.password = randomPassword(defaultPasswordLength);
      
       
       // Combine elements to generate Email
       email = firstName.toLowerCase() + " " + lastName.toLowerCase() + "@" + department + companySuffix;
      
       
   }
   
   // Ask for the department
   private String setDepartment() {
       System.out.print(" DEPARTMENT CODES\n1 for sales\n2  for development\n3 for accounting\n0 for none\nEnter department code : ");
       Scanner in = new Scanner(System.in);
       int depChoice = in.nextInt();
       if (depchoice == 1) {
           return "sales";
       }
       else if (depChoice == 2) {
           return "dev";
       }
       else if (depChoice == 3) {
           return "acct";}
           else {
               return "" ;
           }
       
   }
   
   // Generate a random password
   private String randomPassword(int length) {
       String passwordSet = "ABCD1234$@%";
       char[] password = new char[length];
       for (int i=0; i<length; i++) {
         int rand =  (int) (Math.random() * passwordSet.length());
         password[i] = passwordSet.charAt(rand);
       }
       return new String(password);
   }
   
   // Set a mailbox capacity
   public void setMailboxCapacity(int capacity) {
       this.mailboxCapacity = capacity;
   }
   
   // Set an alternate email
   public void setAlternateEmail(String altEmail) {
       this.alternateEmail = altEmail;
   }
   
   // Change the password
   public void changePassword(String password) {
       this.password = password;
   }
   public int getMailboxCapacity() { return mailboxCapacity;
}
   public String getAlternateEmail() {
       return alternateEmail;
   }
   public String getPassword() {
       return password;
   }
   public String showInfo() {
       return "DISPLAY NAME: " + firstName + " " + lastName + "\nCOMPANY EMAIL: " + email + "\nMAILBOX CAPACITY: " + mailboxCapacity + "mb";
   }
 }
public class EmailApp
{
	public static void main(String[] args) {
	    Email em1 = new Email("Sayan","Mallick");
	    
	   System.out.println(em1.showInfo()); 
		 
	}
}
