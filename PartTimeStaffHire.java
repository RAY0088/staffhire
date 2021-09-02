
/**
 * Write a description of class PartTimeStaffHire here.
 *
 * @author (Ramkrishna Yadav)
 * @version (0.01)
 */
public class PartTimeStaffHire extends StaffHire
{
    //declaring private varaibles
    private int workingHour;
    private int wagesPerHour;
    private String staffName;
    private String joiningDate;
    private String qualification;
    private String appointedBy;
    private String shift;
    private boolean joined;//boolean is used in conditional statements
    private boolean terminated;
    //calling constructor for the six parameter     
    public PartTimeStaffHire(int vacancyNumber, String designation, String job_Type, int workingHour, int wagesPerHour, String Shift)
    {
        // invoking the super class by using  super keyword
        super(vacancyNumber, designation, job_Type);
        this.workingHour=workingHour;
        this.wagesPerHour=wagesPerHour;
        this.shift=Shift;
        staffName="";
        joiningDate="";
        qualification="";
        appointedBy="";
        joined=false;
        terminated=false;
    }
    // Creation of getter method so that it can read the value of variable
    public int getWorkingHour()
    {
       return workingHour;
    }
    public int getwagesPerHour()
    {
        return wagesPerHour;
    }
    public String getShift()
    {
        return shift;
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
    public boolean getJoined()
    {
        return joined;
    }
    public boolean getTerminated()
    {
        return terminated;
    }
    // calling method for setting Shift
    public void setShift(String newShift)
    {
        if(joined==false)
        {
            System.out.println("The shift has been changed from " +shift+" to " +newShift+".");
            this.shift=newShift;
        }else{
            System.out.println("The shift can't be changed as the staff has already been hired.");
                    
        }
    }
    //calling the method by setting the conditional statement of joined
    public void hirePartTimeStaff(String staffName,String joiningDate,String qualification,String appointedBy)
    {
        // if... else conditional is used to specify a new condition to test, if the first condition is false
        if(joined==true)
        {
            System.out.println("The staff has already been hired");
        }else{
            this.staffName=staffName;
            this.joiningDate=joiningDate;
            this.qualification=qualification;
            this.appointedBy=appointedBy;
            joined=true;
            terminated=false;
            System.out.println("The Staff "+ staffName+ " has been hired for a part time job."); 
        }
    }
    // calling the method by setting the conditional statement of terminated
    public void terminateStaff(String staffName)
    {
        if(terminated==true )
        {
            System.out.println("No records of the staff can be found");
        }else{
            System.out.println(getStaffName()+" has been removed from the job");
            this.staffName=" ";
            joiningDate=" ";
            qualification=" ";
            appointedBy=" ";
            joined=false;
            terminated=true;
        }
    }
    //displaying the information 
    public void displayPartTime()
    {
        super.displayInfo();
        if(joined=true)
        {
            System.out.println("Vacancy Number: "+getVacancyNumber());
            System.out.println("Designation: " + getDesignation());
            System.out.println("Job Type: "+ getJob_Type());
            System.out.println("Staff Name: " +getStaffName());
            System.out.println("wages Per hour: " + getwagesPerHour());
            System.out.println("Working Hour: " + getWorkingHour());
            System.out.println("JoinedDate: " + getJoiningDate());
            System.out.println("Qualification: " + getQualification());
            System.out.println("Appointed By: " + getAppointedBy());
            System.out.println("Income per day: " + (wagesPerHour*workingHour));
        }else{
            System.out.println("No staff has been hired yet for part time job");
        }
    }
    
}
