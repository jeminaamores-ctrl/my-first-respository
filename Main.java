public class Main{

   public static void main(String[] args){
   
   Movie movie1 = new Movie();
   movie1.title = "Spirited Away";
   movie1.genre = "(Fantasy)";
   movie1.duration = 124;
   movie1.displayInfo();
   
   Movie movie2 = new Movie();
   movie2.title = "Avatar";
   movie2.genre = "(Sci-Fi)";
   movie2.duration = 162;
   movie2.displayInfo();

   
   Movie movie3 = new Movie();
   movie3.title = "Pride and Prejudice";
   movie3.genre = "(Romance)";
   movie3.duration = 129;
   movie3.displayInfo();


   }
}