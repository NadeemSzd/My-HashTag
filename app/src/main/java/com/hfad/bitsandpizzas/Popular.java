package com.hfad.bitsandpizzas;

public class Popular
{
    private String name;
    private int imageResourceId;
    public static final Popular[] popular =
            {
                    new Popular("Love", R.drawable.love),
                    new Popular("Friends", R.drawable.friend),
                    new Popular("Feelings", R.drawable.feelings),
                    new Popular("Fashion", R.drawable.fashion),
                    new Popular("Life", R.drawable.life),
                    new Popular("Food", R.drawable.food),
                    new Popular("Nature", R.drawable.nature),
                    new Popular("New Year", R.drawable.new_year),
                    new Popular("Religion", R.drawable.religion),
                    new Popular("Sports", R.drawable.sports),
                    new Popular("Travelers", R.drawable.travlers)
            };

    private Popular(String name, int imageResourceId)
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
    }
}
