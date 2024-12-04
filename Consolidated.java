package myownjavaprogs;
import java.util.*;
class marks{
	Scanner sc = new Scanner(System.in);
	int year,marks1,marks2,marks3;String sem;
	void readdata() {
		System.out.println("sem?");
		sem=sc.nextLine();
		System.out.println("year studying when attempting?");
		year=sc.nextInt();
		System.out.println("marks in the first subject?");
		marks1=sc.nextInt();
		System.out.println("marks in the second subject?");
		marks2=sc.nextInt();
		System.out.println("marks in the third subject?");
		marks3=sc.nextInt();
	}
}
public class Consolidated {
Scanner sc = new Scanner(System.in);
static int sturoll;
static String name;
marks[] mlist;
int count=0;
int fimark1=1,fimark2=1,fimark3=1;
int check1=0,check2=0,check3=0;
Consolidated(int p_sturoll,String p_name){
	sturoll=p_sturoll;
	name=p_name;
}
void getmarks() {
	mlist[count]=new marks();
	mlist[count].readdata();
	if(mlist[count].marks1>fimark1) {fimark1=mlist[count].marks1;check1=count;}
	if(mlist[count].marks2>fimark2) {fimark2=mlist[count].marks2;check2=count;}
	if(mlist[count].marks3>fimark3) {fimark3=mlist[count].marks3;check3=count;}
	count++;
}
void printdata() {
	System.out.println("ROLL =  "+sturoll);
	System.out.println("NAME = "+name);
	System.out.println();
	System.out.println("year"+"  "+"mon"+"  "+"S1"+"  "+"S2"+"  "+"S3");
	System.out.println("---------------------------------------");
	for(int j=0;j<count;j++) {
	System.out.println(mlist[j].year+"  "+mlist[j].sem+"  "+mlist[j].marks1+"  "+mlist[j].marks2+"  "+mlist[j].marks3);
	}
	System.out.println("---------------------------------------");
	System.out.println();
	System.out.println("CONSOLIDATED MARKS:-");
	System.out.println("SUBJECT 1"+"  "+mlist[check1].sem+"  "+mlist[check1].year+"  "+fimark1);
	System.out.println("SUBJECT 2"+"  "+mlist[check2].sem+"  "+mlist[check2].year+"  "+fimark2);
	System.out.println("SUBJECT 3"+"  "+mlist[check3].sem+"  "+mlist[check3].year+"  "+fimark3);
}
public static void main(String...args) {
	Consolidated s1 = new Consolidated(1,"sunny");
	Scanner sc = new Scanner(System.in);
	System.out.println("no:of attempts?");
	int noa=sc.nextInt();
	s1.mlist=new marks[noa];
	for(int i=1;i<=noa;i++) {
		s1.getmarks();
	}
	s1.printdata();
}

}
