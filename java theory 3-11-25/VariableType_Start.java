class VariableType{
	private int instanceVariable;
	public static int classVariable=200;
	
	public void setInstanceVariable(int value){
		instanceVariable = value;
	}
	public int getInstanceVariable(){
		return instanceVariable;
	}
	
}
public class VariableType_Start{
public static void main (String[]args){
 
	System.out.println("class variable : "+VariableType.classVariable);
	//instanceVariable i1=new instanceVariable(45);
	VariableType v1 = new VariableType();
	v1.setInstanceVariable(45);
	System.out.println("Instance variable : " + v1.getInstanceVariable());
}	
}