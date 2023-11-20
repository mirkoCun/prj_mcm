package com.company;

public class CoppiaNumeri {
    private int n1;
    private int n2;

    public CoppiaNumeri(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN1(int n1) {
        if (n1<0){
            this.n1 = -n1;
        }else{
            this.n1 = n1;
        }
    }

    public void setN2(int n2) {
        if (n2<0){
            this.n2 = -n2;
        }else{
            this.n2 = n2;
        }
    }

    public int mcm() {
        int magg, min;
        if (n1>n2){
            magg=n1;
            min=n2;
        }else{
            magg=n2;
            min=n1;
        }
        while (magg % min != 0){
            magg+=magg;
        }
        return magg;
    }
}
