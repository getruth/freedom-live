package javabase.generics;

class MyInterger <T> {
    T t;
    void SetVal(T t) {
        this.t = t;
    }
    <T> T GetVal() {
        return (T)this.t;
    }
}

public class SupperExtends {
    public static void main(String[] args) {
        Integer integers = 5;
        // Error:(16, 53) java: 不兼容的类型: java.lang.Integer[]无法转换为javabase.generics.MyInterger<? extends java.lang.Integer>
        MyInterger< ? extends Integer> myIntergerE = new MyInterger<Integer>();
        MyInterger< ? super Integer> myIntergerS = new MyInterger<Integer>();
        var inter = new Integer[] { 1, 2, 3, 4};

    }
}

//懒汉式：默认不会实例化，什么时候用什么时候new。
class Lazy{
    private Lazy(){}
    //默认不会实例化，什么时候用什么时候new
    private static Lazy lazy=null;
    public static synchronized Lazy getInstance(){
        if(lazy==null){
            lazy=new Lazy();
        }
        return lazy;
    }
}