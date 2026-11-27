package fr.amu.iut.noel.lycanthrope;

public class Howl {
    private final HowlType type;
    private final Lycanthrope sender;
    private final Lycanthrope receiver;
    private boolean response;

    public Howl(HowlType type, Lycanthrope sender, Lycanthrope receiver) {
        this.type = type;
        this.sender = sender;
        this.receiver = receiver;
        this.response = false;
    }

    public HowlType getType() {
        return type;
    }

    public Lycanthrope getSender() {
        return sender;
    }

    public Lycanthrope getReceiver() {
        return receiver;
    }

    public boolean isResponse() {
        return response;
    }

    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Howl{" +
                "type=" + type +
                ", sender=" + sender.getNom() +
                ", receiver=" + receiver.getNom() +
                ", response=" + response +
                '}';
    }
}
