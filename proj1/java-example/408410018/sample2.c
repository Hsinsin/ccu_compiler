#include <stdio.h>
#include <stdlib.h>
#include <ctype.h>

int mystrlen(char *dest){
    int cnt=0;
    while(*dest!='\0'){
        dest++;
        cnt++;
    }
    return cnt;
}
void mystrcat(char *dest,char *src){
    dest+=mystrlen(dest);
    while(*src!='\0'){
        *dest++=*src++;
    }
    *dest='\0';
}
char *mystrstr(char *haystack,char *needle){
    int i=0;
    int len=mystrlen(needle);
    while(*haystack!='\0'){
        while(*(haystack+i)==*(needle+i)) {
            i++;
        }
        if(i==len) return haystack;
        haystack++;
        i=0;
    }
    return NULL;
}
int main()
{
    char line[64];
    char result[8192]={'\0'};
    while(fgets(line,64,stdin)!=NULL){
        mystrcat(result,line);
    }
    char *found=mystrstr(result,"Mama");
    if(!found){
        printf("[len]:\n0\n\n[content]:\n(null)\n");
    }else{
        printf("[len]:\n%d\n\n[content]:\n%s\n",mystrlen(found),found);
    }
    return 0;
}
