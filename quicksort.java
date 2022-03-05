public class quicksort
{

    String names[];
    int length;

    public static void main(String[] args) 
    {
        quicksort obj = new quicksort();
        String stringsList[] = {"nibin","raj", "akhil", "akash", "helen", "alen"};
        System.out.println("list of names before sorting");
        for (String i : stringsList) 
        {
            System.out.print(i);
            System.out.print(" ");
        }
        
        obj.sort(stringsList);
       System.out.println("list of names in ascending order after quicksort is :");
        for (String i : stringsList) 
        {
            System.out.print(i);
            System.out.print(" ");
        }
    }

    void sort(String array[]) {
        if (array == null || array.length == 0) {
            return;
        }
        this.names = array;
        this.length = array.length;
        quickSort(0, length - 1);
    }

    void quickSort(int lowerIndex, int higherIndex) {
        int i = lowerIndex;
        int j = higherIndex;
        String pivot = this.names[lowerIndex + (higherIndex - lowerIndex) / 2];

        while (i <= j) {
            while (this.names[i].compareToIgnoreCase(pivot) < 0) {
                i++;
            }

            while (this.names[j].compareToIgnoreCase(pivot) > 0) {
                j--;
            }

            if (i <= j) {
                exchangeNames(i, j);
                i++;
                j--;
            }
        }
        if (lowerIndex < j) {
            quickSort(lowerIndex, j);
        }
        if (i < higherIndex) {
            quickSort(i, higherIndex);
        }
    }

    void exchangeNames(int i, int j) {
        String temp = this.names[i];
        this.names[i] = this.names[j];
        this.names[j] = temp;
    }
}
