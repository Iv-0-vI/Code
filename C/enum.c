#include <stdio.h>
enum Book{
    ChineseBook=1,EnglishBook,MathBook,HistoryBook,GeometryBook

} realbook;
int main(){
    enum Book b1 =ChineseBook;
    enum Book b2 =GeometryBook;
    printf("%d",b1);//%d !!!!!
    printf("%d",b2);//%d
    for(realbook=ChineseBook;realbook<=GeometryBook;realbook++){
        printf("枚举元素: %d \n",realbook);
    }
    return 0;
}
/*
15枚举元素: 1 
枚举元素: 2 
枚举元素: 3 
枚举元素: 4 
枚举元素: 5 
*/