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
class Test3
{
public static void main(String args[])
{
Scanner s2=new Scanner(System.in);
Trainer[] s1=new Trainer[5];
for(int i=0;i<5;i++) {
s1[i]=new Trainer();
s1[i].setTid(s2.nextInt());
}
System.out.println("Details are:\n");
for(int j=0;j<5;j++) {
System.out.println("Tid:"+s1[j].getTid());
}
}
}
