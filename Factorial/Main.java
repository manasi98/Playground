#include<stdio.h>
int main()
{
	int n,i;
  scanf("%d",&n);
  long int f=1;
  for(i=1; i<=n; i++)
  {
    f=f*i;
  }
  printf("%ld",f);
}