package com.sdsoon.test.a;

import com.sdsoon.test.tio.bean.TioPacket;

import java.nio.Buffer;
import java.nio.ByteBuffer;

/**
 * Created By Chr on 2019/4/16.
 */
public class Test {


    //    public void show(){
//        TioPacket imPacket = new TioPacket();
//        if (bodyLength > 0) {
//            byte[] dst = new byte[bodyLength];
//            buffer.get(dst);
//            imPacket.setBody(dst);
//
//        System.out.println();
//    }
    public static void main(String args[]) {
        ByteBuffer buffer =
                ByteBuffer.allocate(10);
        byte[] dst = new byte[8];
        buffer.put((byte) 1);
        buffer.put((byte) 2);
        buffer.put((byte) 3);
        buffer.put((byte) 4);
        buffer.put((byte) 5);
        buffer.put((byte) 6);
        buffer.put((byte) 7);
        buffer.put((byte) 8);
//        buffer.put((byte) 9);
//        buffer.put((byte) 0);
        byte b = buffer.get(buffer.capacity() - 7);
        System.out.println(buffer.capacity());
        System.out.println(buffer.limit());
        System.out.println(buffer.get(b));
    }

}
