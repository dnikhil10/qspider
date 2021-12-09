package autosuggestion;
class Program1
{
	Program1()
	{
		System.out.println("executing program1 constructor");
	}
}
class Program2 extends Program1
{
	Program2(String s1,float f1)
	{
		System.out.println("executing program2 constructor");
		System.out.println("s1="+s1);
		System.out.println("f1="+f1);
	}
}
class Program3 extends Program2
{
	Program3()
	{
		super("hiii",89.87f);
		System.out.println("executing program3 constructor");
	}
}
class Program4 extends Program3
{
	Program4(int a)
	{
		System.out.println("executing program4 constructor");
		System.out.println("a="+a);
	}
}

public class Demo1 {

	public static void main(String[] args) {
	Program4 p4=new Program4(756);
	

	}

}
