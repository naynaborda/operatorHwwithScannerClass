import java.util.Scanner;

public class OperatorHWwithScannerClass {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);


        //Arithmetic Operators
        System.out.print("Enter the value for a: ");
        int a=scanner.nextInt();
        System.out.print("Enter the value for b: ");
        int b=scanner.nextInt();
        System.out.println("Addition ="+(a+b));
        System.out.println("Subtraction ="+(a-b));
        System.out.println("Multiplication ="+(a*b));
        System.out.println("Division ="+(a/b));

        //Relational Operator
        System.out.print("Enter the value for c: ");
        char c=scanner.next().charAt(0);
        System.out.print("Enter the value for d: ");
        char d=scanner.next().charAt(0);
        System.out.println("Answer ="+(a>b));
        System.out.println("Answer ="+(a>=b));
        System.out.println("Answer ="+(a<b));
        System.out.println("Answer ="+(a<=b));
        System.out.println("Answer ="+(a!=b));
        System.out.println("Answer ="+(c>d));
        System.out.println("Answer ="+(d<c));
        System.out.println("Answer ="+(d>c));

        //Logical Operator
        System.out.print("Enter the value for x: ");
        boolean x=scanner.nextBoolean();
        System.out.print(("Enter the value for y: "));
        boolean y=scanner.nextBoolean();
        System.out.println("Answer ="+(x&&y));
        System.out.println("Answer ="+(x||y));
        System.out.println("Answer ="+(x!=y));
        System.out.println("Answer ="+(x==y));
        System.out.println("Answer ="+!(x||y));

        //Assignment Operator
        System.out.print("Enter the value for p");
        int p=scanner.nextInt();
        System.out.print("Enter the Value for q");
        int q=scanner.nextInt();
        System.out.print("Enter the value for r");
        int r=scanner.nextInt();
        System.out.println("Answer ="+(p/=q));
        System.out.println("Answer ="+(q-=3));
        System.out.println("Answer ="+(r*=7));
        System.out.println("Answer ="+(p+=1));
        System.out.println("Answer ="+(q-=1));
        System.out.println("Answer ="+(q*=3));


        //Conditional or ternary operator
        System.out.print("Enter the marks for maths: ");
        int maths = scanner.nextInt();
        System.out.print("Enter the marks for english:");
        int english=scanner.nextInt();
        System.out.print("Enter the marks for science: ");
        int science=scanner.nextInt();
        System.out.print("Enter the marks for history");
        int history=scanner.nextInt();
        System.out.println("Answer ="+(maths>40?"pass":english>40?"pass":science> 40?"pass":history>40?"pass":"fail"));
        System.out.println("Answer ="+(maths<40?"fail":english<40?"fail":science<40?"fail":history<40?"fail":"pass"));


        //increment & decrement operator
        System.out.print("Enter the value for g: ");
        int g=scanner.nextInt();
        System.out.print("Enter the value for h: ");
        int h=scanner.nextInt();
        System.out.println("Answer ="+(g));
        System.out.println("Answer ="+(++g));
        System.out.println("Answer ="+(g++));
        System.out.println("Answer ="+(--g));
        System.out.println("Answer ="+(g--));
        System.out.println("Answer ="+h);
        System.out.println("Answer ="+(++h));
        System.out.println("Answer ="+(h++));
        System.out.println("Answer ="+(--h));
        System.out.println("Answer ="+(h--));

        //bitwise operator
        System.out.print("Enter the value for t: ");
        int t=scanner.nextInt();
        System.out.print("Enter the value for v: ");
        int v=scanner.nextInt();
        System.out.println("Answer ="+(t>>2));// similar to 10/(2*2)2
        System.out.println("Answer ="+(t<<2)); //similar to 10(2*2)40
        System.out.println("Answer ="+(v>>3));//similar to 20/(3*3)2
        System.out.println("Answer ="+(v<<3));//similar to 20(3*3)180


    }
}













