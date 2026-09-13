public class Demo34 {
    public static void main(String[] args) {
      
        // 34. 2D array = An array where each element is an array 
        //                useful for storing a matrix of data 

    /* 
        String[][] groceries = {{"apple", "banana", "orange"},
                                {"potato", "onion", "carrot"},
                                {"chicken", "egg", "pork", "beef"}};

        groceries[2][1] = "fish"; // change the element in row 2 column 1

        for(String[] foods: groceries){
            for(String food: foods){
                System.out.print(food + " ");
            }
            System.out.println();
        }
    */

     // Mini project 

     char[][] telephone = {{'1', '2', '3'},
                           {'4', '5', '6'},
                           {'7', '8', '9'},
                           {'*', '0', '#'}};

    for(char[] row: telephone){
        for(char number : row){
            System.out.print(number + " ");
        }
        System.out.println();
    }

    }
}