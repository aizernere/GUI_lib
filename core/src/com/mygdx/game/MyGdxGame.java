package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.ScreenUtils;

public class MyGdxGame extends ApplicationAdapter implements Screen {

	static Texture img;
	private final Fasaar game;

	public MyGdxGame(Fasaar game) {
		this.game = game;
	}

	public static void init(){
		img = new Texture("badlogic.jpg");
	}


	@Override
	public void show() {


	}

	@Override
	public void render(float delta) {
		ScreenUtils.clear(1, 0, 0, 1);
		game.getBatch().begin();
		game.getBatch().draw(img, 0, 0);
		game.getBatch().end();
	}

	@Override
	public void hide() {

	}

	@Override
	public void dispose () {
		img.dispose();
	}
}
