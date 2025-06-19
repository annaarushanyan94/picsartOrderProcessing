
    public class Pair<K, V> {
        private K key;
        private V value;

        // Constructor
        public Pair(K key, V value) {
            this.key = key;
            this.value = value;
        }

        // Set key
        public void setKey(K key) {
            this.key = key;
        }

        // Get key
        public K getKey() {
            return key;
        }

        // Set value
        public void setValue(V value) {
            this.value = value;
        }

        // Get value
        public V getValue() {
            return value;
        }
    }

