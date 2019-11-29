
public class BusThisStatement {
     int seats;
     String color;
     BusThisStatement(int seats,String color){
    	 this.seats = seats;
    	 this.color = color;
     }
     BusThisStatement(){
    	 this(40);
     }
     BusThisStatement(int seats){
    	 this(seats,"red");
     }
     void show() {
    	 System.out.println("seats available "+seats);
    	 System.out.println("color is "+color);
     }
     public static void main(String[] args) {
    	 BusThisStatement b = new BusThisStatement();
    	 b.show();
    	 
    	 BusThisStatement b1 = new BusThisStatement(33,"blue");
    	 b1.show();
    	 
    	 BusThisStatement b2 = new BusThisStatement(22);
    	 b2.show();
	}
}
