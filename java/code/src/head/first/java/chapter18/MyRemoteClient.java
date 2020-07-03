package head.first.java.chapter18;

import java.rmi.Naming;

public class MyRemoteClient {
    public static void main(String []args) {
        new MyRemoteClient().go();
    }
    public void go() {
        try {
            // IP地址+注册的名字
            MyRemote service = (MyRemote) Naming.lookup("rmi://127.0.0.1/Remote Hello");
            String s = service.sayHello(); // 调用服务器上实现的方法
            System.out.println(s);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
