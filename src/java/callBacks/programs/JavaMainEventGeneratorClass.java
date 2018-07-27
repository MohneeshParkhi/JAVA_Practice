package java.callBacks.programs;

public class JavaMainEventGeneratorClass {

	
	public void informEventListener(Object obj) {
	
		CallBackClass callBackObj = (CallBackClass)obj;
		callBackObj.methodOne();
		callBackObj.methodTwo();
		
	}
	
	
	public static void main(String[] args) {
	
	
	
	CallBackClass ob1 = new CallBackClass();
	JavaMainEventGeneratorClass ob = new JavaMainEventGeneratorClass();
	
	// assuming event listening method is called, to perform callback, we pass the object to 
	ob.informEventListener(ob1);
	
	
	
}
}
