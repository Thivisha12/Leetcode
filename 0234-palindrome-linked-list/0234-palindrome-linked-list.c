/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */

// Helper function to reverse the linked list
struct ListNode* reverseList(struct ListNode* head) {
    struct ListNode* prev = NULL;
    struct ListNode* curr = head;
    struct ListNode* next = NULL;
    
    while (curr != NULL) {
        next = curr->next;
        curr->next = prev;
        prev = curr;
        curr = next;
    }
    return prev;
}

bool isPalindrome(struct ListNode* head) {
    if (head == NULL || head->next == NULL) {
        return true;
    }

    // Step 1: Find the middle of the list using slow and fast pointers
    struct ListNode* slow = head;
    struct ListNode* fast = head;
    
    while (fast != NULL && fast->next != NULL) {
        slow = slow->next;
        fast = fast->next->next;
    }

    // Step 2: Reverse the second half of the list
    struct ListNode* secondHalf = reverseList(slow);
    struct ListNode* firstHalf = head;

    // Step 3: Compare the first half and the reversed second half
    struct ListNode* secondHalfCopy = secondHalf;  // Store to restore later if needed
    bool isPalin = true;

    while (secondHalf != NULL) {
        if (firstHalf->val != secondHalf->val) {
            isPalin = false;
            break;
        }
        firstHalf = firstHalf->next;
        secondHalf = secondHalf->next;
    }

    // Step 4: (Optional) Restore the reversed second half back to its original form
    reverseList(secondHalfCopy);

    return isPalin;
}
