import java.util.Random;

public class SoccerGame {
    public static void main(String[] args) {
        Ball2 ball = new Ball2(50, 25); 
        Player team1[] = { new Player("Player 1A", 20, 25), new Player("Player 1B", 30, 30) };
        Player team2[] = { new Player("Player 2A", 70, 25), new Player("Player 2B", 60, 30) };
        Random random = new Random();
        for (int i = 0; i < 10; i++) { 
            Player player = (random.nextBoolean() ? team1 : team2)[random.nextInt(2)];
            float xSpeed = random.nextFloat() * 10 - 5; 
            float ySpeed = random.nextFloat() * 5 - 2.5f;
            player.kick(ball, xSpeed, ySpeed);
            for (int j = 0; j < 5; j++) { 
                ball.move();
                System.out.println(ball);
            }
        }
    }
}
