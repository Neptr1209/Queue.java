public class LinkedList<T> {
    private Link<T> head;

    public LinkedList() {
        head = null;
    }

    public void insertFirst(T newItem) {
        Link<T> newLink = new Link<>(newItem);
        newLink.next = head;
        head = newLink;
    }

    public void insertLast(T newItem) {
        Link<T> newLink = new Link<>(newItem);
        if (head == null) {
            head = newLink;
        } else {
            Link<T> current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newLink;
        }
    }

    public void insertAt(T newItem, int index) {
        if (index == 0) {
            insertFirst(newItem);
            return;
        }

        Link<T> newLink = new Link<>(newItem);
        Link<T> current = head;
        int count = 0;

        while (current != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current == null) {
            System.out.println("Index out of range");
        } else {
            newLink.next = current.next;
            current.next = newLink;
        }
    }

    public boolean deleteFirst() {
        if (head == null)
            return false;
        head = head.next;
        return true;
    }

    public boolean deleteLast() {
        if (head == null)
            return false;
        if (head.next == null) {
            head = null;
            return true;
        }

        Link<T> current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        current.next = null;
        return true;
    }

    public boolean deleteAt(int index) {
        if (head == null)
            return false;
        if (index == 0) {
            head = head.next;
            return true;
        }

        Link<T> current = head;
        int count = 0;
        while (current.next != null && count < index - 1) {
            current = current.next;
            count++;
        }

        if (current.next == null)
            return false;

        current.next = current.next.next;
        return true;
    }

    public boolean deleteKey(T key) {
        if (head == null)
            return false;
        if (head.data.equals(key)) {
            head = head.next;
            return true;
        }

        Link<T> current = head;
        while (current.next != null && !current.next.data.equals(key)) {
            current = current.next;
        }

        if (current.next == null)
            return false;

        current.next = current.next.next;
        return true;
    }

    public int find(T key) {
        Link<T> current = head;
        int index = 0;
        while (current != null) {
            if (current.data.equals(key))
                return index;
            current = current.next;
            index++;
        }
        return -1;
    }

    public boolean isEmpty() {
        return head == null;
    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        Link<T> current = head;
        while (current != null) {
            sb.append(current.data);
            if (current.next != null)
                sb.append(" -> ");
            current = current.next;
        }
        return sb.toString();
    }

    // (l)
    public void display() {
        System.out.println(this.toString());
    }
}