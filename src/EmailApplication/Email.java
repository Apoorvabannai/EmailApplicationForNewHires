package EmailApplication;

import java.util.Scanner;

public class Email {
    Scanner sc =  new Scanner(System.in);
   private String firstName;
   private String lastName;
   private String password;
   private int defaultPasswordLength = 10;
   private String altPassword;
   private String getDepartment;
   private String department;
   private int mailBoxCapacity = 500;
   private String email;
   private String alternateEmail;
   private String suffix = "du.edu";

    //Create a constructor  which takes firstName and Last name
    public Email(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.department =setDepartment();

        this.password = randomPassword(defaultPasswordLength);
        System.out.println("EMAIl CREATED :");
        System.out.println("Department Name :"+ this.department);
        System.out.println(("Your default password is: "+ this.password));
        // combine elements to generate email
        email = firstName.toLowerCase()+lastName.toLowerCase()+"@"+ department+"."+suffix;
        System.out.println("Your email is "+ email);
    }
    private String setDepartment(){
        System.out.println("Enter the Department\n 1.Sales\n 2.Devlopment\n 3.Accounting\n 4.Other");

           System.out.println("Enter Code");
            int Enter = sc.nextInt();
            if( Enter == 1) {
                return "sales";
            }
            else if( Enter == 2 ){
                return "Development";
            }
            else if( Enter == 3 ){
                return "Accounting";
            }
            else {
                return "Other";
            }
    }
    private String randomPassword( int length){
       String password = " ABcdefghIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz1234567890@#%&*";
       char[] p = new char[length];
       for( int i=0; i<length; i++){
           int random = (int) (Math.random()* password.length());
           p[i]= password.charAt(random);
       }
       return new String(p);

    }
    // ask for department, set mailbox caacity, change passwords

    public void setMailBoxCapacity(int capacity){
        this.mailBoxCapacity = capacity;
    }
    //alternate email
    public void setAlternateEmail( String alternateEmail1){
        this.alternateEmail = alternateEmail1;
    }
    public void setAlternatePassword( String altPassword){
        this.altPassword = password;
    }
    public int getMailBoxCapacity(){
        return mailBoxCapacity;
    }
    public String getAlternateEmail(){
        return alternateEmail;
    }
    public String getPassword() {
        return password;
    }
}
