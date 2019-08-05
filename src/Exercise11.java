/**
 * 
 */

/**
 * @author rmahbubani
 *
 */
import java.util.ArrayList;
import java.util.Scanner;

class UserMainCode11
{
	static String highestScorer (ArrayList<String> ob)
	{
		int total=0,maxtotal=-1;
		int max=0;
		for(int i=0;i<ob.size();i++)
		{
			String temp=ob.get(i);
			String[] t=temp.split("-");
			total=Integer.parseInt(t[1])+Integer.parseInt(t[2])+Integer.parseInt(t[3]);
			if(total>maxtotal)
			{
				maxtotal=total;
				max=i;
			}
		}
		return (ob.get(max)).split("-")[0];
	}
}
public class Exercise11 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of students: ");
		n=sc.nextInt();
		ArrayList<String> arr=new ArrayList<String>();
		System.out.println("Enter student details (name-mark1-mark2-mark3): ");
		for(int i=0;i<n;i++)
		{
			String temp="";
			temp=sc.next();
			arr.add(temp);
		}
		System.out.println(UserMainCode11.highestScorer(arr));

	}

}
