package test;

public class Foo {

        public static void main(String[] args) {

                new Foo();

        }

        public Foo(){

                bar(null);

        }

        String bar(String string) {

                  // should be &&

                  if (string!=null || !string.equals(""))

                    return string;

                  // should be ||

                  if (string==null && string.equals(""))

                    return string;

                return string;

                 }

         

        }

