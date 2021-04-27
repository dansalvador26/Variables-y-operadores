import java.util.*;
public class Variables {
    public static void main(String[]args){
        Scanner obj= new Scanner(System.in);
        float val1,val2, resultado;
        System.out.printf("Ingresa el primer numero:");
        val1=obj.nextInt();
        System.out.printf("Ingresa el segundo numero:");
        val2=obj.nextInt();

        resultado=val1+val2;
        System.out.printf("-La suma es igual a:"+resultado);
        resultado=val1-val2;
        System.out.printf("-La resta es igual a:"+resultado);
        resultado=val1*val2;
        System.out.printf("-La multiplicacion es igual a:"+resultado);
        resultado=val1/val2;
        System.out.printf("-La division es igual a:"+resultado);
        resultado=val1%val2;
        System.out.printf("-El modulo es igual a:"+resultado);
}
}
