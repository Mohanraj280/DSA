/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow=head,fast=head;
        if(head==null)
        return head;

        for(int i=0;i<n;i++)
        {
            fast=fast.next;
        }
        
        if(fast==null)
            return head.next;
    
        while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }

        slow.next=slow.next.next;
    return head;
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head==null || head.next==null)
        return head;

        ListNode dummy=new ListNode(0);
        dummy.next=head;
        ListNode point=dummy;
        while(point.next!=null && point.next.next!=null)
        {
            ListNode swap1 = point.next;
            ListNode swap2 = point.next.next;

            swap1.next = swap2.next;
            swap2.next = swap1;

            point.next = swap2;
            point = swap1;
        }

    return dummy.next;

    }
}
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode fast=head,slow=head;
       
       k=k-1;
       while(k-- >0)
       fast=fast.next;

        ListNode swap1=fast;
         while(fast.next!=null)
        {
            fast=fast.next;
            slow=slow.next;
        }

        int temp = slow.val;
        slow.val=swap1.val;
        swap1.val=temp;

        return head;


    }
}

class Solution {
    public int missingNumber(int[] nums) {
        int num = nums.length;
        int sum = (num*(num+1))/2;
        int sums=0;
        for(int i=0;i<num;i++)
        {
            sums = sums + nums[i]; 
        }
        return sum-sums;
    }
}
class Solution {
    public int minDifference(int[] nums) {
        if(nums.length<=4)
        {
            return 0;
        }
        Arrays.sort(nums);
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<=3;i++)
        {
               ans = Math.min(ans,nums[nums.length-1-3+i]-nums[i]);
        }
        return ans;
    }
}


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        List<List<Integer>> ans=new ArrayList<>();
        if(root==null)
        return ans;

        Queue<TreeNode> queue=new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty())
        {
            List<Integer> lst=new ArrayList<>();
            int size=queue.size();

            for(int i=0;i<size;i++)
            {
                TreeNode node=queue.poll();
                lst.add(node.val);

                if(node.left!=null)
                queue.add(node.left);
                if(node.right!=null)
                queue.add(node.right);
            }
            ans.add(lst);
        }
      return ans;
    // Queue<TreeNode> queue=new LinkedList<>();
    
    // List<Integer> lst=new ArrayList<>();
    // if(root==null)
    // return lst;

    // queue.add(root);
    // while(!queue.isEmpty())
    // {
    //     TreeNode node=queue.poll();
    //     lst.add(node.val);
    //     if(node.left!=null)
    //     queue.add(node.left);
    //     if(node.right!=null)
    //     queue.add(node.right);
    // }
    // return lst;
    }
}

class Solution {
    public int[] twoSum(int[] numbers, int target) {
     int i=0;
     int j=numbers.length-1;

        int total;

        while(i<j)
        {
            total=numbers[i]+numbers[j];
            if(total==target)
            {
                return new int[]{i+1,j+1};
            }
            else if(total > target)
            {
                j--;
            }
            else
            {
                i++;
            }

        }
        return new int[]{-1,-1};
    }
}

class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] arr = new int[nums1.length];
        
        for (int i = 0; i < nums1.length; i++) {
            boolean found = false;
            int nextGreater = -1;
            for (int j = 0; j < nums2.length; j++) {
                if (nums2[j] == nums1[i]) {
                    found = true;
                }
                
                if (found && nums2[j] > nums1[i]) {
                    nextGreater = nums2[j];
                    break;
                }
            }
            
            arr[i] = nextGreater;
        }
        
        return arr;
    }
}
class Solution {
    public int myAtoi(String s) {
       s=s.trim();
       int num=0;
        if(s.isEmpty())
        {
            return 0;
        }
        int i=0;
        boolean pos = s.charAt(0) == '+';
        boolean neg = s.charAt(0) == '-';
        if(neg||pos)
        {
            i++;
        }
        while(i<s.length() && Character.isDigit(s.charAt(i)))
        {
            int digit = s.charAt(i)-'0';
            if(num>Integer.MAX_VALUE/10 || (num==Integer.MAX_VALUE/10 && digit>Integer.MAX_VALUE%10))
            {
                return neg?Integer.MIN_VALUE : Integer.MAX_VALUE;   
            }
            num=num*10+digit;
            i++;
        }
        return neg?-num:num;
    }
}
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==1)
            {
                count++;
            }
            else
            {
                count=0;
            }
            if(count>max)
            {
                max=count;
            }
        }
        return max;
    }
}
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    private TreeNode createNode(int nums[],int l, int r)
    {
        if(l>r)
        {
            return null;
        }
        int mid=l+(r-l)/2;
        TreeNode root=new TreeNode(nums[mid]);
        root.left = createNode(nums,l,mid-1);
        root.right = createNode(nums,mid+1,r);
        return root;
    }
   
    public TreeNode sortedArrayToBST(int[] nums) {
       return createNode(nums,0,nums.length-1);        
    }
}

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
     List<Integer> lst=new ArrayList<>();
    public List<Integer> inorderTraversal(TreeNode root) {
       
        traverse(root);
        return lst;
       
    }
    private void traverse(TreeNode root)
    {
         if(root==null)
         return;
         
        traverse(root.left);
        lst.add(root.val);
        traverse(root.right);
    }
}

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
//  */
// class Solution {
//     public ListNode deleteDuplicates(ListNode head) {
//         ListNode temp=head;
//         List<Integer> lst=new ArrayList<>();
//         while(temp!=null)
//         {
//             if(!lst.contains(temp.val))
//             {
//                 lst.add(temp.val);
//             }
//             temp=temp.next;
//         }
//         ListNode node=new ListNode(0);
//         ListNode dummy=node;
//         for(int val:lst)
//         {
//                 dummy.next=new ListNode(val);
//                 dummy=dummy.next;
//         }
//         return node.next;
//     }
// }
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return null;
        }
        ListNode temp = head;
        ListNode temp2 = head.next;
        int last = head.val;
        while(temp2 != null){ // while end of Linked list
            if(temp2.val == last){ // Current number same to last number
                if(temp2.next == null){ // If last element, just delete and break loop
                    temp.next = null;
                    break;
                }
                temp2 = temp2.next; // Not last, then delete that element
                temp.next = temp2; // and move to next element
            }
            else{ // If not the same as last element, jump to next node
                temp = temp2; 
                last = temp.val;
                temp2 = temp2.next;
            }
        }
        return head; // return the head back
    }

}

class Solution {
    public int climbStairs(int n) {
       int a=1,b=1;
       List<Integer> lst=new ArrayList<>();
       lst.add(a);
       lst.add(b);
       for(int i=2;i<=n;i++)
       {
        int c=lst.get(i-1)+lst.get(i-2);
        lst.add(c);
       }
       return lst.get(n);
    }
}
class Solution {
    public int mySqrt(int x) {
        return (int)Math.sqrt(x);
    }
}
class Solution {
    public boolean isPalindrome(int x) {
            int temp=x;
        if(x<0)
        {
                return false;
        }
        int rev=0,rem;
        while(x>0)
        {
            rem=x%10;
            rev=rev*10+rem;
            x=x/10;
        }
        if(temp==rev)
        return true;
        else
        return false;
        


    }
}
