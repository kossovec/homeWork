package mihail_metel.homeWork06.arrayUtilsPack;

public class UseArrayUtils {

    public static void main(String[] args) {
        int[] intArray = new int[]{
                15,
                6,
                10,
                125,
                358,
                3258,
                1,
                3258,
                -125,
                10};

        double[] doubleArray = new double[]{
                10.2,
                6.5,
                1.2,
                250.365,
                3258.1,
                1.11,
                1.33,
                3258.1,
                -125,
                4};

        try {
            System.out.println("Инты: ");
            System.out.println("Сумма масива: " + ArrayUtils.sum(intArray));
            System.out.println("Минимальное значение массива: " + ArrayUtils.min(intArray));
            System.out.println("Максимальное значение массива: " + ArrayUtils.max(intArray));
            System.out.println("Максимальное положительное значение массива: " + ArrayUtils.maxPositive(intArray));
            System.out.println("Остаток от деления первого элемента массива на последний: "
                    + ArrayUtils.modulus(intArray));
            System.out.println("Второе по величине число массива: " + ArrayUtils.secondLargest(intArray));
            System.out.println("Результат перемножения массива: " + ArrayUtils.multiplication(intArray));
        }
        catch (Exception e) {
            System.out.println(e);
        }

        try{
            System.out.println("\nДаблы: ");
            System.out.println("Сумма масива: " + ArrayUtils.sum(doubleArray));
            System.out.println("Минимальное значение массива: " + ArrayUtils.min(doubleArray));
            System.out.println("Максимальное значение массива: " + ArrayUtils.max(doubleArray));
            System.out.println("Максимальное положительное значение массива: " + ArrayUtils.maxPositive(doubleArray));
            System.out.println("Результат перемножения массива: " + ArrayUtils.multiplication(doubleArray));
            System.out.println("Остаток от деления первого элемента массива на последний: "
                    + ArrayUtils.modulus(doubleArray));
            System.out.println("Второе по величине число массива: " + ArrayUtils.secondLargest(doubleArray));
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

}
