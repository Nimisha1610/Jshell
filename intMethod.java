
jshell> int sumOf(int a, int b){
   ...>     int sum=a+b;
   ...>     return sum;
   ...> }
|  modified method sumOf(int,int)

jshell> sumOf(4,5)
$10 ==> 9
 
EXERCISE S4V11
jshell> int sumOfThree(int a,int b,int c){
   ...>     int sum=a+b+c;
   ...>     return sum;
   ...> }
|  created method sumOfThree(int,int,int)

jshell> sumOfThree(1,2,3)
$12 ==> 6

jshell> int calThirdangle(int a,int b){
   ...>     int c=180-(a+b);
   ...>     return c;
   ...> }
|  created method calThirdangle(int,int)

jshell> calThirdangle(35,45)
$14 ==> 100
