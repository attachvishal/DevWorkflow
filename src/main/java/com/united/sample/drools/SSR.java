package com.united.sample.drools;

import java.util.Objects;
/**
 * This class was automatically generated by the data modeler tool.
 */

public class SSR implements java.io.Serializable {

    static final long serialVersionUID = 1L;
   	private String Code;
    private String Comment;
    private String RawSSR;
    private String ItemNum;
    
    public SSR() {
    }

   

    public String getCode() {
        return Code;
    }

    public void setCode(String code) {
        Code = code;
    }

    public String getComment() {
        return Comment;
    }

    public void setComment(String comment) {
        Comment = comment;
    }

    public String getRawSSR() {
        return RawSSR;
    }

    public void setRawSSR(String rawSSR) {
        RawSSR = rawSSR;
    }

    public String getItemNum() {
        return ItemNum;
    }

    public void setItemNum(String itemNum) {
        ItemNum = itemNum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SSR ssr = (SSR) o;
        return Objects.equals(getCode(), ssr.getCode()) &&
                Objects.equals(getComment(), ssr.getComment()) &&
                Objects.equals(getRawSSR(), ssr.getRawSSR()) &&
                Objects.equals(getItemNum(), ssr.getItemNum());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getCode(), getComment(), getRawSSR(), getItemNum());
    }


}