public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        int i = 165004;
        byte b = 13;
        short s = 14568;
        long l = 1684484164;
        float f = 5.1f;
        double d = 8324.1531;
        System.out.println("Значение переменной i с типом int равно = " + i);
        System.out.println("Значение переменной b с типом byte равно = " + b);
        System.out.println("Значение переменной s с типом short равно = " + s);
        System.out.println("Значение переменной l с типом long равно = " + l);
        System.out.println("Значение переменной f с типом float равно = " + f);
        System.out.println("Значение переменной d с типом double равно = " + d);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float f1 = 27.12f;
        long l = 987678965549L;
        float f2 = 2.786f;
        short s1 = 569;
        short s2 = -159;
        short s3 = 27897;
        byte b = 67;
        System.out.println("Следующие значения записаны в переменные:");
        System.out.println(f1 + " " + l + " " + f2 + " " + s1 + " " + s2 + " " + s3 + " " + b);
    }
    public static void task3 () {
        System.out.println("Задача 3");
        byte teacher1 = 23;
        byte teacher2 = 27;
        byte teacher3 = 30;
        short numberOfPaper = 480;
        int n = numberOfPaper/(teacher1 + teacher2 + teacher3);
        System.out.println("На каждого ученика рассчитано " + n +" листов бумаги");
    }
    public static void task4 () {
        System.out.println("Задача 4");
        short velocity = 8;
        int number;
        number = velocity*20;
        System.out.println("За 20 минут машина произвела " + number + " штук бутылок");
        number = velocity*60*24;
        System.out.println("За сутки машина произвела " + number + " штук бутылок");
        number = number*3;
        System.out.println("За 3 дня машина произвела " + number + " штук бутылок");
        number = number*10;
        System.out.println("За месяц машина произвела " + number + " штук бутылок");
    }
    public static void task5 () {
        System.out.println("Задача 5");
        short numberPaint = 480;
        short whiteForClass = 2;
        short brownForClass = 4;
        short numberClass = (short) (numberPaint/(whiteForClass + brownForClass));
        short numberWhite = (short) (numberClass*whiteForClass);
        short numberBrown = (short) (numberClass*brownForClass);

        System.out.println("В школе, где " + numberClass + " классов, нужно " + numberWhite + " банок белой краски и " +
                numberBrown + " банок коричневой краски");
    }
    public static void task6 () {
        System.out.println("Задача 6");
        short banan, milk, iceCream, egg, weight;
        float weightKg;
        banan = 5*80;
        milk = 2*105;
        iceCream = 2*100;
        egg = 4*70;
        weight = (short) (banan + milk + iceCream + egg);
        weightKg = (float) weight/1000;
        System.out.println("Вес завтрака в граммах " + weight);
        System.out.println("Вес завтрака в кг " + weightKg);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        short weight = 7;
        short numberDays250, numberDays500, average;
        numberDays250 = (short) (weight/0.250);
        numberDays500 = (short) (weight/0.500);
        average = (short) ((numberDays250 + numberDays500)/2);
        System.out.println("Количество дней для похудения на 7 кг при условии потери 250 гр за день составляет = " + numberDays250);
        System.out.println("Количество дней для похудения на 7 кг при условии потери 500 гр за день составляет = " + numberDays500);
        System.out.println("Среднее количество дней для похудения на 7 кг составляет = " + average);
    }
    public static void task8 () {
        System.out.println("Задача 8");
        float income;
        int masha = 67760;
        int denis = 83690;
        int cristina = 76230;
        float salary10;
        salary10 = (float) (masha*1.1);
        income = (float) (masha*0.1*12);
        System.out.println("Маша теперь получает " + salary10 + " рублей. Годовой доход вырос на " + income + " рублей");
        salary10 = (float) (denis*1.1);
        income = (float) (denis*0.1*12);
        System.out.println("Денис теперь получает " + salary10 + " рублей. Годовой доход вырос на " + income + " рублей");
        salary10 = (float) (cristina*1.1);
        income = (float) (cristina*0.1*12);
        System.out.println("Кристина теперь получает " + salary10 + " рублей. Годовой доход вырос на " + income + " рублей");
    }

    //   На каждого ученика рассчитано … листов бумаги




    }
