package com.java.eshop.eshop.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class OrderDTO {

    private Long id;
    private Long clientId;
    private Double totalCost;
    private List<OrderShopDTO> shopList;

}
