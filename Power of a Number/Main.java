#include <stdio.h>
#include<math.h>
int main()
{
  int a,b;
  scanf("%d %d",&a,&b);
  if(b>0)
  {
    long int res=pow(a,b);
    printf("%ld",res);
  }
  else if(b==0)
  {
    printf("%d",1);
  }
  else
  {
    printf("Wrong input");
  }
  	      
    return 0;
}