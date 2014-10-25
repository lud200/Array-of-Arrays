package AofA;

import java.util.*;

public class testargs {

public static void main(String args[]){
	
	int[] a={2, 4, 5, 5, 9};
	int sum=10;
	HashMap<Integer, Integer> h=new HashMap<Integer, Integer>();
	for(int i=0;i<a.length;i++){
		if(h.containsKey(a[i])){
			int count=h.get(a[i]);
			h.put(a[i], count+1);
		}
		else{
			h.put(a[i], 1);
		}
	}
	for(int i=0;i<a.length;i++){
		int valu=sum-a[i];
		if(h.containsKey(valu)){
			if(valu==a[i] && h.get(a[i])>1){
			System.out.println(a[i]+", "+valu);
			break;
			}
			else if(valu!=a[i]){
				System.out.println(a[i]+", "+valu);
				break;
			}
		}
	}
}
}
