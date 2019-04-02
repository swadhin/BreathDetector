package cn.edu.sustc.recoder.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class ReadMusicFile {
    private String musicUrl;
    byte[] buffer;
    public ReadMusicFile(String path){
        musicUrl = path;
    }

    public byte[] read(){
        File file = new File(musicUrl);
        try {
            InputStream fis = new FileInputStream(file);
            buffer = new byte[(int)file.length()];
            fis.read(buffer, 0, buffer.length);
            fis.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return buffer;
    }

    public static byte[] read(String path){
        byte[] buf = null;
        File file = new File(path);
        try {
            InputStream fis = new FileInputStream(file);
            buf = new byte[(int)file.length()];
            fis.read(buf, 0, buf.length);
            fis.close();
        }catch (IOException e) {
            e.printStackTrace();
        }
        return buf;
    }

}
