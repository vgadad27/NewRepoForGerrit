import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {

  /**
   * @param args
   * @throws Exception 
   */
  public static void main(String[] args) throws Exception {

    runScript();
    
  }

public static void runScript() throws Exception { 
    String s;
    try { 
        
      Runtime rt = Runtime.getRuntime();
      Process p=rt.exec("python D:/Automation/InService/Workspace/Selenium/src/Sample.py");
      p.waitFor();
      int x=p.exitValue();
      System.out.println("exit value is : "+x);
      BufferedReader in = new BufferedReader(new InputStreamReader(p.getErrorStream()));
      while((s=in.readLine())!=null)
      {
        System.out.println("Message is "+s);
      }
      }catch(Exception e){
        System.out.println("Message is"+e.getMessage());
      }
      }
}


