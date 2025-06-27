       class TicketCounter {
            private int availableSeats = 5;
        
            public synchronized void bookTicket(String name, int seatsRequested) {
                if (seatsRequested <= availableSeats) {
                    System.out.println(name + " successfully booked " + seatsRequested + " seat(s).");
                    availableSeats -= seatsRequested;
                } else {
                    System.out.println(name + " failed to book. Not enough seats.");
                }
            }
        }
        
        class BookingThread extends Thread {
            private TicketCounter counter;
            private String customerName;
            private int seats;
        
            BookingThread(TicketCounter counter, String customerName, int seats) {
                this.counter = counter;
                this.customerName = customerName;
                this.seats = seats;
            }
        
            public void run() {
                counter.bookTicket(customerName, seats);
            }
        }
        
        public class TicketBookingSystem {
            public static void main(String[] args) throws InterruptedException {
                TicketCounter counter = new TicketCounter();
        
                BookingThread vip1 = new BookingThread(counter, "VIP Paravdeep", 2);
                BookingThread vip2 = new BookingThread(counter, "VIP Anmol", 1);
                BookingThread normal1 = new BookingThread(counter, "Chakshit", 2);
                BookingThread normal2 = new BookingThread(counter, "Sahil", 2);
        
              
                vip1.start();
                vip1.join(); 
        
                vip2.start();
                vip2.join();
        
               
                normal1.start();
                normal1.join(); 
        
                normal2.start();
                normal2.join();
            }
        }
    
        