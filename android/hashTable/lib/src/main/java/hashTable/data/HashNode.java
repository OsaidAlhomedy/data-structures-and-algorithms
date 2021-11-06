package hashTable.data;

public class HashNode<K, T> {

  public K key;
  public T data;
  public HashNode<K, T> next;

  public HashNode(K key, T data) {
    this.key = key;
    this.data = data;
  }

}
