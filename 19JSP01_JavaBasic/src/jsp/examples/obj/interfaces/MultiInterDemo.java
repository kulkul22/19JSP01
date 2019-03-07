/**
 * 
 */
package jsp.examples.obj.interfaces;

/**
 * @author ndloc
 *
 */
interface printable1 {  
    void print();  
}  
   
interface showable1{  
    void show();  
} 
public class MultiInterDemo implements printable1, showable1 {

	@Override
	public void show() {
		// TODO Auto-generated method stub
		System.out.println("Hello");
		
	}

	@Override
	public void print() {
		// TODO Auto-generated method stub
		System.out.println("Welcome");
		
	}
	
	public static void main(String args[]){  
		MultiInterDemo obj = new MultiInterDemo();  
        obj.print();  
        obj.show();  
    }  

}
