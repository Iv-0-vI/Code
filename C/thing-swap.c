#include <stdio.h>
float swapnumber(float *n1,float *n2){
    
    float swap=*n1;
    *n1=*n2;
    *n2=swap;
    return *n1;
}
int main(){
    float firstnumber,secondnumber;
    firstnumber=3.2;
    secondnumber=5.3;
    if(firstnumber>secondnumber){
        printf("%lf>%lf",firstnumber,secondnumber);
    }else if (secondnumber>firstnumber)
    {
        printf("%lf>%lf",secondnumber,firstnumber);

    }else{
        printf("未考虑的情况");
    }
    float swapted=swapnumber(&firstnumber,&secondnumber);
    printf("交换后的number为%f %f",firstnumber,secondnumber);
    return 0;
}
//5.300000>3.200000
//交换后的number为5.300000 3.200000