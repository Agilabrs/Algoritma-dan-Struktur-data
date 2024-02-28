
public class Dragon {

    private int x;
    private int y;
    private int width;
    private int height;

    public static void main(String[] args) {
        Dragon dg1 = new Dragon();
        dg1.x = 3;
        dg1.y = 5;
        dg1.width = 10;
        dg1.height = 10;

        dg1.posisionDragon();
        dg1.moveRight();
        dg1.detectCollision(dg1.x, dg1.y);
        dg1.posisionDragon();
        dg1.moveRight();
        dg1.detectCollision(dg1.x, dg1.y);
        dg1.posisionDragon();
        dg1.moveRight();
        dg1.detectCollision(dg1.x, dg1.y);
        dg1.posisionDragon();
        dg1.moveLeft();
        dg1.detectCollision(dg1.x, dg1.y);
        dg1.posisionDragon();
        dg1.moveLeft();
        dg1.detectCollision(dg1.x, dg1.y);
        for (int i = 1; i < 10; i++) {
            dg1.moveUp();
            dg1.posisionDragon();
            dg1.detectCollision(dg1.x, dg1.y);
    }

    public Dragon(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public void moveLeft() {
        x--;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    public void moveRight() {
        x++;
        if (x < 0 || x > width) {
            detectCollision();
        }
    }

    public void moveUp() {
        y--;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    public void moveDown() {
        y++;
        if (y < 0 || y > height) {
            detectCollision();
        }
    }

    public void detectCollision() {
        System.out.println("Game Over");
        System.exit(0);
    }

    public void posisionDragon() {
        System.out.printf("\nDragon posision : X = %d, Y = %d\n", x, y);
    }
}
