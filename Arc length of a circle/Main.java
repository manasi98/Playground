#include<stdio.h>
int main()
{
  float r,theta;
  scanf("%f %f",&r,&theta);
  float arc= (theta/360)*2*3.14*r;
  printf("%.2f",arc);
}