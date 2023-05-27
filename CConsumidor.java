package productorconsumidormsj;
class CConsumidor extends Thread {
	private CMensaje mensaje;   //ultimo mensaje generado
	
	public CConsumidor (CMensaje c) {
		mensaje = c;
	}
	
	public void run() {
	  int Msj;	//mensaje a mostrar
		
	  while (true) {
	     Msj = mensaje.Obtener(getName()); //obtener el ultimo mensaje
	  }
	}
}