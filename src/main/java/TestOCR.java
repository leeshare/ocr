import java.io.File;
import java.io.IOException;

/**
 * Created by Administrator on 2016/3/15.
 */
public class TestOCR {
    /**
     * @param args
     */
    public static void main(String[] args) {
        //String path = "d://test_eng.jpg";
        String path = "d://test_chi.jpg";
        try {
            String valCode = new OCR().recognizeText(new File(path), "jpg");
            System.out.println(valCode);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
