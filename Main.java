package homework2part1;

import java.io.IOException;

import static java.lang.System.*;

public class Main
{
    public static void main(String[] args) throws MyArraySizeException, MyArrayDataException
    {
        String arr[][] = new String[4][4];
        arr[0][0] = "qw";
        arr[0][1] = "qwe";
        arr[0][2] = "1";
        arr[0][3] = "2";
        arr[1][0] = "qwer";
        arr[1][1] = "qwerty";
        arr[1][2] = "45";
        arr[1][3] = "345";
        arr[2][0] = "76";
        arr[2][1] = "qwj";
        arr[2][2] = "qwja";
        arr[2][3] = "32";
        arr[3][0] = "qaz";
        arr[3][1] = "wsx";
        arr[3][2] = "78";
        arr[3][3] = "90";


        for (int i = 0; i < arr.length; i++) {
            if (arr.length != 4) {
                throw new MyArraySizeException("Размер массива должен быть 4 х 4");

            }
        }
        int result = MyArrayExceptions(arr);
    }

    public static int MyArrayExceptions(String[][] arr) throws MyArraySizeException, MyArrayDataException
    {

        int sum = 0;

        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr.length; j++)
            {

                try
                {
                    sum = sum + Integer.parseInt(arr[i][j]);
                    throw new MyArrayDataException("Ошибка в ячейке: " + i + "x" + j);
                } catch (NumberFormatException e)
                {
                    e.getMessage();

                }

            }

        }
      return sum;
    }
}








