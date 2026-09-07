package com.functions;

class getterSetter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int num;

    public void setNum(int num){
        this.num = num;
    }

    public int getNum(){
        return num;
    }


}
public class GetSet {
    public static void main(String[] args) {
        getterSetter values = new getterSetter();
        values.setNum(560);
        System.out.println(values.getNum());
        values.setName("Siddharth");
        System.out.println(values.getName());
    }
}
