#include<stdio.h>
int main()
{
int n,d,l,s;
  scanf("%d",&n);
  d=n/100;
  l=n%10;
  s=d+l;
  printf("%d",s);
  return 0;
}