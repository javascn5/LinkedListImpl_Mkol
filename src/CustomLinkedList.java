public class CustomLinkedList<E> implements CustomList<E> {

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public void add(E e) {

    }

    @Override
    public int size() {
        return 0;
    }

    class Node {
        private Object data;
        private Node next;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
}
