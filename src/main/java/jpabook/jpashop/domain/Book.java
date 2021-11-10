package jpabook.jpashop.domain;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Book extends Item{
    private String aurhor;
    private String isbn;
}
