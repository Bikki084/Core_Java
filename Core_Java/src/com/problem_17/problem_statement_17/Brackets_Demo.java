package com.problem_17.problem_statement_17;

import java.util.ArrayDeque;
import java.util.Deque;

public class Brackets_Demo
{

	static boolean areBracketsBalanced(String expr)
    {
       
        Deque<Character> stack
            = new ArrayDeque<Character>();
 
       
        for (int i = 0; i < expr.length(); i++)
        {
            char x = expr.charAt(i);
 
            if (x == '(' || x == '[' || x == '{')
            {
                
                stack.push(x);
                continue;
            }
 
           
            if (stack.isEmpty())
                return false;
            char check;
            switch (x) {
            case ')':
                check = stack.pop();
                if (check == '{' || check == '[')
                    return false;
                break;
 
            case '}':
                check = stack.pop();
                if (check == '(' || check == '[')
                    return false;
                break;
 
            case ']':
                check = stack.pop();
                if (check == '(' || check == '{')
                    return false;
                break;
            }
        }
 
        
        return (stack.isEmpty());
    }
 
    
    public static void main(String[] args)
    {
        String expr = "�[(])}";
 
        
        if (areBracketsBalanced(expr))
            System.out.println("Balanced ");
        else
            System.out.println("Not Balanced ");
    }
}

