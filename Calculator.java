
public class Calculator{
    public static void main(String args[]) {	
 
 int num1 = input.Int("Введите первое число: ");
 char operation = input.Char("Введите оператор: (+ или - или * или /) ");
 int num2 = input.Int("Введите второе число: ");
 
 if (!(operation == '+' || operation == '-' || operation == '*' || operation == '/')) {
     System.err.println("Неверная операция!");}
 
 else if (operation == '/' && num2 == 0) {
     System.err.println("На ноль делить нельзя!");
 }
 
 switch (operation) {
     case '+':
         System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
          break;
     case '-':
         System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
         break;
     case '*':
         System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
         break;
     case '/':
         System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
         break;
         
     }
 }

    public void addNumber(int i) {
    }

    public void doOperationAndAddNumber(char c, int i) {
    }

    public void printResult() {
    }

    public void undo() {
    }

    public void cascadeUndo(int i) {
    }
    }