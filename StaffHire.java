
/**
 * Write a description of class StaffHire here.
 *
 * @author (Ramkrishna Yadav)
 * @version (0.01)
 */
public class StaffHire
{
  // decalring private variable
  private int vacancyNumber;     
  private String designation;
  private String job_Type; 
  //creation of constructor for three parameter
  public  StaffHire(int vacancyNumber,String designation, String job_Type)
  {    
      //invoking current class constructor
      this.vacancyNumber=vacancyNumber;
      this.designation=designation;
      this.job_Type=job_Type;
    
  }
  // creation of getter and setter method
  public int getVacancyNumber()
  { 
      return vacancyNumber;
  }
  public void setVacancyNumber(int vacancyNumber)
  { 
      this.vacancyNumber=vacancyNumber;
  }
  public String getDesignation()
  {
      return designation;
  }
  public void  setDesignation(String designation)
  { 
      this.designation=designation;
  }
  public String getJob_Type()
  {
        return job_Type;
  }
  public void setJob_Type(String job_Type)
  { 
      this.job_Type=job_Type;
  }
  //displaying the information 
  public void displayInfo()
  { 
      System.out.println("............................................");
      System.out.println("Vacancy Number : " +getVacancyNumber());
      System.out.println("Designatioin   : " +getDesignation());
      System.out.println("Job Type       : " +getJob_Type() );
      System.out.println("............................................");
  }
}
