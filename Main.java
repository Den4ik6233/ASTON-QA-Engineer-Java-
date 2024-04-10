public class Main {
    public static void main(String[] args) {
        String[][] array = {
                {"1", "4", "1", "2"},
                {"2", "2", "2", "3"},
                {"3", "3", "3", "4"},
                {"2", "4", "3", "1"}
        };

        ArrayProcessor arrayProcessor = new ArrayProcessor();
        try {
            int result = arrayProcessor.sumArray(array);
            System.out.println("Сумма элементов массива: " + result);
        } catch (MyArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (MyArrayDataException e) {
            System.out.println("Ошибка данных массива: " + e.getMessage());
        }
    }
}
