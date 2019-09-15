import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;

import java.util.Set;
import java.util.Iterator;
import java.util.List;

public class Details {

    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        
        DesktopOptions options=new DesktopOptions();
        
        options.setApplicationPath("D:\\Build\\20\\install\\InService_6.4_F000-CPS11.01\\setup.bat");
        
        DesiredCapabilities desiredCapabilities = (DesiredCapabilities)options.toCapabilities();
        
      //  RemoteWebDriver driver = new RemoteWebDriver(new URL("http://localhost:9999"), desiredCapabilities);
       
       WiniumDriver driver=new WiniumDriver(new URL("http://localhost:9999"), options);
        
        Thread.sleep(20000);
        
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        
        WebElement el=driver.findElement(By.xpath("/form[@title='']/element[@type='Flexeraat7$6']//button[@name='defaultButton']"));
                                                 
     //  executor.executeScript("arguments[0].click();", el);
        
        el.click();
        System.out.println("the elemet is ");
        System.out.println(driver.findElementById("137").getAttribute("AutomationId")); 
        System.out.println("Perform the click action successfully");
       
        /* List<Double> d=null;
        double d1;
        String str="USD 10.60";
        Pattern p = Pattern.compile("(\\d+(?:[\\.]?\\d+))");
      //  Pattern p = Pattern.compile("(\\d+)");
        Matcher m = p.matcher(str);
        while(m.find()) {
            Double.parseDouble(m.group(1));
            d1=Double.parseDouble(m.group(1));
            d.add(d1);
            System.out.println(d1);
        */
        
     /*   HashMap<String, String> hmap = new HashMap<String, String>();
         hmap.put("5.2", "A");
         hmap.put("11.1", "C");
         
         System.out.println("Size is"+hmap.size());
         System.out.println("Before Sorting:");
         Set set = hmap.entrySet();
         Iterator iterator = set.iterator();
         while(iterator.hasNext()) {
               Map.Entry me = (Map.Entry)iterator.next();
               System.out.print(me.getKey() + ": ");
               System.out.println(me.getValue());
         }
         Map<String, String> map = new TreeMap<String, String>(hmap); 
         System.out.println("After Sorting:");
         Set set2 = map.entrySet();
         Iterator iterator2 = set2.iterator();
         while(iterator2.hasNext()) {
              Map.Entry me2 = (Map.Entry)iterator2.next();
              System.out.print(me2.getKey() + ": ");
              System.out.println(me2.getValue());
         }*/
    }
}