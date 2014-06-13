package com.artivisi.belajar.helper;

public class PageHelper {
    public static Integer pageToStart(Integer page, Integer rows){
        if(page < 2) {
            return 0;
        }
        
        return (page - 1) * rows;
    }
}
