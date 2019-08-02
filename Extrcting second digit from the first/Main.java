#include <stdio.h>
int main() 
{
	int n,fd,ld;
  scanf("%d",&n);
  if(n>1000)
  { 
  fd=n/1000;
  ld=fd%10;
  printf("%d",ld);
  }
  else
  {
    ld=n%10  ;
  printf("%d",ld);
  }
 	return 0;
}