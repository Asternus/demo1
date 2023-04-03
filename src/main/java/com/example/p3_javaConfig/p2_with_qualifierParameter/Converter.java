package com.example.p3_javaConfig.p2_with_qualifierParameter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Converter {
    private Image input;
    private Image output;

    @Autowired
    public Converter(@Qualifier("jpg") Image input,
                     @Qualifier("svg") Image output) {
        this.input = input;
        this.output = output;
    }

    public void convert() {
        System.out.println("Converting: " + input.getFormat() + " to " + output.getFormat());
    }
}
