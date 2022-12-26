import java.util.Scanner;

public class MethodPractice {

    //static int a = 10; // так лучше не делать!!
    public static void main(String[] args){
        System.out.println("Добро пожаловать в простой калькулятор!");
        System.out.println("Введите первое число:");
        double num1 = getNumber(); //просим ввести 1е число
        System.out.println("Введите второе число:");
        double num2 = getNumber(); //просим ввести 2е число
        System.out.println("Выберите операцию: 1+, 2-, 3*, 4/");
        char operation = getOperation(); //просим ввести операцию 1-4
        double result = calc(num1, num2, operation); //считаем
        System.out.println("Результат: " + result); //Выводим результат

        /*int[] a = {10,15,20,75,30};
        writeArray(a);

        String[] strings = {"один","два","три","пять","семь"};
        writeArray(strings); //убираем string, но программа их не спутает так как параметры разные

        writeArray(strings, 2);*/
    }
    private static double calc(double num1, double num2, char operation) {
        switch (operation){
            case '+':
                return num1+num2;
            case '-':
                return num1-num2;
            case '*':
                return num1*num2;
            case '/':
                return num1/num2;
            default: return 0;
        }
    }

    private static char getOperation() {
        Scanner in = new Scanner(System.in); // 1+, 2-, 3*, 4/
        switch (in.nextInt()){
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default: return '+';
        }
    }

    private static double getNumber() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /*public static void writeArray(int[] arr){
        for(int i = 0; i <= arr.length-1; i++) {
            System.out.println("Значение: " + (arr[i]+1));
        }
        //a++;
        //System.out.println(a); //так лучше не делать!!
    }

    public static void writeArray(String[] arr){ //можно вместо writeStringArray записать writeArray
        for(int i = 0; i <= arr.length-1; i++) {
            System.out.println("Значение: " + (arr[i]));
        }
    }

    public static void writeArray(String[] arr, int numberOfPrints){
        for(int i = 0; i <= numberOfPrints-1; i++) {
            System.out.println("Значение: " + (arr[i]));
        }
    }*/
}
