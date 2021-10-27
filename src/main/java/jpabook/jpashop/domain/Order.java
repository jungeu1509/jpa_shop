package jpabook.jpashop.domain;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "ORDERS")
public class Order {

    @Id @GeneratedValue
    @Column(name = "ORDER_ID")
    private Long id;

    @Column(name = "MEMBER_ID")
    private Long memberId;
    // 객체지향적이지 않다(관계형DB 스타일로 객체를 맞춘...).
    // 테이블의 외래키를 객체에 그대로 가져옴
    // 객체 그래프의 탐색이 불가능
    // 참조가 없으므로 UML 도 잘못되어있다.
    // 아래처럼 되어야 할 것 같은데... 그래서 연관관계 매핑이 필요하다.
    // private Member member;

    private LocalDateTime orderDate;

    @Enumerated(EnumType.STRING)
    private OrderStatus status;
}
