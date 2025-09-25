#include <bits/stdc++.h>
using namespace std;

bool isPrime(int x){
    bool prime = true;
    for (int i = 2;i<x;i++){
        if (x%i==0){
            prime=false;
            break;
        }
    }
    return prime;
   
}

int checkpalindrome(int a){
    string n= to_string(a);
    string rev = "";
    int size = n.length();
    for (int i=(size-1);i>=0;i--){
        rev = rev+n[i];
    }
    return stoi(rev);
}

int factorial(int n){
    if (n==0||n==1){
        return 1;
    }
    return n*factorial(n-1);
  
}

int sum(int n){
    if (n==0){
        return 0;
    }
    return n+sum(n-1);
}

int main(){
    //cout<<checkpalindrome(321);
    cout<<factorial(5);

    // for (int i=1;i<=5;i++){
    //     for (int j=1;j<i+1;j++){
    //         cout<<i;
    //     }
    //     cout<<"\n";
    // }


//pattern 2:
    // for (int i=0;i<5;i++){
    //     for (int j=0;j<5-i-1;j++){
    //         cout<<" ";
    //     }
    //     for (int l=0;l<2*i+1;l++){
    //         cout<<"*";
    //     }
    //     cout<<endl;
    // }
    // for (int a=5;a>0;a--){
    //     for (int b=0;b<5-a;b++){
    //         cout<<" ";
    //     }
    //     for (int c=0;c<2*a-1;c++){
    //         cout<<"*";
    //     }
    //     cout<<endl;
    // }


}