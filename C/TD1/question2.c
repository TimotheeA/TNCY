#include <stdio.h>
#include <stdlib.h>

void echange (int *x, int *y) {
    int temp = *x;
    *x = *y;
    *y = temp;
}

int main (int argc, char** argv) {
	int x = atoi(argv[1]);
    int y = atoi(argv[2]);
    echange(&x, &y);

	printf("x : %d, y : %d\n", x, y);
	return 0;
}
