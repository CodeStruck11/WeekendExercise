import java.util.Scanner;

/**
 * 
 */

/**
 * @author rmahbubani
 *
 */
class UserMainCode
{
	
	static String input(String str1,String str2)
	{
		
		String res="";
		for(int i=0;i<str1.length();i++)
		{
			if(!str2.contains(""+str1.charAt(i)))res=res+'+';
			else res=res+str1.charAt(i);
		}
		return res;
	}
}
public class Exercise1 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1,str2;
		Scanner sc=new Scanner(System.in);
		str1=sc.next();
		str2=sc.next();
		System.out.println(UserMainCode.input(str1, str2));
	}

}
