package tomaynotificacionpedidos;

import java.util.ArrayList;

public class Mesero {
	
	public void consultarproductos() {
	}
	
	
	public String getMensaje() {
		return "No hay productos";
	}
	
	Producto productox = new Producto("Aguardiente",30000);

	public ArrayList<Producto> getProductos() {
		ArrayList<Producto> x = new ArrayList<Producto>();
		x.add(productox);
		return x;
	}
	
	public Pedido realizar_pedido(){
		ArrayList<Producto> y = new ArrayList<Producto>();
		y.add(productox);
		Pedido x = new Pedido(y);
		return x;
	}
	
	public String enviar_pedido(){
		if(realizar_pedido().getCuerpo().size()==0){
			return "No hay productos.";
		}
		return "Pedido enviado";
	}
	

}
