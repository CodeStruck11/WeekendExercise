import java.util.Scanner;

/**
 * 
 */

/**
 * @author rmahbubani
 *
 */
class UserMainCode12
{
	static String getWordWithMaximumVowels(String str)
	{
		String[] t=str.split(" ");
		int count=0,maxcount=0,max=0;
		//System.out.println(t.length);
		for(int i=0;i<t.length;i++)
		{
			String str1=t[i];
			count=0;
			for(int j=0;j<str1.length();j++)
				
			if (str1.charAt(j) == 'a' || str1.charAt(j) == 'e' || str1.charAt(j) == 'i'
                    || str1.charAt(j) == 'o' || str1.charAt(j) == 'u')
            {
                count++;
            }
			//System.out.println(count);
			if(count>maxcount)
			{
				maxcount=count;
				max=i;
			}
		}
		return t[max];
	}
}
public class Exercise12 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str;
		System.out.println("Enter sentence: ");
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		System.out.println(UserMainCode12.getWordWithMaximumVowels(str));
	}

}
