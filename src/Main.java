import java.util.ArrayList;
import  java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int opc;

        EmpleadoAdministrativo ea1 = new EmpleadoAdministrativo("PEDRO", 35, 3200000, 120000);


        EmpleadoVentas ev1 = new EmpleadoVentas("PAULA", 26, 2400000, 3600000, 6);


        EmpleadoHoras eh1 = new EmpleadoHoras("JOAQUIN", 45, 1300000, 14, 85000);
        /*System.out.println(ea1. toString());
        System.out.println(ev1. toString());
        System.out.println(eh1. toString());


        lstEmpleado.add(ea1);
        lstEmpleado.add(eh1);
        lstEmpleado.add(ev1);


        System.out.println(lstEmpleado);

         */

        List<Empleado> lstEmpleado = new ArrayList<>();

        do {
            System.out.println("Elija la opcion que necesite modificar");
            System.out.println("1 Registro empleados");
            System.out.println("2. mostrar info");
            System.out.println("3. bucarlos");
            System.out.println("4. salir");

            opc = teclado.nextInt();
            switch (opc) {
                case 1:

                    System.out.println("Elija la opcion que necesite modificar");
                    System.out.println("1. Empleado administrativo");
                    System.out.println("2. Empleado Ventas");
                    System.out.println("3. Empleado Horas");
                    int opcion = teclado.nextInt();
                    switch (opcion) {
                        case 1:
                            System.out.println("Sistema de registro de empleados administrativos");
                            System.out.println("Ingrese el nombre del empleado");
                            String nombre1 = teclado.next();
                            System.out.println("Ingrese la edad del empleado");
                            int edad1 = teclado.nextInt();
                            System.out.println("Ingrese el salario base del empleado");
                            double salario1 = teclado.nextDouble();
                            System.out.println("Ingrese la bonificacion del empleado");
                            double bonification = teclado.nextDouble();
                            EmpleadoAdministrativo ea2 = new EmpleadoAdministrativo(nombre1,edad1,salario1,bonification);
                            lstEmpleado.add(ea2);
                            break;


                        case 2:
                            System.out.println("Sistema de registro de empleados ventas");
                            System.out.println("Ingrese el nombre del empleado");
                            String nombre2 = teclado.next();
                            System.out.println("Ingrese la edad del empleado");
                            int edad2 = teclado.nextInt();
                            System.out.println("Ingrese el salario base del empleado");
                            double salario2 = teclado.nextDouble();
                            System.out.println("Ingrese la totalidad de ventas del empleado");
                            int ventas = teclado.nextInt();
                            System.out.println("Ingrese la comision del empleado");
                            double comision = teclado.nextDouble();
                            EmpleadoVentas ev2 = new EmpleadoVentas(nombre2,edad2,salario2,ventas,comision);
                            lstEmpleado.add(ev2);
                            break;


                        case 3:
                            System.out.println("Sistema de registro de empleados horas");
                            System.out.println("Ingrese el nombre del empleado");
                            String nombre3 = teclado.next();
                            System.out.println("Ingrese la edad del empleado");
                            int edad3 = teclado.nextInt();
                            System.out.println("Ingrese el salario base del empleado");
                            double salario3 = teclado.nextDouble();
                            System.out.println("Ingrese la totalidad de horas del empleado");
                            int horas = teclado.nextInt();
                            System.out.println("Ingrese el valor de la hora del empleado");
                            double vlHora = teclado.nextDouble();
                            EmpleadoHoras eh2 = new EmpleadoHoras(nombre3,edad3,salario3,horas,vlHora);
                            lstEmpleado.add(eh2);
                            break;

                    }
                    break;


                case 2:
                    System.out.println("Elija los empleados que desea la info");
                    System.out.println("1. Mostrar todos los empleados");
                    System.out.println("2. Mostrar empleados administrativos");
                    System.out.println("3. Mostrar empleados por horas");
                    System.out.println("4. Mostrar empleados Ventas");
                    System.out.println("5. Mostrar empleados mayores de edad");

                    int op = teclado.nextInt();
                    switch (op){
                        case 1:
                            for (Empleado E1 : lstEmpleado) {
                                System.out.println(E1);
                            }

                            break;
                        case 2:
                            for (Empleado E2: lstEmpleado){
                                if (E2 instanceof EmpleadoAdministrativo){
                                    System.out.println(E2);
                                    System.out.println("Ingrese la opcion de modificacion del empleado");
                                    System.out.println("1. Aumentar Salario Base");
                                    System.out.println("2: Calcular salario");
                                    int cion = teclado.nextInt();
                                    switch (cion){
                                        case 1:
                                            System.out.println("Sistema de Aumentar salario");
                                            System.out.println("Ingrese el aumento del salario");
                                            E2.salario(teclado.nextDouble());
                                            break;
                                        case 2:
                                            System.out.println("Sistema de Calcular salario");
                                            System.out.println("El salario total es: " + ((EmpleadoAdministrativo) E2).salarioA());
                                            break;
                                    }break;
                                }

                            }


                            break;
                        case 3:
                            for (Empleado E2: lstEmpleado){
                                if (E2 instanceof EmpleadoHoras){
                                    System.out.println(E2);
                                    System.out.println("Ingrese la opcion de modificacion del empleado");
                                    System.out.println("1. Aumentar Salario Base");
                                    System.out.println("2: Calcular salario");
                                    int cion = teclado.nextInt();
                                    switch (cion){
                                        case 1:
                                            System.out.println("Sistema de Aumentar salario");
                                            System.out.println("Ingrese el aumento del salario");
                                            System.out.println(E2.salario(teclado.nextDouble()));
                                            break;
                                        case 2:
                                            System.out.println("Sistema de Calcular salario");

                                            break;
                                    }break;
                                }

                            }

                            break;
                        case 4:
                            for (Empleado E2: lstEmpleado){
                                if (E2 instanceof EmpleadoVentas){
                                    System.out.println(E2);
                                    System.out.println("Ingrese la opcion de modificacion del empleado");
                                    System.out.println("1. Aumentar Salario Base");
                                    System.out.println("2: Calcular salario");
                                    int cion = teclado.nextInt();
                                    switch (cion){
                                        case 1:
                                            System.out.println("Sistema de Aumentar salario");
                                            System.out.println("Ingrese el aumento del salario");
                                            System.out.println(E2.salario(teclado.nextDouble()));
                                            break;
                                        case 2:
                                            System.out.println("Sistema de Calcular salario");

                                            break;
                                    }break;

                                }

                            }


                            break ;
                        case 5:
                            for (Empleado E3 : lstEmpleado) {
                                if (E3.getEdad()>18)
                                    System.out.println(E3);

                            }
                            break;

                    }
                    break;


                case 3:
                    String nombre;
                    System.out.println("Sistema de busqueda del empleado");
                    System.out.println("Ingrese el nombre del empleado");
                    nombre = teclado.next();
                    if (lstEmpleado.isEmpty()) {
                        System.out.println("No hay historial");
                    }

                    Empleado EM1 = null;
                    for (Empleado p : lstEmpleado) {
                        if (p.getNombre().equalsIgnoreCase(nombre)) {
                            EM1 = p;
                            System.out.println(EM1);
                        }
                    }
                default:
                    System.out.println("Opicion no reconocida");
            }


        }while (opc != 5) ;
    }
}