package entity;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Command implements KeyListener {

	private Player p1;

	Command(Player p) {
		this.p1 = p;
	}

	@Override
	public void keyPressed(KeyEvent e) {

		System.out.println("z");
		if (e.getKeyCode() == KeyEvent.VK_Z)
			p1.move(2);//ok

		if (e.getKeyCode() == KeyEvent.VK_S)
			p1.move(1);//ok

		if (e.getKeyCode() == KeyEvent.VK_Q)
			p1.move(4);//ok

		if (e.getKeyCode() == KeyEvent.VK_D)
			p1.move(3);//ok

	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}