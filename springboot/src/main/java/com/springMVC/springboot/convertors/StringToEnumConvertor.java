package com.springMVC.springboot.convertors;

import com.springMVC.springboot.beans.Gender;

import javax.persistence.Convert;

public class StringToEnumConvertor implements Convert<String, Gender> {

    @Override
    public Class converter() {
        return null;
    }
}
