package ru.sberbank.lectures.lecture2;

public class PersonImpl implements Person {
    private final String name;
    private final boolean man;
    private Person spouse;

    public PersonImpl(String name, boolean man) {
        this.name = name;
        this.man = man;
    }
    @Override
    public boolean marry(Person person) {
        if (this.getSex() == person.getSex()) {
            System.out.println("Same sex");
            return false;
        }

        if ((this.getSpouse() != null)) {
            this.divorce();
            if (person.getSpouse() != null)
                person.divorce();
        }

        this.spouse = person;
        if (person.getSpouse()!=this)
            person.marry(this);

        System.out.println(this.getName() + " " + this.getSpouse().getName() +
                    " just got married");
        return true;
        }


    @Override
    public boolean divorce() {
        if (this.getSpouse() != null) {
            this.spouse = null;
            return true;
        }
        return false;
    }

    public String getName(){
        return name;
    }

    public boolean getSex(){
        return man;
    }

    public Person getSpouse(){
        return this.spouse;
    }
}
