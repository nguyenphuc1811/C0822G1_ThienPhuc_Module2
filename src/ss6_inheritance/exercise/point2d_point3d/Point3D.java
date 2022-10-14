package ss6_inheritance.exercise.point2d_point3d;

import java.util.Arrays;

public class Point3D extends Point2D {
    private float z;

    Point3D(float x, float y, float z) {
        this.getX();
        this.getY();
        this.getZ();
    }

    Point3D() {
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setXY(x, y);
        setZ(z);
    }

    public float[] getXYZ() {
        return new float[]{getX(), getY(), this.z};
    }

    @Override
    public String toString() {
        return "Point3D{" +
                "z=" + z + " Array= " + Arrays.toString(getXYZ()) +
                '}';
    }
}
