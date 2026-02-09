class subtraction
{
	public int subtraction(int a,int b){
		return a-b;
	}
}  

public class addition extends subtraction
{
	public int addition(int a, int b){
		return a+b;
	}
	public static void main(String[] args){
		addition s=new addition ();
		System.out.println(s.subtraction(20,40));
		System.out.println(s.addition(30,30));
	}
}