#include <stdio.h>
int main() {
	int n,last;
  scanf("%d",&n);
  last=n%10;
  int num;
  while(n>0)
  {
    num=n;
    num=n%10;
    n=n/10;
  }
  printf("%d",last+num);
	return 0;
}