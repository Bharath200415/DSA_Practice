#include <vector>
#include <iostream>
#include <bits/stdc++.h>
using namespace std;

struct ListNode {
    int val;
    ListNode *next;
    ListNode() : val(0), next(nullptr) {}
    ListNode(int x) : val(x), next(nullptr) {}
    ListNode(int x, ListNode *next) : val(x), next(next) {}
};

int printLL(ListNode* head){
    while (head){
        cout<<head->val<<" ";
        head = head->next;
    }
}
ListNode* insertatHead(ListNode* head,int value){
    ListNode* temp = new ListNode(value,head);
    return temp;
}
ListNode* insertatTail(ListNode* head, int value){
    if (head==NULL){
        return new ListNode(value,head);
    }
    ListNode* temp = head;
    while (temp->next!=nullptr){
        temp = temp->next;
    }
    ListNode* newNode = new ListNode(value);
    temp->next = newNode;
    return head;
}
ListNode* insertatKth(ListNode* head, int value, int k){
    if (head==NULL){
        if (k==1){
            return new ListNode(value,head);
        }else{
            cout<<" incorrect index";
        }
        if (k==1){
            ListNode* temp = new ListNode(value,head);
            return temp;
        }
        ListNode* temp = head;
        int count = 0;
        while(temp){
            count++;
            if (count==k-1){
                ListNode* newNode = new ListNode(value);
                newNode->next = temp->next;
                temp->next = newNode;
                break;

            }
            temp = temp->next;

        }
        return head;


    }


}
ListNode* convertarrtoLL(vector<int> nums){
    ListNode* head = new ListNode(nums[0]);
    ListNode* pointer = head;
    for (int i=1;i<nums.size();i++){
        ListNode *temp = new ListNode(nums[i]);
        pointer->next = temp;
        pointer = temp;
    }
    return head;

}
int main(){
    vector<int> array1= {1,2,3,4,5};
    ListNode* head = convertarrtoLL(array1);
    // ListNode* head2 = insertatTail(head,5);
    ListNode* head3 = insertatKth(head,6,3);
    printLL(head3);

}