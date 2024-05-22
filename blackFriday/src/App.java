import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
/*
2- (medio) Llega Black Friday en tu tienda online de teléfonos móviles
y decides ofrecer un 20% de descuento en todos tus productos.

Instancia algunos móviles para probar.
El descuento se aplica en todos, (static) así que debes poder mostrar
el precio antiguo y el precio con descuento.

+EXTRA: posibilidad de anular el descuento a todos los productos
después del Black Friday, mediante método a tal propósito.


 */

 Telefono m1 = new Telefono("Apple", "15",825);
 Telefono m2 = new Telefono("Apple", "15 pro", 1075);
 Telefono m3 = new Telefono("Samsung", "s23", 639);
 Telefono m4 = new Telefono("Xiaomi", "Redmi note 13", 249);
System.out.println("\n-----------------\n");
 System.out.println("Ofertas Black Friday");
 System.out.println("\n-----------------\n");
 System.out.println(m1);
 System.out.println(m2);
 System.out.println(m3);
 System.out.println(m4);

 Scanner teclado = new Scanner(System.in);
 System.out.println("¿Quieres mantener eñl BF?SI/NO");
 if(teclado.nextLine().equalsIgnoreCase("NO")){
    Telefono.cancelarBf(true);
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
    System.out.println(m4);


 } 
 else {
    System.out.println(m1);
    System.out.println(m2);
    System.out.println(m3);
    System.out.println(m4);
 }


}


}
