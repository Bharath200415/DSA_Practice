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
        return NULL;
    }else if(head->next==NULL){
        return NULL;
    }
    while (temp->next->next!=NULL){
        temp = temp->next;
    }
    delete temp->next;
    temp->next = nullptr;
    return head;

}

ListNode* deletekthElement(ListNode* head, int k){
    ListNode*temp = head;
    if (head==NULL) return head;
    if (k==1){
        ListNode* temp2 = head;
        head=head->next;
        delete temp2;
        return head;

    }
    int count = 0;
    ListNode* prev;
    while (temp!=NULL){
        count++;
        if (count==k){
            prev->next = prev->next->next;
            delete temp;
            break;
        }
        prev = temp;
        temp= temp->next;

    }
    return head;
}
ListNode* deleteElement(ListNode* head,int ele){
    if (head==NULL){
        return head;
    }
    if (head->val==ele){
        ListNode* temp = head;
        head = head->next;
        delete temp;
        return head;
    }
    ListNode* temp = head;
    ListNode* prev;
    int count = 0;
    while (temp!=nullptr){
        if (temp->val ==ele){
            prev->next = prev->next->next;
            delete temp;
            break;
        }
        prev = temp;
        temp = temp->next;
    }
    return head;
}
ListNode* deleteatIndex(ListNode* head, int index){
    ListNode* temp = head;
    try{
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

    }catch (exception e){
        cout<<" the index value is incorrect";

    }
    
}
ListNode* deleteDuplicates(ListNode* head){

}
class Solution {
public:
    ListNode* removeElements(ListNode* head, int val) {
        ListNode* temp = head;
        // if (!head){
        //     return nullptr;
        // }
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
    vector<int> arr = {1,2,3,4,4};
    ListNode* head1= insertion(arr);
    // ListNode* head2 = DeleteatHead(head1);
    // ListNode* head = deleteatTail(head1);
    // ListNode* head = deleteatIndex(head1,5);
    // ListNode* head = deletekthElement(head1, 2);
    ListNode* head = deleteElement(head1,4);
    while (head){
        cout<<head->val<<" ";
        head=head->next;
    }


}