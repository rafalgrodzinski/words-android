package com.unalignedbyte.words;

/**
 * Created by rafal on 11/12/2017.
 */

public class Language
{
    private String code;
    private String name;

    public Language(String code, String name)
    {
        this.code = code;
        this.name = name;
    }

    public String getCode()
    {
        return code;
    }

    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return name;
    }
}
