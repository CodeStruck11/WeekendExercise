import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

class UserMainCode20{
	public static String getMaxKeyValue(HashMap<Integer,String> hashMap) {
		int maxKey=Integer.MIN_VALUE;
		String ans="";
		for(Map.Entry<Integer,String> entry : hashMap.entrySet()) {
			if(entry.getKey()>maxKey ) {
				maxKey=entry.getKey();
				ans=entry.getValue();
			}
		}
		return ans;

	}
	
}
public class Exercise20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n=Integer.parseInt(sc.nextLine());
		HashMap<Integer,String> hashMap =new HashMap<Integer,String>(n);
		for(int i=0;i<n;i++) {
			hashMap.put(Integer.parseInt(sc.nextLine()),sc.nextLine());
		}
		System.out.println(UserMainCode20.getMaxKeyValue(hashMap));
	}

}
