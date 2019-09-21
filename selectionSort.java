class Solution {
  static void swap(int[] array, int firstIndex, int secondIndex) {
    int temp = array[firstIndex];
    array[firstIndex] = array[secondIndex];
    array[secondIndex] = temp;
    return;
  }
  
  static int indexOfMinimum(int[] array, int startIndex) {
    int minValue = array[startIndex];
    int minIndex = startIndex;

    for(int i = minIndex + 1; i < array.length; i++) {
      if(array[i] < minValue) {
        minIndex = i;
        minValue = array[i];
      }
    } 
    return minIndex;
  }; 

  public static void selectionSort(int[] array) {
    int length = array.length;
    for(int i=0;i<length-1;i++){
      int start = i;
      int min = indexOfMinimum(array,start);
      swap(array,start,min);
    }
    
   	return; 
  }
}
