public class Planta {
   private int nroRegadas;
   private int costo;
   private String nombre;

   public Planta(int nroRegadas, int costo, String nombre) {
      this.nroRegadas = nroRegadas;
      this.costo = costo;
      this.nombre = nombre;
   }
   
   public void regar(){
       nroRegadas = nroRegadas - 1;
   }
   
   public int getRegadas() {
      return nroRegadas;
    }
   
   public int cosechar() {
      return costo;
   }
   
   public String getNombre(){
       return nombre;
   }
}