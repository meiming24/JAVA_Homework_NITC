public class HelloWorld{
    
    public static int getIndexMin(int[] numbers){
        int min = numbers[0];
        int minIndex = -1;
        for(int i = 0; i < numbers.length; i++){
            if(min > numbers[i]){
                min = numbers[i];
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static int getIndexMinFrom(int[] numbers, int from){
       int min = numbers[from];
       int minIndex = from;
       for(int i = from ; i < numbers.length; i++){
           if(min > numbers[i]){
                min = numbers[i];
                minIndex = i;
            }
       }
       return minIndex;
    }
    
    public static int[] exchangeMinFrom(int[] numbers, int from){
        int mid = numbers[getIndexMinFrom(numbers, from)];
        numbers[getIndexMinFrom(numbers, from)] = numbers[from];
        numbers[from] = mid;
        return numbers;
    }
    
    public static int[] sortBySelection(int[] numbers){
        int res[] = new int[numbers.length];
        for(int i = 0; i < numbers.length; i++){
            res = exchangeMinFrom(numbers, i);
        }
        return res;
    }
    
    public static int[] findDuplicates(int[] numbers){
        
    }
    
//      public static void main(String []args){
//         int arr1[] = {1, 3, 0, 4};
//         System.out.println(getIndexMin(arr1));
        
//         int arr2[] = {4, 3, 1, 4, 5};
//         System.out.println(getIndexMinFrom(arr2, 1));
        
//         int arr3[] = {4, 3, 1, 4, 5};
//         int arrRes3[] = exchangeMinFrom(arr3, 1);
//         for(int i : arrRes3){
//             System.out.print(i + " ");
//         }
//         System.out.println(" ");
        
//         int arr4[] = {4, 3, 1, 0, 5};
//         int arrRes4[] = sortBySelection(arr4);
//         for(int i : arrRes4){
//             System.out.print(i + " ");
//         }
//         System.out.println(" ");
        
        
//      }
}
