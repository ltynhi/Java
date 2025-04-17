package Thread;

public class TicketBuyer extends Thread{
	private final TicketBuffer buffer;

    public TicketBuyer(TicketBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        while (true) {
            try {
                buffer.buyTicket();
                sleep(150); // Simulate time taken to buy a ticket
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

