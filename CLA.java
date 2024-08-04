class CLA{
public static void main(String args[])
{
int i,s=0;
for(i=0;i<args.length;i++)
{
System.out.println(args[i]);

s=s+Integer.parseInt(args[i]);
}
System.out.println("The sum is"+s);

System.out.println("The average is"+s/args.length);
}
}
