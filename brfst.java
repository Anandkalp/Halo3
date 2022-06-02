import java.util.Scanner;
class breakfast
{
public static void main(String args[])

{
Scanner sc = new Scanner(System.in);
System.out.print("Dosa =");
int x1 = sc.nextInt();

System.out.print("OnionDosa =");
int x2 = sc.nextInt();

System.out.print("MasalaDosa =");
int x3 = sc.nextInt();

System.out.print("Edly =");
int x4 = sc.nextInt();

System.out.print("poori =");
int x5 = sc.nextInt();

System.out.println("");

int sum1 = x1+x2+x3+x4+x5;
System.out.println("Total Bill :"+sum1);

float sum = x1+x3+x5;
System.out.println("Ordered bill :"+sum);

}
}
