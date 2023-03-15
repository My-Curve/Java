// write hello world in java
public class main {
    public static void main(String[] args) {
        //using println
        System.out.println("Hello World");
        System.out.println("Am a Newbie in Java");
        System.out.println("I love Java");
        //using print
        System.out.print("Hello World");
        System.out.print("Am a Newbie in Java");
        System.out.print("I love Java");
        //its kiash in java from python programmer write this code
        System.out.println("Hello World kiash is a new programmer in java");

        //print number using println and print
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.println(4);
        System.out.println(5);

        //create a variable named kiash and print saying kiash loves doing hard task    
        String kiash = "kiash loves doing hard task";
        System.out.println(kiash);

        String Fname="Samuel";
        String Sname="Kaindo";
        String ThirdName="Wainaina";
        String FullName=Fname+" "+Sname+" "+ThirdName;
        System.out.println(FullName);


        //create now calculatiion
        int num1=10;
        int num2=20;
        int num3=30;
        int add=num1+num2+num3;
        System.out.println(add);


        //create a program that asks the user for the inputs and display them
        Scanner input=new Scanner(System.in);
        System.out.println("Enter your name");
        String name=input.nextLine();
        System.out.println("Enter your age");
        int age=input.nextInt();
            

    }
}