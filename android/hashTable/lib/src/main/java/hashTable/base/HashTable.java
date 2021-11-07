package hashTable.base;

import hashTable.data.HashNode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

public class HashTable<K, T> {

  private int numBuckets;
  private int size;

  private ArrayList<HashNode<K, T>> bucketArray;

  public HashTable() {
    bucketArray = new ArrayList<>();
    numBuckets = 10;
    size = 0;

    for (int index = 0; index < numBuckets; index++) {
      bucketArray.add(null);
    }
  }

  private int hashCode(K key) {
    return Objects.hashCode(key);
  }

  public int hash(K key) {
    int hashCode = hashCode(key);
    int index = hashCode % numBuckets;
    index = index < 0 ? index * -1 : index;
    return index;
  }

  public void add(K key, T value) {


    int bucketIndex = hash(key);
    int hashCode = hashCode(key);

    HashNode<K, T> head = bucketArray.get(bucketIndex);


    while (head != null) {
      if (head.key.equals(key)) {
        head.data = value;
        return;
      }


      head = head.next;
    }


    size++;
    head = bucketArray.get(bucketIndex);
    HashNode<K, T> newNode = new HashNode<>(key, value);
    newNode.next = head;
    bucketArray.set(bucketIndex, newNode);


    if ((1.0 * size) / numBuckets >= 0.7) {
      ArrayList<HashNode<K, T>> temp = bucketArray;
      bucketArray = new ArrayList<>();
      numBuckets = 2 * numBuckets;
      size = 0;


      for (int index = 0; index < numBuckets; index++) {
        bucketArray.add(null);
      }


      for (HashNode<K, T> headNode : temp) {
        while (headNode != null) {
          add(headNode.key, headNode.data);
          headNode = headNode.next;
        }
      }
    }
  }

  public T get(K key) {
    int bucketIndex = hash(key);
    int hashCode = hashCode(key);

    HashNode<K, T> head = bucketArray.get(bucketIndex);


    while (head != null) {
      if (head.key.equals(key)) {
        return head.data;
      }

      head = head.next;
    }


    return null;
  }

  public boolean contains(K key) {
    int bucketIndex = hash(key);

    HashNode<K, T> head = bucketArray.get(bucketIndex);


    while (head != null) {
      if (head.key.equals(key)) {
        return true;
      }

      head = head.next;
    }


    return false;
  }

  public int getSize() {
    return size;
  }


  public String repeatedWord(String string) {

    String filteredString = string.replaceAll("[\\,\\.\\–]", "");
    String[] arrayString = filteredString.split(" ");

    for (String item : arrayString) {
      item = item.toLowerCase(Locale.ROOT);
      int bucketIndex = hash((K) item);

      HashNode<K, T> head = bucketArray.get(bucketIndex);

      while (head != null) {
        if (head.key.equals(item)) {
          return item;
        }
        head = head.next;
      }
      head = bucketArray.get(bucketIndex);
      HashNode<K, T> newNode = new HashNode<>((K) item, (T) item);
      newNode.next = head;
      bucketArray.set(bucketIndex, newNode);
    }

    return null;

  }
}



