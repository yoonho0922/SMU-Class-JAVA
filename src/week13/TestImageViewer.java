package week13;

public class
TestImageViewer {
    public static void main(String[] args) {
        ImageViewer v = new ImageViewer();
        v.addPlugIn(new PNGModule());
        v.addPlugIn(new JPGModule());
        v.show("a.jpg", "JPG");
        v.show("b.png", "PNG");
        v.show("c.tif", "TIF");
    }

}
