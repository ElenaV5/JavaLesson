import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // задание переменной
        /*{
            System.out.println("Hello world!");
            // <тип><имя переменной>[=<значение>];
            int a = 6;
            int b = 8;
            System.out.println(a + b);
            System.out.println(6 + 8);

            // можно записать и по другому
            int a1 = 6, b1 = 8;
            System.out.println(a1 + b1);
        }*/

        //Средства для выведения данных
        /*{
            System.out.println("Введи мне два числа и я посчитаю тебе их сумму");
            System.out.println("----------------------------------------------");
            int a = 0, b = 0;
            Scanner in = new Scanner(System.in);
            System.out.print("Введите сюда первое число: ");
            a = in.nextInt();
            System.out.print("Введите сюда второе число: ");
            b = in.nextInt();
            System.out.println("Сумма ваших чисел равна: " + (a + b));
        }*/

        //Выведение данных не дробных чисел
        /*{
            System.out.println("Введите мне два числа и я посчитаю тебе их сумму");
            System.out.println("------------------------------------------------");
            double a = 0, b = 0; //дробное число
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US); //вместо (,) ставит (.)
            System.out.print("Введите сюда первое число: ");
            a = in.nextDouble();
            System.out.print("Введите сюда второе число: ");
            b = in.nextDouble();
            System.out.println("Сумма ваших чисел равна: " + (a + b));
            // Можно также вычетать (-), умножать (*), делить (/)
        }*/

        //Размеры переменных
        /*{
            int x = 1000 * 1000;
            System.out.println(x * x); //получается отрицательное значение из-за переполнения
            System.out.println(x); //размер int всего 32 бита

            long xx = 1000 * 1000;
            System.out.println(xx * xx); // размер long уже 64 бита
            System.out.println((int) (x * xx));

            long x2 = 1000000L; // правильное написание числа
            System.out.println(x2 * x2);
        }*/

        //Операции
        /*{
            System.out.println(5 % 3); //остаток от деления
            System.out.println((-5) % 3);
            System.out.println(5 / 3);
            System.out.println((Double) (5.0) / 3);
            System.out.println((Double) (5.0));
        }*/

        //проверяет остаток от деления
        /*{Scanner in = new Scanner(System.in);
        Double value = in.nextDouble();
        if(value % 2 == 0){
            System.out.println("Вы ввели четное число");
        } else System.out.println("Вы ввели нечетное число");
        System.out.println(12.2 % 2);}*/

        //Операции сокращенного типа
        /*{
            int minutes = 10;
            //minutes = minutes + 1;
            System.out.println(minutes); //11
            //minutes = ++minutes;
            System.out.println(++minutes); //10 11
            System.out.println(minutes); //10 11 11
            minutes += 2;
            System.out.println(minutes); //10 11 11 13
            minutes *= 2;
            System.out.println(minutes); //10 11 11 13 26
            minutes /= 2;
            System.out.println(minutes); //10 11 11 13 26 13
            minutes -= 3;
            System.out.println(minutes); //10 11 11 13 26 13 10
        }*/

        //Примитивные типы
        /*{
            char a = 8667; //можно число преобразовать в символ
            char b = '\u21DB';
            char c = '⇛';
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println((int)c); //8667
        }*/

        //Примитивные типы операций
        /*{
            // типы: || - или, && - и, == - равно, != - не равно
            Scanner in = new Scanner(System.in);
            if (in.nextInt() > 10) { //если число больше 10, то истина
                System.out.println("Условие сгенерировало TRUE");
            } else {
                System.out.println("Условие сгенерировало FALSE");
            }
            //генерация цепочек типа 1 < x < 3
            int x = 0;
            boolean a = 1 < x;
            boolean b = x < 3;
            if( a && b) {
                System.out.println("TRUE");
            } else System.out.println("FALSE");
            //работа с типами и цепочками
            *Scanner in = new Scanner(System.in);
            int x = in.nextInt();
            boolean a = x < 5 || x > 5 && x < 7;
            System.out.println(a);
            boolean b = !(x < 5 || x > 5 && x < 7); //Инвертирует результат на противоположный
            System.out.println(b);
            //еще один пример
            int x = 5;
            boolean b1 = x > 0;
            boolean b2 = b1 && (x < 20);
            System.out.println(b1);
            System.out.println(b2);
        }*/

        //Интернальный оператор
        /*{
            //<условие>?<значение если условие истина>:<значение если условие ложно>
            int a = 10;
            int b = 20;
            int max = (a > b ? a : b);
            System.out.println(max);
            System.out.println(a > 0 ? a*a : "Wrong"); //100
        }*/

        //Задача № 112165 (сайт: informatics.msk.ru)
        /*{
            System.out.println("Задача № 112165");
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            Double x = in.nextDouble();
            Double y = in.nextDouble();
            System.out.println(x < 2 && y < x && x*x + y*y > 4 && y > 0 ? "YES" : "NO");
        }*/

        //Задача № 112167
        /*{
            System.out.println("Задача № 112167");
            Scanner in = new Scanner(System.in);
            in.useLocale(Locale.US);
            Double x = in.nextDouble();
            Double y = in.nextDouble();
            System.out.println( (y<2 - x*x && y>x && x<0) || (y<2 - x*x && y>0 && x>=0) ? "YES" : "NO");
        }*/

        //Какое из чисел больше?
        /*{
            Scanner in = new Scanner(System.in);
            int x1, x2;
            x1 = in.nextInt();
            if (x1 > 9 && x1 < 100) {
                x2 = x1 % 10;
                x1 = x1 / 10;
                System.out.println(x1 + " ; " + x2);
                if (x1 == x2) {
                    System.out.println("В числе одинакове цифры");
                } else if (x2 < x1) {
                    System.out.println("Первая цифра больше второй");
                } else System.out.println("Вторая цифра больше");
            } else System.out.println("Число не двухзначное");
        }*/

        //Switch-case
        /* {
            //Кол-во дней в месяце не високосного года
            System.out.println("Введите месяц числом от 1 - 12:");
            Scanner in = new Scanner(System.in);
            switch (in.nextInt()){
                case 1:
                    System.out.println("В январе: 31 день");
                    break; //для остановки кейса (иначе выполнится и следующий)
                case 2:
                    System.out.println("В феврале: 28 дней");
                    break;
                case 3:
                    System.out.println("В марте: 31 день");
                    break;
                case 4:
                    System.out.println("В апреле: 30 дней");
                    break;
                case 5:
                    System.out.println("В мае: 31 день");
                    break;
                case 6:
                    System.out.println("В июне: 30 дней");
                    break;
                case 7:
                    System.out.println("В июле: 31 день");
                    break;
                case 8:
                    System.out.println("В августе: 31 день");
                    break;
                case 9:
                    System.out.println("В сентябре: 30 дней");
                    break;
                case 10:
                    System.out.println("В октябре: 31 день");
                    break;
                case 11:
                    System.out.println("В ноябре: 30 дней");
                    break;
                case 12:
                    System.out.println("В декабре: 31 день");
                    break;
            }
        }*/

        //Прикол))
        /*{
            System.out.println("Привет! Меня зовут Елешка. А тебя как?");
            Scanner in = new Scanner(System.in);
            System.out.print("Введи своё имя: ");
            //x = in.next();  //тут неизвестный пока мне кусок кода))
            System.out.println("Привет " + x + "! Приятно познакомиться!");
            System.out.println("О чём поговорим?");
            //y = in.
        }*/

        //Можно Int вывести как long или double
        /*{
            int x = 1000 * 1000;
            System.out.println((long) x * x);
        }*/

        //Блоки и области
        /*{
            int inf = 10;
            if (inf > 0){
                int price = 4;
                price += inf * price / 100;
                System.out.println(price);
            }
        }*/
        /*{
            Scanner in = new Scanner(System.in);
            int x1, x2;
            x1 = in.nextInt();
            x2 = x1 % 10;
            x1 = x1 / 10;
            if (x2 == 3 || x1 == 3){
                System.out.println("В числе присутствует цифра 3");
            } else {
                System.out.println("В числе отсутствует цифра 3");
            }
        }*/

        //Цикл while
        /*{
            int x = 0;
            while (x < 5){ //если вместо выражение поставить true, то while не остановится пока память не переполнится
                System.out.print(x + " ,");
                x++; //0 1 2 3 4
            }
            System.out.println(" но x равен: " + x); //5
        }*/

        //Цикл do while
        /*{
            int x = 0;
            do {
                System.out.print(x + " ,");
                x++;
            } while (x < 5); //0 1 2 3 4; но при условии false выведет 0 1
            System.out.println(" а x равен: " + x); // 5
        }*/

        //Задача на циклы "Автобус и мосты"
        {
            Scanner in = new Scanner(System.in);
            int t = 0; // высота мостов
            int t2 = 437; //высота автобуса
            int i = 1;
            int N = in.nextInt(); // кол-во мостов
            while (i <= N){ //скорее всего это более правильно, чем i<N
                t = in.nextInt();
                if (t < t2) {
                    System.out.println("Crach " + i);
                    break;
                }
                i++;
            }
            if(t > t2){
                System.out.println("No crash");
            }
        }


    }
}