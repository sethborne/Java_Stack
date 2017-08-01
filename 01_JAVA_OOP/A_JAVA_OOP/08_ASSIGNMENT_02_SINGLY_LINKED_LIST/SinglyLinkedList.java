class SinglyLinkedList{
    public Node head;
    
    public SinglyLinkedList(){
        this.head = null;
    }
    
    public void add(int value){
        //instantiable a new Node with value parameter
        Node newNode = new Node(value);
        // add node to the end of the list with value in the parameter
        
        // if no nodes, make this the head
        if ( head == null ){
            head = newNode;
        }
        else {
            // set runner to head
            Node runner = head;
            // as long as there is a next, iterate
            while ( runner.next != null ){
                runner = runner.next;
            }
            // when there is no longer a next set new node to next
            runner.next = newNode;
        }
    }
    
    public void remove(){
        //remove node from the end of the list
        //node is at then end when .next.next has no next
        
        Node runner = this.head;
        //are there nodes? if not - then say no nodes
        if( head == null ){
            System.out.println("No nodes in SLL");
        }
        //what if there are just two nodes
        else if( head.next == null ){
            head = null;
        }
        // all other cases
        else {
            //at current, when next next is not null (is not last), iterate
            while(runner.next.next != null){
                runner = runner.next;
            }
            //when while breaks, you are on 2nd to last node, cut .next by setting to null
            runner.next = null;
        }
    }
    
    public void printValues(){
        // print all values of each node in the list in order
        // are there nodes?
        if ( head == null ){
            System.out.println("There are no node in the Singly Linked List.  Can't print values");
        }
        // make current/runner
        Node current = this.head;
        int numInList = 1;
        while (current != null){
            // log current value
            if(current.next == null){
                System.out.println("Number in List is: " + numInList + " | Value is: " + current.value + " | Next is: null");
                current = current.next;
                numInList += 1;
            }
            else{
                System.out.println("Number in List is: " + numInList + " | Value is: " + current.value + " | Next is: " + current.next.value);
                //if next, iterate current print value
                current = current.next;
                numInList += 1;
            }
        }
    }

}

