package exercise;

public class Barber implements Runnable {

    private final WaitingRoom waitingRoom;

    public Barber(WaitingRoom waitingRoom) {
        this.waitingRoom = waitingRoom;
    }

    @Override
    public void run() {
        try {
            while (true) {
                Customer customer = waitingRoom.nextCustomer();

                System.out.println("barber call and shave customer " + customer);
                customer.callAndShave();
            }

        } catch (InterruptedException e) {
            System.out.println("barber has finished his job");
        }
    }
}
