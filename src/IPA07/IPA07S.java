package IPA07;

import java.util.Arrays;
import java.util.Scanner;

public class IPA07S {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        Movie [] arr = new Movie[4];
        for (int i = 0; i < arr.length; i++) {
            String movieName = sc.nextLine();
            String company = sc.nextLine();
            String genre = sc.nextLine();
            int budget = sc.nextInt();sc.nextLine();

            arr[i] = new Movie(movieName,company,genre,budget);
        }
        String searchGenre = sc.nextLine();

        Movie [] result = getMovieByGenre(arr,searchGenre);

        if(result != null){
            for (int i = 0; i < result.length; i++) {
                if(result[i].getBudget() >= 80000000){
                    System.out.println("High Budget Movie");
                }
                else{
                    System.out.println("Low Budget Movie");
                }
            }
        }


    }
    public static Movie[] getMovieByGenre(Movie [] movie ,String searchGenre){
        Movie [] arr2 = new Movie[0];
        for (int i = 0; i < movie.length ; i++) {
            if(movie[i].getGenre().equalsIgnoreCase(searchGenre)){
                arr2 = Arrays.copyOf(arr2,arr2.length + 1);
                arr2[arr2.length - 1 ] = movie[i];
            }
        }
        if (arr2.length > 0){
            return arr2;
        }else {
            return null;
        }
    }
}
class Movie {
    private String movieName;
    private String company;
    private String genre;
    private int budget;

    public Movie(String movieName,String company,String genre,int budget){
        this.movieName = movieName;
        this.company = company;
        this.genre = genre;
        this.budget = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public String getCompany() {
        return company;
    }

    public String getGenre() {
        return genre;
    }

    public int getBudget() {
        return budget;
    }
}
