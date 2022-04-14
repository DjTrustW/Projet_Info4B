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

		if (e.getKeyCode() == KeyEvent.VK_Z)
			p1.move(2);//ok

		if (e.getKeyCode() == KeyEvent.VK_S)
			p1.move(1);//ok

		if (e.getKeyCode() == KeyEvent.VK_Q)
			p1.move(4);//ok

		if (e.getKeyCode() == KeyEvent.VK_D)
			p1.move(3);//ok

		if (e.getKeyCode() == KeyEvent.VK_A)
			p1.delBlock(0);

		if (e.getKeyCode() == KeyEvent.VK_E)
			p1.delBlock(1);

	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}