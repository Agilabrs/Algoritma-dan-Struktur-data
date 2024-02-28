public class DragonMain {
    public static void main(String[] args) {
        DragonMain dg1 = new DragonMain();
        dg1.x = 3;
        dg1.y = 5;
        dg1.width = 10;
        dg1.heigth = 10;
    
        dg1.posisionDragon();
        dg1.moveRigth();
        dg1.detectCollision(dg1.x, dg1.y);
        dg1.posisionDragon();    
        dg1.moveRigth();
        dg1.detectCollision(dg1.x, dg1.y);
        dg1.posisionDragon();    
        dg1.moveRigth();
        dg1.detectCollision(dg1.x, dg1.y);
        dg1.posisionDragon();    
        dg1.moveLeft();
        dg1.detectCollision(dg1.x, dg1.y);
        dg1.posisionDragon();    
        dg1.moveLeft();
        dg1.detectCollision(dg1.x, dg1.y);    
        for (int i = 1; i < 10;i++) {
            dg1.moveUp();
            dg1.posisionDragon();    
            dg1.detectCollision(dg1.x, dg1.y);    
        }    
    }
}
