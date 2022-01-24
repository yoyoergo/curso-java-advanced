package ar.com.educacionit.clase4.chat.ui.swing;

import javax.swing.JTextArea;

import ar.com.educacionit.clase4.chat.ui.ITxa;

public class SwingTXa implements ITxa{

	private JTextArea text;
	
	public SwingTXa(JTextArea text) {
		this.text = text;
	}

	@Override
	public void clear() {
		this.text.setText("");
	}

	@Override
	public void setText(String text) {
		this.text.setText(text);
	}

	@Override
	public void appendText(String text) {
		this.text.append(text);		
	}

	@Override
	public String getText() {
		return this.text.getText();
	}

	
}
