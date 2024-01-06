//java static nested class example with a static method
class A1
{
static int data=30;
static class B
{
static void msg()
{
System.out.println("data="+data);
}
}
public static void main(String args[])
{
A1.B.msg(); 
}
}