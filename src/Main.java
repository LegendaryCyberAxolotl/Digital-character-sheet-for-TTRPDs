//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    CharacterInfo adventurer1 = new CharacterInfo("Asmas", 3, "Human", "Paladin");
    CharacterInfo adventurer2 = new CharacterInfo("Renod", 7, "Tiefling", "Sorcerer");

    adventurer1.levelUP(1);
    adventurer2.levelUP(2);

    adventurer1.setCharacterSubclass("Glory");
    adventurer2.setCharacterSubclass("Wild magic");

    System.out.println("\n" + adventurer1.getName() + " level: " + adventurer1.getLevel());
    System.out.println(adventurer1.getCharacterClass() + " subclass: " + adventurer1.getCharacterSubclass() + "\n");

    System.out.println(adventurer2.getName() + " is " + adventurer2.getRace() + "\n");

    if (adventurer1.getLevel() > adventurer2.getLevel())
    {
        System.out.println(adventurer1.getName() + " is stronger than " + adventurer2.getName());
    }
    else
    {
        if (adventurer1.getLevel() < adventurer2.getLevel())
        {
            System.out.println(adventurer2.getName() + " is stronger than " + adventurer1.getName());
        }
        else
        {
            System.out.println(adventurer1.getName() + " and " + adventurer2.getName() + " have the same level");
        }
    }
}
