


boolean hasCycle(Node head) {
    Node fptr=head;
    Node sptr=head;
    if(head==null){return false;}
    //if(head.next==null){return false;}
    while(fptr!=null){
        sptr = sptr.next;
        fptr = fptr.next.next;
        if(fptr==sptr){return true;}
    }
    
  // if(fptr.next==null)
  // { return false; }
   return false;

}

