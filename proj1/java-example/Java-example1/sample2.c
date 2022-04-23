#include <stdio.h>

int primeform(int n){
    if(n<2)
        return 0;
    for(int i=2;(i*i)<=n;i++){
        if(n%i==0)
            return 0;
    }
    return 1;
}

int main()
{
    int n=100000,k=0;
    int t[100000];
    for(int i=2;i<n+1;i++){
        if(primeform(i)){
            t[k++]=i;
        }
    }
    while(scanf("%d",&n) !=EOF){    
        if(t[k-1]!=n) 
            printf("%d\n",t[k-1]);
        else
            printf("%d\n",t[k-2]);
    }
    return 0;
}

