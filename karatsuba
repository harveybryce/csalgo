
import java.util.Scanner;



public class karatsuba {
    public static void main(String[] args)
    {
        int a,b,c,d, ac, ad,bc,bd, h,i,answer;
        String x,y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter x: ");
        x= sc.nextLine();
        System.out.println("Enter y: ");
        y= sc.nextLine();
        System.out.println("x: " +x +" " +"Y: " +y);
        a = Integer.parseInt(x.substring(0,2));
        b = Integer.parseInt(x.substring(2,4));
        c = Integer.parseInt(y.substring(0,2));
        d = Integer.parseInt(y.substring(2,4));
        
         System.out.println("a: " +a +" " +"b: " +b +" c: " +c +" d: " +d);
         
         ac = a*c;
         ad = a*d;
         bc = b*c;
         bd = b*d;
         System.out.println("ac: " +ac +" ad: " +ad +" bc: " +bc +" bd: " +bd );
         
         h= ac*10000;
         i= (ad+bc)*100;
         answer = h+i+bd;
         System.out.println(h +" + "+i+" + " +bd +": ");
         System.out.println(answer);
    }
}
