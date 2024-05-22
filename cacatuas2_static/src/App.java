import java.util.Scanner;

public class App {

    public static void main(String[] args) throws Exception {
/*
1- (fácil) Entrenamiento (opcional)
Tu amiga cacatúa está de vuelta!
Tienes la clase Cacatua con un método static que cuando le llamas
dice "Cacatúa cacahuete!".
También tiene una variable estatica: cantidadMinimaCacahuetes = 100;
Mostrar en un system.out lo siguiente: " la cacatúa se llama X (su nombre),
dice 'Cacatúa cacahuete!' y lo mínimo para que se calle son 100 cacahuetes " 
 */

Cacahuete c1 = new Cacahuete("Pepe");
Scanner teclado = new Scanner(System.in);
int cuantosCacahuetes=0;
System.out.println("Bienvenido, la cacatúa se llama " + c1.getCacatuaName());

while (cuantosCacahuetes<Cacahuete.cantidadMinimaCacahuetes) {
    Cacahuete.cacatua();
    System.out.println("Cuanto cacahuetes quieres darle?");
    cuantosCacahuetes=teclado.nextInt();
    teclado.nextLine();
}

    }
}
