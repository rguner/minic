package com.guner.sonar.futuretask;
import java.text.SimpleDateFormat;
 /*
  * Thread Safe implementation of SimpleDateFormat
  * Each Thread will get its own instance of SimpleDateFormat which will not be shared between other threads. *
  */
 public class SimpleDateTimePerThread {
 
     private static final ThreadLocal<SimpleDateFormat> dateFormatHolder = new ThreadLocal<SimpleDateFormat>() {
 
         /*
          * initialValue() is called
          */
         @Override
         protected SimpleDateFormat initialValue() {
             return new SimpleDateFormat("dd.MM.yyyy");
         }
     };
     
     private static final ThreadLocal<SimpleDateFormat> dateTimeFormatHolder = new ThreadLocal<SimpleDateFormat>() {
 
         /*
          * initialValue() is called
          */
         @Override
         protected SimpleDateFormat initialValue() {
             return new SimpleDateFormat("dd.MM.yyyy HH:mm");
         }
     };
     
     /*
      * Every time there is a call for DateTimeFormat, ThreadLocal will return calling
      * Thread's copy of SimpleDateFormat
      */
     public static SimpleDateFormat getDateTimeFormatter() {
         return dateTimeFormatHolder.get();
     }
     
     /*
      * Every time there is a call for DateFormat, ThreadLocal will return calling
      * Thread's copy of SimpleDateFormat
      */
     public static SimpleDateFormat getDateFormatter() {
         return dateFormatHolder.get();
     }
 }
