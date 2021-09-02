
/**
 * Write a description of class FullTimeStaffHire here.
 *
 * @author (Ramkrishan Yadav)
 * @version (0.01)
 */

//extends keyword is used to indicate that a new class is derived from the base class using inheritance
public class FullTimeStaffHire extends StaffHire 
{
   //declaring private varaible
    private int salary; 
    private int workingHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private boolean  joined;
   //Creation of constructor
   public FullTimeStaffHire(int vacancyNumber, String designation, String jobType,int salary, int workingHour) 
   {
       //calling the super class by using  super keyword
       super(vacancyNumber,designation,jobType);
       this.salary=salary;
       this.workingHour=workingHour;
       staffName="";
       joiningDate="";
       qualification=""; 
       appointedBy="";
       joined= false;
   }
   //Creation of getter method
   public int getSalary()
   {
       return salary;
   }
   public int getWorkingHour()
   {
       return workingHour;
   }
   public String getStaffName()
   {
       return staffName;
   }
   public String getJoiningDate()
   {
       return joiningDate;
   }
   public String getQualification()
   {
       return qualification;
   }
   public String getAppointedBy()
   {
       return appointedBy;
   }
   //boolean is used in conditional statements
   public boolean joined()
   {
       return joined;
   }
   public void setSalary (int newSalary)
   {
        // if... else conditional is used to specify a new condition to test, if the first condition is false
        if(joined == false)
        {
            this.salary= newSalary;
            System.out.println(" New salary is set to Rs. "+ newSalary+".");
        }else{
            System.out.println("It is not possible to change the Salary as staff is already hired.");
            joined=true;
        }
    }
   // Calling method for setting workingHour
   public void setWorkingHour(int newWorkingHour)
   { 
        if(joined==false)
        {
            this.workingHour= newWorkingHour;
            System.out.println("New Working hour has been set to " +newWorkingHour+" Hours.");
        }else{
            System.out.println("It is not possible to change the Working Hour as the staff has already been hired");
        }  
   }
   // creating methods which do not return a value
   public void hireFullTimeStaff(String StaffName, String JoiningDate, String Qualification, String AppointedBy)
   {
        this.staffName=StaffName;
        this.joiningDate=JoiningDate;
        this.qualification=Qualification;    
        this.appointedBy=AppointedBy;
        if(joined== false)
        {
            System.out.println("The staff " + StaffName +" is hired by "+ AppointedBy + "." );
            joined=true ;
        } else{
            System.out.println("Sorry The staff has already been hired.");
            joined=true;
        }
   }
   //displaying the information!!!
   public void displayInfo()
   {
        super.displayInfo();
        if(joined==true)
        {
            System.out.println("The Name of the Staff is: "+ getStaffName()+" .");
            System.out.println("The Salary of the Staff is: "+ getSalary()+" Ruppes.");
            System.out.println("The Working hours of the Staff is: "+ getWorkingHour()+" hours.");
            System.out.println("The Joined Date of the Staff is: "+ getJoiningDate()+" .");
            System.out.println("The qualification of the Staff is: "+ getQualification()+ " .");
            System.out.println("The Staff is appointed by: "+ appointedBy+" .");
            System.out.println("........................................................");
        }
   }
}
    

