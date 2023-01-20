public class MaxMinArray{

	public static void main(String[] args) {

		int a[] = {1,2,3,4,5};

		int max=a[0];
		int min=a[0];

		for(int v:a){
			if(v>max){max=v;}
		}System.out.println(max +" is the largest");
		
		for(int u:a){
			if(u<min){min=u;}
		}System.out.println(min +" is the smallest");
	}

}