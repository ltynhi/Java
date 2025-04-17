package Thread;

public class TrainTicketSelling {

	public static void main(String[] args) {
        TicketBuffer buffer = new TicketBuffer(5);

        TicketSeller seller = new TicketSeller(buffer);
        TicketBuyer buyer = new TicketBuyer(buffer);

        seller.start();
        buyer.start();
    }
}
