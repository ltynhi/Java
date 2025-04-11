package Thread;

public class TicketSeller extends Thread {
	private final TicketBuffer buffer;

    public TicketSeller(TicketBuffer buffer) {
        this.buffer = buffer;
    }

    @Override
    public void run() {
        int ticket = 0;
        while (true) {
            try {
                buffer.sellTicket(ticket++);
                sleep(100); // Simulate time taken to sell a ticket
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}

