package head.first.java.chapter18;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

// 必须继承UnicastRemoteObject,并实现自定义接口
public class MyRemoteImpl extends UnicastRemoteObject implements MyRemote {
    // 因为父类的构造函数声明了异常，因此你的构造函数可能会调用异常的代码
    public MyRemoteImpl() throws RemoteException {
    }

    @Override
    public String sayHello() throws RemoteException {
        return "Service says, hello";
    }

    public static void main(String []args) {
        try {
            // 创建远程对象
            MyRemote service = new MyRemoteImpl();
            // 使用rebind产生关联，注册的名字会提供给客户端查询
            Naming.rebind("Remote Hello", service);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
