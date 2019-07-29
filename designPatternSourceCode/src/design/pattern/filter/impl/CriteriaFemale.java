package design.pattern.filter.impl;

import design.pattern.filter.Criteria;
import design.pattern.filter.bean.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 女
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}