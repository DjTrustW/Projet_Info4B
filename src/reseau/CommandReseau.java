package reseau;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;

public class CommandReseau implements KeyListener {

	public Client cl;
	CommandReseau(Client c) {
		this.cl = c;
		Frame f = new Frame("Projet_Info4B");
		f.setLayout(new FlowLayout());
		f.setSize(100, 100);
		Label l = new Label();
		l.setText("");
		f.add(l);
		f.setVisible(true);
		f.addKeyListener(this);
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_Z)
			this.cl.send("z");

		if (e.getKeyCode() == KeyEvent.VK_S)
			this.cl.send("s");

		if (e.getKeyCode() == KeyEvent.VK_Q)
			this.cl.send("q");

		if (e.getKeyCode() == KeyEvent.VK_D)
			this.cl.send("d");

		if (e.getKeyCode() == KeyEvent.VK_A)
			this.cl.send("a");

		if (e.getKeyCode() == KeyEvent.VK_E)
			this.cl.send("e");

	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}