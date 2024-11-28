package persons;

import java.util.List;
import java.util.Objects;
import java.util.LinkedList;

import enums.*;
import interfaces.*;



public abstract class Person{
	protected String name;
	protected LinkedList<Items> items;
	public Person(String name){
		this.name = name;
	}
	@Override
	public final String toString(){
		return this.name;
	}
	@Override
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person character = (Person) o;
        return Objects.equals(name, character.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
	abstract void doSomething();
}