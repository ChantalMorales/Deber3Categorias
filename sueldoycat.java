import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    int c;
    double sueldoIn,sueldoFin;
    Scanner s= new Scanner(System.in);
    Scanner leer= new Scanner(System.in);
    System.out.println("Ingrese el sueldo Inicial: ");
    sueldoIn = s.nextDouble();
    System.out.print("La categoria 1 = 15%  \n");
    System.out.print("La categoria 2 = 10%  \n");
    System.out.print("La categoria 3 = 8%  \n");
    System.out.print("La categoria 4 = 7%  \n");
    System.out.print("elija la categoria: ");
    c = leer.nextInt();
    switch(c){
      case 1:
            sueldoFin=sueldoIn*0.15+sueldoIn;
            System.out.println("el Sueldo final es: "+sueldoFin);
            break;
      case 2:
            sueldoFin=sueldoIn*0.10+sueldoIn;
            System.out.println("el Sueldo final es: "+sueldoFin);
            break;
      case 3:
            sueldoFin=sueldoIn*0.08+sueldoIn;
            System.out.println("el Sueldo final es: "+sueldoFin);
            break;
      case 4:
            sueldoFin=sueldoIn*0.07+sueldoIn;
            System.out.println("el Sueldo final es: "+sueldoFin);
            break;
      default: 
            System.out.println("Esa opcion no es correcta ");
            break;
    }


  }
}