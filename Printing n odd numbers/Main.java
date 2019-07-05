#include <stdio.h>
int main() {
	int n;
  scanf("%d",&n);
  int i;
  int num=0;
  for(i=0; i<2*n; i++)
  {
    if(i%2!=0)
    {
      printf("%d \n",i);
      num++;
    }
    if(num>n)
    {
      break;
    }
  }
	return 0;
}