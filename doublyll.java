import java.util.*;
class Node <T>{
    T data;
    Node <T> prev;
    Node <T> next;
    Node(){
        data=null;
         prev=null;
         next=null;
    }
    Node (T val){
         data=val;
         prev=null;
         next=null;
    }
}
class doubly_linkedlist<T>{
    Node<T> head,temp,delete;
    doubly_linkedlist(){
        head=null;
    }
    void add_first(T val){
        if (head == null) {
            head=new Node<T>(val);
        }
         temp=new Node<T>(val);
         temp.next=head;
         head.prev=temp;
         head=temp;
         temp=null;
    }
    void add_last(T val){
        if (head == null) {
            head=new Node<T>(val);
        }
        temp=head;
        while (temp.next != null) {
            temp=temp.next;
        }
        temp.next=new Node<T>(val);
        temp.next.prev=temp;
    }
    void add_any(T val,int pos){
        int current=1;
        if (head == null) {
            head=new Node<T>(val);
        }
        temp=head;
        while (current != pos ) {
            temp=temp.next;
            current ++;
        }
        delete=new Node<T>(val);
        temp.next.prev=delete.next;
        delete.prev=temp;
        delete.next=temp.next;
        temp.next=delete;
    }
    void delete_first(){
        if (head == null) {
            System.out.println("Linked list is empty");
        }
        else{
            head.next.prev=null;
            temp=head;
            head=head.next;
            temp.next=null;
            temp=null;
        }
    }
    void delete_last(){
        if (head == null) {
            System.out.println("Linked list is empty");
        }
        else{
            temp=head;
            while (temp.next != null) {
              temp=temp.next;
            }
           temp.prev.next=null;
           temp.prev=null;
           temp=null;
        }
    }
    void delete_any(int pos){
        int current=1;
        if (head == null) {
            System.out.println("Linked list is empty");
        }
        temp=head;
        while (current != pos ) {
            temp=temp.next;
            current ++;
        }
        delete=temp.next;
        delete.next.prev=temp;
        temp.next=delete.next;
        delete=null;
    }
    void delete_all(){
        while (head != null) {
            delete_first();
            head=head.next;
        }
    }
    void print(){
        temp=head;
        while (temp.next != null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
}
public class doublyll {
     public static void main(String[] args) {
        
        
     }
}
