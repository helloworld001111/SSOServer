package io;

import com.fuscent.yooli.sso.pojo.Person;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.junit.Test;

import java.io.*;

public class ObjectDemo {
   @Test
   public void fun1() throws IOException {
      Person p = new Person("zhangsan", 12);
      ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("obj.object"));
      oos.writeObject(p);
      oos.close();
   }
   @Test
   public void fun2() throws IOException, ClassNotFoundException {
      readObject();
   }

   public void readObject() throws IOException, ClassNotFoundException {
      ObjectInputStream ois = new ObjectInputStream(new FileInputStream("obj.object"));
      Person p = (Person)ois.readObject();
      System.out.println(p);
      ois.close();
   }
}
