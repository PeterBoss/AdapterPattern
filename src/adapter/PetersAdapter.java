package adapter;

import app2dapi.App2D;
import app2dapi.Device;
import app2dapi.graphics.Canvas;

/**
 *
 * @author PeterBoss
 */
public class PetersAdapter implements App2D{
    
    private final Peters2DApp app;
    private double aspectRatio;

    public PetersAdapter(Peters2DApp app) {
        this.app = app;
    }
    
    @Override
    public boolean showMouseCursor() {
        return app.showMouseCursor();
    }

    @Override
    public boolean initialize(Device device) {
        double screenX = device.getScreen().getPixelWidth();
        double screenY = device.getScreen().getPixelHeight();
        aspectRatio = screenX / screenY;
        return app.initialize(aspectRatio);
    }

    @Override
    public boolean update(double time) {
        return app.update(time);
    }

    @Override
    public void draw(Canvas canvas) {
        app.setupHUD(canvas);
        app.draw(canvas);
    }

    @Override
    public void destroy() {
        app.destroy();
    }
    
}
