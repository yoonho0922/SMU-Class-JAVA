package week13;

public interface ImageViewerInterface {
    String getName();   //return Module Name ex) "JPG Module"
    void show(String fileName); // ex) "JPG image loading: fileName"
    String getExtension();  // ex) "JPG"
}
