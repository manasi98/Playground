#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int i;
  int sum=0;
  for(i=0;i<=n;i++)
  {
    sum=sum+i;
  }
  printf("%d",sum);
	return 0;
}