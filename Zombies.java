import java.util.ArrayList; import java.lang.Math;
public class Zombies{
    public static void main(String[] args){
        public String nombre; public int salud; public String birthday; public String blood;
        ArrayList<Zombies> zombies = new ArrayList<Zombies>();
        public Zombies(String name, int health, String birth, String rh){
            this.nombre=name; this.salud=health; this.birthday=birth; this.blood=rh
        }
        public String getNombre() {return this.nombre;}
        public void setNombre(String name) {this.nombre=name;}
        public int getSalud() {return this.salud;}
        public void setSalud(int health) {this.salud=health;}
        public String getBirthday() {return this.birthday;}
        public void setBirthday(String birth) {this.birthday=birth;}
        public String getBlood() {return this.blood;}
        public void setBlood(String rh) {this.blood=rh;}

        public mostrarDatos(int ind){
            System.out.println(Zombies.getNombre(zombies.get(ind)));
            System.out.println("Salud: " + Zombies.getSalud(zombies.get(ind)));
            System.out.println("Fecha de Nacimiento: " + Zombies.getBirthday(zombies.get(ind)));
            System.out.println("Tipo de Sangre: " + Zombies.getBlood(zombies.get(ind)));
        }
        

    }
}