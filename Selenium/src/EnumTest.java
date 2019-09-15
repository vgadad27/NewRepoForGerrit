import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

public class EnumTest {
 

  public static void main(String[] args) {
   CopyOnWriteArrayList<String> list= new CopyOnWriteArrayList<>();
   list.add("A");
   list.add("B");
   list.add("C");
   Iterator<String> ii= list.iterator();
   list.remove("B");
   while(ii.hasNext()){
     System.out.println(ii.next());
   }
   int x = 0,y = 0,count=0;
   boolean z=false;
   if(z=true || y==1){
     count=count+1;
   }
  
   if(z^false){
     count=count+1;
   }
if(++x>0 & y++>0){
  count=count+1;
}
System.out.println(count);
StringBuilder[] s= {new StringBuilder("A"),new StringBuilder("B"), new StringBuilder("C")};
System.out.println(s[2]);
  }


}
