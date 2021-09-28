package Day5;

public class Demo1The_middle_node_of_a_linked_list2 {
    public static void main(String[] args) {
        ListNode head = new ListNode(1,new ListNode(2,new ListNode(3,new ListNode(4,new ListNode(5)))));
        System.out.println(head.val);
        System.out.println(head.next.next.next.next.next);
        System.out.println(middleNode(head).val);
    }


    public static class ListNode {
     int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
    public static ListNode middleNode(ListNode head,int n) {

    }
}
