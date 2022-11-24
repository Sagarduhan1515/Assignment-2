import java.util.*;
class DemoStaticBlock  
{  
Static                                  
{  
System.out.println("Static block");  
}  
}     


abstract class DemoNoMain extends javafx.application.Application  
{  
static      //static block  
{  
System.out.println("Java");  
System.exit(0);  
}  
}  


class program3
{  
public static void main(int a)  //overloaded main method  
{  
System.out.println(a);  
}  
public static void main(String args[])  
{     
System.out.println("main method incoked");  
main(6);  
}  
}  
