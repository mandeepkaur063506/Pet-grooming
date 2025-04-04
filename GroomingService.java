// Grooming Service Class
class GroomingService {
    private String serviceName;
    private double price;

    public GroomingService(String serviceName, double price) {
        this.serviceName = serviceName;
        this.price = price;
    }

    public String getServiceName() { return serviceName; }
    public double getPrice() { return price; }
}

// Appointment Class
class Appointment {
    private Pet pet;
    private GroomingService service;
    private String date;

    public Appointment(Pet pet, GroomingService service, String date) {
        this.pet = pet;
        this.service = service;
        this.date = date;
    }

    public Pet getPet() { return pet; }
    public GroomingService getService() { return service; }
    public String getDate() { return date; }
}

// Payment Class
class Payment {
    private Appointment appointment;
    private double amount;
    private String paymentMethod;

public Payment(Appointment appointment, double amount, String paymentMethod) {
        this.appointment = appointment;
        this.amount = amount;
        this.paymentMethod = paymentMethod;
    }

    public double getAmount() { return amount; }
    public String getPaymentMethod() { return paymentMethod;}
}

public class PetGroomingTest {
    public static void main(String[] args) {
        // Create a Customer
        Customer customer = new Customer("John Doe", "123-456-7890");

        // Create a Pet
        Pet pet = new Pet("Buddy", "Golden Retriever", 3, customer);

        // Create a Grooming Service
        GroomingService service = new GroomingService("Full Grooming Package", 49.99);

        // Schedule an Appointment
        Appointment appointment = new Appointment(pet, service, "2025-04-05");

        // Process Payment
        Payment payment = new Payment(appointment, service.getPrice(), "Credit Card");

        // Display Output
        System.out.println("=== Pet Grooming Appointment ===");
        System.out.println("Customer: " + customer.getName() + " | Phone: " + customer.getPhone());
        System.out.println("Pet: " + pet.getName() + " | Breed: " + pet.getBreed() + " | Age: " + pet.getAge());
        System.out.println("Service: " + service.getServiceName() + " | Price: $" + service.getPrice());
        System.out.println("Appointment Date: " + appointment.getDate());
        System.out.println("Payment Method: " + payment.getPaymentMethod() + " | Amount Paid: $" + payment.getAmount());
    }
}