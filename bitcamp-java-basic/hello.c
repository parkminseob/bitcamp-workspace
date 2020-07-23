#include <stdio.h>
#include <stdlib.h>

int main() {

    int age;
    age = 20;
    printf("age = %d\n", age);
    
    int*page = malloc(4);
    *page = 200;
    printf("age = %d\n", *page);
    return 0;

}