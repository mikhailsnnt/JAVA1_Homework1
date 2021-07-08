public class HomeWorkApp {
    public static void main(String[] args) {
    }
    static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }
    static void checkSumSign(){
        int a = 50 , b = -51;
        if (a+b >= 0)
            System.out.println("Сумма положительна");
        else
            System.out.println("Сумма отрицательна");
    }
    static void printColor(){
        int value = (int) (Math.random()*1000) -200; //Random value, possibly negative
        if (value <= 0 )
            System.out.println("Красный");
        else if (value<=100)
            System.out.println("Желтый");
        else
            System.out.println("Зеленый");
    }
    static void compareNumbers(){
        int a = 5 , b = 7;
        if (a>=b)
            System.out.println("a>=b");
        else
            System.out.println("a<b");
    }
}
