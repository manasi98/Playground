#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  int num;
  while(n>10)
  {
    num=n;
    num=n%10;
    n=n/10;
  }
  printf("%d",num);
  return 0;
}