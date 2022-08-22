package com.example.c36login.hadeeth;

public class HadethModel {
    private String hadeethnum ;

    public String getHadethContent() {
        return hadethContent;
    }

    public void setHadethContent(String hadethContent) {
        this.hadethContent = hadethContent;
    }

    private String hadethContent;

    public HadethModel(String hadeethnum) {
        this.hadeethnum = hadeethnum;
    }

    public String getHadeethnum() {
        return hadeethnum;
    }

    public void setHadeethnum(String hadeethnum) {
        this.hadeethnum = hadeethnum;
    }
}

