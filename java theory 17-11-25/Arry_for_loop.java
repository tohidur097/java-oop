public class Arry_for_loop{
	public static void main(String[] args){
		int []arry=new int[]{1,2,3,4,5,6};
		
		for(int i=0;i<arry.length;i++){
			System.out.print(arry[i]+" ");
		}
		System.out.println(" ");
			
		System.out.println("--------------");
		
		
		for(int i=arry.length-1;i>=0;i--){
			System.out.print(arry[i]+" ");
		}
		
	}
}