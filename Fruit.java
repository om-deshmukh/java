class mango
{ public void display()
    {System.out.println("I love mango");
    }
}
class grapes 
{ public void display()
    {System.out.println("I love grapes");
    }  
}
public class Fruit{
    public static void main (String[] args)
    {
        mango fruit1 = new mango();
        grapes fruit2 = new grapes();
        fruit1.display();
        fruit2.display();
    }
}