#include <bits/stdc++.h>
using namespace std;
int main(){
    int tc;
    double x,y,z,a,b,c;
    cin>>tc;
    while(tc--){
        cin>>x>>y>>z;
        a=(x+z-y)/2.0;
        b=(x-z+y)/2.0;
        c=(y+z-x)/2.0;
        printf("%.2lf",2*(a*b+a*c+b*c));
        cout<<endl;
    }
    return 0;
}

