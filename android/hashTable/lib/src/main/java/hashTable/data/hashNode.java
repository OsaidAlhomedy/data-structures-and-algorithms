package hashTable.data;

public class hashNode<K, T> {

  public K key;
  public T data;
  public hashNode<K, T> next;

  public hashNode(K key, T data) {
    this.key = key;
    this.data = data;
  }

}
