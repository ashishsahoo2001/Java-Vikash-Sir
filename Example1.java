class Example1{
int x;
int y;
void fun1()
{
System.out.println("Ashish");
}
void fun2()
{
System.out.println("Jitu");
}
}
class Object1{
public static void main(String[] args)
{
Example1 f1=new Example1();
Example1 f2=new Example1();

f1.x=10;
f2.y=15;
System.out.println(f1.x);
System.out.println(f1.y);
System.out.println(f2.x);
System.out.println(f2.y);


}
}