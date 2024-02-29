public class linkedldisplayrec {
    Node head,tail;

    public linkedldisplayrec(){
        head = tail = null;
    }
    public class  Node {
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void  create(int s){
        Node n = new Node(s);
        if(head == null){
            tail = head = n;
        }
        else{
            tail.next = n;
            tail = n;
        }
    }
    public void printlist(Node head){
        if(head==null)
            return;
        System.out.println(head.data);
        printlist(head.next);
    }
    public void printrev(Node head){
        if(head==null)
           return;
        printrev(head.next);
        System.out.println(head.data);
    }
    public static void main(String args[]){
        linkedldisplayrec list = new linkedldisplayrec();
        list.create(1);
        list.create(2);
        list.create(3);
        list.printlist(list.head);
        System.out.println();
        list.printrev(list.head);
    }
}
