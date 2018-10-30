package genel;

class Team {
   private String name;
   public Team(String aName) { name = aName; }
   public String getName() { return name; }
	
   public boolean esit(Team t) {
	   System.out.println("selam");
      return this.getName().equals(t.getName());
   }
}

public class Equation {
   public static void main(String[] args) {
	   Team t1 = new Team("Barcelona");
	   Team t2 = new Team("Galatasaray");
	   Team t3 = new Team("Barcelona");
      System.out.print(t1.esit(t2));
      System.out.print(t1.esit(t3));
   }
}