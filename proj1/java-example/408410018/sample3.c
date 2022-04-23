#include<stdio.h>

int combination(int n, int m)
{
    if(m > n)
        return 0;
    else if(m == n||m == 0)
        return 1;
    else
        return combination(n-1,m) + combination(n-1, m-1);
}

int mod(int n){
	if(n ==0) return 1;
	return mod(n-1)*n;
}

int main()
{
    int n, m;
    while(scanf("%d %d",&n,&m) !=EOF){
        printf("%d\n",combination(n,m)*mod(m));
        printf("%d\n",combination(n,m));
        printf("%d\n",combination(n+m-1,m));
    }
    return 0;
}

