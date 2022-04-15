package entity;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Command implements KeyListener { /// permet de creer un KeyListener pour ecouter le clavier

	private Player p1; /// reference au joueur

	Command(Player p) {
		this.p1 = p;	
	}

	@Override
	public void keyPressed(KeyEvent e) {

		if (e.getKeyCode() == KeyEvent.VK_Z)
			p1.move(2);//deplace vers le haut

		if (e.getKeyCode() == KeyEvent.VK_S)
			p1.move(1);//deplace vers le bas

		if (e.getKeyCode() == KeyEvent.VK_Q)
			p1.move(4);//deplace a gauche

		if (e.getKeyCode() == KeyEvent.VK_D)
			p1.move(3);//de place a droite

		if (e.getKeyCode() == KeyEvent.VK_A)
			p1.delBlock(0);// detrui les block de gauche 

		if (e.getKeyCode() == KeyEvent.VK_E)
			p1.delBlock(1);//detrui les block de droite

	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}