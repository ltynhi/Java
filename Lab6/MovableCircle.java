public class MovableCircle implements Movable {
	
   private MovablePoint center;  
   private int radius;
   public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
      center = new MovablePoint(x, y, xSpeed, ySpeed);  // Create the center point
      this.radius = radius;
   }
   @Override
   public void moveUp() {
      center.moveUp();  
   }
   @Override
   public void moveDown() {
      center.moveDown(); 
   }
   @Override
   public void moveLeft() {
      center.moveLeft();  
   }
   @Override
   public void moveRight() {
      center.moveRight();  
   }
   @Override
   public String toString() {
      return "MovableCircle[center=" + center + ", radius=" + radius + "]";
   }
}
