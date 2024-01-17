public class Calculator {
public static double add(double num1, double num2){
return num1 + num2;
}
public static double subtract (duble num1, double num2){
return num1 - num2;
}
public static double multiply (double num1, double num2){
return num1 * num2;
}
public static double divide(double num1, douuble num2){
if (num2 != 0){
return num1 / num2;
}else{
reutrn DOuble.NaN;
}
}
public static double modulus(double num1 , double num2){
return num1 % num2;
}
public static double power (double num1, double num2){
return Math.pow(num1, num2);
}
public static int factorial (int n){
if(n >= 0){
int fact = 1;
for(int i= 1, i <=n, i++){
fact *=i;
}
return fact;
} else {
return -1;
}
}
public static double squareRoot(double num){
return Math.sqrt(num);
}
}
