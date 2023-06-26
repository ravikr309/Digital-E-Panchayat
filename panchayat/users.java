package com.example.panchayat;

public class users {
String pname,problem,ptext;

    public users() {
    }



    public users(String pname, String problem, String ptext){
    this.pname=pname;
    this.problem=problem;
    this.ptext=ptext;
}

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getProblem() {
        return problem;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public String getPtext() {
        return ptext;
    }

    public void setPtext(String ptext) {
        this.ptext = ptext;
    }
}
