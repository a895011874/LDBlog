package com.dong.util;

import java.util.HashMap;

/**
 * Created by Administrator on 2017/11/22.
 */
public class JSONParamUtil
{
    public static String getValue(String obj,String key){
        HashMap<String,String> map = new HashMap();

        String [] s =obj.split("&");

        for (int i = 0;i<s.length;i++){
            map.put(s[i].split("=")[0],s[i].split("=")[1]);
        }


        return map.get(key);
    }
}
