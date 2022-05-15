/*
The MIT License (MIT)
Copyright (c) 2022 Carlos Eduardo <cduhno@gmail.com>
Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:
The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.
THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
*/

package datavalida;
import java.util.Scanner;

public class DataValida {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dia, mes, ano;
        System.out.println("Informe o dia: ");
        dia = in.nextInt();
        System.out.println("Informe o mês: ");
        mes = in.nextInt();
        System.out.println("Informe o ano: ");
        ano = in.nextInt();
        if ((dia >= 1 && dia <= 31 && mes >= 1 && mes <= 12 && ano >= 1900) || (mes == 2 && dia >= 1 && dia <= 29 && ((ano % 4 == 0) && (ano % 100 != 0)) || (mes == 4 || mes == 6 || mes == 9 || mes == 11 && dia <= 30))) {
            System.out.println("Data válida. "); 
        }
        else {
            System.out.println("Data inválida. "); 
        }
    }
}