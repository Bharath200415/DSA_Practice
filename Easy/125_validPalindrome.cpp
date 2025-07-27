#include <bits/stdc++.h>
using namespace std;

class Solution{
public:
    // bool isPalindrome(string s) {
    //     string c = "";
    //     for (char a: s){
    //         if (isalnum(a)){
    //             c+=tolower(a);
    //         }
    //     }
    //     string reverseit = c;
    //     reverse(reverseit.begin(),reverseit.end());
    //     return reverseit==c;
        
    // }
    bool isPalindrome(string s) {

        string newString = "";
        for (char c:s){
            if (isalnum(c)){
                newString+=tolower(c);
            }
        }
        int a = 0;
        int b = newString.length()-1;
        while (b>a){
            if (newString[b]!=newString[a]){
                return false;
            }
            a++;
            b--;
        }
        return true;
    }

};

int main(){
    string language = "malayalam";
    Solution a;
    cout<<a.isPalindrome(language);

}