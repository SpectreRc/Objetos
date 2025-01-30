package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Persona persona1 = new Persona();
//        Persona persona2 = new Persona("Paco","Ruiz","12345678F", 'H',99, "Alicante", "Carpintero");
//        Persona persona3 = new Persona("Messi","Ratón","12345678F",'M',3,"Mykonos", "Golfista");
//
//        persona1.mostrarInfo();
//        persona2.mostrarInfo();
//        persona3.mostrarInfo();
//
//        System.out.println(persona2.concatenar());
//        System.out.println("La edad de " + persona2.getNombre() + " es " + persona2.getEdad());
//        persona1.setApellido("Sin Nombre");
//        System.out.println(persona1.getApellido());
//        persona1.setNombre("Messi");
//        System.out.println(persona1.getNombre());

//        Paciente paciente = new Paciente("Luis", 12, 'H', 130, 2.00);
//        paciente.imprimirInfo();
//        Paciente paciente2 = new Paciente();
//        paciente2.imprimirInfo();

        Estudiante estudiante1 = new Estudiante("Paco");
        Estudiante estudiante2 = new Estudiante("Paco","2ºESO","noseque@edu.gva.es");

        System.out.println(estudiante1);
        System.out.println(estudiante2);

        if(Estudiante.validarEmail(estudiante2.getEmail())){
            System.out.println("El email es correcto");
        }else{
            System.out.println("El email no cumple con el formato");
        }

        Editorial editorial1 = new Editorial("ANAYA","ESPAÑA");
        System.out.println(editorial1);

        Libro libro1 = new Libro("el principito","quevedo",editorial1);
        System.out.println(libro1);
        Libro libro2 = new Libro("tiburon","torres", editorial1);
        System.out.println(libro2);

        System.out.println(Libro.getLibrosDisponibles());
        Prestamo prestamo1 = libro1.prestar(estudiante2);
        System.out.println(prestamo1);
        System.out.println(estudiante2);
        System.out.println(libro1);
        System.out.println(Libro.getLibrosDisponibles());

        libro1.devolver(estudiante2);
        System.out.println(libro1);
        System.out.println(estudiante2);
        System.out.println(Libro.getLibrosDisponibles());
        libro1.devolver(estudiante2);

        libro1.estaDisponible();

//        Persona persona1 = new Persona("Marta", "Poveda", "12345678P", 'M', 23, "Alicante", "Mamporrera");
//        Equipo equipo1 = new Equipo("Barstra");
//        System.out.println(persona1);
//        System.out.println(equipo1);
//        equipo1.insertarIntegrante(persona1);
//        System.out.println(equipo1);
//        Persona persona2 = new Persona("Kiko", "Perez", "12345678J", 'M', 19, "Alicante", "Gigolo");
//        System.out.println(persona2);

    }
