package design.pattern.filter.impl;

import design.pattern.filter.Criteria;
import design.pattern.filter.bean.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 男
 */
public class CriteriaMale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}