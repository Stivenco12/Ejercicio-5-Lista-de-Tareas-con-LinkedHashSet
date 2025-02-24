package lista_de_tarea_con_linkehashset;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap< Integer,String > ocjec = new LinkedHashMap<>();
        try (Scanner sc = new Scanner(System.in)) {
            String menu = "1";
            do{
                System.out.println("Ingrese de tareas desea registrar");
                int cantidad = sc.nextInt();
                sc.nextLine();

                for(int i = 1; i <= cantidad; i++){
                    System.out.print("ingrese el numero de la tarea = ");
                    int ed = sc.nextInt();
                    System.out.print("ingrese el nombre de la tarea = ");
                    String name = sc.nextLine();
                    sc.nextLine();
                    ocjec.put( ed, name);
                }

                System.out.println();
                System.out.print("Quieres elimar una tarea? \n1. si\n2. no \nElije =  ");
                int buscar = sc.nextInt();
                sc.nextLine();

                if (buscar == 1) {
                    System.out.print("ingrese el nombre de la tarea que deseas eliminar = ");
                    int names = sc.nextInt();
                    boolean existe = ocjec.containsKey(names);
                    if (existe == true) {
                        ocjec.remove(names);
                        System.out.println("la tarea a sido eliminada ");

                    }else{
                        System.out.println("la tarea que buscas no existe y nose puede eliminar");
                    }
                }

                System.out.println("LinkedHashMap en orden de inserción:");
                for (Map.Entry<Integer , String> entry : ocjec.entrySet()) {
                    System.out.println(entry.getKey() + " -> " + entry.getKey());
                }
            }while(!menu.equals("2"));
        }catch (Exception e) {
        System.out.println("error por favor vuelve a ejecutrar el programa");
    }
    }
}