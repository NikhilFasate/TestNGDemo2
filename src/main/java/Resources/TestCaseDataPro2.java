package Resources;

import java.text.DecimalFormat;
import java.util.Random;



public class TestCaseDataPro2 
{
	public static String firstName=("QWERTY");
	public static String lastName=("ASDF");
	public static String password=("1234");
	public static String confPassword=("1234");
	
	static Random rand = new Random();
    static int num1 = (rand.nextInt(7) + 1) * 100 + (rand.nextInt(8) * 10) + rand.nextInt(8);
    static int num2 = rand.nextInt(743);
    static int num3 = rand.nextInt(10000);

    static DecimalFormat df3 = new DecimalFormat("000"); // 3 zeros
    static  DecimalFormat df4 = new DecimalFormat("0000"); // 4 zeros

    public static String phoneNumber = "+91"+df3.format(num1) + df3.format(num2) + df4.format(num3);
    
    public static String email=getSaltString()+"@gmail.com";
	static String getSaltString() 
	{
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) 
        { // length of the random string
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;
    }
	 

}
