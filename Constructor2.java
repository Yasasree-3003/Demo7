import java.util.Scanner;
class Trainer
{
private int tid;
private String name;
private String course;
private double fee;

public void setTid(int tid)
{
this.tid=tid;
}

public void setName(String name)
{
this.name=name;
}

public void setCourse(String course)
{
this.course=course;
}

public void setFee(double fee)
{
this.fee=fee;
}

public int getTid()
{
return this.tid;
}

public String getName()
{
return this.name;
}

public String getCourse()
{
return this.course;
}

public double getFee()
{
return this.fee;
}


public Trainer(int tid,String name,String course)
{
this.tid=tid;
this.name=name;
this.course=course;
this.fee=fee;
}
public Trainer()
{
this.tid=0;
this.name=null;
this.course=null;
this.fee=0;
}
}
class Test4
{
public static void main(String args[])
{
Scanner s2=new Scanner(System.in);
Trainer[] s1=new Trainer[5];
for(int i=0;i<5;i++) {
s1[i]=new Trainer();
s1[i].setTid(s2.nextInt());
s1[i].setName(s2.next());
s1[i].setCourse(s2.next());
s1[i].setFee(s2.nextDouble());

}
System.out.println("Details are:\n");
for(int j=0;j<5;j++) {
System.out.println("Tid:"+s1[j].getTid());
System.out.println("Name:"+s1[j].getName());
System.out.println("Course:"+s1[j].getCourse());
System.out.println("Fee:"+s1[j].getFee());
}
}
}
