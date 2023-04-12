package guru.springframework.spring6webapp.domain;

import jakarta.persistence.*;

import java.util.Set;

//if you use jakarta, JPA will say this is the entity to database. I will use same thing for book
//I have two POJO and Entity classes which are Author and Book
@Entity
public class Author {

    //this is just setup a basic data structure, we have couple Pojo

    //I say that ID will be generated automatically
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    //Books can have moren than one author and visa verse
    //ManyToMany: we will have many authors and many books
    @ManyToMany(mappedBy = "authors")
    private Set<Book> books;

    public Set<Book> getBooks() {
        return books;
    }

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
