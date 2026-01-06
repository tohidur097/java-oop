/*import java.lang.*;
public class Arry_String{
	public static void main(String[]args){

		String s[]=new String[]{"One","Two","Three","Four","Five"};
		
		for(int i=0;i<s.length;i++){
			System.out.print(s[i]+"  ");
		}
		
		
	}
}*/


class ArrayDemo {

    public static void main(String[] args) {

        double dataSet[] = {12.7, 17.3, 18.9, 3.5, 20.7};

        float filtered[] = new float[dataSet.length];

        for (int i = 0; i < dataSet.length; i++) {

            if (((int)dataSet[i]) % 3 == 0) {  // example condition
                filtered[i] = (int)dataSet[i];
            } else {
                filtered[i] = -1;  // not divisible
            }
        }

        for (int j = 0; j < filtered.length; j++) {
            System.out.println(filtered[j]);
        }
    }
}