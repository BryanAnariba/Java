package topics;

enum OrderStatus {
    DELIVERED,
    PENDIND,
    CANCELLED,
}

public class EnumsConcept {

    // 08: 45: 00
    public static void main(String[] args) {
        OrderStatus os = OrderStatus.CANCELLED;
        System.out.println("Status: " + os + " Number: " + os.ordinal());
        
        switch (os) {
            case CANCELLED -> System.out.println("The Order was canceled!");
            case DELIVERED -> System.out.println("The Order was delivered!");
            case PENDIND -> System.out.println("The Order was pending!");
        }
    }
}
