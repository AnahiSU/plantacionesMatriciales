public class Huerto
{
    private Planta [][] campo;
    private int jugadas;
    private Monedero monedero;
    private boolean estado;
    private boolean iniciado;

    public Huerto(){
        campo = new Planta[3][3];
        jugadas = 18;
        monedero = new Monedero();
        estado = false;
        iniciado = false;
    }

    public String iniciar(){
        //crear el campo y comenzar a jugar
        generarCampo();
        String res = ""; 
        iniciado = true;
        estado = true;
        res = mostrarHuerto();
        return res;
    }

    public String regarHorizontal(int fila){
        String res = "";
        if(enJuego()){
            for(int i = 0; i < 3; i++){
                if(campo[fila][i] != null){
                    campo[fila][i].regar(); //Si hay planta, regarla
                    if(campo[fila][i].getRegadas()<1){
                        //si ya cumplio su ciclo de riego, quitar la planta
                        // y recolectar el dinero.
                        monedero.anadirDinero(campo[fila][i].cosechar());
                        monedero.contarBonus(); //Cuenta si se tiene un bonus
                        campo[fila][i] = null;
                    }
                }else{
                    campo[fila][i] = generarPlanta();
                }
            }
            contarJugada();
        }
        //Mostrar el estado de la partida
        res = mostrarHuerto();
        return res;
    }

    public String regarVertical(int col){
        String res = "";
        if(enJuego()){
            for(int i = 0; i < 3; i++){
                if(campo[i][col] != null){
                    campo[i][col].regar(); //Si hay planta, regarla
                    if(campo[i][col].getRegadas()<1){
                        //si ya cumplio su ciclo de riego, quitar la planta
                        // y recolectar el dinero.
                        monedero.anadirDinero(campo[i][col].cosechar());
                        monedero.contarBonus();
                        campo[i][col] = null;
                    }
                }else{
                    campo[i][col] = generarPlanta();
                }
            }
            contarJugada();
        }
        //Mostrar el estado de la partida
        res = mostrarHuerto();
        return res;
    }

    public String usarBonus(int fil, int col){
        String res = "";
        if(enJuego()){
            if(monedero.getBonus() > 0){
                if(campo[fil][col] != null){
                    campo[fil][col].regar(); //Si hay planta, regarla
                    if(campo[fil][col].getRegadas()<1){
                        //si ya cumplio su ciclo de riego, quitar la planta
                        // y recolectar el dinero.
                        monedero.anadirDinero(campo[fil][col].cosechar());
                        monedero.contarBonus();
                        campo[fil][col] = null;
                    }
                }else{
                    campo[fil][col] = generarPlanta();
                }
                monedero.usarBono();
            }
            contarJugada(); 
        }
        //Mostrar el estado de la partida
        res = mostrarHuerto();
        return res;
    }

    private void contarJugada(){
        jugadas = jugadas-1;
    }
    //Modifica el atributo campo con 3 plantas aleatorias
    private void generarCampo(){
        int i;
        int j;
        int cont = 0;
        while(cont != 3){
            i = (int) (Math.random()*3);
            j = (int) (Math.random()*3);
            if(campo[i][j] == null){
                campo[i][j] = generarPlanta();
                cont++;
            }
        }
    }
    //Genera una plantita de cualquier tipo
    private Planta generarPlanta(){
        //Se genera cada vez que se llama al método
        //un banco con tres objetos distintos en memoria.
        Planta[] bancoPlantas = {new Ramiper(), new Betometa(), new Rezagameta()};
        //Se selecciona uno
        int aux = (int)(Math.random()*3);
        Planta plantita = bancoPlantas[aux];
        return plantita;
    }
    //Si aún no se vació el campo
    private boolean enJuego(){
        int c = 0;
        for(int i = 0; i<3;i++){
            for(int k = 0; k<3;k++){
                if(campo[i][k] != null){
                    c = c+1;
                }
                if(c>=1 && jugadas > 0){
                    estado = true;
                }else{
                    estado = false;
                }
            }
        }
        return estado;
    }
    //Mostrar la matriz campo
    private String mostrarHuerto(){
        String huerto = "";
        int aux = 0; //variable auxiliar para contar si 
        //todos los cuadrados están vacíos.
        if(enJuego()){
            for(int i = 0; i<3;i++){
                for(int k = 0; k<3;k++){
                    if(campo[i][k] == null){
                        huerto = huerto + campo[i][k]+"\t";
                        aux++;
                    }else{
                        huerto = huerto + campo[i][k].getNombre() + "|"+ campo[i][k].getRegadas()+"|" +"\t";
                    }
                    if(aux == 9){
                        huerto = "Ganaste"; //Si los 9 cuadrados están vacíos, entonces se gana.
                        estado = false;
                        iniciado = false;
                    }
                }
                huerto += "\n" ;;
            } 
            huerto = huerto + "Tus bonus: " + monedero.getBonus() + "\n"+ "Regadas: " + jugadas + "\n" + "Dinero: "+
            monedero.getMonto() +"Bs."+ "\n"+"-----------------";
        }else{
            if(iniciado == false){
                huerto = "No iniciaste un juego";
            }else{
                huerto = "Perdiste";
                estado = false;
                iniciado = false;
            }
        }
        return huerto;
    }

}
