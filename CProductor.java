package productorconsumidormsj;
//esta clase es el hilo
class CProductor extends Thread {

    private CMensaje mensaje;   //ultimo mensaje generado

    public CProductor(CMensaje c) {//resive el mensaje
        mensaje = c;
    }

    public void run() {//jamas se cincroniza el run de un hilo
        int nMsj;	//numero de mensaje

        while (true) {
            nMsj = (int) (Math.random() * 100); //genera num. de  msj
            mensaje.Almacenar(nMsj, getName()); //almaena el mensaje
        }

    }
}
