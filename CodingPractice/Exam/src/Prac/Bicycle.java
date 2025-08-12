package Prac;

public class Bicycle extends Vehicle{
     String name = "자전거";

     @Override
     public void move() {
          System.out.println("운전수 " + name + "은 " + (wheelCount = 2) + "개의 바퀴의 " + name + "을 운전한다.");
     }

     @Override
     public void stop() {
          System.out.println("운전수 " + name + "은 " + name + "을 정지한다.");
     }
}
