package Generick;

public class Camera extends Product<Camera> implements Gener<Camera> {
    float zoom;




    public float getZoom() {
        return zoom;
    }

    public void setZoom(float zoom) {
        this.zoom = zoom;
    }

    @Override
    public int subCompare(Camera o) {

            return 0;//super.subCompare(o)==0&&zoom == ((Camera) o).zoom?0:-1;

    }

    @Override
    public Camera creat() {
        return null;
    }
}
