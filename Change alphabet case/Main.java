#include <stdio.h>
int main() {
	char ch;
  scanf("%c",&ch);
  if(ch>='a' && ch<='z')
  {
    ch = toupper(ch);
    printf("%c",ch);
  }
 else if(ch>='A' && ch<='Z')
  {
    ch = tolower(ch);
    printf("%c",ch);
  }
  
  
	return 0;
}