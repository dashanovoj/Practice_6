public class Task1 {

    // Создаём интерфейс Movable
    public interface Movable {
        // Добавляем абстрактные методы для их реализации в implement классах
        public void moveUp();
        public void moveDown();
        public void moveLeft();
        public void moveRight();

    }

    // Класс, реализующий интерфейс Movable
    public class MovablePoint implements Movable {
        // Поля класса
        private int x;
        private int y;
        private int xSpeed;
        private int ySpeed;

        // Конструктор
        public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
            this.x = x;
            this.y = y;
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
        }

        // Метод toString()
        @Override
        public String toString() {
            return "MovablePoint{" +
                    "x=" + x +
                    ", y=" + y +
                    ", xSpeed=" + xSpeed +
                    ", ySpeed=" + ySpeed +
                    '}';
        }

        // Реализация методов интерфейса
        @Override
        public void moveUp() {
            y += ySpeed;
        }

        @Override
        public void moveDown() {
            y -= ySpeed;
        }

        @Override
        public void moveLeft() {
            x -= xSpeed;
        }

        @Override
        public void moveRight() {
            x += xSpeed;
        }
    }

    // Класс, реализующий интерфейс Movable и агрегацию с MovablePoint
    public class MovableCircle implements Movable {
        // Поля
        private int radius;
        private MovablePoint center; // объект класса MovablePoint (агрегация)

        // Конструктор
        public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
            this.center = new MovablePoint(x, y, xSpeed, ySpeed);
            this.radius = radius;
        }

        // Метод toString()
        @Override
        public String toString() {
            return "MovableCircle{" +
                    "radius=" + radius +
                    ", center=" + center.toString() +
                    '}';
        }

        // Реализация методов интерфейса
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
    }
}