package com.csp;

import java.util.HashMap;
import java.util.Map;

class VeryImportantException extends Exception {
    public String toString() {
        return "A very Important exception!";
    }
}

class HoHumException extends Exception {
    public String toString() {
        return "A trivial exception!";
    }
}

/**
 * 缺陷 异常丢失
 */
public class LostMessage {

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    public static void main(String[] args){
        /*try {
            LostMessage lostMessage = new LostMessage();
            try {
                lostMessage.f();
            }finally {
                lostMessage.dispose();
            }
        }catch (Exception e){
            System.out.println(e);
        }*/

        Map<String,Object> map = new HashMap<>();
        map.put("11","sd");
        map.put("22","sd");
        map.put("33",null);

        String aa = map.get("33") + "";
        System.out.println(aa.toString());
        String bb = (String) map.get("44");
        System.out.println(bb);
    }
    /*
     A trivial exception!
     */
}
