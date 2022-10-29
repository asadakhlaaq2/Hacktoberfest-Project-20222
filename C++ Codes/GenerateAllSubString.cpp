#include <iostream>
using namespace std;

void SubStrings(string s,string ans){

    //base case
    if(s.length() == 0){
        cout <<ans <<endl;
        return;
    }

    char ch =s[0];
    string ros = s.substr(1);

    SubStrings(ros,ans);
    SubStrings(ros,ans+ch);
}

int main(){
    
    // string str;
    // getline(cin,str);

    SubStrings("ABC","");
    
return 0;
}