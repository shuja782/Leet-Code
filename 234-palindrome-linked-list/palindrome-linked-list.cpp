/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
class Solution {
public:
    bool isPalindrome(ListNode* head) {
        stack<ListNode*> stack;
        ListNode* temp = head;
        while (temp != NULL){
            stack.push(temp);
            temp = temp->next;
        }
        temp = head;
        while (temp != NULL && !stack.empty()){
            if (temp->val != stack.top()->val)
                return false;
            temp = temp->next;
            stack.pop();
        }
        return true;
    }
};