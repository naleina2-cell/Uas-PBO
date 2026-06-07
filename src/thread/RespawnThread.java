package thread;
import character.Hero;
public class RespawnThread extends Thread { 
    private Hero hero;

    public RespawnThread(Hero hero) {
        this.hero = hero;
    }

    @Override
    public void run() {
            try {
                System.out.println(
                        hero.getName() 
                        + " will respawn in 5 seconds!"
                );
                Thread.sleep(5000);
                hero.respawn();

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            }
        }
    
