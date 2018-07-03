package dj.com.testso2;


/**
 * Created by Administrator on 2018/7/3.
 */

public class MainActivity {
    // Used to load the 'native-lib' library on application startup.
    static {
        System.loadLibrary("native-lib");
    }
    public String showResult()
    {
        return stringFromJNI();
    }

    public native String stringFromJNI();

}
