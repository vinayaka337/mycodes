package myownjavaprogs;
import java.util.*;

class ex {
    public static void main(String... args) {
        Scanner sc = new Scanner(System.in);
        int empNo, basSal;
        double da = 0, hra = 0, cca = 0;
        int oa = 0, fa = 0;
        char des, loc;
        String empName, desgnation = "t", locality = "t";

        System.out.println("employee number");
        empNo = sc.nextInt();
        sc.nextLine();
        System.out.println("employee name");
        empName = sc.nextLine();
        System.out.println("designation of the employee");
        des = sc.next().charAt(0);
        if (des == 'd' || des == 'D') {
            desgnation = "developer";
        } else if (des == 't' || des == 'T') {
            desgnation = "tester";
        } else if (des == 'm' || des == 'M') {
            desgnation = "manager";
        }
        System.out.println("employee basic salary");
        basSal = sc.nextInt();
        sc.nextLine();
        System.out.println("locality");
        loc = sc.next().charAt(0);
        if (loc == 'u' || loc == 'U') {
            locality = "urban";
        } else if ((loc == 'r') || (loc == 'R')) {
            locality = "rural";
        }
        if (basSal > 16000) {
            da = (15.0 / 100.0) * basSal;
        } else if (basSal >= 10000) {
            da = (25.0 / 100.0) * basSal;
        } else if (basSal >= 8000) {
            da = (35.0 / 100.0) * basSal;
        } else if (basSal >= 0) {
            da = (50.0 / 100.0) * basSal;
        }
        if (loc == 'u' || loc == 'U') {
            hra = (15.0 / 100.0) * basSal;
            cca = (5.00 / 100.0) * basSal;
            oa = 0;
        } else if (loc == 'r' || loc == 'R') {
            hra = (25.0 / 100.0) * basSal;
            cca = 0;
            oa = 150;
        }
        if (des == 'm' || des == 'M' || des == 'd' || des == 'D') {
            fa = 2200;
        } else if (des == 't' || des == 'T') {
            fa = 1100;
        }
        double epf = ((12.0 / 100.0) * basSal);
        double grossSal = (basSal + da + hra + cca + oa + fa);
        double it = ((20.0 / 100.0) * grossSal);
        double grossDed = (it + epf);
        double netSal = (grossSal - grossDed);

        System.out.printf("---------------------------------------------------\n");
        System.out.printf("PAYSHIP FOR MONTHLY JULY 2024\n");
        System.out.printf("---------------------------------------------------\n");
        System.out.printf("EMPLOYEE ID : %d", empNo);
        System.out.printf("       NAME : %s\n", empName);
        System.out.printf("---------------------------------------------------\n");
        System.out.printf(" EARNINGS             DEDUCTIONS\n");
        System.out.printf("---------------------------------------------------\n");
        System.out.printf("Basic pay : %d", basSal);
        System.out.printf("              EPF : %f\n", epf);
        System.out.printf("DA        : %f", da);
        System.out.printf("        IT : %f\n", it);
        System.out.printf("HRA       : %f\n", hra);
        System.out.printf("OA        : %d\n", oa);
        System.out.printf("CCA       : %f\n", cca);
        System.out.printf("---------------------------------------------------\n");
        System.out.printf("GROSS SALARY : %f", grossSal);
        System.out.printf("       GROSS DEDUCTION : %f\n", grossDed);
        System.out.printf("---------------------------------------------------\n");
        System.out.printf("---------------------------------------------------\n");
        System.out.printf("           NET SALARY : %f\n", netSal);
        System.out.printf("---------------------------------------------------\n");
        System.out.printf("---------------------------------------------------\n");
    }
}