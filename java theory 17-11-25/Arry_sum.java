public class Arry_sum{
	public static void main (String[] args){
		int num[]={1,2,3,4,8,6};
		
		int sum=0;
		sum=num[0]+num[1]+num[2]+num[3]+num[4]+num[5];
		System.out.println("sum:"+sum);
		
		int avg=sum/num.length;
		
		System.out.println("average:"+avg);	  
	}
}