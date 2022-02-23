package sofkaTaller02;

import java.util.Scanner;

public class SofkaTaller02 {

    public static void main(String[] args) {
       
       Energy energy = new Energy();
       PioneerXI pioneerXI = new PioneerXI ();
       SaturnV saturnV = new SaturnV ();
       SkyLab skyLab = new SkyLab();
       
       
       energy.fuelType();
       energy.tonOfThrust();
       energy.Weight();
       energy.tonsOfTransport();
       
       System.out.println("---------------------------------");
       
       
       pioneerXI.fuelType();
       pioneerXI.tonOfThrust();
       pioneerXI.Weight();
       pioneerXI.tonsOfTransport();
       
       System.out.println("---------------------------------");
       
       saturnV.Weight();
       saturnV.fuelType();
       saturnV.tonOfThrust();
       saturnV.tonsOfTransport();
       
       System.out.println("---------------------------------");
       
       
       skyLab.setPassengers(7);
       System.out.println("SkyLab: Tiene la cantidad de Pasajeros 7" );
       skyLab.setOrbit(" 435km ");
       System.out.println("SkyLab: Orbita a Km 435 ");
       skyLab.Weight();
       skyLab.tonsOfTransport();
        
       System.out.println("---------------------------------");
       
        /**
        * Variable para leer entradas por consola
        */
        Scanner read = new Scanner(System.in);
        /**
         * Representa el país de lanzamiento de la nave
         */
        String launchingCountry = null;
        /**
         * Representa el nombre de la nave
         */
        String name = null;
        /**
         * Representa la velocidad de la nave
         */
        float speed = 0;
        /**
         * Captura el valor seleccionado del menú
         */
        int option=0;
        /**
         * Representa la creación de la nave, sin constructor
         */
        SpecialVehicles specialVehicles;
        /**
         * El menú se realizó con un do-while, el cuál se repetirá hasta que
         * se seleccione la opción de salir.
         */
        do {
            /**
             * Menú
             */
            System.out.println("Seleccione una opción");
            System.out.println("1.Crear Vehiculo Lanzadera");
            System.out.println("2.Crear Vehiculo No Tripulada");
            System.out.println("3.Crear Vehiculo Tripulada");
            System.out.println("0.Salir");
            /**
             * Captura el valor seleccionado del menú.
             */
            option = read.nextInt();
            /**
             * Validación de que sea una opción válida.
             */
            if(option>0 && option <4){
                /**
                 * En la opción 3 no es necesario pedir el pais de lanzamiento de la nave.
                 */
                if(option!=3){
                    /**
                     * Se captura el pais de lanzamiento deVehiculo
                     */
                    System.out.println("Pais de lanzamiento del Vehiculo");
                    launchingCountry = read.next();
                }
                /**
                 * Se captura el nombre del Vehiculo
                 */
                System.out.println("Nombre del Vehiculo");
                name = read.next();
                /**
                 * Se captura la velocidad del Vehiculo
                 */
                System.out.println("Velocidad del Vehiculo (km/h)");
                speed = read.nextFloat();
                
                /**
                 * Se crea la nave, dependiendo de la opción seleccionada por el usuario
                 */
                switch (option) {
                    /**
                     * Vehiculo Lanzadera
                     */
                    case 1:                    
                        specialVehicles = new Shuttle(launchingCountry,name,speed);
                        specialVehicles.Weight();
                        specialVehicles.fuelType();
                        break;
                    /**
                     * Vehiculo No tripulada
                     */    
                    case 2:
                        specialVehicles = new Unmanned(launchingCountry,name,speed);
                        specialVehicles.Weight();
                        specialVehicles.fuelType();
                        break;
                    /**
                     * Vehiculo Tripulada.
                     */    
                
                    case 3:
                        specialVehicles = new Manned(name,speed);
                        specialVehicles.Weight();
                        specialVehicles.fuelType();
                        break;
                    /**
                     * Opción cero del menú.
                     */    
                    case 0:
                        System.out.println("Saliendo,Gracias por usar la aplicacion");
                        break;
                    default:
                        throw new AssertionError();
                }
            }else System.out.println("Escoja una opción válida");
        } while (option!=0);
        
    }
       
        
       
    }
    

