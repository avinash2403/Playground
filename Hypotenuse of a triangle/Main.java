#include<stdio.h>
#include<math.h>
int main()
{
float hypo,opp,adj;
  scanf("%f %f",&opp,&adj);
 hypo=sqrt((opp*opp)+(adj*adj));
  printf("%.2f",hypo);
  return 0;
}