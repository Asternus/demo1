package com.example.p3_javaConfig.p2_with_qualifierParameter;

import org.springframework.stereotype.Component;

@Component
public class Svg implements Image{

    @Override
    public String getFormat() {
         return "svg";
    }
}
