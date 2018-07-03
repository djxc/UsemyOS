1.利用javah根据java的native方法生成相应的头文件，可以在类文件上右击选择ndk下的javah。然后根据头文件写相应的cpp文件。
在as中生成so文件，可以将生成的so文件放在其他项目中使用。

2.在其他Android项目中使用so文件，将so文件放在libs文件夹中，在app的build.gradle中添加一下代码用来告诉系统在哪里找到so文件
 sourceSets {
        main {
            jniLibs.srcDirs = ['libs']
        }
    }
 根据so文件写出相应的Java类文件，包名、类名以及方法都要一致。在类文件中写入
 static {
        System.loadLibrary("native-lib");
    }
    public native String stringFromJNI();
    既可以调用c++里面的函数。