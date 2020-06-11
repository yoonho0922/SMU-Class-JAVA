package week13;

public class ImageViewer {
    private static final int MAX_PLUGINS = 5;
    private int i=0;
    private ImageViewerInterface[] ivis;

    public ImageViewer(){
         this.ivis = new ImageViewerInterface[MAX_PLUGINS];
         // MAX_PLUGINS 크기의 배열 초기화
    };

    public void addPlugIn(ImageViewerInterface ivi){
        ivis[i]=ivi;    // 모듈 추가
        i++;
    }

    public void show(String fileName, String ext){
        for(ImageViewerInterface ivi : ivis){
            if(ivi==null){
                // 일치하는 확장자가 없을 경우
                System.out.println("Image viewer plugin for the extension,"
                        + ext + ", is not registered");
                return;
            }
            if(ivi.getExtension().equals(ext)) {   // 일치하는 확장자가 있을 경우
                System.out.println("Using " + ivi.getName());
                ivi.show(fileName);
                return;
            }
        }

    }
}