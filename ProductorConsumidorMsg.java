package productorconsumidormsj;
class ProductorConsumidorMsg {

   public static void main (String[] ars) {
	//creaci�n de los hilos
	CMensaje mensaje = new CMensaje();
	CProductor  productor1 = new CProductor(mensaje);
    CProductor  productor2 = new CProductor(mensaje);
    CConsumidor consumidor1 = new CConsumidor(mensaje);

	
	//ejecucion de los hilos
	productor1.start();
    productor2.start();
	consumidor1.start();
    }
}
/*
Primer examen parcial
 */