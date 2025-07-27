
#include <bits/stdc++.h>

using namespace std;

int main(){
    int arr[] = {437,315,322,431,534};
    int even = 0;
    for (int ele:arr){
        int digits=0;

        while (ele>0){
            ele/=10;
            digits++;
        }
        if (digits%2==0){
            even+1;
        }else{
            continue;
        }

    }
    cout<<even;


}