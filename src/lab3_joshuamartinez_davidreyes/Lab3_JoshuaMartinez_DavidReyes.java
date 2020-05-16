package lab3_joshuamartinez_davidreyes;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class Lab3_JoshuaMartinez_DavidReyes {

    static int cont = 0;

    public static void main(String[] args) throws ParseException {
        char resp = 's', resp1 = 's';
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
        ArrayList carrito = new ArrayList();
        while (resp1 == 's' || resp1 == 'S') {
            System.out.println("1 log in y sig in");
            System.out.println("2. Salir");
            System.out.print("Ingrese opcion: ");
            opcion = input.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("1. log in");
                    System.out.println("2. sig in");
                    System.out.print("Ingrese opcion: ");
                    opc2 = input.nextInt();
                    switch (opc2) {
                        case 1:
                            int tipo = 0;
                            System.out.print("Ingrese username: ");
                            username = input.next();
                            System.out.print("Ingrese contraseña: ");
                            contraseña = input.next();
                            if (username.equalsIgnoreCase("SUDO") && contraseña.equalsIgnoreCase("1234")) {
                                tipo = 1;
                            }

                            for (Object t : lista) {
                                if (t instanceof Empleados) {
                                    String a = lista.get(lista.indexOf(t)).getUsername();
                                    String b = lista.get(lista.indexOf(t)).getContra();
                                    if (username.equalsIgnoreCase(a) && contraseña.equalsIgnoreCase(b)) {
                                        tipo = 2;
                                    }
                                }
                            }
                            for (Object o : lista) {
                                if (o instanceof Clientes) {
                                    String con = lista.get(lista.indexOf(o)).getContra();
                                    String a = lista.get(lista.indexOf(o)).getUsername();
                                    if (username.equalsIgnoreCase(a) || contraseña.equalsIgnoreCase(con)) {
                                        tipo = 3;
                                    }
                                }
                            }
                            switch (tipo) {
                                case 1:
                                    while (resp == 's' || resp == 'S') {
                                        System.out.println("1. crear local");
                                        System.out.println("2. crear productos");
                                        System.out.println("3. crear crear empleados");
                                        System.out.println("4. Eliminar");
                                        System.out.print("Ingrese opcion: ");
                                        opc4 = input.nextInt();
                                        switch (opc4) {
                                            case 1:
                                                System.out.println("1. crear tienda");
                                                System.out.println("2. crear quiosco");
                                                System.out.println("3. crear bar");
                                                System.out.print("Ingrese opcion: ");
                                                opc3 = input.nextInt();
                                                switch (opc3) {
                                                    case 1:
                                                        System.out.print("Ingrese nombre del local: ");
                                                        nombre = input.next();
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
                                                        Tiendas t = new Tiendas(nombre, empleados, productos, nombre);
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
                                                        Quiosco q = new Quiosco(nombre, empleados, productos, nombre);
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
                                                        Bares b = new Bares(nombre, empleados, productos, nombre);
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

                                                    case 1:
                                                        String genero,
                                                         talla;
                                                        System.out.print("Ingrese genero: ");
                                                        genero = input.next();
                                                        System.out.print("Ingrese Talla: ");
                                                        talla = input.next();
                                                        System.out.print("Ingrese la descripcion: ");
                                                        input = new Scanner(System.in);
                                                        descripcion = input.nextLine();
                                                        System.out.print("Ingrese el nombre: ");
                                                        input = new Scanner(System.in);
                                                        nombre = input.nextLine();
                                                        System.out.print("Ingrese el Precio: ");
                                                        precio = input.nextDouble();
                                                        Ropa r = new Ropa(genero, talla, descripcion, nombre, precio);
                                                        lista3.add(r);
                                                        break;

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
                                                            System.out.println(lista2.indexOf(Ob) + ") " + Ob);
                                                        }
                                                        System.out.println("ingrese la posicion");
                                                        int pos = input.nextInt();
                                                        lista2.remove(pos);
                                                        break;
                                                    case 2:
                                                        for (Object Ob : lista) {
                                                            System.out.println(lista.indexOf(Ob) + ") " + Ob);
                                                        }
                                                        System.out.println("ingrese la posicion");
                                                        pos = input.nextInt();
                                                        lista.remove(pos);
                                                        break;
                                                    case 3:
                                                        for (Object Ob : lista3) {
                                                            System.out.println(lista3.indexOf(Ob) + ") " + Ob);
                                                        }
                                                        System.out.println("ingrese la posicion");
                                                        pos = input.nextInt();
                                                        lista3.remove(pos);
                                                        break;

                                                }

                                                break;
                                        }
                                        System.out.print("Desea crear otro[S/N]:");
                                        resp = input.next().charAt(0);

                                    }//fin menu admin
                                    break;
                                case 2:
                                    System.out.println("Bienvenido empleado");

                                    break;

                                case 3:
                                    System.out.println("Bienvenido cliente");
                                    System.out.println("1. Tiendas");
                                    System.out.println("2. Quioscos");
                                    System.out.println("3. Bares");
                                    System.out.print("Ingrese el local: ");
                                    int pos2 = input.nextInt();
                                    switch (pos2) {
                                        case 1:
                                            double dinero,
                                             preci;
                                            for (Object u : lista2) {
                                                if (u instanceof Tiendas) {
                                                    System.out.println(lista2.indexOf(u) + ") " + u);
                                                }
                                            }
                                            System.out.print("Ingrese la posicion de la tienda: ");
                                            int pos3 = input.nextInt();
                                            for (Object t : lista3) {
                                                if (t instanceof Comida) {

                                                } else {
                                                    System.out.println(lista3.indexOf(t) + ") " + t);
                                                }
                                            }
                                            System.out.println("Ingrese la posicion del producto que desea comprar: ");
                                            int pos4 = input.nextInt();
                                            preci = lista3.get(pos4).getPrecio();
                                            System.out.println(preci);
                                            dinero = ((Clientes) lista.get(pos4)).getDinero();
                                            dinero = dinero - preci;
                                            ((Clientes) lista.get(pos4)).setDinero(dinero);
                                            carrito.add(lista3.get(pos4).getNombre());
                                            break;

                                        case 2:
                                            double descuento;
                                            for (Object u : lista2) {
                                                if (u instanceof Quiosco) {
                                                    System.out.println(lista2.indexOf(u) + ") " + u);
                                                }
                                            }
                                            System.out.print("Ingrese la posicion de la Quisco: ");
                                            pos3 = input.nextInt();
                                            for (Object t : lista3) {
                                                if (t instanceof Comida) {

                                                } else {
                                                    System.out.println(lista3.indexOf(t) + ") " + t);
                                                }
                                            }
                                            System.out.println("Ingrese la posicion del producto que desea comprar: ");
                                            pos4 = input.nextInt();
                                            
                                            preci = lista3.get(pos4).getPrecio();
                                            descuento = preci*0.50;
                                            System.out.println(preci);
                                            dinero = ((Clientes) lista.get(pos4)).getDinero();
                                            dinero = dinero-(preci-descuento);
                                            ((Clientes) lista.get(pos4)).setDinero(dinero);
                                            carrito.add(lista3.get(pos4).getNombre());
                                            break;

                                        case 3:
                                            for (Object u : lista2) {
                                                if (u instanceof Bares) {
                                                    System.out.println(lista2.indexOf(u) + ") " + u);
                                                }
                                            }
                                            System.out.print("Ingrese la posicion de la Bar: ");
                                            pos3 = input.nextInt();
                                            ArrayList comida = new ArrayList();
                                            for (Object t : lista3) {
                                                if (t instanceof Comida) {
                                                    System.out.println(lista3.indexOf(t) + ") " + t);
                                                    comida.add(t);
                                                }
                                            }
                                            Random rr = new Random();
                                            int random = 0 + comida.size();
                                            System.out.println("La promocion del dia : "+comida.get(random));            
                                            System.out.println("Ingrese la posicion de la comida que desea comprar: ");
                                            pos4 = input.nextInt();
                                            preci = lista3.get(pos4).getPrecio();
                                            dinero = ((Clientes) lista.get(pos4)).getDinero();
                                            if (pos4 == random) {
                                                descuento = preci*050;
                                                dinero = dinero-(preci-descuento);
                                            }else{
                                            dinero = dinero-preci;
                                            }
                                            System.out.println(preci);
                                            ((Clientes) lista.get(pos4)).setDinero(dinero);
                                            carrito.add(comida.get(pos4));
                                            break;
                                    }

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
