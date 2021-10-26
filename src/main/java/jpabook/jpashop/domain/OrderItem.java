package jpabook.jpashop.domain;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jpabook.jpashop.domain.item.Item;
import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import static javax.persistence.FetchType.*;


@Entity
@Getter
@Setter
public class OrderItem {
    @Id @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @JsonIgnore
    @ManyToOne(fetch = LAZY)
    @JoinColumn(name="order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name="item_id")
    private Item item;

    // 주문 가격
    private int orderPrice;
    // 주문 수량
    private int count;

}

