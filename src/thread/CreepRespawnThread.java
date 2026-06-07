package thread;

public class CreepRespawnThreads extends Thread {
    private String creepName;

    public CreepRespawnThreads(
        String creepName
    ){
        this.creepName = creepName;

    }
    @Override
    public void run(){
        try{
            System.out.println(
                creepName
                + "will respawn in 10 seconds!"

            );
            Thread.sleep(10000);
             System.out.println(
                creepName
                + " has respawned!"
            );
        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }
}