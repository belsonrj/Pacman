package pacman.game;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JPanel;
import javax.swing.Timer;

public class Board extends JPanel {
	
	private Dimension d;
	private final Font smallFont = new Font("Helvetica", Font.BOLD, 14);
	
	private Image ii;
	private final Color dotColor = new Color(192, 192, 0);
	private Color maze;
	
	private boolean inGame = true;
	private boolean dying = false;
	
	private final int BLOCK_SIZE = 24;
	private final int N_BLOCKS = 15;
	private final int SCREEN_SIZE = N_BLOCKS * BLOCK_SIZE;
	private final int PAC_ANIM_DELAY = 2;
	private final int PACMAN_ANIM_COUNTER = 4;
	private final int MAX_GHOST = 12;
	private final int PACMAN_SPEED = 6;
	
	private int pacAnimCount = PAC_ANIM_DELAY;
	private int pacAnimDir = 1;
	private int pacmanAnimPos = 0;
	private int N_GHOSTS = 6;
	private int pacsLeft, score;
	private int[] dx, dy;
	private int[] ghost_x, ghost_y, ghost_dx, ghost_dy, ghostSpeed;
	
	private int pacman_x, pacman_y, pacman_dx, pacman_dy;
	private int req_dx, req_dy, view_dx, view_dy;
	
	private final short levelData[] = {
			19, 26, 26, 26, 18, 18, 18, 18, 18, 18, 18, 18, 18, 18, 22,
			21, 0, 0, 0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
			21, 0, 0, 0, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20,
			21, 0, 0, 0, 17, 16, 16, 24, 16, 16, 16, 16, 16, 16, 20,
			17, 18, 18, 18, 16, 16, 20, 0, 17, 16, 16, 16, 16, 16, 20,
			17, 16, 16, 16, 16, 16, 20, 0, 17, 16, 16, 16, 16, 24, 20,
			25, 16, 16, 16, 24, 24, 28, 0, 25, 24, 24, 16, 20, 0, 21,
			1, 17, 16, 20, 0, 0, 0, 0, 0, 0, 0, 17, 0, 20, 21,
			1, 17, 16, 16, 18, 18, 22, 0, 19, 18, 18, 16, 20, 0, 21,
			1, 17, 16, 16, 16, 16, 20, 0, 17, 16, 16, 16, 20, 0, 21,
			1, 17, 16, 16, 16, 16, 20, 0, 17, 16, 16, 16, 20, 0, 21,
			1, 17, 16, 16, 16, 16, 16, 18, 16, 16, 16, 16, 20, 0, 21,
			1, 17, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 20, 0, 21,
			1, 25, 24, 24, 24, 24, 24, 24, 24, 24, 16, 16, 16, 18, 20,
			9, 8, 8, 8, 8, 8, 8, 8, 8, 8, 25, 24, 24, 24, 28
	};
	
	private final int validSpeeds[] = {1, 2, 3, 4, 6, 8};
	private final int maxSpeed = 6;
	private int currentSpeed = 3;
	private short[] screenData;
	private Timer timer;
	

}
