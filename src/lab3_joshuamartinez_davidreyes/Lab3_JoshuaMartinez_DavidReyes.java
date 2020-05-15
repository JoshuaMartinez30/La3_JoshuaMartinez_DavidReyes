package lab3_joshuamartinez_davidreyes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Lab3_JoshuaMartinez_DavidReyes {

    public static void main(String[] args) throws ParseException {
        char resp = 's';
        Scanner input = new Scanner(System.in);
        int opcion, opc2, opc3, opc4;
        String horario, ID, username, contraseña, correo, f;
        Date nacimiento;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Personas> lista = new ArrayList();

        while (resp == 's' || resp == 'S') {
            System.out.print("1 log in y sig in");
            System.out.print("2. Salir");
            System.out.print("Ingrese opcion: ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("1. log in");
                    System.out.println("2. sig in");
                    System.out.print("Ingrese opcion: ");
                    opc2 = input.nextInt();
                    switch (opc2) {
                        case 1:
                            int tipo = 0;
                            System.out.print("Ingrese username: ");
                            username = input.next();
                            System.out.println("Ingrese contraseña: ");
                            contraseña = input.next();
                            if (username.equalsIgnoreCase("SUDO") && contraseña.equalsIgnoreCase("1234")) {
                                tipo = 1;
                            }

                            for (Object t : lista) {
                                if (t instanceof Empleados) {
                                    String a = String.valueOf(t);
                                    String con = String.valueOf(t);
                                    if (username.equalsIgnoreCase(a) && contraseña.equalsIgnoreCase(con)) {
                                        tipo = 2;
                                    }
                                }
                            }
                            for (Object o : lista) {
                                if (o instanceof Clientes) {
                                    String a = String.valueOf(o);
                                    String con = String.valueOf(o);
                                    if (username.equalsIgnoreCase(a) && contraseña.equalsIgnoreCase(con)) {
                                        tipo = 2;
                                    }
                                }
                            }
                            switch (tipo) {
                                case 1:

                                    while (resp == 's' || resp == 'S') {
                                        System.out.print("1. crear local");
                                        System.out.println("2. crear productos");
                                        System.out.println("3 crear crear empleados");
                                        System.out.print("Ingrese opcion: ");
                                        opc4 = input.nextInt();
                                        switch (opc4) {
                                            case 1:

                                                break;

                                            case 2:

                                                break;

                                            case 3:
                                                System.out.print("Ingrese horario: ");
                                                horario = input.next();
                                                System.out.print("Ingrese ID: ");
                                                ID = input.next();
                                                System.out.print("Ingrese username: ");
                                                username = input.next();
                                                System.out.print("Ingrese contraseña: ");
                                                contraseña = input.next();
                                                System.out.print("Ingrese correo: ");
                                                correo = input.next();
                                                System.out.print("Ingrese fecha de nacimiento(dd/MM/yyyy):");
                                                f = input.next();
                                                nacimiento = df.parse(f);
                                                Empleados e = new Empleados(horario, ID, username, contraseña, correo, nacimiento);
                                                lista.add(e);
                                                break;
                                        }
                                    }//fin menu de gererente
                                    break;
                                case 2:

                                    break;

                                case 3:

                                    break;

                                case 0:
                                    System.out.print("Usuario o  contraseña es incorrecta");
                                    break;
                            }//fin log in
                            break;

                        case 2:
                            System.out.println("Bienvenido al registro de clientes");
                            double dinero;
                            System.out.print("Ingrese dinero: ");
                            dinero = input.nextDouble();
                            System.out.print("Ingrese ID: ");
                            ID = input.next();
                            System.out.print("Ingrese username: ");
                            username = input.next();
                            System.out.print("Ingrese contraseña: ");
                            contraseña = input.next();
                            System.out.print("Ingrese correo: ");
                            correo = input.next();
                            System.out.print("Ingrese fecha de nacimiento(dd/MM/yyyy):");
                            f = input.next();
                            nacimiento = df.parse(f);
                            Clientes c = new Clientes(dinero, ID, username, contraseña, correo, nacimiento);
                            lista.add(c);
                            break;
                    }
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        }
    }

}
