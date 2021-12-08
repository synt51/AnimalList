package model;


public class AnimalList {

    private AnimalListItem head;

    public void add(Animal animal){
        if(head == null){
            head = new AnimalListItem(animal);
        }
        else {
            atTail().setNext(new AnimalListItem(animal));
        }
    }

    private AnimalListItem atTail() {
        AnimalListItem tail = head;
        while(tail.getNext() != null){
            tail = tail.getNext();
        }
        return tail;
    }


    public void remove(Animal animal){

    }

    //soll die Liste wiedergeben wie folgt: a -> b -> c
    @Override
    public String toString() {
        if (head == null) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder(head.getValue().toString());
        AnimalListItem item = head.getNext();

        while (item != null){
            stringBuilder.append(" -> ").append(item.getValue());
            item = item.getNext();
        }
        return stringBuilder.toString();
    }
}
