import java.util.Scanner;;

public class ArrayMainProgram {
    int choice, i, j, size;
    String yn;
    Scanner src = new Scanner(System.in);

    public void MainMenu() {
        System.out.println("_______________________");
        System.out.println("1-Matrix Addition:\n______________________");
        System.out.println("2-Matrix Subtraction:\n_____________________");
        System.out.println("3-Matrix Mltiplication:\n_____________________");
        System.out.println("4-Array Largest elements:\n____________________");
        System.out.println("5-Array Smallest Elements\n_________________________");
        System.out.println("6-Array Sorting By Bubble Sort\n_____________________");
        System.out.println("7-Array Sorting By Sellection Sort\n_____________________");
        System.out.println("8-Array Reverse elenments:\n______________________________");
        System.out.println("9-Array Triverse Elements:\n______________________________");
        System.out.println("10-Array insert elements:\n____________________________");
        System.out.println("11-Array Remove Elements:\n____________________________");
        System.out.println("12-Array Search Elements:\n______________________________");
        System.out.println("13-Exit");
        System.out.println("Enter Your Choice: ");
        choice = src.nextInt();
        if (choice == 1) {
            MatrixAdddition();
        }
        if (choice == 2) {
            MatrixSubtraction();
        }
        if (choice == 3) {
            MatixMultiplication();
        }
        if (choice == 4) {
            ArrayLargestElement();
        }
        if (choice == 5) {
            ArraySmallesttElement();
        }
        if (choice == 6) {
            BubbleSorting();
        }
        if (choice == 7) {
            selectionSort();
        }
        if (choice == 8) {
            ReverseElement();
        }
        if (choice == 9) {
            TriverseElement();
        }
        if (choice == 10) {
            InsertElementInArray();
        }
        if (choice == 11) {
            RemoveArrayEleme();
        }
        if (choice == 12) {
            SearchElements();
        }
        if (choice == 13) {
            System.exit(0);
        }

    }

