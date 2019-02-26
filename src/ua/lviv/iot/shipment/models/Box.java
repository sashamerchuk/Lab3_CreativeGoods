package ua.lviv.iot.shipment.models;

public class Box<T> {

    private T obj;

    public void set(T obj) {
        this.obj = obj;
    }

    public T get() {
        return obj;
    }

    public static void main(String... strings) {
        Tanker olivia = new Tanker();

        Box<Tanker> box = new Box<>();
        box.set(olivia);
        olivia.getBasePricePerMile();
        stupidMethod(box);
        
        String a = (Tanker)box.get();
        
        Box<String> stringBox = new Box<>();
        //box.set("olivia");
        stupidMethod(stringBox);

    }

    public static void stupidMethod(Box<Tanker> box) {
        if (box.get() instanceof Tanker) {
            ((Tanker) box.get()).calculateFinalPricePerMile();
        }
    }
}
