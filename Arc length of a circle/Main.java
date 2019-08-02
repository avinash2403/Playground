#include <stdio.h>

int main()
{
float pi=3.14,r,c,arc;
  scanf("%f %f",&r,&c);
  arc=2*pi*r*(c/360);
  printf("%.2f",arc);
  
    return 0;
}