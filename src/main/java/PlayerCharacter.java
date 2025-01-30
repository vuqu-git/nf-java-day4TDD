public class PlayerCharacter {

    static int x = 0;
    static int y = 0;

    public static int getX() {
        return x;
    }

    public static int getY() {
        return y;
    }

    public static void setX(int newX) {
        x = newX;
    }

    public static void setY(int newY) {
        y = newY;
    }

    public static void move(String keystroke) {
        switch(keystroke) {
            case "W":  setY(y + 1); break;
            case "S":  setY(y - 1); break;
            case "D":  x = x + 1; break;
            case "A":  x = x - 1; break;
        }


    }
}
