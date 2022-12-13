#include <bits/stdc++.h> 
using namespace std; 

int main() 
{ 
int array[] = {30, 15, 53, 6, 24, 47, 102, 68, 3}; 
int n = sizeof(array)/sizeof(array[0]); 
// 'sizeof' gives the size of total array i.e. size of each character * no. of characters
// so to get no. of characters
// we divide the sizeof(array) with the size of any one character of the array
// here it is array[0]
sort(array, array+n);   
cout << "Array after data sorting using "
"default sort is : n"; 
// sort data in ascending order
for (int i = 0; i < n; ++i) 
cout << array[i] << " ";   
return 0; 
}