#include<bits/stdc++.h>
using namespace std;
void arrswap(int a, int b,int arr[]) {
    if (a == b/2) return ;
    swap(arr[a],arr[b-1-a]);
    arrswap(a+1,b,arr);
}
int main() {
    int b;
    cin>>b;
    int arr[b];
    for (int i=0;i<=b-1;i++){
        cin>>arr[i];
    }
    arrswap(0,b,arr);
    for(int i=0;i<=b-1;i++){
        cout<<arr[i]<<" ";
    }
    return 0;
}