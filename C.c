#include<stdio.h>
int main()
{
    int i,a[6],count = 0;
    for(i = 1;i <= 5;i++)
    {
     scanf("%d",&a[i]);
    }
    for(int j = 1,i = 1;j <= 5,i <= 5;j++,i++)
    {
    if(abs(a[i]) % 2 == 0)
    {
        count = count + 1;
    }
    }
    printf("%d valores pares\n", count);
    return 0;
}
