package com.java.dsa.Linkelist.While;

public class TraverseWhile {

    public static void traverseWhile(Nodes head){
        while(head!=null){
            System.out.println(head.data);
            head=head.next;
        }
        System.out.println();
    }
    public static void main(String args[]){
        Nodes head= new Nodes(10);
        head.next= new Nodes(20);
        head.next.next=new Nodes(30);
        head.next.next.next=new Nodes(40);

        traverseWhile(head);
    }
}
