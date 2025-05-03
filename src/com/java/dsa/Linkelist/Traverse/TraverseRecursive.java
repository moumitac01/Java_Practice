package com.java.dsa.Linkelist.Traverse;


public class TraverseRecursive {

    public static void traverseRecursive(Nodes head){
        if(head==null){
            System.out.println();
            return;
        }
        System.out.println(head.data);
        traverseRecursive(head.next);
    }
    public static void main(String args[]){
      Nodes head= new Nodes(10);
      head.next=new Nodes(20);
      head.next.next=new Nodes(30);
      head.next.next.next= new Nodes(40);

        traverseRecursive(head);
    }
}
