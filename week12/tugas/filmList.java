package week12.tugas;

public class filmList {
    Film head, tail;
    int size;

    public filmList() {
        head = tail = null;
        size = 0;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(int id, String judul, double rating) {
        Film newFilm = new Film(id, judul, rating);
        if (isEmpty()) {
            head = tail = newFilm;
        } else {
            newFilm.next = head;
            head.prev = newFilm;
            head = newFilm;
        }
        size++;
    }

    public void addLast(int id, String judul, double rating) {
        Film newFilm = new Film(id, judul, rating);
        if (isEmpty()) {
            head = tail = newFilm;
        } else {
            tail.next = newFilm;
            newFilm.prev = tail;
            tail = newFilm;
        }
        size++;
    }

    public void addAtIndex(int index, int id, String judul, double rating) {
        if (index < 0 || index > size) {
            System.out.println("Index out of bounds.");
            return;
        }
        if (index == 0) {
            addFirst(id, judul, rating);
        } else if (index == size) {
            addLast(id, judul, rating);
        } else {
            Film current = head;
            for (int i = 0; i < index - 1; i++) {
                current = current.next;
            }
            Film newFilm = new Film(id, judul, rating);
            newFilm.next = current.next;
            current.next.prev = newFilm;
            current.next = newFilm;
            newFilm.prev = current;
            size++;
        }
    }

    public void removeFirst() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void removeLast() {
        if (isEmpty()) {
            System.out.println("List is empty.");
            return;
        }
        if (size == 1) {
            head = tail = null;
        } else {
            tail = tail.prev;
            tail.next = null;
        }
        size--;
    }

    public void removeAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Index out of bounds.");
            return;
        }
        if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Film current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public Film findFilm(int id) {
        Film current = head;
        while (current != null) {
            if (current.id == id) {
                return current;
            }
            current = current.next;
        }
        return null;
    }

    public void sortDesc() {
        Film current = head;
        while (current != null) {
            Film maxRatingFilm = current;
            Film tmp = current.next;
            while (tmp != null) {
                if (tmp.rating > maxRatingFilm.rating) {
                    maxRatingFilm = tmp;
                }
                tmp = tmp.next;
            }
            if (maxRatingFilm != current) {
                double tmpRating = current.rating;
                current.rating = maxRatingFilm.rating;
                maxRatingFilm.rating = tmpRating;
                String tmpJudul = current.judul;
                current.judul = maxRatingFilm.judul;
                maxRatingFilm.judul = tmpJudul;
                int tmpId = current.id;
                current.id = maxRatingFilm.id;
                maxRatingFilm.id = tmpId;
            }
            current = current.next;
        }
    }

    public void printFilm() {
        Film current = head;
        while (current != null) {
            System.out.println("| " + current.id + "\t|" + current.judul + "\t|" + current.rating + "\t|");
            current = current.next;
        }
    }
}
