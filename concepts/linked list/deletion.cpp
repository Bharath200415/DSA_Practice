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

ListNode* insertion(vector<int> &arr){
    ListNode* head = new ListNode(arr[0]);
    ListNode* pointer = head;
    for (int i=1;i<arr.size();i++){
        ListNode* temp = new ListNode(arr[i]);
        pointer->next = temp;
        pointer = temp;
    }
    return head;

}

ListNode* DeleteatHead(ListNode* head){
    ListNode* temp = head;
    if (head==NULL) return head;
    head=head->next;
    delete temp;
    return head;

};

ListNode* deleteatTail(ListNode* head){
    ListNode* temp = head;
    if (head==NULL){
        return nullptr;
    } 
    while (temp->next->next!=NULL){
        temp = temp->next;
    }
    delete temp->next;
    temp->next = nullptr;
    return head;

}
ListNode* deleteatIndex(ListNode* head, int index){
    ListNode* temp = head;
    if (index==0){
        head=head->next;
        return head;
    }
    int initial = 0;
    while (initial!=(index-1)){
        temp= temp->next;
        initial++;
    }
    ListNode* temp2 = temp;
    temp->next = temp->next->next;
    return head;
    
}

int main(){
    vector<int> arr = {1,2,3,4,4};
    ListNode* head1= insertion(arr);
    // ListNode* head2 = DeleteatHead(head1);
    // ListNode* head = deleteatTail(head1);
    ListNode* head = deleteatIndex(head1,1);
    while (head){
        cout<<head->val<<" ";
        head=head->next;
    }


}