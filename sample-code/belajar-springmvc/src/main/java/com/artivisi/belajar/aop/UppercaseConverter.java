package com.artivisi.belajar.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class UppercaseConverter implements MethodInterceptor {

    public Object invoke(MethodInvocation mi) throws Throwable {
        String namaMethod = mi.getMethod().getName();
        Integer jumlahArgumen = mi.getMethod().getParameterTypes().length;

        System.out.println("Memanggil method "+namaMethod+" dengan jumlah argumen "+jumlahArgumen);
        
        Object hasil = mi.proceed();
        
        if(hasil != null){
            System.out.println("Tipe data return value : "+hasil.getClass().getName());

            // bila string, jadikan huruf besar
            if(String.class.isAssignableFrom(hasil.getClass())){
                return ((String)hasil).toUpperCase();
            }
        }
        
        return hasil;
    }
    
}
