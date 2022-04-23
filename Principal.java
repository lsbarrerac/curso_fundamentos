import java.util.Scanner;
public class Principal{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean cond = true;
       public mostrarMenu(){
           while(cond){
               System.out.println("Hola, bienveid@ al programa \n \n Menú:\n Pulse 0 para cerrar el programa \n Pulse 1 para registrar información de un nuevo zombie \n Pulse 2 para acceder a la información de los zombies hasta el momento \n Pulse 3 para saber la cantidad de zombies que hay hasta el momento \n Pulse 4 para acceder a la información de los zombies con tipo de sangre O+ y AB+ \n Pulse 5 para mostrar la información de los zombies que nacieron después del año 2000 \n Pulse 6 para disminuir la salud de los zombies a la mitad \n Pulse 7 para registrar un nuevo lugar y la cantidad de zombies en el área \n Pulse 8 para acceder a la información de las ubicaciones almacenadas hasta el momento \n Pulse 9 para encontrar la zona más segura \n Pulse 10 para conocer las ubicaciones más cercanas a Alexandria \n Pulse 11 para más información sobre los zombies \n Pulse 12 para conocer las ubicaciones en las que se pueden acceder a suministros \n \n  Por favor ingrese un número: ");
               int num = scan.nextInt();
               switch(num){
                   case 0: cond = false; break;
                   case 1: System.out.println("Registre un nuevo zombie \n \n Nombre: " ); String nombre = scan.next(); System.out.println("Salud: "); int salud = scan.nextInt(); System.out.println("Fecha de nacimiento: ");  String cumple = scan.next(); System.out.println("Tipo de sangre: "); String sangre = scan.next(); 
                   Zombies zombietemp = new Zombies();
                   zombietemp.setNombre(nombre); zombietemp.setSalud(salud); zombietemp.setBirthday(cumple); zombietemp.setBlood(sangre);
                   zombies.add(zombietemp); break;
                   case 2: for(int i=0;i<zombies.size(); i++){mostrarDatos(i); } break;    
                   case 3: System.out.println("La cantidad de zombies existentes en el sistema es:" + Zombies.size()); break;
                   case 4: for(int i=0; i<zombies.size(); i++){
                       if(Zombies.getBlood(zombies.get(i)).equals("O+") || Zombies.getBlood(zombies.get(i)).equals("AB+")){
                        mostrarDatos(i);}} break;
                   case 5:for(int i=0; i<zombies.size(); i++){if(Zombies.getBirthday(zombies.get(i)).contains("2000")){mostrarDatos(i); }} break;
                   case 6: for(int i=0; i<zombies.size(); i++){ zombies[i].setSalud(zombies.getSalud(zombies[i])/2)}
                   case 7: System.out.println("Registre una nueva ubicación \n \n Nombre: " ); String nombre = scan.next(); System.out.println("Distancia a Alexandria: "); float dist = scan.nextInt(); System.out.println("¿Cuántos zombies hay en la zona?: ");  String z = scan.next(); System.out.println("¿Hay suministros?"); String s = scan.next();
                   Ubicaciones ubicaciontemp = new Ubicaciones();
                   ubicaciontemp.setZonaNombre(nombre); ubicaciontemp.setDistancia(dist); ubicaciontemp.setZom(z); 
                   ubicacion.add(ubicaciontemp); break;
                   case 8: for(int i=0;i<ubicacion.size(); i++){mostrarUbicaciones(i);} break;
                   case 9:int alt = 0; for(int i = 0; i<zombies.size(); i++){if (Ubicaciones.getZom(ubicacion[i])<Ubicaciones.getZom(ubicacion[alt])
                       {alt = i;}} mostrarUbicaciones(alt); break;
                   case 10:cond = false ;break
                   case 11:int numero = (int)(Math.random()*5+1); switch(numero){
                       case 1: System.out.println("La conversión de humano a zombie se genera por una bacteria que ingresa al organismo tras haber sido mordido");
                       case 2: System.out.println("Los zombies son atraídos por el ruido");
                       case 3: System.out.println("La única forma eficiente de asesinar a los zombies es atacando el sistema nervioso, es decir, el cerebro");
                       case 4: System.out.println("Por cada humano, existen 5.000 zombies");
                       case 5: System.out.println("Pese a la relativa poca peligrosidad que los zombies presentan de forma individual, agrupados pueden resultar altamente peligrosos");
                   } break;
                   case 12: for(int i=0; i<zombies.size(); i++){
                    if(Ubicaciones.getSuministros(ubicacion.get(i)).equals("Sí")){ mostrarUbicaciones(i);}} break;
               }
               
           }
       } 
        }
        
    }
}