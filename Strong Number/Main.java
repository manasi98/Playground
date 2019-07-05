#include <stdio.h>
int main() {
	int n,i,num,j;
  int fact=1;
  int sum=0;
  scanf("%d",&n);
  int temp=n;
  for(i=-1; i<=n; i++)
  {
    num=n%10;
    for(j=1; j<=num; j++)
    {
      fact=fact*j;
      //printf("%d\n",fact);
    }
    sum=sum+fact;
    fact=1;
    n=n/10;
  }
  if(sum==temp)
  {
    printf("Yes");
  }
  else
  {
    printf("No");
  }
  
	return 0;
}