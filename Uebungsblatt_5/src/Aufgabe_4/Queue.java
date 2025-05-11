package Aufgabe_4;

public class Queue <T> {
    private Node<T> anfang;
    private Node<T> ende;


    public Queue() {
        anfang = null;
        ende = null;
    }

    public void add(T inhalt) {
        Node<T> neu = new Node<>(inhalt, null);
        if (anfang == null) {
            anfang = neu;
            ende = neu;
        } else {
                ende.setNext(neu);
                ende = neu;
        }
    }

    public T peek() {

        if (anfang == null) {
            return null;
        }
        return anfang.value;
    }

    public T poll() {

        if (anfang == null) {
            return null;
        } else {
            T inhalt = anfang.value;
            anfang = anfang.next;
            if (anfang == null) {
                ende = null;
            }
            return inhalt;
        }
    }

    public void remove() {

        if (anfang == null) {
            System.out.println("null");
        } else {
            anfang = anfang.next;
            if (anfang == null) {
                ende = null;
            }
        }
    }

    public boolean isEmpty() {

        return anfang == null;
    }


    @Override
    public String toString() {
        StringBuilder bd = new StringBuilder();

        if (anfang == null) {
            return "Leere Queue";
        } else {
            Node<T> current = anfang;
            while (current != null) {
                bd.append(current.getValue().toString());
                if(current.getNext() !=null){
                    bd.append(" -> ");
                }
                current = current.getNext();
            }

            return bd.toString();
        }


    }
}

