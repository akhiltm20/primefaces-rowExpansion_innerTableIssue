package org.primefaces.test;

import javax.annotation.PostConstruct;
import javax.faces.view.ViewScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Named
@ViewScoped
public class MainBean implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 7536893702695858952L;
    List<OrderVO> orderVOs;
    private List<LineVO> lineItems;

    @PostConstruct
    public void init() {
        orderVOs = new ArrayList<OrderVO>();
        lineItems = new ArrayList<LineVO>();
        LineVO l1 = new LineVO("desc1", "d", "s", "s", "d");
        lineItems.add(l1);
        OrderVO orderVO = new OrderVO();
        orderVO.setOrderNo("10000");
        orderVO.setAddressLine1("address1");
        orderVO.setLineItems(lineItems);
        orderVOs.add(orderVO);

    }

    public List<LineVO> getLineItems() {
        return lineItems;
    }

    public void setLineItems(List<LineVO> lineItems) {
        this.lineItems = lineItems;
    }

    public List<OrderVO> getOrderVOs() {
        return orderVOs;
    }

    public void setOrderVOs(List<OrderVO> orderVOs) {
        this.orderVOs = orderVOs;
    }

    public void onRowEdit(OrderVO orderVO) {

    }

    public void onRowCancel(OrderVO orderVO, LineVO lineVO) {

    }

    public void onRowEditLine(OrderVO orderVO, LineVO lineVO) {

    }

    public void onRowCancelLine(OrderVO orderVO, LineVO lineVO) {

    }

    public void addOrder() {
        OrderVO orderVO = new OrderVO();
        orderVOs.add(0, orderVO);

    }

    public void addLine(OrderVO orderVO) {
        LineVO lineVO = new LineVO("dd", "jjj", "kk", "ooo", "iiiii");
        if (orderVO.getLineItems() == null) {
            orderVO.setLineItems(new ArrayList<LineVO>());
        }

        orderVO.getLineItems().add(0, lineVO);

    }

}
