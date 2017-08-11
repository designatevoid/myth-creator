package name.michaelamiethyst.games.mythcreator;

import javax.inject.Inject;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.google.inject.Guice;
import com.google.inject.Injector;

import name.michaelamiethyst.games.mythcreator.model.MythicLevel;
import name.michaelamiethyst.games.mythcreator.model.MythicMenu;
import name.michaelamiethyst.games.mythcreator.model.MythicPlayer;

/**
 * Main entry point into the application-level code.
 * 
 * @author desig
 */
public class GameMain extends ApplicationAdapter {
	/**
	 * A grouping of Sprites used to improve performance.
	 */
	private SpriteBatch batch;
	
	/**
	 * The main charactor.
	 */
	private MythicPlayer player;
	
	private MythicLevel level;
	
	private MythicMenu menu;
	
	@Override
	public void create () {
		Injector injector = Guice.createInjector(new MythicModule());
		player = injector.getInstance(MythicPlayer.class);
		level = injector.getInstance(MythicLevel.class);
		menu = new MythicMenu();
		batch = new SpriteBatch();
		int width = 1280;
		int height = 1024;
		Gdx.graphics.setWindowedMode(width, height);
	}

	/**
	 * <p>Main Game Loop here.</p>
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void render () {
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		level.render(batch);
		player.render(batch);
		menu.render(batch);
		batch.end();
	}
	
	/**
	 * <p>For saving game state.
	 * 
	 * {@inheritDoc}
	 */
	@Override
	public void pause() {
	}

	@Override
	public void dispose () {
		batch.dispose();
		player.dispose();
		level.dispose();
		menu.dispose();
	}
}
