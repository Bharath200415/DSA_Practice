
#include <iostream>
#include <vector>
using namespace std;

//Consists of : basic structure of a LL
//              insertion in a linked list 
//              traversal of a linked list
//              Searching an element in a LL
//              Length of an LL

//basic structure of a linked list
class Node{
    public:
    int data;
    Node* next;

    Node(int val, Node* next1){
        data = val;
        next=next1;
    }
    Node (int data1){
        data = data1;
        next = nullptr;
    }

};

//converting an array to a LL
Node* convertArrtoLL(vector<int> &arr){
    Node*head = new Node(arr[0]);
    Node* pointer = head;
    for (int i=1;i<arr.size();i++){
        Node* temp = new Node(arr[i]);
        pointer->next = temp;
        pointer = temp;
    }
    return head;

}

//Length of the linked list:
int lengthofLL(Node* head){
    int count = 0;
    Node* temp = head;
    while (temp){
        cout<<temp->data<<" ";
        temp = temp->next;
        count++;
      
        
    }
    return count;

}

//searching an element in a LL
int searchele(Node* head,int ele){
    Node* temp = head;
    int index = 0;
    while (temp){
        if (temp->data==ele){
            cout<<"element is present in this list and found at "<<index;
            return 1;
        }
        index++;
        temp = temp->next;
    }
    
    cout<<"element not found";
    return -1;

}
vector <int> data = {1,2,3,4};

int main(){
    vector<int> arr = {2,3,4,6};
    Node *y = new Node(arr[0]);
    Node *head = convertArrtoLL(arr);
    Node* temp = head;
    while (temp){
        cout<<temp->data<<" ";
        temp = temp->next;

    }
    lengthofLL(head);
    searchele(head,6);

    return 0;

}