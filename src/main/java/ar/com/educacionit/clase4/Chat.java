package ar.com.educacionit.clase4;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import ar.com.educacionit.clase4.chat.ServerChat;
import ar.com.educacionit.clase4.chat.ui.swing.SwingTXa;
import java.awt.event.ActionListener;
import java.io.OutputStream;
import java.net.Socket;
import java.awt.event.ActionEvent;

public class Chat {

	private JFrame frame;
	private JTextField txtMensaje;
	JComboBox cmbLista = new JComboBox();
	JTextArea txaChat = new JTextArea();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Chat window = new Chat();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txaChat.setEditable(false);
		txaChat.setBounds(10, 0, 416, 154);
		frame.getContentPane().add(txaChat);
		
		cmbLista.setBounds(10, 200, 360, 22);
		frame.getContentPane().add(cmbLista);
		
		txtMensaje = new JTextField();
		txtMensaje.setBounds(10, 165, 360, 29);
		frame.getContentPane().add(txtMensaje);
		txtMensaje.setColumns(10);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String aux = (String)cmbLista.getItemAt(cmbLista.getSelectedIndex());
				String ip = MapaDirecciones.getMapa().get(aux);
				
				try(OutputStream out = new Socket(ip,9000).getOutputStream()) {
					//ahora puedo escribir
					
					String mensaje = txtMensaje.getText();
					
					//envio como byte[]
					out.write(mensaje.getBytes());
					
					txaChat.append("se envió a " + aux + " " + txtMensaje.getText() + "\n");
				}catch (Exception e2) {
					txaChat.append("No se pudo enviar el mensaje a" + aux + "\n");
				}
				
				txtMensaje.setText("");
				txtMensaje.requestFocus();				
			}
		});
		btnEnviar.setBounds(10, 229, 360, 23);
		frame.getContentPane().add(btnEnviar);
	}
	
	/**
	 * Create the application.
	 */
	public Chat() {
		initialize();
		//MapaDirecciones.getMapa().keySet();//carlos,alejandro,ana, etc
		//lambda expression
		/*for(String key : MapaDirecciones.getMapa().keySet()) {
			cmbLista.addItem(key);
		}*/
		//8 Collection
		// stream()
		//  filter,map, reduce, max, count
		MapaDirecciones.getMapa().keySet().forEach(x -> cmbLista.addItem(x)); //method reference ::
		
		//poner a escuchar el serversocket
		new Thread(new ServerChat(new SwingTXa(txaChat))).start();
	}
}
