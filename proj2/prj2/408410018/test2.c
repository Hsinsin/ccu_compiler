
int main(){
	int a;
	int b;
	scanf("%d", &a);
	switch(a){
		case 1:
			b = 10;
			break;
		case 2:
			b = a-1;
			break;
		default:
			b = 3;
	}
	do{ a+1; }while(a<10)
	return 0;
}
