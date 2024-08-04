class Demo
{
int x;
int y;

 Demo(int p, int q){
System.out.println("Ashish");
x=p;
y=q;
System.out.println(x);
System.out.println(y);
}

void f1()
{
x=5;
y=10;
System.out.println(x);
System.out.println(y);
}
}
public class Construct
{
public static void main(String[] args)
{
Demo d=new Demo(5,9);
d.f1();
Demo d1=new Demo(50,90);

}
}



