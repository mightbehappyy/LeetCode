public class App {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Create two sorted linked lists
        Solution.ListNode list1 = solution.new ListNode(1);
        list1.next = solution.new ListNode(3);
        list1.next.next = solution.new ListNode(5);

        Solution.ListNode list2 = solution.new ListNode(2);
        list2.next = solution.new ListNode(5);
        list2.next.next = solution.new ListNode(6);

        // Merge the two lists
        Solution.ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Print the merged list
        printList(mergedList);
    }

    public static void printList(Solution.ListNode head) {
        Solution.ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
    }
}
