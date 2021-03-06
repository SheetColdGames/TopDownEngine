package me.sheetcoldgames.topdownengine.engine;

import com.badlogic.gdx.Input.Buttons;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.InputProcessor;
import com.badlogic.gdx.math.Vector3;

public class Input implements InputProcessor {
	
	public boolean buttons[];
	
	public static final int UP = 0;
	public static final int DOWN = 1;
	public static final int LEFT = 2;
	public static final int RIGHT = 3;
	
	public static final int ACTION = 4;
	public static final int CHANGE = 5;
	
	public static final int SELECT = 6;
	
	public static final int ENTER = 7;
	
	public static final int CAM_UP = 8;
	public static final int CAM_DOWN = 9;
	public static final int CAM_LEFT = 10;
	public static final int CAM_RIGHT = 11;
	
	// ======= related to the editor =======
	public static final int PREVIOUS_GROUP = 12;
	public static final int NEXT_GROUP = 13;
	public static final int TOGGLE_GRID = 14;
	public static final int TOGGLE_MAP = 15;
	public static final int SAVE_POINTS = 16;
	
	// ======= miscelaneous =======
	public static final int CTRL = 30;
	public static final int SHIFT = 31;
	
	// ======= The binded keys =======
	int KEY_UP;
	int KEY_DOWN;
	int KEY_LEFT;
	int KEY_RIGHT;
	
	int KEY_ACTION;
	int KEY_MAGIC;
	
	int KEY_SELECT;
	
	int KEY_ENTER;
	
	int KEY_CAM_UP;
	int KEY_CAM_DOWN;
	int KEY_CAM_LEFT;
	int KEY_CAM_RIGHT;
	
	// ======= Related to the editor ======
	int KEY_PREVIOUS_GROUP;
	int KEY_NEXT_GROUP;
	
	int KEY_TOGGLE_GRID;
	int KEY_TOGGLE_MAP;
	
	int KEY_SAVE_POINTS;
	
	// ======= Miscelaneous/helper keys =======
	int KEY_CTRL;
	int KEY_SHIFT;
	
	// ======= Related to mouse click =======
	public Vector3 currentRawPoint; // contains the position of the last action done with the mosue
	public Vector3 movingMousePosition; // contains the mouse position everytime
	public MOUSE_BUTTON lastMouseButton;
	public boolean mouseDown = false;
	public boolean mouseDragged = false;
	public boolean mouseReleased = false;
	
	public Input() {
		buttons = new boolean[32];
		
		defaultControls();
		currentRawPoint = new Vector3();
		movingMousePosition = new Vector3();
	}
	
	public void releaseAllKeys() {
		for (int i = 0; i < buttons.length; i++) {
			buttons[i] = false;
		}
	}
	
	private void defaultControls() {
		KEY_UP 		= Keys.UP;
		KEY_DOWN 	= Keys.DOWN;
		KEY_LEFT 	= Keys.LEFT;
		KEY_RIGHT 	= Keys.RIGHT;
		
		KEY_ACTION 	= Keys.Z;
		KEY_MAGIC 	= Keys.X;
		
		KEY_SELECT 	= Keys.C;
		
		KEY_ENTER 	= Keys.ENTER;
		
		KEY_CAM_UP 		= Keys.W;
		KEY_CAM_DOWN 	= Keys.S;
		KEY_CAM_LEFT 	= Keys.A;
		KEY_CAM_RIGHT 	= Keys.D;
		
		KEY_PREVIOUS_GROUP = Keys.Q;
		KEY_NEXT_GROUP = Keys.E;
		
		KEY_TOGGLE_GRID = Keys.T;
		KEY_TOGGLE_MAP = Keys.M;
		
		KEY_SAVE_POINTS = Keys.B;
		
		KEY_CTRL = Keys.CONTROL_LEFT;
		KEY_SHIFT = Keys.SHIFT_LEFT;
	}
	
