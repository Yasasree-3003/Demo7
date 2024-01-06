import java.util.Scanner;
class Trainer
{
private int tid;
public void setTid(int tid)
{
this.tid=tid;
}
public int getTid()
{
return this.tid;
}
public Trainer(int tid)
{
this.tid=tid;
}
public Trainer()
{
this.tid=0;
}
}
class Test
{
public static void main(String args[])
{
Scanner s2=new Scanner(System.in);
System.out.println("Enter Teacher ID");
int tidin=s2.nextInt();
Trainer ob1=new Trainer(tidin);
System.out.println("tid:"+ob1.getTid());
}
}
