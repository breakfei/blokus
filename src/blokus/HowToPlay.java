package blokus;
/**
 * HowToPlay window for our Blokus game
 * @author Avery Johnson
 * @author Leah Cole
 * @author Gil Eisbruch
 * @author Adrian Carpenter
 * Sets up the window that informs the player how to actually play the game.
 *
 */

public class HowToPlay implements WindowBox {

	int h = 300;
	int w = 800;
	int x = 500 - w/2;
	int y = 400 - h/2;
	
	int[] colors = {180, 200, 100};
	String rules = "RULES: Each player starts with 21 pieces. Turn order is: Blue, Yellow, Red, Green." +
			" A player's piece bin will highlight to indicate current turn." +
			" In the first round, players place their opening piece on a corner of the board." +
			" Each new piece played must be placed so that it touches at least one piece of the same color,"+
			" only corner-to-corner contact allowed, edges cannot touch."+
			" A player may pass, if they have no valid moves, play continues."+
			" Game ends when no player can place piece."+
			" Score calculated by remaining pieces in players hands."+
			" The player with the highest score wins!";
	String controls = "CONTROLS: Select a piece by clicking it."+
			" Rotate the selected piece 90 degrees by using the Left(<--) and Right(-->) arrow keys."+
			" The space bar will flip selected piece. Click and hold to move selected piece on the board."+
			" Enter/Return will set the piece in board if move was legal. Press 'p' to pass. Have fun!";

	int[][] rectangles = {{x,y,w,h}, {0,0,0,0}};
	String[] words = {rules, controls};

	int[][] wordXY = {{x+5, y+5, w-10, h},{x+5,y+5+150,w-10,h}};

	Button OK = new Button(x + w/2 - 25, y+h - 60, 50, 30, "OK", colors, false);//x, y+h*2 -100, w, h-200, "OK", colors, false);
	Button[] buttons = {OK};


	boolean active = false;

	public String getRules() {
		return rules;
	}
	public String getControls() {
		return controls;
	}
	public int getX(){
		return x;
	}
	public int getY(){
		return y;
	}
	public int getHeight() {
		return h;
	}
	public int getWidth() {
		return w;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active){
		this.active = active;
		for(int b = 0; b<buttons.length; b++){
			buttons[b].setVisible(false);
		}
	}
	public int[] getColors() {
		return colors;
	}
	public int[][] getRect() {
		return rectangles;
	}
	public Button[] getButtons() {
		return buttons;
	}
	public String[] getWords() {
		return words;
	}
	public int[][] getWordXY() {
		return wordXY;
	}
	public int[][] getFillColors() {
		return fillColors;
	}
}
