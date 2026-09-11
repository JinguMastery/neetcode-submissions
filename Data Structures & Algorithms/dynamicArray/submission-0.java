class DynamicArray {

    private ArrayList<Integer> list;
    private int capacity;

    public DynamicArray(int capacity) {
        list = new ArrayList<> (capacity);
        this.capacity = capacity;
    }

    public int get(int i) {
        return list.get(i);
    }

    public void set(int i, int n) {
        list.set(i, n);
    }

    public void pushback(int n) {
        if (getSize() >= capacity) {
            resize();
        }
        list.add(n);
    }

    public int popback() {
        return list.remove(getSize()-1);
    }

    private void resize() {
        capacity *= 2;
        list.ensureCapacity(capacity);
    }

    public int getSize() {
        return list.size();
    }

    public int getCapacity() {
        return capacity;
    }
}
