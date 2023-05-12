package hello.core.order;

public interface OrderService {
    //최종 order 결과 return
    Order createOrder(Long memberId, String itemName, int itemPrice);

}
