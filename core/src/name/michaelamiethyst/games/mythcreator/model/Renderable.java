package name.michaelamiethyst.games.mythcreator.model;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

/**
 * For objects that need to be rendered onto the screen.
 *
 * Like a Fluent ApplicationListener but with default implementations of everything
 * but render and dispose.
 */
public interface Renderable<T> {

	// no create(), just use default constructor

	default T resize(int width, int height) {
		return null;
	}

	T render(SpriteBatch batch);

	default T pause() {
		return null;
	}

	default T resume() {
		return null;
	}

	T dispose();

}
