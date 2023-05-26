package Task1;

import java.util.Date;

public class GeometricObject {
    private String colorName;
    private boolean isFull;
    private Date creationDate;

    public GeometricObject() {
    }

    public GeometricObject(String colorName, boolean isFull, Date creationDate) {
        this.colorName = colorName;
        this.creationDate = creationDate;
        this.isFull = isFull;
    }

    public String getColorName() {
        return colorName;
    }

    public void setColorName(String colorName) {
        this.colorName = colorName;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
    }

    public boolean isFull() {
        return isFull;
    }

    public void setFull(boolean full) {
        isFull = full;
    }

    @Override
    public String toString() {
        return "GeometricObject{" +
                "colorName='" + colorName + '\'' +
                ", isFull=" + isFull +
                ", creationDate=" + creationDate +
                '}';
    }
}
