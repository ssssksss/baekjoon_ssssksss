#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <string.h>

int main() {
	int count_e = 0;
	int len = 0;
	
	//1.length of string
	scanf_s("%d",&len);
	char c;

	//2. count the number of 'e' character
	for (int i = 0; i < len+1; i++) {
		c = getchar();
		if (c == 101) {
			count_e++;
		}
	}
	//3. Subtract the number of 'e' from the entire length
	//and find out the number of '2'
	int count_2 = len-count_e;
	
	//4. compare the number of characters 'e' and '2'
	if (count_e > count_2) printf("e");
	else if (count_e < count_2) printf("2");
	else if (count_e == count_2) printf("yee");

	return 0;
}
