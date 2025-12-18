public class CharacterInfo {

    private String name;

    private int level;

    private String race;
    private String characterClass;
    private String characterSubclass;



    public CharacterInfo (String name, int level, String race, String characterClass)
    {
        this.name = name;

        if (level >= 20) {
            this.level = 20;
        } else {
            if (level <= 1){
                this.level = 1;
            } else {
                this.level = level;
            }
        }

        this.race = (race != null ? race.toLowerCase() : null);
        this.characterClass = (characterClass != null ? characterClass.toLowerCase() : null);
        this.characterSubclass = null;
    }





    public void levelUP(int addLevels)
    {
        setLevel(level + addLevels);
    }



    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getLevel()
    {
        return level;
    }

    public void setLevel(int level)
    {
        if (level >= 20) {
            this.level = 20;
        } else {
            if (level <= 1){
                this.level = 1;
            } else {
                this.level = level;
            }
        }
    }

    public String getRace()
    {
        return race;
    }

    public void setRace(String race)
    {
        this.race = (race != null ? race.toLowerCase() : null);
    }

    public String getCharacterClass()
    {
        return characterClass;
    }

    public void setCharacterClass(String characterClass)
    {
        this.characterClass = (characterClass != null ? characterClass.toLowerCase() : null);
    }

    public String getCharacterSubclass()
    {
        return characterSubclass;
    }

    public void setCharacterSubclass (String characterSubclass)
    {

        if (characterClass == null) {return;}

        characterSubclass = characterSubclass != null ? characterSubclass.toLowerCase() : null;

        switch (characterClass.toLowerCase())
        {
            case "cleric":
            case "sorcerer":
            case "warlock":
                return;

            case "wizard":
                if (level >= 2)
                {
                    this.characterSubclass = characterSubclass;
                }
                else
                {
                    System.out.println("Subclass available from level 2.");
                }

                return;

            default:
                if (level >= 3)
                {
                    this.characterSubclass = characterSubclass;
                }
                else
                {
                    System.out.println("Subclass available from level 3.");
                }
        }
    }

}
