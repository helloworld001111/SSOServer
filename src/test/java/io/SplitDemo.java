package io;

import org.junit.Test;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Enumeration;

public class SplitDemo {
    @Test
    public void fun1() throws IOException {
//        split();
        merge();
    }

    private void merge() throws IOException {
        ArrayList<FileInputStream> list = new ArrayList<FileInputStream>();
        String folder = "C:\\Users\\DELL\\Desktop\\个人\\java_test\\part";
        for(int i =0;i<6;i++){
            FileInputStream fis = new FileInputStream(new File(folder, i + ".part"));
            list.add(fis);
        }
        Enumeration<FileInputStream> enu = Collections.enumeration(list);
        SequenceInputStream sis = new SequenceInputStream(enu);
        FileOutputStream fos = new FileOutputStream("part.png");
        byte[] bys = new byte[1024];
        int len = 0;
        while((len = sis.read(bys))!=-1){
            fos.write(bys,0,len);
        }
        fos.close();
        sis.close();
    }

    private void split() throws IOException {
        FileInputStream fis = new FileInputStream("test.png");
        byte[] bys = new byte[1024];
        int len = 0;
        int count =0;
        while((len=fis.read(bys))!=-1){
            File folder = new File("C:\\Users\\DELL\\Desktop\\个人\\java_test\\part");
            //图片部分可以打开，部分无法打开
            FileOutputStream fos = new FileOutputStream(new File(folder,count++ + ".part"));
            fos.write(bys,0,len);
            fos.close();
        }
        fis.close();
    }

    public void read(byte[] bys,int offset,int len){

    }
}
