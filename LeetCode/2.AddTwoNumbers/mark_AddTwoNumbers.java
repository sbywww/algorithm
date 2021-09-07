public class mark_AddTwoNumbers {
    public static void main(String[] args) {
        int[] l1 = {2, 4, 3};
        int[] l2 = {5, 6, 4};

        ListNode result = addTwoNumbers(listNode(l1), listNode(l2));
        print(result);
    }

    public static ListNode listNode(int[] v) {
        ListNode ln1 = new ListNode(v[0]);
        ListNode ln2 = new ListNode(v[1]);

        ln2.next = new ListNode(v[2]);
        ln1.next = ln2;
        return ln1;
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        int sum = 0, p = 0;
        ListNode result, temp = new ListNode(0);
        result = temp;
        while (l1 != null || l2 != null || sum != 0) {
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }

            p = sum % 10;
            sum /= 10;
            temp.next = new ListNode(p);
            temp = temp.next;
        }

        return result.next;
    }

    public static void print(ListNode n) {
        while (n != null) {
            System.out.print(n.val + ", ");
            n = n.next;
        }
    }

    public static class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
}
