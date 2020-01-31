package com.hfad.bitsandpizzas;

public class Pizza
{

    private String title;
    private String message;

    public static final Pizza[] pizzas =
            {
                    new Pizza("#Friend", "From Middle English frend," +
                            " freend, from Old English frēond (“friend, relative, lover”," +
                            " literally “loving[-one]”), from Proto-Germanic *frijōndz (“lover, friend”), " +
                            "from Proto-Indo-European *prēy-, *prāy- (“to like, love”), equivalent to free" +
                            " +\u200E -nd. Cognate with Saterland Frisian Früünd (“friend”)"),

                    new Pizza("#Love", "Love is an American" +
                            " romantic comedy web television series created by " +
                            "Judd Apatow, Lesley Arfin, and Paul Rust, starring" +
                            " Gillian Jacobs, Paul Rust, and Claudia O'Doherty." +
                            " Netflix originally ordered two seasons of the show. "),
                    new Pizza("#Friend", "From Middle English frend," +
                            " freend, from Old English frēond (“friend, relative, lover”," +
                            " literally “loving[-one]”), from Proto-Germanic *frijōndz (“lover, friend”), " +
                            "from Proto-Indo-European *prēy-, *prāy- (“to like, love”), equivalent to free" +
                            " +\u200E -nd. Cognate with Saterland Frisian Früünd (“friend”)"),

                    new Pizza("#Love", "Love is an American" +
                            " romantic comedy web television series created by " +
                            "Judd Apatow, Lesley Arfin, and Paul Rust, starring" +
                            " Gillian Jacobs, Paul Rust, and Claudia O'Doherty." +
                            " Netflix originally ordered two seasons of the show. "),
                    new Pizza("#Friend", "From Middle English frend," +
                            " freend, from Old English frēond (“friend, relative, lover”," +
                            " literally “loving[-one]”), from Proto-Germanic *frijōndz (“lover, friend”), " +
                            "from Proto-Indo-European *prēy-, *prāy- (“to like, love”), equivalent to free" +
                            " +\u200E -nd. Cognate with Saterland Frisian Früünd (“friend”)")


            };

    private Pizza(String title, String message)
    {
        this.title = title;
        this.message = message;
    }

    public String getTitle()
    {
        return title;
    }

    public String  getMessage()
    {
        return message;
    }


    /*private String name;
    private int imageResourceId;
    public static final Pizza[] pizzas =
            {
                    new Pizza("Love", R.drawable.love),
                    new Pizza("Friends", R.drawable.friend)
            };

    private Pizza(String name, int imageResourceId)
    {
        this.name = name;
        this.imageResourceId = imageResourceId;
    }

    public String getName()
    {
        return name;
    }

    public int getImageResourceId()
    {
        return imageResourceId;
    }*/
}
