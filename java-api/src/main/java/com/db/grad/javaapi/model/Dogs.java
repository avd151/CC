package com.db.grad.javaapi.model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "dogs")
public class Dogs {

	@Idd
	private Long dogId;
    private String name;
    private Long age;

    public Dogs() {

    }

    public Dogs(long id, String name, long age) {
    	this.dogId=id;
        this.name = name;
        this.age = age;

    }

    @Id
    @Column(name = "dog_id", nullable = false)
    public long getId() {
        return dogId;
    }
    public void setId(long id) {
        this.dogId = id;
    }
    
    @Column(name = "name", nullable = false)
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    @Column(name = "age", nullable = false)
    public long getAge() {
        return age;
    }
    public void setAge(long age) {
        this.age = age;
    }
}