	@Override
	public boolean keyDown(int keycode) {
		if (keycode == KEY_UP) {
			buttons[UP] = true;
		} else if (keycode == KEY_LEFT) {
			buttons[LEFT] = true;
		} else if (keycode == KEY_RIGHT) {
			buttons[RIGHT] = true;
		} else if (keycode == KEY_DOWN) {
			buttons[DOWN] = true;
		} else if (keycode == KEY_ACTION) {
			buttons[ACTION] = true;
		} else if (keycode == KEY_MAGIC) {
			buttons[CHANGE] = true;
		} else if (keycode == KEY_SELECT) {
			buttons[SELECT] = true;
		} else if (keycode == KEY_ENTER) {
			buttons[ENTER] = true;
		} else if (keycode == KEY_CAM_UP) {
			buttons[CAM_UP] = true;
		} else if (keycode == KEY_CAM_DOWN) {
			buttons[CAM_DOWN] = true;
		} else if (keycode == KEY_CAM_LEFT) {
			buttons[CAM_LEFT] = true;
		} else if (keycode == KEY_CAM_RIGHT) {
			buttons[CAM_RIGHT] = true;
		} else if (keycode == KEY_NEXT_GROUP) {
			buttons[NEXT_GROUP] = true;
		} else if (keycode == KEY_PREVIOUS_GROUP) {
			buttons[PREVIOUS_GROUP] = true;
		} else if (keycode == KEY_TOGGLE_GRID) {
			buttons[TOGGLE_GRID] = true;
		} else if (keycode == KEY_TOGGLE_MAP) {
			buttons[TOGGLE_MAP] = true;
		} else if (keycode == KEY_SAVE_POINTS) {
			buttons[SAVE_POINTS] = true;
		} else if (keycode == KEY_CTRL) {
			buttons[CTRL] = true;
		} else if (keycode == KEY_SHIFT) {
			buttons[SHIFT] = true;
		}
		return true;
	}

	@Override
	public boolean keyUp(int keycode) {
		if (keycode == KEY_UP) {
			buttons[UP] = false;
		} else if (keycode == KEY_LEFT) {
			buttons[LEFT] = false;
		} else if (keycode == KEY_RIGHT) {
			buttons[RIGHT] = false;
		} else if (keycode == KEY_DOWN) {
			buttons[DOWN] = false;
		} else if (keycode == KEY_ACTION) {
			buttons[ACTION] = false;
		} else if (keycode == KEY_MAGIC) {
			buttons[CHANGE] = false;
		} else if (keycode == KEY_SELECT) {
			buttons[SELECT] = false;
		} else if (keycode == KEY_ENTER) {
			buttons[ENTER] = false;
		} else if (keycode == KEY_CAM_UP) {
			buttons[CAM_UP] = false;
		} else if (keycode == KEY_CAM_DOWN) {
			buttons[CAM_DOWN] = false;
		} else if (keycode == KEY_CAM_LEFT) {
			buttons[CAM_LEFT] = false;
		} else if (keycode == KEY_CAM_RIGHT) {
			buttons[CAM_RIGHT] = false;
		} else if (keycode == KEY_NEXT_GROUP) {
			buttons[NEXT_GROUP] = false;
		} else if (keycode == KEY_PREVIOUS_GROUP) {
			buttons[PREVIOUS_GROUP] = false;
		} else if (keycode == KEY_TOGGLE_GRID) {
			buttons[TOGGLE_GRID] = false;
		} else if (keycode == KEY_TOGGLE_MAP) {
			buttons[TOGGLE_MAP] = false;
		} else if (keycode == KEY_SAVE_POINTS) {
			buttons[SAVE_POINTS] = false;
		} else if (keycode == KEY_CTRL) {
			buttons[CTRL] = false;
		} else if (keycode == KEY_SHIFT) {
			buttons[SHIFT] = false;
		}
		return true;
	}

	@Override
	public boolean keyTyped(char character) {
		return false;
	}

	@Override
	public boolean touchDown(int screenX, int screenY, int pointer, int button) {
		currentRawPoint.set(screenX, screenY, 0);
		if (button == Buttons.LEFT) {
			this.lastMouseButton = MOUSE_BUTTON.LEFT;
		} else if (button == Buttons.MIDDLE) {
			this.lastMouseButton = MOUSE_BUTTON.MIDDLE;
		} else if (button == Buttons.RIGHT) {
			this.lastMouseButton = MOUSE_BUTTON.RIGHT;
		}
		mouseReleased = false;
		mouseDown = true;
		return true;
	}

	@Override
	public boolean touchUp(int screenX, int screenY, int pointer, int button) {
		currentRawPoint.set(screenX, screenY, 0);
		if (button == Buttons.LEFT) {
			this.lastMouseButton = MOUSE_BUTTON.LEFT;
		} else if (button == Buttons.MIDDLE) {
			this.lastMouseButton = MOUSE_BUTTON.MIDDLE;
		} else if (button == Buttons.RIGHT) {
			this.lastMouseButton = MOUSE_BUTTON.RIGHT;
		}
		mouseDragged = false;
		mouseDown = false;
		mouseReleased = true;
		return true;
	}

	@Override
	public boolean touchDragged(int screenX, int screenY, int pointer) {
		currentRawPoint.set(screenX, screenY, 0);
		mouseDown = false;
		mouseDragged = true;
		return true;
	}

	@Override
	public boolean mouseMoved(int screenX, int screenY) {
		movingMousePosition.set(screenX, screenY, 0f);
		return false;
	}

	@Override
	public boolean scrolled(int amount) {
		return false;
	}	
}
