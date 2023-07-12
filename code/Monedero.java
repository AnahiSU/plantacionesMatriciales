public class Monedero
{
    private int monto;
    private int bono;
    //Constructor de monedero
    public Monedero (){
        monto=0;
        bono=0;
    }
    //Determinando el bono a numero de vesces la ayuda del hermano de Lisandro
    public void contarBonus(){
        bono=monto/90;
    }
    //Incrementando el monto
    public void anadirDinero(int precio){
        monto=monto+precio;
    }
    //Accediendo al monto
    public int getMonto(){
        return monto;
    }
    //Accediento al  bonus
    public int getBonus(){
        return bono;
    }
    public void usarBono(){
        bono--;
        monto = monto - 90;
    }
}