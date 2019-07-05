#include<stdio.h>
int main()
{
  int num,f,l;
  scanf("%d",&num);
  f=num/100;
  l=num%10;
  printf("%d",f+l);
  return 0;
}