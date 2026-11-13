import java.util.Scanner;
import java.util.Stack;


public class Calculator2{

public static double evaluateExpression(String expression){
    char[] tokens = expression.toCharArray();
    Stack<Double> values = new Stack<>();
    Stack<Character> operators = new Stack<>();
    
    for(int i=0; i<tokens.length; i++){
        if (tokens[i] == ' ')
            continue;
        
        if((tokens[i]>='0' && tokens[i]<='9') || tokens[i] =='.'){
            StringBuilder sb = new StringBuilder();
            while(i<tokens.length && ((tokens[i]>='0'&& tokens[i]<='9') || tokens[i] =='.')){
                sb.append(tokens[i++]);
            }
            i--;
            values.push(Double.parseDouble(sb.toString()));

    }
    else if (tokens[i]=='('){
        operators.push(tokens[i]);
    }
    else if (tokens[i]==')'){
        while(!operators.isEmpty() && operators.peek() != '('){
            values.push(applyOp(operators.pop(), values.pop(), values.pop()));
        }
        operators.pop();

    }
    else if (tokens[i]=='+' || tokens[i]=='-' || tokens[i]=='*' || tokens[i]=='/'){
        while(!operators.isEmpty() && hasPrecedence(tokens[i], operators.peek())){
            values.push(applyOp(operators.pop(), values.pop(), values.pop()));
        }
        operators.push(tokens[i]);
    }
}

while (!operators.isEmpty()){
    values.push(applyOp(operators.pop(), values.pop(), values.pop()));}

    return values.pop();

}

public static  boolean hasPrecedence(char op1, char op2){
    if(op2 == '(' || op2 == ')' ){
        return false;
    }
    if((op1=='*' || op1 == '/' ) && (op2 == '+' || op2 == '-')){
        return false;
    }
    return true;
}

public static double applyOp(char op, double b, double a){
    switch (op){
        case '+': return a+b;
        case '-': return a-b;
        case '*': return a*b;
        case '/': 
        if(b==0){
            throw new ArithmeticException("Division by Zero");

        }
        return a/b;
    }
    return 0;
}




    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the expression: ");
        String expression = sc.nextLine();
        System.out.println("Result: " + evaluateExpression(expression));
    }
}