    public void MatrixAdddition() {
        System.out.println("Welcom To Matrix Addition: ");
        System.out.println("Enter The size Of Matrix: ");
        size = src.nextInt();
        int a[][] = new int[size][size];
        int b[][] = new int[size][size];
        int c[][] = new int[size][size];

        System.out.println("Enter first  Matrix Elements: ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                a[i][j] = src.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter Secound  Matrix Elements: ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                b[i][j] = src.nextInt();
            }
            System.out.println();
        }

        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("Matrix Addition is: ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Do You Want To Again Add Matrix [Y / N]: ");
        yn = src.next();
        if (yn.equalsIgnoreCase("y")) {
            MatrixAdddition();
        } else {
            MainMenu();
        }

    }

    public void MatrixSubtraction() {
        System.out.println("Welcom To Matrix Subtraction: ");
        System.out.println("Enter The size Of Matrix: ");
        size = src.nextInt();
        int a[][] = new int[size][size];
        int b[][] = new int[size][size];
        int c[][] = new int[size][size];

        System.out.println("Enter first  Matrix Elements: ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                a[i][j] = src.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter Secound  Matrix Elements: ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                b[i][j] = src.nextInt();
            }
            System.out.println();
        }

        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                c[i][j] = a[i][j] - b[i][j];
            }
        }

        System.out.println("Matrix Subtraction is: ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Do You Want To Again Subtract Matrix [Y / N]: ");
        yn = src.next();
        if (yn.equalsIgnoreCase("y")) {
            MatrixSubtraction();
        } else {
            MainMenu();
        }
    }

    public void MatixMultiplication() {
        System.out.println("Welcom To Maatrix Multiplication: ");
        System.out.println("Enter The Size Of he Matrix : ");
        size = src.nextInt();
        int a[][] = new int[size][size];
        int b[][] = new int[size][size];
        int c[][] = new int[size][size];
        System.out.println("Enter The Elements Of First Matrix : ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                a[i][j] = src.nextInt();
            }
            System.out.println();
        }

        System.out.println("Enter The Elements Of Secound Matrix : ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                b[i][j] = src.nextInt();
            }
            System.out.println();
        }

        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                c[i][j] = 0;
                for (int k = 0; k < size; k++) {
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        System.out.println("Matrix Multiplication is: ");
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                System.out.print(c[i][j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Do You Want To Again Multiply Matrix [Y / N]: ");
        yn = src.next();
        if (yn.equalsIgnoreCase("y")) {
            MatixMultiplication();
        } else {
            MainMenu();
        }
    }

    public void ArrayLargestElement() {
        System.out.println("Welcom To find LArgest element In Array: ");
        System.out.println("Enter The size Of Array: ");
        size = src.nextInt();
        int a[] = new int[size];
        System.out.println("Enter Array Elements: ");
        for (i = 0; i < size; i++) {
            a[i] = src.nextInt();
        }
        System.out.print("Array Elements Are: ");
        for (i = 0; i < size; i++) {
            System.out.println(a[i] + " ");
        }
        int large = a[0];
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (a[i] < a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                large = a[i];
            }
        }
        System.out.println("Largest Element is:  " + large);

        System.out.println("\n\nDo You Want To Again ind Smallest Element Array [Y / N]: ");
        yn = src.next();
        if (yn.equalsIgnoreCase("y")) {
            ArrayLargestElement();
        } else {
            MainMenu();
        }
    }

    public void ArraySmallesttElement() {
        System.out.println("Welcom To find Smallest element In Array: ");
        System.out.println("Enter The size Of Array: ");
        size = src.nextInt();
        int a[] = new int[size];
        System.out.println("Enter Array Elements: ");
        for (i = 0; i < size; i++) {
            a[i] = src.nextInt();
        }
        System.out.print("Array Elements Are: ");
        for (i = 0; i < size; i++) {
            System.out.println(a[i] + " ");
        }
        int small = a[0];
        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
                small = a[i];
            }
        }
        System.out.println("Largest Element is:  " + small);

        System.out.println("\n\nDo You Want To Again find Small Element in Array [Y / N]: ");
        yn = src.next();
        if (yn.equalsIgnoreCase("y")) {
            ArraySmallesttElement();
        } else {
            MainMenu();
        }
    }

    public void BubbleSorting() {
        System.out.println("Welcome To Bubble Sorting ");
        System.out.println("Enter The Size of Array: ");
        size = src.nextInt();
        int a[] = new int[size];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < size; i++) {
            a[i] = src.nextInt();
        }
        System.out.println("Elements are: ");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i] + " ");
        }

        for (i = 0; i < size; i++) {
            for (j = 0; j < size - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

        }
        System.out.println("Sorted elements: is: ");
        for (i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n\nDo You Want To Again Sort Element in Array [Y / N]: ");
        yn = src.next();
        if (yn.equalsIgnoreCase("y")) {
            BubbleSorting();
        } else {
            MainMenu();
        }

    }

    public void selectionSort() {
        int m;
        int temp = 0;
        System.out.println("Welcom To Selection Sort");
        System.out.println("Enter The Size Of Array ");
        size = src.nextInt();

        int a[] = new int[size];
        System.out.println("Enter Array Elements: ");
        for (i = 0; i < size; i++) {
            a[i] = src.nextInt();
        }
        System.out.println("Array Elements Are: ");
        for (int i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        for (i = 0; i < size; i++) {
            m = i;
            for (j = i + 1; j < size; j++)
                if (a[j] < a[m]) {
                    m = j;
                }
            temp = a[m];
            a[m] = a[i];
            a[i] = temp;
        }
        System.out.println("\nSorted elements Are: \n\n");
        for (i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n\nDo You Want To Again Sort Element in Array [Y / N]: ");
        yn = src.next();
        if (yn.equalsIgnoreCase("y")) {
            selectionSort();

        } else {
            MainMenu();
        }
    }

    public void ReverseElement() {
        System.out.println("Welcom To the Reverse Aray : ");
        System.out.println("Enter The siz Of Array");
        size = src.nextInt();
        int a[] = new int[size];
        System.out.println("Enter The Arra Elemnts : ");
        for (i = 0; i < size; i++) {
            a[i] = src.nextInt();
        }

        System.out.println("Array Elements Are: ");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i] + " ");
        }
        int temp = a[0];

        for (i = 0; i < size; i++) {
            for (j = 0; j < size; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }

            }
        }
        System.out.println("Revsre Elements Are: ");
        for (i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println("\n\nDo You Want To Again Reversearray Element in Array [Y / N]: ");
        yn = src.next();
        if (yn.equalsIgnoreCase("y")) {
            ReverseElement();

        } else {
            MainMenu();
        }
    }

    public void TriverseElement() {
        System.out.println("Welcome To Triverse The Elements ");
        System.out.println("Enter The Size Of The Array ");
        size = src.nextInt();
        int b;
        int a[] = new int[size];
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < size; i++) {
            a[i] = src.nextInt();
            b = a[i];
        }
        System.out.println("Array Elements Are");
        for (i = 0; i < size; i++) {
            System.out.print(a[i] + " ");
        }

        System.out.print("\nArray Triverse Elements Are\n");
        for (i = 0; i < size; i++) {
            b = a[i];
            System.out.print(b + " ");
        }
        System.out.println("\n\nDo You Want To Again Triverse Element in Array [Y / N]: ");
        yn = src.next();
        if (yn.equalsIgnoreCase("y")) {
            TriverseElement();

        } else {
            MainMenu();
        }
    }

    public void InsertElementInArray() {
        System.out.println("Welcome To Insert New Element in An Array: ");
        System.out.println("Enter The size of array: ");
        size = src.nextInt();
        int a[] = new int[size + 1];
        System.out.println("Enter Array Elemenste: ");
        for (i = 0; i < size; i++) {
            a[i] = src.nextInt();
        }
        System.out.println("Array Elements are: ");
        for (i = 0; i < size; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("Enter The Element Which You want To Enter: ");
        int ins = src.nextInt();
        a[i] = ins;

        for (int i = 0; i < size + 1; i++) {
            for (int j = 0; j < size - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }

            System.out.println("Array Insretd Element is: ");
            for (i = 0; i < size + 1; i++) {
                System.out.print(a[i] + " ");
            }
        }
        System.out.println("\n\nDo You Want To Again insert New Element in Array [Y / N]: ");
        yn = src.next();
        if (yn.equalsIgnoreCase("y")) {
            InsertElementInArray();

        } else {
            MainMenu();
        }
    }

    public void RemoveArrayEleme() {
        System.out.println("Welcome To Remove Array Element ");

        System.out.println("Enter The size of Array: ");
        size = src.nextInt();
        int a[] = new int[size];
        int index = -1;
        System.out.println("Enter Array Elements: ");
        for (int i = 0; i < size; i++) {
            a[i] = src.nextInt();
        }
        System.out.print("Array Elements Are: ");
        for (int i = 0; i < size; i++) {
            System.out.println(a[i] + " ");
        }
        System.out.println("Enter The Elements which you want to remove");
        int rem = src.nextInt();
        for (i = 0; i < size; i++) {
            if (a[i] == rem) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            for (int i = index; (i < size - 1); i++) {
                a[i] = a[i + 1];
            }
            System.out.println("New Array Elements: ");
            for (i = 0; i < size; i++) {
                System.out.print(a[i] + " ");
            }
        } else {
            System.out.println("Number Not Found: ");
        }

        System.out.println("\n\nDo You Want To Again Remove New Element in Array [Y / N]: ");
        yn = src.next();
        if (yn.equalsIgnoreCase("y")) {
            RemoveArrayEleme();

        } else {
            MainMenu();
        }
    }

    public void SearchElements() {
        System.out.println("Welcom To Search Elements ");
        System.out.println("Enter the Size Of  Array:");
        size = src.nextInt();
        int a[] = new int[size];
        int counter = 0;
        System.out.println("Enter The Array elemenst: ");
        for (i = 0; i < size; i++) {
            a[i] = src.nextInt();
        }
        System.out.println("Enter The  Elements Which You Want To Search In An Array: ");
        int num = src.nextInt();
        for (int i = 0; i < size; i++) {
            if (num == a[i]) {
                counter++;
            }
        }
        if (counter > 0) {
            System.out.println("Number Found ");
        } else {
            System.out.println("Number Not Found");
        }
        System.out.println("\n\nDo You Want To Again Search  Element in Array [Y / N]: ");
        yn = src.next();
        if (yn.equalsIgnoreCase("y")) {
            SearchElements();

        } else {
            MainMenu();
        }
    }

}

class Mainnn {
    public static void main(String[] args) {
        ArrayMainProgram src = new ArrayMainProgram();
        src.MainMenu();
    }
}
