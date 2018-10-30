package com.examples;
 
import com.tangosol.net.CacheFactory;
import com.tangosol.net.NamedCache;
 
public class CoherenceHelloWorld {
 
   public static void main(String[] args) {
 
      String key = "k2";
      String value = "Hello World2!";
 
      CacheFactory.ensureCluster();
      NamedCache cache = CacheFactory.getCache("hello-example");
 
      cache.put(key, value);
      System.out.println((String)cache.get(key));
 
      CacheFactory.shutdown();
   }
}
