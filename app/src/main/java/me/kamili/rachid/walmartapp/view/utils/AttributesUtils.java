package me.kamili.rachid.walmartapp.view.utils;

import java.util.HashMap;
import java.util.Map;

public class AttributesUtils {
    public static Map<String, String> getQueryMap(String query)
    {
        String[] params = query.split("&");
        Map<String, String> map = new HashMap<String, String>();
        for (String param : params){
            if (param.contains("=")){
                String name = param.split("=")[0];
                String value = param.split("=")[1];
                map.put(name, value);
            }
        }
        return map;
    }

    public static String getAttributeValue(String query, String attr){
        return getQueryMap(query).get(attr);
    }
}
