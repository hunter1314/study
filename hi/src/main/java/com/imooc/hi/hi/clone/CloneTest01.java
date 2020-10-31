package com.imooc.hi.hi.clone;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.util.Map;

public class CloneTest01
{
    public static void main(String[] args) throws Exception
    {
        CloneVO vo1 = new CloneVO();

        /*CloneVO vo2 = new CloneVO();
        vo2 = (CloneVO) vo1.deepClone();*/

        
        CloneVO2 vo2 = new CloneVO2();
        vo2 = (CloneVO2) vo1.deepClone();
        
        
        System.out.println(vo1);
        System.out.println(vo2);
    }

}
