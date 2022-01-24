package ar.com.educacionit.clase1.runnables;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

public class ReproductoR implements Runnable{

	private Player player;
	
	/*
	public static void main(String[] args) {
		File file =  new File("src/main/resources/himno.mp3");
		try {
			InputStream is = new FileInputStream(file);
			new Player(is).play();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(JavaLayerException jle) {
			jle.printStackTrace();
		}
	}
	*/
	/*
	public static void main(String[] args) {
		try {
			InputStream is = ReproductoR.class.getResourceAsStream("/music/himno.mp3");
			new Player(is).play();
		}  catch(JavaLayerException jle) {
			jle.printStackTrace();
		}
	}*/
	
	@Override
	public void run() {
		try {
			InputStream is = ReproductoR.class.getResourceAsStream("/music/himno.mp3");
			new Player(is).play();
		}  catch(JavaLayerException jle) {
			jle.printStackTrace();
		}
	}
	/*
	public void play() {
		try {
			player.play();
		} catch (JavaLayerException e) {
			e.printStackTrace();
		}
	}*/
}
