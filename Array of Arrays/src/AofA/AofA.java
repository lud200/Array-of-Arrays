package AofA;

public class AofA {
	public static void main(String[] args){
		int[] a={2, 3, 1, 0};
		int[] b=new int[a.length];
		for(int i=0;i<a.length;i++){
			int pos=a[a[i]];
			b[i]=pos;
			System.out.println(a[i]);
		}		
	}
}
