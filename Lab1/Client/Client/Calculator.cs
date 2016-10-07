using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Calc
{
    public static class Calculator
    {
        private static bool IsDelimeter(char c)
        {
            return (!IsOperator(c) && !Char.IsDigit(c));
        }
        private static bool IsOperator(char с)
        {
            return ("+-/*()".IndexOf(с) != -1);
        }
        private static byte GetPriority(char c)
        {
            switch (c)
            {
                case '(': return 0;
                case ')': return 0;
                case '+': return 1;
                case '-': return 1;
                case '*': return 2;
                case '/': return 2;
                default: return 3;
            }
        }

        public static string GetMessage(string message)
        {
            var output = string.Empty;
            var operStack = new Stack<char>();

            for (var i = 0; i < message.Length; i++)
            {
                if (IsDelimeter(message[i]))
                    continue;
                if (Char.IsDigit(message[i]))
                {
                    while (!IsDelimeter(message[i]) && !IsOperator(message[i]))
                    {
                        output += message[i++];
                        if (i == message.Length) 
                            break;
                    }
                    output += ' ';
                    i--;
                }
                if (IsOperator(message[i]))
                {
                    if (message[i] == '-' && output == string.Empty) {
                        output += "0 ";
                    }
                    if (operStack.Count() > 0) {
                        if (message[i] == '-' && operStack.Peek() == '(') {
                            output += "0 ";
                        }
                    }
                    switch (message[i])
                    {
                        case '(':
                            operStack.Push(message[i]);
                            break;
                        case ')':
                        {
                            var s = operStack.Pop();
                            if (s == '(' && IsOperator(output[output.Length - 1])) {
                                output += "0 ";
                            }
                            while (s != '(')
                            {
                                output += s.ToString() + ' ';
                                s = operStack.Pop();
                            }
                        }
                            break;
                        default:
                            if (operStack.Count > 0)
                                if (GetPriority(message[i]) <= GetPriority(operStack.Peek()))
                                    output += operStack.Pop().ToString() + " "; 
                            operStack.Push(char.Parse(message[i].ToString()));
                            break;
                    }
                }
            }
            while (operStack.Count > 0)
                output += operStack.Pop() + " ";
            return output;
        }

        public static double Calculation(string message)
        {
            double result = 0;
            var temp = new Stack<double>();
            for (var i = 0; i < message.Length; i++)
            {
                if (Char.IsDigit(message[i]))
                {
                    string a = string.Empty;
                    while (!IsDelimeter(message[i]) && !IsOperator(message[i]))
                    {
                        a += message[i];
                        i++;
                        if (i == message.Length) break;
                    }
                    temp.Push(double.Parse(a));
                    i--;
                }
                else if (IsOperator(message[i]))
                {
                    double a = temp.Pop();
                    double b = temp.Pop();
                    switch (message[i])
                    {
                        case '+': result = b + a; break;
                        case '-': result = b - a; break;
                        case '*': result = b * a; break;
                        case '/': result = b / a; break;
                    }
                    temp.Push(result);
                }
            }
            return temp.Peek();
        }
    }
}
