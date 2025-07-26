#include<bits/stdc++.h>
#include<string>

using namespace std;
    vector<string> fizz(int n){
        vector<string> answer[n]={};
        for (int i=1;i<=n;i++){
            if (i%3==0 && i%5==0){
                answer[i-1]="Fizzbuzz";
            }
            else if(i%3==0){
                answer[i-1]="fizz";
            }
            else if(i%5==0){
                answer[i-1]="buzz";
            }else{
                answer[i-1] = to_string(i);
            }
        }
        return answer;
    }

int main(){

    cout<<fizz(3);

}

