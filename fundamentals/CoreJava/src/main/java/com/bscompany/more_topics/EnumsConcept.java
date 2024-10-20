package com.bscompany.more_topics;

enum LaptopBrands {
    MACBOOK,
    DELL,
    ASUS,
    LENOVO,
}

enum OrderStatus {
    DELIVERED,
    PENDIND,
    CANCELLED,
}

public class EnumsConcept {

    public static void main(String[] args) {
        // 09: 00
        OrderStatus os = OrderStatus.CANCELLED;
        System.out.println("Status: " + os + " Number: " + os.ordinal());

        switch (os) {
            case CANCELLED ->
                System.out.println("The Order was canceled!");
            case DELIVERED ->
                System.out.println("The Order was delivered!");
            case PENDIND ->
                System.out.println("The Order was pending!");
        }
    }
}
