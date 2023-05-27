package productorconsumidormsj;
public class CMensaje {
	private int []codigos;//numero de mensaje
	private String name;
	private int indice;
	public CMensaje(int n){
		codigos = new int[n];
		indice = -1;
	}

	}
	private void imprimirCodigos(){
		for (int i =0, i<=indice, i++)
			System.out.println("\t"codigos[i]);
	}
	public synchronized void Almacenar(int nmsj, String name) {
		//metodo sincronizado
		while (indice == codigos.length - 1) {//mientras este leno el arreglo, esperara
		    //el ultimo mensaje no ha sido mostrado
		    try {
				System.out.println(name + " esperando al consumidor");
		  		wait(); //se pone a dormir y cede el monitor
		   } catch (InterruptedException e) {}
		}
		indice ++;
		codigos [indice] = nmsj;
		System.out.println("Productor " + name + ":   almacena el mensaje #" + codigos[indice]);
		imprimirCodigos();
		notifyAll();//notifica y despierta a todos los hilos en wait()
	}
	public synchronized int Obtener (string name) {//sincroizado, recurso compartido
		String name;
		int mensaje;
		while (indice == -1) {//bandera cuando el arreglo este vacio
		    //no hay mensaje
		    try {
		  	wait(); //se pone a dormir y cede el monitor
		    } catch (InterruptedException e) {} 
		}
		mensaje = codigos[indice];
		indice --;//modifica la bandera
		notifyAll();//despierta a los hilos en wait()
		System.out.println("Consumidor "+ name + ":  obtuvo " + mensaje + "\n");
		return (mensaje);
	}
}
