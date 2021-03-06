package com.ervin.moviecatalogue.utils;

import com.ervin.moviecatalogue.R;
import com.ervin.moviecatalogue.model.FilmModel;

import java.util.ArrayList;
import java.util.List;

public class DataDummy {

    public static ArrayList<FilmModel> generateDummyFilmMovieList(){
        ArrayList<FilmModel> films = new ArrayList<>();
        List<String> genres = new ArrayList<>();
        genres.clear(); genres.add("Action"); genres.add("Adventure");genres.add("Fiction");
        films.add(new FilmModel("a1",
                "Alita: Battle Angel (2019)",
                genres,
                R.drawable.poster_alita,
                "67%",
                "2h 2m",
                "ini sinopsis alita"));

        genres.clear(); genres.add("Action"); genres.add("Adventure");genres.add("Fantasy");
        films.add(new FilmModel("a2",
                "Aquaman (2018)",
                genres,
                R.drawable.poster_aquaman,
                "68%",
                "2h 24m",
                "ini sinopsis aquaman"));

        genres.clear(); genres.add("Adventure");
        films.add(new FilmModel("a3",
                "Fantastic Beasts: The Crimes of Grindelwald (2019)",
                genres,
                R.drawable.poster_crimes,
                "69%",
                "2h 14m",
                "ini sinopsis grinderwald"));

        genres.clear(); genres.add("Action"); genres.add("Drama");genres.add("Fiction");
        films.add(new FilmModel("a4",
                "Glass (2019)",
                genres,
                R.drawable.poster_glass,
                "65%",
                "2h 9m",
                "ini sinopsis glass"));

        genres.clear(); genres.add("Adventure"); genres.add("Animation");genres.add("Family");
        films.add(new FilmModel("a5",
                "How to Train Your Dragon: The Hidden World (2019)",
                genres,
                R.drawable.poster_how_to_train,
                "76%",
                "2h 2m",
                "ini sinopsis httyd"));

        genres.clear(); genres.add("Action"); genres.add("Adventure");genres.add("Fiction");
        films.add(new FilmModel("a6",
                "Avengers: Infinity War (2018)",
                genres,
                R.drawable.poster_infinity_war,
                "80%",
                "2h 29m",
                "ini sinopsis infitywar"));

        genres.clear(); genres.add("Comedy"); genres.add("Family");genres.add("Animation");genres.add("Adventure");
        films.add(new FilmModel("a7",
                "Ralph Breaks the Internet (2018)",
                genres,
                R.drawable.poster_ralph,
                "72%",
                "1h 52m",
                "ini sinopsis wreck it ralph"));
        return films;
    }

    public static ArrayList<FilmModel> generateDummyFilmSeriesList(){
        ArrayList<FilmModel> films = new ArrayList<>();
        List<String> genres = new ArrayList<>();
        genres.clear(); genres.add("Animation"); genres.add("Comedy");
        films.add(new FilmModel("b1",
                "Family Guy (1999)",
                genres,
                R.drawable.poster_family_guy,
                "65%",
                "22m",
                "ini sinopsis family guy"));

        genres.clear(); genres.add("Animation"); genres.add("Comedy");genres.add("Drama");
        films.add(new FilmModel("b2",
                "Naruto Shippuden (2007)",
                genres,
                R.drawable.poster_naruto_shipudden,
                "75%",
                "22m",
                "ini sinopsis naruto"));

        genres.clear(); genres.add("Animation"); genres.add("Comedy");
        films.add(new FilmModel("b3",
                "The Simpsons (1989)",
                genres,
                R.drawable.poster_the_simpson,
                "71%",
                "22m",
                "ini sinopsis simpsons"));

        return films;
    }

    public static FilmModel getFilm(String filmID) {
        List<FilmModel> filmList;
        if(filmID.charAt(0) == 'a') filmList = generateDummyFilmMovieList();
        else filmList = generateDummyFilmSeriesList();

        for (int i = 0; i < filmList.size(); i++) {
            if (filmList.get(i).getFilmID().equals(filmID)) {
                return filmList.get(i);
            }
        }
        return null;
    }
}
