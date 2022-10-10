#include <stdio.h>
#include <string.h>
int main()
{
    printf("Enter the two strings\n");
    char s[100],sc[100];
    scanf("%[^\n]s", sc);
    fflush(stdin);
    scanf("%[^\n]s", s);
    printf("Enter your choice\n1. With strcmp function\n2. Without strcmp function\n");
    int c,i,k=0;
    scanf("%d", &c);
    switch(c)
    {
        case 2:
            i=0;
            while(s[i]!='\0' || sc[i]!='\0')
            {
                if(s[i]>sc[i])
                {
                    printf("-1\n");
                    break;
                }
                else if(s[i]<sc[i])
                {
                    printf("1\n");
                    break;
                }
                else if(s[i]==sc[i])
                {
                    k++;
                }
                i++;
            }
            if(k==(strlen(s)))
                printf("0\n");
            break;
        case 1:
            printf("%d", strcmp(sc,s));
            break;
        default:
            printf("Wrong Choice\n");
    }
    getch();
    return 0;
}
