package ar.com.educacionit.clase4.chat;


import java.io.BufferedReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.io.InputStreamReader;

import ar.com.educacionit.clase4.MapaDirecciones;
import ar.com.educacionit.clase4.chat.ui.ITxa;

public class ServerChat implements Runnable{

	private ITxa txa;

	public ServerChat(ITxa txa) {	
		this.txa = txa;
	}
	
	
	@Override
	public void run() {
		try(ServerSocket ss = new ServerSocket(9000)) {
			
			while(true) {
				try(	
						Socket so = ss.accept();
						BufferedReader in = new BufferedReader(new InputStreamReader(so.getInputStream()));
				) {//aca se queda el hilo esperando una conexion
					
					//quien mando mensanje
					String ip = so.getInetAddress().getHostAddress();//
					
					//logica para el nombre
					String nombre = MapaDirecciones.getMapa()
						.entrySet().stream() //Set<Entry<String,String>>
						.filter(x-> x.getValue().equals(ip))//Entry<String,String> >key, value
						.map(x -> x.getKey())
						.findFirst().orElse("N/D");
					
					//mensaje
					String mensaje = in.readLine();//una linea entera
					
					//actualiza el chat
					txa.appendText(nombre + ":" + mensaje + "\n");
				}catch (Exception e) {
					// TODO: handle exception
				}
			}
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
}
