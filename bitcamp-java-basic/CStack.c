#include <stdio.h>
#include <stdlib.h>

#define MAX_LENGTH 100
 
int stack[MAX_LENGTH];
int top=-1;
 
int IsEmpty(){
    if(top<0)
        return true;
    else
        return false;
    }
int IsFull(){
    if(top>=MAX_LENGTH-1)
        return true;
    else
        return false;
}
 
void push(int value){
    if(IsFull()==true)
        printf("스택이 가득 찼습니다.");
    else
        stack[++top]=value; 
}
 
int pop(){
    if(IsEmpty()==true)
        printf("스택이 비었습니다.");
    else 
        return stack[top--];
}
 
int main(){
    
    push(3);
    push(5);
    push(12);
    printf("%d ",pop());
    printf("%d ",pop());
    printf("%d ",pop());
 
    return 0;
}