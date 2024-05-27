package com.mygdx.game;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class Fasaar extends Game {
    private SpriteBatch batch;
    @Override
    public void create() {
        MyGdxGame.init();
        batch = new SpriteBatch();
        setScreen(new LoginApp(this));
    }
    public void render(){
        super.render();
    }
    public void dispose(){
        super.dispose();
    }

    public SpriteBatch getBatch() {
        return batch;
    }
}
