import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Command implements KeyListener {

	private Map lvl;
	private int size_x, size_y, x, y;

	Command(Map level) {
		this.lvl = level;
		size_x = this.lvl.getLevel().length;
		size_y = this.lvl.getLevel()[0].length;
		x = size_x/2;y = size_y/2;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_D) {
			if (x != size_x) {
				x += 1;
				System.out.println("Moving Right");
			} else
				System.out.println("Cannot Move Right");
		}
		if (e.getKeyCode() == KeyEvent.VK_Q) {
			if (x != 0) {
				x -= 1;
				System.out.println("Moving Left");
			} else
				System.out.println("Cannot Move Left");
		}
		if (e.getKeyCode() == KeyEvent.VK_S) {
			if (y != size_y) {
				y += 1;
				System.out.println("Moving Down");
			} else
				System.out.println("Cannot Move Down");
		}
		if (e.getKeyCode() == KeyEvent.VK_Z) {
			if (y != 0) {
				y -= 1;
				System.out.println("Moving Up");
			} else
				System.out.println("Cannot Move Up");
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}
}