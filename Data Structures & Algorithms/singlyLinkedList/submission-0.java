class LinkedList {

    private Integer value;
    private LinkedList nextElem;

    public LinkedList() {
        value = null;
        nextElem = null;
    }

    public LinkedList(int n) {
        value = n;
        nextElem = null;
    }

    public LinkedList(LinkedList elem) {
        value = elem.value;
        nextElem = elem.nextElem;
    }

    public int get(int index) {
        LinkedList elem = this;
        for (int i = 0 ; i < index+1 ; i++) {
            if (elem.nextElem != null) {
                elem = elem.nextElem;
            } else {
                return -1;
            }
        }
        return elem.value;
    }

    public void insertHead(int val) {
        LinkedList newNode = new LinkedList(val);
        newNode.nextElem = this.nextElem;
        this.nextElem = newNode;
    }

    public void insertTail(int val) {
        LinkedList elem = this;
        while (elem.nextElem != null) {
            elem = elem.nextElem;
        }
        elem.nextElem = new LinkedList(val);
    }

    public boolean remove(int index) {
        LinkedList elem = this, previous = this;
        for (int i = 0 ; i < index+1 ; i++) {
            if (elem.nextElem != null) {
                previous = elem;
                elem = elem.nextElem;
            } else {
                return false;
            }
        }
        previous.nextElem = elem.nextElem;
        elem.value = null;
        elem = null;
        return true;
    }

    public ArrayList<Integer> getValues() {
        LinkedList elem = this;
        ArrayList<Integer> values = new ArrayList<>();
        while (elem.nextElem != null) {
            elem = elem.nextElem;
            values.add(elem.value);
        }
        return values;
    }
}
