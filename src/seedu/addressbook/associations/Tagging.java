package seedu.addressbook.associations;

import seedu.addressbook.data.person.Person;
import seedu.addressbook.data.tag.Tag;

/**
 * Represents an association class between a tag and a person with the tag added/deleted info.
 * @author sriram
 *
 */
public class Tagging {
    
    public enum TagStatus { 
        TAG_ADDED, 
        TAG_DELETED 
    }
    
    private Person person;
    private Tag tag;
    private TagStatus tagStatus;
    
    public Tagging(Person person, Tag tag, TagStatus tagStatus) {
        this.person = person;
        this.tag = tag;
        this.tagStatus = tagStatus;
    }
    
    public Person getPerson() {
        return person;
    }
    public Tag getTag() {
        return tag;
    }
    public TagStatus getTagStatus() {
        return tagStatus;
    }
    
    
}
