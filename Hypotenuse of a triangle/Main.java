#include<stdio.h>
#include<math.h>
int main()
{
  float a,b;
  scanf("%f %f",&a,&b);
  float hyp= sqrt((a*a)+(b*b));
  printf("%.2f",hyp);
  return 0;
}