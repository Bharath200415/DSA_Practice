// question link-> https://leetcode.com/problems/remove-linked-list-elements/
#include <vector>
#include <iostream>
using namespace std;


struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

//insertion function
ListNode* convertarrtoLL(vector<int> &arr){
    ListNode* head = new ListNode(arr[0]);
    ListNode* pointer = head;

    for (int i=1;i<arr.size();i++){
        ListNode* temp = new ListNode(arr[i]);
        pointer->next = temp;
        pointer = temp;
    }
    return head;

}

class Solution{
    public:
    ListNode* removeElements(ListNode* head, int val) {
        ListNode* temp = head;
        if (!head){
            return nullptr;
        }
        while (head && head->val == val) {
            ListNode* temp = head;
            head = temp->next;
            delete temp; // Free memory
        }
        ListNode* temp2 = head;
        ListNode* prev = nullptr;

        while (temp2){
            if (temp2->val==val){
                prev->next = temp2->next;
                delete temp2;
                temp2 = prev->next;
                
            }else{
                prev = temp2;
                temp2 =temp2->next;

            }
        }
        return head;
    }
        

};

int main(){
    vector<int> arr1 = {1,2,3,4,1};
    ListNode* head = convertarrtoLL(arr1);
    Solution s;
    ListNode* head2 = s.removeElements(head,1);
    while (head2){
        cout<<head2->val<<" ";
        head2=head2->next;
    }

}