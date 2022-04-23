#include<stdio.h>

int str_len(const char *s)
{
    int cnt=0;
    while(*s!='\0'){
        s++;
        cnt++;
    }
    return cnt;
}
void str_cpy(char *dest, const char *src)
{
    while(*src!='\0'){
        *dest++=*src++;
    }
    *dest='\0';
}
int main()
{
    char line[8192];
    int maxlen=0;
    int cnt=0;
    char longword[256];
    while(fgets(line,8192,stdin)){
        if(str_len(line)>maxlen){
            maxlen=str_len(line);
            str_cpy(longword,line);
        }
        cnt++;
    }
    printf("number of sentences: %d\n", cnt);
    printf("longest line: %s", longword);
    printf("length: %d\n", maxlen);
}

