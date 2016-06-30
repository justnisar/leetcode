/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class ReverseLinkedList {
public:
    ListNode* reverseList(ListNode* head) {
        ListNode * current = head;
        ListNode *prev = NULL;
        
        while(current != NULL){
            ListNode *next = current->next;
            current->next = prev;
            prev = current;
            current = next;
            
        }
        head = prev;
        return head;
    }
};
