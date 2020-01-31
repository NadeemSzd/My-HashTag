package com.hfad.bitsandpizzas;

public class Trend
{
    public String title;
    public String message;

    public static final Trend[] Trends =
            {
                    new Trend("#Friend", "From Middle English frend," +
                            " freend, from Old English frēond (“friend, relative, lover”," +
                            " literally “loving[-one]”), from Proto-Germanic *frijōndz (“lover, friend”), " +
                            "from Proto-Indo-European *prēy-, *prāy- (“to like, love”), equivalent to free" +
                            " +\u200E -nd. Cognate with Saterland Frisian Früünd (“friend”)"),

                    new Trend("#Love", "Love is an American" +
                            " romantic comedy web television series created by " +
                            "Judd Apatow, Lesley Arfin, and Paul Rust, starring" +
                            " Gillian Jacobs, Paul Rust, and Claudia O'Doherty." +
                            " Netflix originally ordered two seasons of the show. "),
                    new Trend("#Friend", "From Middle English frend," +
                            " freend, from Old English frēond (“friend, relative, lover”," +
                            " literally “loving[-one]”), from Proto-Germanic *frijōndz (“lover, friend”), " +
                            "from Proto-Indo-European *prēy-, *prāy- (“to like, love”), equivalent to free" +
                            " +\u200E -nd. Cognate with Saterland Frisian Früünd (“friend”)"),

                    new Trend("#Love", "Love is an American" +
                            " romantic comedy web television series created by " +
                            "Judd Apatow, Lesley Arfin, and Paul Rust, starring" +
                            " Gillian Jacobs, Paul Rust, and Claudia O'Doherty." +
                            " Netflix originally ordered two seasons of the show. "),
                    new Trend("#Friend", "From Middle English frend," +
                            " freend, from Old English frēond (“friend, relative, lover”," +
                            " literally “loving[-one]”), from Proto-Germanic *frijōndz (“lover, friend”), " +
                            "from Proto-Indo-European *prēy-, *prāy- (“to like, love”), equivalent to free" +
                            " +\u200E -nd. Cognate with Saterland Frisian Früünd (“friend”)")

            };

    Trend(String title, String message)
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

    public void setTitle(String title) {
        this.title = title;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
