class A
{
int x;
private static int y;
void f1()
{
y=20;
}
void f2()
{
System.out.println(y);
}
void f3()
{
y=22;
}
}

class StaticMembers{
public static void main(String[] args)
{
A a1=new A();
A a2=new A();
a1.f1();
a2.f3();
a1.f2();
}
}