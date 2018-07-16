import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Hunter_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int ak=sc.nextInt();
		int arr[]=new int [ak];
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
		}
		
		
		HashSet h=new HashSet<>();
		for(int i=0;i<arr.length;i++) {
			int count=0;
			for(int j=0;j<arr.length;j++) {
				if(arr[i]==arr[j]){
				count++;	
				}
			}
			if(count>1) {
				h.add(arr[i]);
			}
				
		}
		ArrayList arl=new ArrayList(h);
		int a[]=new int[arl.size()];
		for(int i=0;i<a.length;i++) {
			a[i]=(int)arl.get(i);
			
			System.out.println(a[i]);
		}
		
		
		

	}
}
