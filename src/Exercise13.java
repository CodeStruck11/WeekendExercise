import java.util.Scanner;

/**
 * 
 */

/**
 * @author rmahbubani
 *
 */
class UserMainCode13
{
	static String swapPairs(String str)
	{
		String res="";
		
		for(int i=0;i<str.length();i+=2)
		{
		
			if(i+1<str.length())
			{
				res=res+str.charAt(i+1)+str.charAt(i);
			}
			else
			{
				res=res+str.charAt(i);
			}
		}
		
		return res;
	}
}
public class Exercise13 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		System.out.println("Enter word: ");
		Scanner sc=new Scanner(System.in);
		str=sc.next();
		System.out.println(UserMainCode13.swapPairs(str));
		
	}

}
