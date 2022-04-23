import java.util.ArrayList;
public class ubicaciones{
    public static void main(String[] args){
        public String zonaNombre; public float distancia; public int zom; public String suministros;
        ArrayList<Ubicaciones> ubicacion = new ArrayList<Ubicaciones>();
        public Ubicaciones(String zona, float dist, int z, String sum){
            this.zonaNombre=zona; this.distancia=dist; this.zom=z; this.suministros=sum;
        }
        public String getZonaNombre() {return this.zonaNombre;}
        public void setZonaNombre(String zona) {this.zonaNombre=zona;}
        public float getDistancia() {return this.distancia;}
        public void setDistancia(float dist) {this.distancia=dist;}
        public int getZom() {return this.zom;}
        public void setZom(int z) {this.zom=z;}
        public String getSuministros() {return this.suministros;}
        public void setSuministros(String sum) {this.suministros=sum;}

        public mostrarUbicaciones(int x){
            System.out.println(Ubicaciones.getZonaNombre(ubicacion.get(xi)));
            System.out.println("Distancia a Alexandria: " + Ubicaciones.getDistancia(ubicacion.get(x)));
            System.out.println("Cantidad de Zombies en el área: " + Ubicaciones.getZom(ubicacion.get(x)));
            System.out.println("Existencia de suministros: " + Ubicaciones.getSuministros(ubicacion.get(x)));
        }
    }
}