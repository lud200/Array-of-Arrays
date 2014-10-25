package AofA;
import java.util.*;
public class AofA {
	public static void main(String[] args){
		String s="anything SATA=1241241. anything ATA=2414121";
		String s1[]=s.split(" ATA*");
		for(int i=0;i<s1.length;i++){
			System.out.println(s1[i]);
		}
		/*int[] a={2, 3, 1, 0};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++){
			int pos=a[a[i]];
			b[i]=pos;
			System.out.println(a[i]);
		}
			//word reversing
			String s="Iam good girl";
			String s1[]=s.split(" ");
			StringBuilder sb=new StringBuilder();
			for(int i=s1.length-1; i>=0; i--){
				sb=sb.append(s1[i]+" ");		
			}
			String s2=sb.toString();
			System.out.println(s2);*/				
	}
}
