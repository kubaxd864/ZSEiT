import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

class Ticket {
    private LocalDateTime purchaseTime;
    private LocalDateTime expiryTime;

    public Ticket(int validityMinutes) {
        purchaseTime = LocalDateTime.now();
        expiryTime = purchaseTime.plusMinutes(validityMinutes);
    }

    public boolean isExpired() {
        return LocalDateTime.now().isAfter(expiryTime);
    }
}

class Passenger {
    private String firstName;
    private String lastName;
    private Ticket ticket;

    public Passenger(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public boolean hasValidTicket() {
        if (ticket == null) {
            return false;
        }
        return !ticket.isExpired();
    }

    @Override
    public String toString() {
        return firstName + " " + lastName;
    }
}

class TicketMachine {
    public void buyTicket(Passenger passenger, int validityMinutes) {
        Ticket ticket = new Ticket(validityMinutes);
        passenger.setTicket(ticket);
    }
}

public class TicketController {
    public static void main(String[] args) {
        List<Passenger> passengers = new ArrayList<>();
        passengers.add(new Passenger("Jan", "Kowalski"));
        passengers.add(new Passenger("Maria", "Nowak"));
        passengers.add(new Passenger("Piotr", "Lewandowski"));
        passengers.add(new Passenger("Alicja", "Majewska"));
        passengers.add(new Passenger("Kamil", "Duda"));

        TicketMachine ticketMachine = new TicketMachine();
        ticketMachine.buyTicket(passengers.get(0), 30);
        ticketMachine.buyTicket(passengers.get(1), 60);
        ticketMachine.buyTicket(passengers.get(2), 15);
        passengers.get(3).setTicket(new Ticket(-2));
        passengers.get(4).setTicket(new Ticket(45));

        List<Passenger> invalidPassengers = getInvalidPassengers(passengers);
        System.out.println("Lista pasażerów bez ważnego biletu:");
        for (Passenger passenger : invalidPassengers) {
            System.out.println(passenger);
        }
    }

    private static List<Passenger> getInvalidPassengers(List<Passenger> passengers) {
        List<Passenger> invalidPassengers = new ArrayList<>();
        for (Passenger passenger : passengers) {
            if (!passenger.hasValidTicket()) {
                invalidPassengers.add(passenger);
            }
        }
        return invalidPassengers;
    }
}