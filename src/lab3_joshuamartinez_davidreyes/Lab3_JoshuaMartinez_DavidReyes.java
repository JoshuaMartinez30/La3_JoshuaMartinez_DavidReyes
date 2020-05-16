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
        int opcion, opc2, opc3, opc4, opc5;
        String horario, ID, username, contraseña, correo, f;
        String descripcion, nombre;
        double precio;
        Date nacimiento;
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        ArrayList<Personas> lista = new ArrayList();
        ArrayList<Locales> lista2 = new ArrayList();
        ArrayList<Productos> lista3 = new ArrayList();
        ArrayList empleados = new ArrayList();
        ArrayList productos = new ArrayList();

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
                                        System.out.println("3. crear crear empleados");
                                        System.out.println("4. Eliminar");
                                        System.out.print("Ingrese opcion: ");
                                        opc4 = input.nextInt();
                                        switch (opc4) {
                                            case 1:
                                                System.out.print("1. crear tienda");
                                                System.out.println("2. crear quiosco");
                                                System.out.println("3. crear bar");
                                                System.out.print("Ingrese opcion: ");
                                                opc3 = input.nextInt();
                                                switch (opc3) {
                                                    case 1:
                                                        System.out.print("Ingrese nombre del local: ");
                                                        input = new Scanner(System.in);
                                                        nombre = input.nextLine();
                                                        for (Object o : lista) {
                                                            if (o instanceof Empleados) {
                                                                empleados.add(o);
                                                            }
                                                        }
                                                        for (Object u : lista3) {
                                                            if (u instanceof Comida) {

                                                            } else {
                                                                productos.add(u);
                                                            }
                                                        }
                                                        Tiendas t = new Tiendas(nombre, empleados, productos, empleados.get(0).toString());
                                                        lista2.add(t);
                                                        break;
                                                    case 2:
                                                        System.out.print("Ingrese nombre del local: ");
                                                        input = new Scanner(System.in);
                                                        nombre = input.nextLine();
                                                        for (Object o : lista) {
                                                            if (o instanceof Empleados) {
                                                                empleados.add(o);
                                                            }
                                                        }
                                                        for (Object u : lista3) {
                                                            if (u instanceof Comida) {

                                                            } else {
                                                                productos.add(u);
                                                            }
                                                        }
                                                        Quiosco q = new Quiosco(nombre, empleados, productos, empleados.get(0).toString());
                                                        lista2.add(q);
                                                        break;

                                                    case 3:
                                                        System.out.print("Ingrese nombre del local: ");
                                                        input = new Scanner(System.in);
                                                        nombre = input.nextLine();
                                                        for (Object o : lista) {
                                                            if (o instanceof Empleados) {
                                                                empleados.add(o);
                                                            }
                                                        }
                                                        for (Object u : lista3) {
                                                            if (u instanceof Comida) {
                                                                productos.add(u);
                                                            } 
                                                        }
                                                        Bares b = new Bares(nombre, empleados, productos,empleados.get(0).toString() );
                                                        lista2.add(b);
                                                        break;
                                                }//fin crear locales
                                                break;

                                            case 2:
                                                System.out.println("1. crear ropa");
                                                System.out.println("2. crear juguetes");
                                                System.out.println("3. crear comida");
                                                System.out.print("Ingrese una opcion: ");
                                                opc5 = input.nextInt();
                                                switch (opc5) {
                                                    

                                                    case 2:
                                                        System.out.print("Ingrese la descripcion: ");
                                                        input = new Scanner(System.in);
                                                        descripcion = input.nextLine();
                                                        System.out.print("Ingrese el nombre: ");
                                                        input = new Scanner(System.in);
                                                        nombre = input.nextLine();
                                                        System.out.print("Ingrese el Precio: ");
                                                        precio = input.nextDouble();
                                                        Juguetes j = new Juguetes(descripcion, nombre, precio);
                                                        lista3.add(j);
                                                        break;

                                                    case 3:
                                                        String tip,
                                                         fecha;
                                                        Date caducidad;
                                                        System.out.print("Ingrese la descripcion: ");
                                                        input = new Scanner(System.in);
                                                        descripcion = input.nextLine();
                                                        System.out.print("Ingrese el nombre: ");
                                                        input = new Scanner(System.in);
                                                        nombre = input.nextLine();
                                                        System.out.print("Ingrese el precio");
                                                        precio = input.nextDouble();
                                                        System.out.print("Ingrese el tipo de comida: ");
                                                        tip = input.next();
                                                        System.out.print("Ingrese la fecha de caducidad(dd/MM/yyyy): ");
                                                        fecha = input.next();
                                                        caducidad = df.parse(fecha);
                                                        Comida co = new Comida(tip, caducidad, descripcion, nombre, precio);
                                                        lista3.add(co);
                                                        break;
                                                }//fin crear productos
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
                                            case 4:
                                                System.out.println("1. Locales\n"
                                                        + "2. personas"
                                                        + "\n3. Productos");
                                                System.out.print("Ingrese opcion: ");
                                              int opcion2 = input.nextInt();
                                                switch (opcion2) {
                                                    case 1:
                                                        
                                                        for (Object Ob : lista2) {
                                                            System.out.println(lista2.indexOf(Ob)+") "+Ob);
                                                        }
                                                        System.out.println("ingrese la posicion");
                                                        int pos = input.nextInt();
                                                        lista2.remove(pos);
                                                        break;
                                                    case 2:
                                                        for (Object Ob : lista) {
                                                            System.out.println(lista.indexOf(Ob)+") "+Ob);
                                                        }
                                                        System.out.println("ingrese la posicion");
                                                        pos = input.nextInt();
                                                        lista.remove(pos);
                                                        break;
                                                    case 3:
                                                        for (Object Ob : lista3) {
                                                            System.out.println(lista3.indexOf(Ob)+") "+Ob);
                                                        }
                                                        System.out.println("ingrese la posicion");
                                                        pos = input.nextInt();
                                                        lista3.remove(pos);
                                                        break;
                                                    
                                                }
                                                
                                                
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
