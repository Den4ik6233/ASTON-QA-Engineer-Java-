public class ArrayProcessor {
    public int sumArray(String[][] array) throws MyArraySizeException, MyArrayDataException {
        validateArraySize(array);

        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException ex) {
                    throw new MyArrayDataException("Некорректные данные в ячейке [" + i + "][" + j + "]");
                }
            }
        }
        return sum;
    }

    private void validateArraySize(String[][] array) throws MyArraySizeException {
        if (array.length != 4) {
            throw new MyArraySizeException("Неправильный размер массива. Должен быть 4x4");
        }
        for (String[] row : array) {
            if (row.length != 4) {
                throw new MyArraySizeException("Неправильный размер массива. Должен быть 4x4");
            }
        }
    }
}
