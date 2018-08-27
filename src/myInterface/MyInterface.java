package myInterface;
import java.rmi.Remote;
import java.rmi.RemoteException;

public interface MyInterface extends Remote {
	
	public int length (String text) throws RemoteException;
	public String[] dataNames () throws RemoteException;

}
