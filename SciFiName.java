

public class SciFiName   
{
    public static void main()
    {
        System.out.println("If you provide me some information I will provide a Science Fiction name for you.");
        System.out.println("Please have all responses  be at least three characters long.");
        System.out.println("For best results, user lowercase letters with no spaces.\n");

        // notice this methd (print) does not print a newline
        System.out.print("Enter your first name: ");
        String FirstName = UserInput.getString();
        System.out.print("Enter your last name: ");
        String LastName = UserInput.getString();
        System.out.print("Enter the city where you or one of your parents were born: ");
        String City = UserInput.getString();
        System.out.print("Enter the name of your grammar school: ");
        String School = UserInput.getString();
        System.out.print("Enter the first name of a sibling or other relative: ");
        String RelativeName1 = UserInput.getString();
        System.out.print("Enter the first name of a second sibling or relative: ");
        String RelativeName2 = UserInput.getString();

        // generate a sciFi name
   String sciFirstName1;
   String sciLastName1;
   String sciLastName2;
   String sciCityName1;
   String sciSchoolName1;
   
   sciFirstName1 = FirstName.substring(0,2);
   sciLastName1 = LastName.substring(0,1);
   Math.random();
   int r = (int)Math.random() * RelativeName1.length() - 1;
   String planet1 = RelativeName1.substring(r);
   
   sciCityName1 = City.substring(0,1);
   sciSchoolName1 = School.substring(0,2);
   Math.random();
   int f = (int)Math.random()* RelativeName2.length() - 1;
   String planet2 = RelativeName2.substring(r);
   System.out.println("Hi " + sciFirstName1 + sciLastName1 + "and " + planet1);     
   
   

    }
}
