package com.zhang.picpig.util;

import com.zhang.picpig.plugin.Page;

import javax.servlet.http.HttpServletRequest;
import java.io.UnsupportedEncodingException;
import java.util.*;

public class ParameterMap extends HashMap implements Map {

    Map map = null;
    HttpServletRequest request;

    public ParameterMap() {
        map = new HashMap();
    }

    public ParameterMap(Page page) {
        Map<String, Object> pageMap = new HashMap<>();
        pageMap.put("currentPage", page.getCurrentPage());
        pageMap.put("totalPage", page.getTotalPage());
        pageMap.put("totalResult", page.getTotalResult());
        pageMap.put("showCount", page.getShowCount());
        map = pageMap;
    }

    public ParameterMap(HttpServletRequest request) {
        this.request = request;
        try {
            request.setCharacterEncoding("utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        Map proerties = request.getParameterMap();
        Map returnMap = new HashMap();
        Iterator entries = proerties.entrySet().iterator();
        Map.Entry entry;
        while (entries.hasNext()) {
            String name = "";
            String value = "";
            entry = (Entry) entries.next();
            name = (String) entry.getKey();
            Object valueObject = entry.getValue();
            if (valueObject == null) {
                value = "";
            } else if (valueObject instanceof String[]) {
                String[] values = (String[]) valueObject;
                for (int i = 0; i < values.length; i++) {
                    value = values[i] + "," + value;
                }
                value = value.substring(0, value.length() - 1);
            } else {
                value = valueObject.toString();
            }
            returnMap.put(name, value);
        }
        returnMap.put("SessionID", request.getSession().getId());
        map = returnMap;
    }

    @Override
    public Object get(Object key) {
        Object obj = null;
        if (map.get(key) instanceof Object[]) {
            Object[] arr = (Object[]) map.get(key);
            obj = request == null ? arr : (request.getParameter((String) key) == null ? arr : arr[0]);
        } else {
            obj = map.get(key);
        }
        return obj;
    }

    public String getString(Object key) {
        String str = "";
        if (get(key) != null) {
            str = String.valueOf(get(key));
        }
        return str;
    }

    @Override
    public Object put(Object key, Object value) {
        return map.put(key, value);
    }

    @Override
    public Object remove(Object key) {
        return map.remove(key);
    }

    @Override
    public void clear() {
        map.clear();
    }

    @Override
    public boolean containsKey(Object key) {
        return  map.containsKey(key);
    }

    @Override
    public boolean containsValue(Object value) {
        return map.containsValue(value);
    }

    @Override
    public Set<Entry> entrySet() {
        return map.entrySet();
    }

    @Override
    public boolean isEmpty() {
        return map.isEmpty();
    }

    @Override
    public Set keySet() {
        return map.keySet();
    }

    @Override
    public void putAll(Map m) {
        map.putAll(m);
    }

    @Override
    public int size() {
        return map.size();
    }

    @Override
    public Collection values() {
        return map.values();
    }
}
