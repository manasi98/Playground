#include <stdio.h>
int main() {
	int n;
  scanf("%d", &n);
  int sum=0;
  int num;
  while(n>0)
  {
    num=n;
    num=num%10;
    sum=sum+num;
    n=n/10;
  }
  printf("%d",sum);
	return 0;
}