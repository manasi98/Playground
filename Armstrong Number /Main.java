#include <stdio.h>
#include <math.h>
int main() {
	int n;
  scanf("%d",&n);
  int i,j,temp2;
  int c;
  temp2=n;
  int temp=n;
  int sum=0;
  int num,num2;
  for(int i=0; i<=n; i++)
  {
    n=n/10;
    c=c+1;
  }
  c=c+1;
  for(j=-1; j<=temp; j++)
  {
    num=temp%10;
    //printf("%d\n",num);
      temp=temp/10;
     num2=pow(num,c);
   // printf("%d\n",num2);
    sum=sum+num2;
    //printf("%d",c+1);
  }
if(sum==temp2)
{
  printf("Armstrong Number");
}
  else
  {
    printf("Not an Armstrong Number");
  }
	return 0;
}