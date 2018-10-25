#include <bits/stdc++.h>
#define mod 1000000007
using namespace std;
typedef long long ll;
int main(){
    ll tc,n,ans[100001][2];
    cin>>tc;
    ans[1][1]=0,ans[1][0]=2,ans[2][1]=1,ans[2][0]=3,ans[0][0]=1,ans[0][1]=0;
    for(int i=3;i<100001;i++){
        ans[i][1]=(ans[i-1][1]+ans[i-2][1]+ans[i-3][0])%mod;
        ans[i][0]=(ans[i-1][0]+ans[i-2][0])%mod;
    }
    while(tc--){
        cin>>n;
        cout<<ans[n][1]<<"\n";
    }
    return 0;
}
