package head.first.java.chapter18;
import java.rmi.*;
public interface MyRemote extends Remote{ // 你的接口必须继承于java.rmi.Remote
    public String sayHello() throws RemoteException; // 所有接口的方法都必须声明RemoteException
}
