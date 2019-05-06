package bench.test;

import java.net.InetAddress;
import java.net.UnknownHostException;
 
public class PCSpecs
{
	public String hostname;
	public String ipadress;
	public String nameos;
	public String ostype;
	public String osversion;
	public String proc1;
	public String proc2;
	public String proc3;
	public String proc4;
  
	public void PCSpec()
	{
  
    InetAddress ip;
	
    try {
  
        ip = InetAddress.getLocalHost();
        
        hostname = ip.getHostName();
        ipadress = ip.getHostAddress();
        nameos= System.getProperty("os.name");
        ostype= System.getProperty("os.arch");
        osversion= System.getProperty("os.version");
        proc1 = System.getenv("PROCESSOR_IDENTIFIER");
        proc2 = System.getenv("PROCESSOR_ARCHITECTURE");
        proc3 = System.getenv("PROCESSOR_ARCHITEW6432");
        proc4 = System.getenv("NUMBER_OF_PROCESSORS");
  
    } catch (UnknownHostException e) {
  
        e.printStackTrace();
  
    } catch (Exception e){
  
        e.printStackTrace();
  
    }
  
   }
  
}