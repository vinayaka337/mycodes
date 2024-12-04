package myownjavaprogs;
import java.util.*;
class mark{
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
public class Consol {
Scanner sc = new Scanner(System.in);
static int sturoll;
static String name;
mark[] mlist;
int count=0;
int fimark1=1;
int check1=0;
Consol(int p_sturoll,String p_name){
	sturoll=p_sturoll;
	name=p_name;
}
void getmarks() {
	mlist[count]=new mark();
	mlist[count].readdata();
	count++;
}
void cal() {
	int count1=0;
	for(int i=1;i<=count1;i++) {
		if(mlist[count1].marks1>fimark1) {fimark1=mlist[count1].marks1;check1=count1;}}
		count1++;
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
	System.out.println("SUBJECT 2"+"  "+mlist[check1].sem+"  "+mlist[check1].year+"  "+fimark1);
	System.out.println("SUBJECT 3"+"  "+mlist[check1].sem+"  "+mlist[check1].year+"  "+fimark1);
}
public static void main(String...args) {
	Consol s1 = new Consol(1,"sunny");
	Scanner sc = new Scanner(System.in);
	System.out.println("no:of attempts?");
	int noa=sc.nextInt();
	s1.mlist=new mark[noa];
	for(int i=1;i<=noa;i++) {
		s1.getmarks();
		s1.cal();
	}
	s1.printdata();
}
}

