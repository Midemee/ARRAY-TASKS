 int [] numberList = {10, 20, 30,40, 50}; 
    int []reversed = new int [numberList.length];

    for (int index = 0; index < numberList.length; index++){
        reversed[index] = numberList[numberList.length-1-index];
    }
        System.out.print(java.util.Arrays.toString(numberList));
            System.out.println();
        System.out.print(java.util.Arrays.toString(reversed));
    System.out.println();
    
