package name.michaelamiethyst.games.mythcreator.model;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.BitmapFont;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer;
import com.badlogic.gdx.graphics.glutils.ShapeRenderer.ShapeType;

/**
 * Main player charactor.
 * 
 * @author desig
 */
public class MythicMenu implements Renderable<MythicMenu> {
	
	/**
	 * Filename for the player's sprite.
	 */
	private static final String ASSET_FILENAME = "the-god-emperor-of-man.jpg";
	
	/**
	 * The player's Icon.
	 */
	private Texture img;
	
	public MythicMenu() {
		img = new Texture(ASSET_FILENAME);
	}

	/**
	 * @see ApplicationAdapter#render();
	 * @return this object for method chaining.
	 */
	public MythicMenu render(SpriteBatch batch) {
		boolean wasDrawing = batch.isDrawing();
		if (wasDrawing) {
			batch.end();
		}
		int height = renderLetterboxes();
		batch.begin();
		
		renderText(batch, height);
		if (!wasDrawing) {
			batch.end();
		}
		return this;
	}

	private int renderLetterboxes() {
		ShapeRenderer shapes = new ShapeRenderer();
		shapes.begin(ShapeType.Filled);
		shapes.setColor(0, 0, 0, 1);
		int width = Gdx.graphics.getWidth();
		int height = Gdx.graphics.getHeight();
		if (height != 1024 && height != 873) {
			throw new RuntimeException(Integer.toString(height));
		}
		
		// draw top and bottom letterboxes
		int cellHeight = 138;
		int halfCellHeight = cellHeight / 2;
		shapes.rect(0, height - halfCellHeight, width, cellHeight);
		shapes.rect(0, 0, width, cellHeight);
		shapes.end();
		return height;
	}

	private void renderText(SpriteBatch batch, int height) {
		// draw top text
		BitmapFont font = new BitmapFont();
		font.setColor(255f, 0f, 0f, 1f);
		int fontHeight = height / 2 - 42;
		font.draw(batch, "Hm.  Maybe I should right click on something... and fix that 4th wall.", 10, fontHeight);
	}

	/**
	 * @see ApplicationAdapter#dispose().
	 * @return this object for method chaining.
	 */
	public MythicMenu dispose() {
		if (img != null) {
			img.dispose();
		}
		return this;
	}
	
}
