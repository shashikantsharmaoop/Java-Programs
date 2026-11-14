// Interface
interface Switchable {

    void turnOn();

    void turnOff();
}

// First Class
class Light implements Switchable {

    public void turnOn() {
        System.out.println("Light is ON");
    }

    public void turnOff() {
        System.out.println("Light is OFF");
    }
}

// Second Class
class AC implements Switchable {

    public void turnOn() {
        System.out.println("AC is ON");
    }

    public void turnOff() {
        System.out.println("AC is OFF");
    }
}

// Third Class
class Fan implements Switchable {

    public void turnOn() {
        System.out.println("Fan is ON");
    }

    public void turnOff() {
        System.out.println("Fan is OFF");
    }
}

// Fourth Class
class Television implements Switchable {

    public void turnOn() {
        System.out.println("Television is ON");
    }

    public void turnOff() {
        System.out.println("Television is OFF");
    }
}

// Main Class
public class SwitchableDemo {

    public static void main(String[] args) {

        Switchable[] devices = {
            new Light(),
            new AC(),
            new Fan(),
            new Television()
        };

        for (int i = 0; i < devices.length; i++) {

            devices[i].turnOn();
            devices[i].turnOff();

            System.out.println("----------------");
        }
    }
}