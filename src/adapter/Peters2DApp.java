package adapter;

import app2dapi.graphics.Canvas;

/**
 *
 * @author PeterBoss
 */
public interface Peters2DApp {
    public boolean showMouseCursor();
    public boolean initialize(double aspectRatio);
    public boolean update(double time);
    public void draw(Canvas canvas);
    public void destroy();    
    public void setupHUD(Canvas canvas);
}
