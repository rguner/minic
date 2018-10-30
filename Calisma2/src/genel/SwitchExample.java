package genel;

public class SwitchExample {
   public static void main(String[] args) {
      byte g=110;
      switch (g) {
        case 100: System.out.print("MURAT ");			
          break;
        case 110: System.out.print("HALUK ");		
        case 120: System.out.print("HASAN ");		
        case 125: System.out.print("ISMAIL ");		
        default: System.out.print("KADIR ");			
     }
   }
}