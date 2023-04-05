// create a defualt contructor
    
class default1
{
    int a;
    default1()
    {
        a=10;
    }
    void display()
    {
        System.out.println("a="+a);
    }
    public static void main(String args[])
    {
        default1 d=new default1();
        d.display();
    }
}

// create a  parameterized constructor

class default2
{
    int a;
    default2(int x)
    {
        a=x;
    }
    void display()
    {
        System.out.println("a="+a);
    }
    public static void main(String args[])
    {
        default2 d=new default2(20);
        d.display();
    }
}

// create a  copy constructor

class default3
{
    int a;
    default3(int x)
    {
        a=x;
    }
    default3(default3 d)
    {
        a=d.a;
    }
    void display()
    {
        System.out.println("a="+a);
    }
    public static void main(String args[])
    {
        default3 d1=new default3(20);
        default3 d2=new default3(d1);
        d1.display();
        d2.display();
    }
}